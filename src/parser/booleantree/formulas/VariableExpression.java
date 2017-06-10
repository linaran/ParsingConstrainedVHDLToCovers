package parser.booleantree.formulas;


import parser.booleantree.BasicExpression;

public class VariableExpression extends BasicExpression {

  private String name;

  public VariableExpression(String name) {
    this.name = name;
  }

  @Override
  public Type getType() {
    return Type.VARIABLE;
  }

  @Override
  public int getMinArgCount() {
    return 0;
  }

  public String getName() {
    return name;
  }
}
