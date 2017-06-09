package coverfromvhdl.booleantree;


public interface Expression {

  Type getType();

  Expression getArg(int i);

  int getArgCount();

  void setArg(int index, Expression expression);

  public enum Type {
    VARIABLE,
    AND,
    OR,
    NAND,
    NOR,
    XOR,
    NOT
  }
}
