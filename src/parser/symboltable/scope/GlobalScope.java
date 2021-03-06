package parser.symboltable.scope;

import parser.symboltable.symbol.Symbol;

final public class GlobalScope extends BaseScope {

  public GlobalScope() {
    super(null);
  }

  public GlobalScope(Scope enclosingScope) {
    super(enclosingScope);
  }

  @Override
  public Symbol resolve(String name) {
    return scope.get(name);
  }

  @Override
  public Scope getLinkedScope() {
    return null;
  }
}
