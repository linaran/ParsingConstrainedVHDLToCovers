package symboltable.scope;


import symboltable.symbol.Symbol;
import symboltable.symbol.SymbolType;

import static symboltable.symbol.SymbolType.ARCHITECTURE;

final public class ArchitectureSymbol extends BaseScope implements Symbol {

  private final String architectureName;

  public ArchitectureSymbol(String architectureName, Scope linkedScope) {
    super(linkedScope);
    this.architectureName = architectureName;
  }

  public String getArchitectureName() {
    return architectureName;
  }

  @Override
  public SymbolType getType() {
    return ARCHITECTURE;
  }

  @Override
  public String getName() {
    return architectureName;
  }
}
