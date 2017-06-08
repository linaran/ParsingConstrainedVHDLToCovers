package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

import static coverfromvhdl.booleantree.Formula.Type.OR;

public class OrFormula extends BasicFormula {

  public OrFormula(Formula... formulas) {
    super(formulas);
  }

  @Override
  public Type getType() {
    return OR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
