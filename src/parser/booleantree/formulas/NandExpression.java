package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

import java.util.Collection;

public class NandExpression extends BasicExpression {

  public NandExpression(Expression... expressions) {
    super(expressions);
  }

  public NandExpression(Collection<? extends Expression> expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.NAND;
  }

  @Override
  public int getMinArgCount() {
    return 2;
  }
}
