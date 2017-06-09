package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;
import coverfromvhdl.booleantree.Expression;

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
