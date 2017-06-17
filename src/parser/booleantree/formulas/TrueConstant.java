package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;

import static parser.booleantree.Expression.Type.TRUE;

public class TrueConstant extends BasicExpression {
  @Override
  public Type getType() {
    return TRUE;
  }

  @Override
  public int getMinArgCount() {
    return 0;
  }
}
