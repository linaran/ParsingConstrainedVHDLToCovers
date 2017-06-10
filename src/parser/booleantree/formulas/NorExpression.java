package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

public class NorExpression extends BasicExpression {

  public NorExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.NOR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
