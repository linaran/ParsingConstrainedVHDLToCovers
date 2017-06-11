package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

public class NorExpression extends BasicExpression {

  public NorExpression(Expression... expressions) {
    super(expressions);
  }

  public NorExpression(Collection<? extends Expression> expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.NOR;
  }

  @Override
  public int getMinArgCount() {
    return 2;
  }
}
