package parser.models;


import parser.booleantree.Expression;
import parser.symboltable.symbol.Symbol;

public class ArchitectureAssignment {

  final private Symbol leftSide;
  private Expression expression;

  public ArchitectureAssignment(Symbol leftSide, Expression expression) {
    this.leftSide = leftSide;
    this.expression = expression;
  }

  public Symbol getLeftSide() {
    return leftSide;
  }

  public Expression getExpression() {
    return expression;
  }

  public void setExpression(Expression expression) {
    this.expression = expression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ArchitectureAssignment that = (ArchitectureAssignment) o;

    return leftSide.equals(that.leftSide);
  }

  @Override
  public int hashCode() {
    return leftSide.hashCode();
  }
}
