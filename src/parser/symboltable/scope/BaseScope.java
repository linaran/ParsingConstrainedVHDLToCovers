package parser.symboltable.scope;


import com.sun.istack.internal.Nullable;
import parser.symboltable.symbol.Symbol;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseScope implements Scope {

  private Scope linkedScope;
  protected Map<String, Symbol> scope = new LinkedHashMap<>();

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

  @Override
  public Iterator<Symbol> iterator() {
    return scope.values().iterator();
  }
}
