package symboltable.scope;


import symboltable.Symbol;

public interface Scope {

  boolean define(Symbol symbol);

  Symbol resolve(String name);

  Scope getLinkedScope();
}
