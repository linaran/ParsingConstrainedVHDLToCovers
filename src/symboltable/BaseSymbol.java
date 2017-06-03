package symboltable;


abstract public class BaseSymbol implements Symbol {

  private String name;

  public BaseSymbol(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
