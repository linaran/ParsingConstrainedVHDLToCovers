package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;
import coverfromvhdl.booleantree.Expression;

import static coverfromvhdl.booleantree.Expression.Type.OR;

public class OrExpression extends BasicExpression {

  public OrExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return OR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
