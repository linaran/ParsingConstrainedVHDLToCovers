package parser;


import generated.VHDLBaseListener;
import generated.VHDLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import parser.symboltable.scope.ArchitectureSymbol;
import parser.symboltable.scope.EntitySymbol;
import parser.symboltable.scope.GlobalScope;
import parser.symboltable.scope.Scope;
import parser.symboltable.symbol.InSymbol;
import parser.symboltable.symbol.OutSymbol;
import parser.symboltable.symbol.SignalSymbol;
import parser.symboltable.symbol.Symbol;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import static parser.symboltable.symbol.SymbolType.IN;
import static parser.symboltable.symbol.SymbolType.OUT;

public class SemanticCorrectnessVHDL extends VHDLBaseListener {

  private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
  private Stack<Scope> scopeStack = new Stack<>();

  private GlobalScope globalScope;
  private EntitySymbol storedEntitySymbol;
  private ArchitectureSymbol storedArchitectureSymbol;

  private Set<String> leftSideNamesResolved = new HashSet<>();
  private Set<String> rightSideNamesResolved = new HashSet<>();

  private void saveScope(ParserRuleContext context, Scope scope) {
    scopes.put(context, scope);
  }

  private void tryDefine(Scope scope, Symbol symbol, int line) {
    if (!scope.define(symbol)) {
      alreadyDefined(symbol, line);
    }
  }

  private void checkResolve(Scope scope, String name, int line) {
    if (scope.resolve(name) == null) {
      notDefined(name, line);
    }
  }

  private void alreadyDefined(Symbol symbol, int line) {
    throw new UnsupportedOperationException(
        symbol.getName() + " in line " + line + " already defined in this scope."
    );
  }

  private void notDefined(String name, int line) {
    throw new UnsupportedOperationException(
        name + " in line " + line + " not defined in this scope."
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
    VHDLParser.IdentifierContext entityIdentifier = ctx.identifier(0);
    String entityName = entityIdentifier.getText();
    EntitySymbol entitySymbol = new EntitySymbol(entityName);
    int line = entityIdentifier.BASIC_IDENTIFIER().getSymbol().getLine();

    tryDefine(currentScope, entitySymbol, line);

    scopeStack.push(entitySymbol);
    storedEntitySymbol = entitySymbol;
    saveScope(ctx, entitySymbol);
  }

  @Override
  public void enterInput_declaration(VHDLParser.Input_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    List<VHDLParser.IdentifierContext> identifiers = ctx.identifier_list().identifier();
    for (VHDLParser.IdentifierContext identifier : identifiers) {
      Symbol inSymbol = new InSymbol(identifier.getText());
      int line = identifier.BASIC_IDENTIFIER().getSymbol().getLine();
      tryDefine(currentScope, inSymbol, line);
    }
  }

  @Override
  public void enterOutput_declaration(VHDLParser.Output_declarationContext ctx) {
    Scope currentScope = scopeStack.peek();

    List<VHDLParser.IdentifierContext> identifiers = ctx.identifier_list().identifier();
    for (VHDLParser.IdentifierContext identifier : identifiers) {
      Symbol outSymbol = new OutSymbol(identifier.getText());
      int line = identifier.BASIC_IDENTIFIER().getSymbol().getLine();
      tryDefine(currentScope, outSymbol, line);
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

    String linkedEntityName = ctx.identifier(1).getText();
    Symbol symbolPlaceholder = globalScope.resolve(linkedEntityName);

    if (symbolPlaceholder == null) {
      throw new UnsupportedOperationException(
          "Entity " + linkedEntityName + " for this architecture doesn't exist. " +
              "Found in line: " + ctx.identifier(1).BASIC_IDENTIFIER().getSymbol().getLine()
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
    String architectureName = ctx.identifier(0).getText();
    int line = ctx.identifier(0).BASIC_IDENTIFIER().getSymbol().getLine();
    ArchitectureSymbol architectureSymbol =
        new ArchitectureSymbol(architectureName, linkedEntitySymbol);

    tryDefine(currentScope, architectureSymbol, line);

    scopeStack.push(architectureSymbol);
    storedArchitectureSymbol = architectureSymbol;
    saveScope(ctx, architectureSymbol);

    defineSignals(ctx);
  }

  private void defineSignals(VHDLParser.ArchitectureContext ctx) {
    Scope currentScope = scopeStack.peek();

    List<VHDLParser.IdentifierContext> identifiers = ctx.identifier_list().identifier();
    for (VHDLParser.IdentifierContext identifier : identifiers) {
      SignalSymbol signalSymbol = new SignalSymbol(identifier.getText());
      int line = identifier.BASIC_IDENTIFIER().getSymbol().getLine();
      tryDefine(currentScope, signalSymbol, line);
    }
  }

  @Override
  public void enterAssignment_expression(VHDLParser.Assignment_expressionContext ctx) {
    Scope currentScope = scopeStack.peek();
    String leftIdentifierName = ctx.identifier().getText();
    int line = ctx.identifier().BASIC_IDENTIFIER().getSymbol().getLine();

    checkForMultipleAssignment(leftIdentifierName, line);
    checkResolve(currentScope, leftIdentifierName, line);
  }

  private void checkForMultipleAssignment(String leftIdentifierName, int line) {
    if (leftSideNamesResolved.contains(leftIdentifierName)) {
      throw new UnsupportedOperationException(
          "Identifier " + leftIdentifierName + " already has an assignment. " +
              "Found on line: " + line
      );
    } else {
      leftSideNamesResolved.add(leftIdentifierName);
    }
  }

  @Override
  public void enterExpressionIdentifier(VHDLParser.ExpressionIdentifierContext ctx) {
    Scope currentScope = scopeStack.peek();
    String identifier = ctx.identifier().getText();
    int line = ctx.identifier().BASIC_IDENTIFIER().getSymbol().getLine();

    rightSideNamesResolved.add(identifier);
    checkResolve(currentScope, identifier, line);

    Symbol symbol = currentScope.resolve(identifier);
    if (symbol.getType() == OUT) {
      throw new UnsupportedOperationException(
          "Entity output " + identifier + " used as input or signal" +
              "Found on line: " + line
      );
    }
  }

  @Override
  public void exitArchitecture_details(VHDLParser.Architecture_detailsContext ctx) {
    Scope currentScope = scopeStack.peek();

    checkSignalUsage(currentScope);
    checkInOutUsage(currentScope);
  }

  private void checkSignalUsage(Scope currentScope) {
    currentScope.forEach(symbol -> {
      if (!leftSideNamesResolved.contains(symbol.getName())) {
        throw new UnsupportedOperationException(
            "Signal " + symbol.getName() + " wasn't assigned an expression."
        );
      }

      if (!rightSideNamesResolved.contains(symbol.getName())) {
        throw new UnsupportedOperationException(
            "Signal " + symbol.getName() + " wasn't used in an expression."
        );
      }
    });
  }

  private void checkInOutUsage(Scope currentScope) {
    currentScope.getLinkedScope().forEach(symbol -> {
      if (symbol.getType() == OUT && !leftSideNamesResolved.contains(symbol.getName())) {
        throw new UnsupportedOperationException(
            "Output identifier " + symbol.getName() + " was defined but not used."
        );
      }

      if (symbol.getType() == IN && !rightSideNamesResolved.contains(symbol.getName())) {
        throw new UnsupportedOperationException(
            "Input identifier " + symbol.getName() + " was defined but not used."
        );
      }
    });
  }

  @Override
  public void exitArchitecture(VHDLParser.ArchitectureContext ctx) {
    scopeStack.pop();
  }

  public ParseTreeProperty<Scope> getScopes() {
    return scopes;
  }

  public GlobalScope getGlobalScope() {
    return globalScope;
  }

  public ArchitectureSymbol getArchitectureScope() {
    return storedArchitectureSymbol;
  }
}
