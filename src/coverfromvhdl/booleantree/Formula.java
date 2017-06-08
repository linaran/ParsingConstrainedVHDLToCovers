package coverfromvhdl.booleantree;


import java.util.Arrays;

public interface Formula {

  Type getType();

  Formula getArg(int i);

  int getArgCount();

  void setArg(int index, Formula formula);

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
