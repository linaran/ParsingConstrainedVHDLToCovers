package parser.booleantree;


public interface Expression {

  Type getType();

  Expression getArg(int i);

  int getArgCount();

  int getMinArgCount();

  void setArg(int index, Expression expression);

  enum Type {
    VARIABLE,
    AND,
    OR,
    NOT,
    NAND,
    NOR,
    XOR
  }
}
