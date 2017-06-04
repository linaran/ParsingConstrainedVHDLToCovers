package coverfromvhdl;


import generated.VHDLBaseListener;
import generated.VHDLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import symboltable.scope.ArchitectureSymbol;
import symboltable.scope.EntitySymbol;
import symboltable.scope.GlobalScope;
import symboltable.scope.Scope;
import symboltable.symbol.InSymbol;
import symboltable.symbol.OutSymbol;
import symboltable.symbol.SignalSymbol;
import symboltable.symbol.Symbol;

import java.util.Arrays;
import java.util.Stack;

public class SemanticCorrectnessVHDL extends VHDLBaseListener {

  private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
  private Stack<Scope> scopeStack = new Stack<>();
  private GlobalScope globalScope;

  private void saveScope(ParserRuleContext context, Scope scope) {
    scopes.put(context, scope);
  }

  private void tryDefine(Scope scope, Symbol symbol) {
    if (!scope.define(symbol)) {
      alreadyDefined(symbol);
    }
  }

  private void checkResolve(Scope scope, String name) {
    if (scope.resolve(name) == null) {
      notDefined(name);
    }
  }

  private void alreadyDefined(Symbol symbol) {
    throw new UnsupportedOperationException(
        symbol.getName() + " already defined in this scope."
    );
  }

  private void notDefined(String name) {
    throw new UnsupportedOperationException(
        name + " not defined in this scope."
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

  private void checkEntityIdentifierNames(VHDLParser.Entity_declarationContext ctx) {
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
      checkEntityIdentifierNames(ctx);
    }

    Scope currentScope = scopeStack.peek();
    String entityName = ctx.identifier().get(0).getText();
    EntitySymbol entitySymbol = new EntitySymbol(entityName);

    tryDefine(currentScope, entitySymbol);

    scopeStack.push(entitySymbol);
    saveScope(ctx, entitySymbol);
  }

  @Override
  public void enterInput_declaration(VHDLParser.Input_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    String[] inputIdentifierNames = ctx.identifier_list().getText().split(",");
    for (String name : inputIdentifierNames) {
      Symbol inSymbol = new InSymbol(name);
      tryDefine(currentScope, inSymbol);
    }
  }

  @Override
  public void enterOutput_declaration(VHDLParser.Output_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    String[] outputIdentifierNames = ctx.identifier_list().getText().split(",");
    for (String name : outputIdentifierNames) {
      Symbol outSymbol = new OutSymbol(name);
      tryDefine(currentScope, outSymbol);
    }
  }

  @Override
  public void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx) {
    scopeStack.pop();
  }

  private void checkArchitectureIdentityNames(VHDLParser.ArchitectureContext ctx) {
    String startIdentifier = ctx.identifier().get(0).getText();
    int lastIndex = ctx.identifier().size() - 1;
    String endIdentifier = ctx.identifier().get(lastIndex).getText();

    if (!startIdentifier.equals(endIdentifier)) {
      throw new UnsupportedOperationException(
          "Starting and ending identifiers for architecture name need to be equal. " +
              "Found: " + startIdentifier + " and " + endIdentifier
      );
    }
  }

  @Override
  public void enterArchitecture(VHDLParser.ArchitectureContext ctx) {
    if (ctx.identifier().size() > 2) {
      checkArchitectureIdentityNames(ctx);
    }

    String linkedEntityName = ctx.identifier().get(1).getText();
    Symbol symbolPlaceholder = globalScope.resolve(linkedEntityName);

    if (symbolPlaceholder == null) {
      throw new UnsupportedOperationException(
          "Entity " + linkedEntityName + " for this architecture doesn't exist."
      );
    }

    EntitySymbol linkedEntitySymbol;
    if (symbolPlaceholder instanceof EntitySymbol) {
      linkedEntitySymbol = (EntitySymbol) symbolPlaceholder;
    } else {
      throw new UnsupportedOperationException(
          "Parser error. Found Entity which isn't entity scope."
      );
    }

    Scope currentScope = scopeStack.peek();
    String architectureName = ctx.identifier().get(0).getText();
    ArchitectureSymbol architectureSymbol =
        new ArchitectureSymbol(architectureName, linkedEntitySymbol);

    tryDefine(currentScope, architectureSymbol);

    scopeStack.push(architectureSymbol);
    saveScope(ctx, architectureSymbol);

    defineSignals(ctx);
  }

  private void defineSignals(VHDLParser.ArchitectureContext ctx) {
    Scope currentScope = scopeStack.peek();
    String[] signalIdentifiers = ctx.identifier_list().getText().split(",");

    for (String signalIdentifier : signalIdentifiers) {
      SignalSymbol signalSymbol = new SignalSymbol(signalIdentifier);
      tryDefine(currentScope, signalSymbol);
    }
  }

  @Override
  public void enterAssignment_expression(VHDLParser.Assignment_expressionContext ctx) {
    Scope currentScope = scopeStack.peek();
    String leftIdentifier = ctx.identifier().getText();
    checkResolve(currentScope, leftIdentifier);
  }

  @Override
  public void enterExpression(VHDLParser.ExpressionContext ctx) {
    Scope currentScope = scopeStack.peek();
    String identifier = ctx.identifier().getText();
    checkResolve(currentScope, identifier);
  }

  @Override
  public void exitArchitecture(VHDLParser.ArchitectureContext ctx) {
    scopeStack.pop();
  }
}
