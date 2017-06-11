package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

public class XorExpression extends BasicExpression {

  public XorExpression(Expression... expressions) {
    super(expressions);
  }

  public XorExpression(Collection<? extends Expression> expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.XOR;
  }

  @Override
  public int getMinArgCount() {
    return 2;
  }
}
