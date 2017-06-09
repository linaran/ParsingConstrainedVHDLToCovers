package symboltable.scope;


import symboltable.symbol.Symbol;

public interface Scope extends Iterable<Symbol> {

  boolean define(Symbol symbol);

  Symbol resolve(String name);

  Scope getLinkedScope();
}
