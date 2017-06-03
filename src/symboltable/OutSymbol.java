package symboltable;


import static symboltable.SymbolType.*;

public class OutSymbol extends BaseSymbol {
  public OutSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return OUT;
  }
}
