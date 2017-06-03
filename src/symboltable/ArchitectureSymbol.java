package symboltable;


import com.sun.istack.internal.Nullable;

import static symboltable.SymbolType.ARCHITECTURE;

public class ArchitectureSymbol extends BaseScope implements Symbol {

  private final String architectureName;
  private final EntitySymbol entitySymbol;

  public ArchitectureSymbol(String architectureName, EntitySymbol entitySymbol) {
    this.architectureName = architectureName;
    this.entitySymbol = entitySymbol;
  }

  @Override
  public boolean define(Symbol symbol) {
    return entitySymbol.resolve(symbol.getName()) == null && super.define(symbol);
  }

  @Nullable
  @Override
  public Symbol resolve(String name) {
    Symbol retValue = super.resolve(name);
    return (retValue != null) ? retValue : entitySymbol.resolve(name);
  }

  public String getArchitectureName() {
    return architectureName;
  }

  public EntitySymbol getEntitySymbol() {
    return entitySymbol;
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
