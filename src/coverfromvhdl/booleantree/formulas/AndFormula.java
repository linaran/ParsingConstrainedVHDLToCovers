package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

import static coverfromvhdl.booleantree.Formula.Type.AND;

public class AndFormula extends BasicFormula {

  public AndFormula(Formula... formulas) {
    super(formulas);
  }

  @Override
  public Type getType() {
    return AND;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
