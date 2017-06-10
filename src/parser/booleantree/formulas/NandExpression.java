package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;
import parser.booleantree.Expression;

public class NandExpression extends BasicExpression {

  public NandExpression(Expression... expressions) {
    super(expressions);
  }

  @Override
  public Type getType() {
    return Type.NAND;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
