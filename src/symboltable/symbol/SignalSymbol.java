package symboltable.symbol;


public class SignalSymbol extends BaseSymbol {
  public SignalSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return SymbolType.SIGNAL;
  }
}
