package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import static parser.booleantree.Expression.Type.OR;

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
