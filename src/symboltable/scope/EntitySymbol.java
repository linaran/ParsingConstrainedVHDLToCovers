package symboltable.scope;


import symboltable.Symbol;
import symboltable.SymbolType;

import static symboltable.SymbolType.ENTITY;

final public class EntitySymbol extends BaseScope implements Symbol {

  private final String name;

  public EntitySymbol(String name) {
    super(null);
    this.name = name;
  }

  @Override
  public Symbol resolve(String name) {
    return scope.get(name);
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
