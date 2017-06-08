package coverfromvhdl;


import coverfromvhdl.booleantree.Formula;
import coverfromvhdl.booleantree.formulas.*;
import generated.VHDLBaseVisitor;
import generated.VHDLParser;

public class ParseFormulasVisitor extends VHDLBaseVisitor<Formula> {

  private int assignmentIndex;

  public ParseFormulasVisitor(int assignmentIndex) {
    this.assignmentIndex = assignmentIndex;
  }

  @Override
  public Formula visitFile(VHDLParser.FileContext ctx) {
    return visit(ctx.architecture());
  }

  @Override
  public Formula visitArchitecture(VHDLParser.ArchitectureContext ctx) {
    return visit(ctx.architecture_details());
  }

  @Override
  public Formula visitArchitecture_details(VHDLParser.Architecture_detailsContext ctx) {
    return visit(ctx.assignment_expression(assignmentIndex));
  }

  @Override
  public Formula visitAssignment_expression(VHDLParser.Assignment_expressionContext ctx) {
    return visit(ctx.expression());
  }

  @Override
  public Formula visitIdentifier(VHDLParser.IdentifierContext ctx) {
    String text = ctx.BASIC_IDENTIFIER().getText();
    return new VariableFormula(text, 0); // TODO: Index!!!!
  }

  @Override
  public Formula visitExpressionUnaryOperator(VHDLParser.ExpressionUnaryOperatorContext ctx) {
    return new NotFormula(visit(ctx.expression()));
  }

  @Override
  public Formula visitExpressionParentheses(VHDLParser.ExpressionParenthesesContext ctx) {
    return visit(ctx.expression());
  }

  @Override
  public Formula visitExpressionBinaryOperator(VHDLParser.ExpressionBinaryOperatorContext ctx) {
    Formula formula = visit(ctx.binary_operator());
    Formula left = visit(ctx.expression(0));
    Formula right = visit(ctx.expression(1));

    formula.setArg(0, left);
    formula.setArg(1, right);

    return formula;
  }

  @Override
  public Formula visitAndOp(VHDLParser.AndOpContext ctx) {
    return new AndFormula();
  }

  @Override
  public Formula visitOrOp(VHDLParser.OrOpContext ctx) {
    return new OrFormula();
  }

  @Override
  public Formula visitNandOp(VHDLParser.NandOpContext ctx) {
    return new NandFormula();
  }

  @Override
  public Formula visitXorOp(VHDLParser.XorOpContext ctx) {
    return new XorFormula();
  }

  @Override
  public Formula visitNorOp(VHDLParser.NorOpContext ctx) {
    return new NorFormula();
  }
}
