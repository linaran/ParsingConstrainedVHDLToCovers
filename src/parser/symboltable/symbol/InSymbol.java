package parser.symboltable.symbol;


public class InSymbol extends BaseSymbol {
  public InSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return SymbolType.IN;
  }
}
