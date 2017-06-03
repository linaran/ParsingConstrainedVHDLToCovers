package symboltable;


import static symboltable.SymbolType.SIGNAL;

public class SignalSymbol extends BaseSymbol {
  public SignalSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return SIGNAL;
  }
}
