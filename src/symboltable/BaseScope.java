package symboltable;


import com.sun.istack.internal.Nullable;

import java.util.HashMap;
import java.util.Map;

public class BaseScope implements Scope {

  protected Map<String, Symbol> scope = new HashMap<>();

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
    return scope.get(name);
  }
}
