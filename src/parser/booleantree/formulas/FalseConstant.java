package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;

import static parser.booleantree.Expression.Type.FALSE;

public class FalseConstant extends BasicExpression {
  @Override
  public Type getType() {
    return FALSE;
  }

  @Override
  public int getMinArgCount() {
    return 0;
  }
}
