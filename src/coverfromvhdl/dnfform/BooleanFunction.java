package coverfromvhdl.dnfform;


import coverfromvhdl.booleantree.Formula;

import java.util.List;

public class BooleanFunction {

  final private String name;
  final private List<String> variables;
  final private Formula formula;

  public BooleanFunction(String name, List<String> variables, Formula formula) {
    this.name = name;
    this.variables = variables;
    this.formula = formula;
  }

  public String getName() {
    return name;
  }


  public Formula getFormula() {
    return formula;
  }
}
