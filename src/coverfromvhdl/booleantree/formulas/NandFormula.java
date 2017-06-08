package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

public class NandFormula extends BasicFormula {

  public NandFormula(Formula... formulas) {
    super(formulas);
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
