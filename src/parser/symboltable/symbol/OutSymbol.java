package parser.symboltable.symbol;


public class OutSymbol extends BaseSymbol {
  public OutSymbol(String name) {
    super(name);
  }

  @Override
  public SymbolType getType() {
    return SymbolType.OUT;
  }
}
