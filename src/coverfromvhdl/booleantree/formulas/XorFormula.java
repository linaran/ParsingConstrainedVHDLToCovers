package coverfromvhdl.booleantree.formulas;


import coverfromvhdl.booleantree.BasicFormula;
import coverfromvhdl.booleantree.Formula;

public class XorFormula extends BasicFormula {

  public XorFormula(Formula... formulas) {
    super(formulas);
  }

  @Override
  public Type getType() {
    return Type.XOR;
  }

  @Override
  public int getArgCount() {
    return 2;
  }
}
