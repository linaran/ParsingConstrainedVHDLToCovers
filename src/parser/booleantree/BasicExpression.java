package parser.booleantree;


import parser.booleantree.formulas.VariableExpression;

import java.util.*;

import static parser.booleantree.Expression.Type.VARIABLE;

abstract public class BasicExpression implements Expression {
  protected List<Expression> args = new ArrayList<>();

  public BasicExpression(Expression... expressions) {
    init(expressions);
  }

  public BasicExpression(Collection<? extends Expression> expressions) {
    init(expressions.toArray(new Expression[0]));
  }

  private void init(Expression... expressions) {
    if (expressions.length == 0) {
//      Situation for empty node creation.
      for (int i = 0; i < getMinArgCount(); i++) {
        this.args.add(null);
      }
    } else if (expressions.length >= getMinArgCount()) {
      for (Expression expression : expressions) {
        if (expression != null) {
          args.add(expression);
        }
      }
    } else {
      throw new IllegalArgumentException("Wrong argument count.");
    }
  }

  @Override
  abstract public Type getType();

  @Override
  public Expression getArg(int i) {
    if (i < 0 || i >= args.size()) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    return args.get(i);
  }

  @Override
  public int getArgCount() {
    return args.size();
  }

  @Override
  abstract public int getMinArgCount();

  @Override
  public void setArg(int index, Expression expression) {
    if (index < 0 || index >= args.size()) {
      throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    args.set(index, expression);
  }

  private String print(String prefix, boolean isTail) {
    StringBuilder retValue = new StringBuilder();

    retValue.
        append(prefix).
        append(isTail ? "└── " : "├── ").
        append(getType() == VARIABLE ?
            getType() + ": " + ((VariableExpression) this).getName() : getType()).
        append("\n");

    for (int i = 0; i < args.size() - 1; i++) {
      retValue.append(((BasicExpression) args.get(i))
          .print(prefix + (isTail ? "    " : "│   "), false));
    }
    if (args.size() > 0) {
      retValue.append(((BasicExpression) args.get(args.size() - 1))
          .print(prefix + (isTail ? "    " : "│   "), true));
    }

    return retValue.toString();
  }

  @Override
  public String toString() {
    return print("", true);
  }

  @Override
  public Iterator<Expression> iterator() {
    return args.iterator();
  }
}
