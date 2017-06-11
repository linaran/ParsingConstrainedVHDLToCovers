package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

import static parser.booleantree.Expression.Type.NOT;

public class NotExpression extends BasicExpression {

  public NotExpression(Expression... expressions) {
    super(expressions);
  }

  public NotExpression(Collection<? extends Expression> expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return NOT;
  }

  @Override
  public int getMinArgCount() {
    return 1;
  }
}
