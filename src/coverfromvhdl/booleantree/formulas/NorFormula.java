package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

public class NorFormula extends BasicFormula {

  public NorFormula(Formula... formulas) {
    super(formulas);
  }

  @Override
  public Type getType() {
    return Type.NOR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
