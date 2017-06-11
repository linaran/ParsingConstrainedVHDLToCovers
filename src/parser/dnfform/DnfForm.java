package parser.dnfform;


import parser.booleantree.Expression;
import parser.booleantree.formulas.AndExpression;
import parser.booleantree.formulas.NotExpression;
import parser.booleantree.formulas.OrExpression;

import java.util.ArrayList;
import java.util.List;

import static parser.booleantree.Expression.Type.NAND;
import static parser.booleantree.Expression.Type.NOR;
import static parser.booleantree.Expression.Type.XOR;

final public class DnfForm {

  private static DnfForm instance = new DnfForm();

  public static DnfForm instance() {
    return instance;
  }

  public Expression make(Expression expression) {
    expressionArgCheck(expression);
    switch (expression.getType()) {
      case VARIABLE:
        return expression;
      case AND:
        return andCase(expression);
      case OR:
        return orCase(expression);
      case NAND:
        return nandCase(expression);
      case NOR:
        return norCase(expression);
      case XOR:
        return xorCase(expression);
      case NOT:
        return notCase(expression);
      default:
        throw new EnumConstantNotPresentException(
            Expression.Type.class,
            "Given enum not supported."
        );
    }
  }

  private void expressionArgCheck(Expression expression) {
    if (expression.getArgCount() != expression.getMinArgCount()) {
      throw new UnsupportedOperationException(
          "This class accepts only expressions with minimal amount of arguments."
      );
    }
  }

  private Expression orCase(Expression expression) {
    Expression left = make(expression.getArg(0));
    Expression right = make(expression.getArg(1));

    return new OrExpression(left, right);
  }

  private Expression andCase(Expression expression) {
    Expression left = make(expression.getArg(0));
    Expression right = make(expression.getArg(1));

    int leftArgCount = left.getArgCount();
    int rightArgCount = right.getArgCount();
    Expression[] clauses = new Expression[leftArgCount * rightArgCount];

    int clauseIndex = 0;
    for (int i = 0; i < leftArgCount; i++) {
      for (int j = 0; j < rightArgCount; j++) {
        Expression p = left.getArg(i);
        Expression q = right.getArg(j);

        clauses[clauseIndex] = new AndExpression(p, q);
      }
    }

    return new OrExpression(clauses);
  }

  private Expression notCase(Expression expression) {
    Expression arg = expression.getArg(0);

//    First modify expression so De Morgan is applicable.
    if (arg.getType() == XOR || arg.getType() == NOR || arg.getType() == NAND) {
      arg = make(arg);
    }

    switch (arg.getType()) {
      case VARIABLE:
        return expression;
      case AND:
        return make(new OrExpression(
            new NotExpression(arg.getArg(0)),
            new NotExpression(arg.getArg(1))
        ));
      case OR:
        return make(new AndExpression(
            new NotExpression(arg.getArg(0)),
            new NotExpression(arg.getArg(1))
        ));
      case NOT:
        return make(arg.getArg(0));
      default:
        throw new EnumConstantNotPresentException(
            Expression.Type.class,
            "Enum not supported."
        );
    }
  }

  private Expression nandCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return make(new OrExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

  private Expression xorCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return make(new OrExpression(
        new AndExpression(left, new NotExpression(right)),
        new AndExpression(new NotExpression(left), right)
    ));
  }

  private Expression norCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return make(new AndExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

}
