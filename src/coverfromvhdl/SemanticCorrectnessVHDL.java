package coverfromvhdl;


import generated.VHDLBaseListener;
import generated.VHDLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import symboltable.scope.EntitySymbol;
import symboltable.scope.GlobalScope;
import symboltable.scope.Scope;
import symboltable.symbol.InSymbol;
import symboltable.symbol.OutSymbol;
import symboltable.symbol.Symbol;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SemanticCorrectnessVHDL extends VHDLBaseListener {

  ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
  Stack<Scope> scopeStack = new Stack<>();
  GlobalScope globalScope;

  public void saveScope(ParserRuleContext context, Scope scope) {
    scopes.put(context, scope);
  }

  private void alreadyDefined(Symbol symbol) {
    throw new UnsupportedOperationException(
        symbol.getName() + " already defined in this scope."
    );
  }

  @Override
  public void enterFile(VHDLParser.FileContext ctx) {
    globalScope = new GlobalScope();
    scopeStack.push(globalScope);
  }

  @Override
  public void exitFile(VHDLParser.FileContext ctx) {
    scopeStack.pop();
    if (!scopeStack.isEmpty()) {
      throw new UnsupportedOperationException("Scopes aren't aligned.");
    }
  }

  private void checkIdentifierNames(VHDLParser.Entity_declarationContext ctx) {
    String startIdentifier = ctx.identifier(0).getText();
    String endIdentifier = ctx.identifier(1).getText();

    if (!startIdentifier.equals(endIdentifier)) {
      throw new UnsupportedOperationException(
          "Starting and ending identifiers for entity name need to be equal. " +
              "Found: " + startIdentifier + " and " + endIdentifier
      );
    }
  }

  @Override
  public void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
    if (ctx.identifier().size() != 1) {
      checkIdentifierNames(ctx);
    }

    Scope currentScope = scopeStack.peek();
    String entityName = ctx.ENTITY().getText();
    EntitySymbol entitySymbol = new EntitySymbol(entityName);

    if (!currentScope.define(entitySymbol)) {
      alreadyDefined(entitySymbol);
    }

    scopeStack.push(entitySymbol);
    saveScope(ctx, entitySymbol);
  }

  @Override
  public void enterInput_declaration(VHDLParser.Input_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    String[] inputIdentifierNames = ctx.identifier_list().getText().split(",");
    for (String name : inputIdentifierNames) {
      Symbol inSymbol = new InSymbol(name);
      if (!currentScope.define(inSymbol)) {
        alreadyDefined(inSymbol);
      }
    }
  }

  @Override
  public void enterOutput_declaration(VHDLParser.Output_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    String[] outputIdentifierNames = ctx.identifier_list().getText().split(",");
    for (String name : outputIdentifierNames) {
      Symbol outSymbol = new OutSymbol(name);
      if (!currentScope.define(outSymbol)) {
        alreadyDefined(outSymbol);
      }
    }
  }

  @Override
  public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
    scopeStack.pop();
  }


}
