package parser;


import parser.booleantree.Expression;
import parser.booleantree.formulas.*;
import parser.dnfform.Architecture;
import parser.dnfform.ArchitectureAssignment;
import generated.VHDLBaseVisitor;
import generated.VHDLParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import parser.symboltable.scope.ArchitectureSymbol;
import parser.symboltable.scope.Scope;
import parser.symboltable.symbol.Symbol;

import java.util.List;

public class ParseFormulasVisitor extends VHDLBaseVisitor<Expression> {

  private Architecture architecture;
  private final ParseTreeProperty<Scope> scopes;
  private Scope currentScope;

  public ParseFormulasVisitor(ParseTreeProperty<Scope> scopes) {
    this.scopes = scopes;
  }

  @Override
  public Expression visitFile(VHDLParser.FileContext ctx) {
    return visit(ctx.architecture());
  }

  @Override
  public Expression visitArchitecture(VHDLParser.ArchitectureContext ctx) {
    currentScope = scopes.get(ctx);
    String architectureName = ctx.identifier(0).getText();

    architecture = new Architecture(architectureName, (ArchitectureSymbol) currentScope);

    return visit(ctx.architecture_details());
  }

  @Override
  public Expression visitArchitecture_details(VHDLParser.Architecture_detailsContext ctx) {
    List<VHDLParser.Assignment_expressionContext> assignments = ctx.assignment_expression();
    for (int i = 0; i < assignments.size(); i++) {
      visit(ctx.assignment_expression(i));
    }

    return null;
  }

  @Override
  public Expression visitAssignment_expression(VHDLParser.Assignment_expressionContext ctx) {
    String leftIdentifierName = ctx.identifier().getText();
    Symbol leftIdentifierSymbol = currentScope.resolve(leftIdentifierName);

    ArchitectureAssignment assignment =
        new ArchitectureAssignment(leftIdentifierSymbol, visit(ctx.expression()));
    architecture.addArchitectureAssignment(assignment);

    return null;
  }

  @Override
  public Expression visitIdentifier(VHDLParser.IdentifierContext ctx) {
    String text = ctx.BASIC_IDENTIFIER().getText();
    return new VariableExpression(text);
  }

  @Override
  public Expression visitExpressionUnaryOperator(VHDLParser.ExpressionUnaryOperatorContext ctx) {
    return new NotExpression(visit(ctx.expression()));
  }

  @Override
  public Expression visitExpressionParentheses(VHDLParser.ExpressionParenthesesContext ctx) {
    return visit(ctx.expression());
  }

  @Override
  public Expression visitExpressionBinaryOperator(VHDLParser.ExpressionBinaryOperatorContext ctx) {
    Expression expression = visit(ctx.binary_operator());
    Expression left = visit(ctx.expression(0));
    Expression right = visit(ctx.expression(1));

    expression.setArg(0, left);
    expression.setArg(1, right);

    return expression;
  }

  @Override
  public Expression visitAndOp(VHDLParser.AndOpContext ctx) {
    return new AndExpression();
  }

  @Override
  public Expression visitOrOp(VHDLParser.OrOpContext ctx) {
    return new OrExpression();
  }

  @Override
  public Expression visitNandOp(VHDLParser.NandOpContext ctx) {
    return new NandExpression();
  }

  @Override
  public Expression visitXorOp(VHDLParser.XorOpContext ctx) {
    return new XorExpression();
  }

  @Override
  public Expression visitNorOp(VHDLParser.NorOpContext ctx) {
    return new NorExpression();
  }

  public Architecture getArchitecture() {
    return architecture;
  }
}
