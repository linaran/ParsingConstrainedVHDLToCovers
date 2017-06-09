package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;
import coverfromvhdl.booleantree.Expression;

import static coverfromvhdl.booleantree.Expression.Type.AND;

public class AndExpression extends BasicExpression {

  public AndExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return AND;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
