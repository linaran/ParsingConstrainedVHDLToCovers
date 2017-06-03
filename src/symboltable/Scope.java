package symboltable;


public interface Scope {

  boolean define(Symbol symbol);

  Symbol resolve(String name);
}
