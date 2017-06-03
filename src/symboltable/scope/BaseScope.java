package symboltable.scope;


import com.sun.istack.internal.Nullable;
import symboltable.symbol.Symbol;

import java.util.HashMap;
import java.util.Map;

public class BaseScope implements Scope {

  private Scope linkedScope;
  protected Map<String, Symbol> scope = new HashMap<>();

  public BaseScope(Scope linkedScope) {
    this.linkedScope = linkedScope;
  }

  @Override
  public boolean define(Symbol symbol) {
    if (resolve(symbol.getName()) == null) {
      scope.put(symbol.getName(), symbol);
      return true;
    } else {
      return false;
    }
  }

  @Override
  @Nullable
  public Symbol resolve(String name) {
    Symbol retValue = scope.get(name);
    return (retValue != null) ? retValue : linkedScope.resolve(name);
  }

  @Override
  public Scope getLinkedScope() {
    return linkedScope;
  }
}
