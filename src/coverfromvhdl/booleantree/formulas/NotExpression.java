package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;
import coverfromvhdl.booleantree.Expression;

import static coverfromvhdl.booleantree.Expression.Type.NOT;

public class NotExpression extends BasicExpression {

  public NotExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return NOT;
  }

  @Override
  public int getArgCount() {
    return 1;
  }
}
