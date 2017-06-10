package parser.booleantree;


abstract public class BasicExpression implements Expression {
  private Expression[] args;

  public BasicExpression(Expression... expressions) {
    if (expressions.length == 0) {
//      Situation for empty node creation.
      this.args = new Expression[getMinArgCount()];
    } else if (expressions.length >= getMinArgCount()) {
      this.args = new Expression[expressions.length];
      System.arraycopy(expressions, 0, this.args, 0, expressions.length);
    } else {
      throw new IllegalArgumentException("Wrong argument count.");
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
  public int getArgCount() {
    return args.length;
  }

  @Override
  abstract public int getMinArgCount();

  @Override
  public void setArg(int index, Expression expression) {
    if (index < 0 || index >= args.length) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    args[index] = expression;
  }

}
