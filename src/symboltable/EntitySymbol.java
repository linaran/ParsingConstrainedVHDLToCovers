package symboltable;


import static symboltable.SymbolType.ENTITY;

public class EntitySymbol extends BaseScope implements Symbol {

  private final String name;

  public EntitySymbol(String name) {
    this.name = name;
  }

  @Override
  public SymbolType getType() {
    return ENTITY;
  }

  @Override
  public String getName() {
    return name;
  }
}
