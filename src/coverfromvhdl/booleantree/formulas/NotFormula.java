package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

import static coverfromvhdl.booleantree.Formula.Type.NOT;

public class NotFormula extends BasicFormula {

  public NotFormula(Formula... formulas) {
    super(formulas);
  }

  @Override
  public Type getType() {
    return NOT;
  }

  @Override
  public int getArgCount() {
    return 1;
  }
}
