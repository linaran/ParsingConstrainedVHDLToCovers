package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

public class XorExpression extends BasicExpression {

  public XorExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.XOR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
