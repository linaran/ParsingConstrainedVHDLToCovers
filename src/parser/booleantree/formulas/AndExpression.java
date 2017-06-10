package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import static parser.booleantree.Expression.Type.AND;

public class AndExpression extends BasicExpression {

  public AndExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return AND;
  }

  @Override
  public int getMinArgCount() {
    return 2;
  }
}
