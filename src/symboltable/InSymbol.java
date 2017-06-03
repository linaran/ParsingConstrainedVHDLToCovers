package symboltable;


import static symboltable.SymbolType.IN;

public class InSymbol extends BaseSymbol {
  public InSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return IN;
  }
}
