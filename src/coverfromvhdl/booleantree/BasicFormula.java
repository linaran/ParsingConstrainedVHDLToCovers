package coverfromvhdl.booleantree;


abstract public class BasicFormula implements Formula {
  private Formula[] args;

  public BasicFormula(Formula... formulas) {
    if (formulas.length == 0) {
      this.args = new Formula[getArgCount()];
    } else if (formulas.length != getArgCount()) {
      throw new IllegalArgumentException("Wrong argument count.");
    } else {
      this.args = new Formula[formulas.length];
      System.arraycopy(formulas, 0, this.args, 0, formulas.length);
    }
  }

  @Override
  abstract public Type getType();

  @Override
  public Formula getArg(int i) {
    if (i < 0 || i >= args.length) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    return args[i];
  }

  @Override
  abstract public int getArgCount();

  @Override
  public void setArg(int index, Formula formula) {
    if (index < 0 || index >= args.length) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    args[index] = formula;
  }

}
