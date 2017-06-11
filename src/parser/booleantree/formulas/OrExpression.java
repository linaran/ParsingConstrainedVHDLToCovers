package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

import static parser.booleantree.Expression.Type.OR;

public class OrExpression extends BasicExpression {

  public OrExpression(Expression... expressions) {
    super(expressions);
  }

  public OrExpression(Collection<? extends Expression> expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return OR;
  }

  @Override
  public int getMinArgCount() {
    return 2;
  }
}
