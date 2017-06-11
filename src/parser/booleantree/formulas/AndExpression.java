package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

import static parser.booleantree.Expression.Type.AND;

public class AndExpression extends BasicExpression {

  public AndExpression(Expression... expressions) {
    super(expressions);
  }

  public AndExpression(Collection<? extends Expression> expressions) {
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
