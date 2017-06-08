package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

public class VariableFormula extends BasicFormula {

  private String name;
  private int index;

  public VariableFormula(String name, int index) {
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
