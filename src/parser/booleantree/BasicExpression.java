package parser.booleantree;


abstract public class BasicExpression implements Expression {
  private Expression[] args;

  public BasicExpression(Expression... expressions) {
    if (expressions.length == 0) {
      this.args = new Expression[getArgCount()];
    } else if (expressions.length != getArgCount()) {
      throw new IllegalArgumentException("Wrong argument count.");
    } else {
      this.args = new Expression[expressions.length];
      System.arraycopy(expressions, 0, this.args, 0, expressions.length);
    }
  }

  @Override
  abstract public Type getType();

  @Override
  public Expression getArg(int i) {
    if (i < 0 || i >= args.length) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    return args[i];
  }

  @Override
  abstract public int getArgCount();

  @Override
  public void setArg(int index, Expression expression) {
    if (index < 0 || index >= args.length) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    args[index] = expression;
  }

}
