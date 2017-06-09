package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;
import coverfromvhdl.booleantree.Expression;

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
