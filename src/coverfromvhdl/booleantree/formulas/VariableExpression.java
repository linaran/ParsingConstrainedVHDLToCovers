package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicExpression;

public class VariableExpression extends BasicExpression {

  private String name;
  private int index;

  public VariableExpression(String name, int index) {
    this.name = name;
    this.index = index;
  }

  @Override
  public Type getType() {
    return Type.VARIABLE;
  }

  @Override
  public int getArgCount() {
    return 0;
  }

  public String getName() {
    return name;
  }

  public int getIndex() {
    return index;
  }
}
