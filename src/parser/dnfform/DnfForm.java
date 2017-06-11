package parser.dnfform;


import parser.booleantree.Expression;
import parser.booleantree.formulas.AndExpression;
import parser.booleantree.formulas.NotExpression;
import parser.booleantree.formulas.OrExpression;
import parser.booleantree.formulas.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import static parser.booleantree.Expression.Type.*;

final public class DnfForm {

  private static DnfForm instance = new DnfForm();

  public static DnfForm instance() {
    return instance;
  }

  public Expression make(Expression expression) {
    return recursiveMake(expression);
  }

  private Expression recursiveMake(Expression expression) {
    expressionArgCheck(expression);
    switch (expression.getType()) {
      case VARIABLE:
        return variableCase(expression);
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

  private Expression variableCase(Expression expression) {
    VariableExpression variableExpression = (VariableExpression) expression;
    return new VariableExpression(variableExpression.getName());
  }

  private Expression orCase(Expression expression) {
    Expression left = recursiveMake(expression.getArg(0));
    Expression right = recursiveMake(expression.getArg(1));

    List<Expression> expressions = new ArrayList<>();
    expressionExtractionOrCase(left, expressions);
    expressionExtractionOrCase(right, expressions);

    return new OrExpression(expressions);
  }

  private void expressionExtractionOrCase(Expression expression, List<Expression> expressions) {
    if (expression.getType() == OR) {
      for (int i = 0; i < expression.getArgCount(); i++) {
        expressions.add(expression.getArg(i));
      }
    } else {
      expressions.add(expression);
    }
  }

  private Expression andCase(Expression expression) {
    Expression left = recursiveMake(expression.getArg(0));
    Expression right = recursiveMake(expression.getArg(1));

    if (left.getType() == OR || right.getType() == OR) {
      List<Expression> leftExpressions = new ArrayList<>();
      List<Expression> rightExpressions = new ArrayList<>();

      expressionExtractionAndCase(left, leftExpressions);
      expressionExtractionAndCase(right, rightExpressions);

      List<Expression> expressions = new ArrayList<>();
      for (Expression leftExpression : leftExpressions) {
        for (Expression rightExpression : rightExpressions) {
          expressions.add(new AndExpression(leftExpression, rightExpression));
        }
      }

      return new OrExpression(expressions);
    } else {
      List<Expression> expressions = new ArrayList<>();

      expressionExtractionAndCase(left, expressions);
      expressionExtractionAndCase(right, expressions);

      return new AndExpression(expressions);
    }
  }

  private void expressionExtractionAndCase(Expression expression, List<Expression> expressions) {
    if (expression.getType() == OR || expression.getType() == AND) {
      for (int i = 0; i < expression.getArgCount(); i++) {
        expressions.add(expression.getArg(i));
      }
    } else {
      expressions.add(expression);
    }
  }

  private Expression notCase(Expression expression) {
    Expression arg = expression.getArg(0);

//    First modify expression so De Morgan is applicable.
    if (arg.getType() == XOR || arg.getType() == NOR || arg.getType() == NAND) {
      arg = recursiveMake(arg);
    }

    switch (arg.getType()) {
      case VARIABLE:
        return expression;
      case AND:
        return recursiveMake(new OrExpression(
            new NotExpression(arg.getArg(0)),
            new NotExpression(arg.getArg(1))
        ));
      case OR:
        return recursiveMake(new AndExpression(
            new NotExpression(arg.getArg(0)),
            new NotExpression(arg.getArg(1))
        ));
      case NOT:
        return recursiveMake(arg.getArg(0));
      default:
        throw new EnumConstantNotPresentException(
            Expression.Type.class,
            "Enum not supported."
        );
    }
  }

  private Expression nandCase(Expression expression) {
    Expression left = recursiveMake(expression.getArg(0));
    Expression right = recursiveMake(expression.getArg(1));

    return recursiveMake(new OrExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

  private Expression xorCase(Expression expression) {
    Expression left = recursiveMake(expression.getArg(0));
    Expression right = recursiveMake(expression.getArg(1));

    return recursiveMake(new OrExpression(
        new AndExpression(left, new NotExpression(right)),
        new AndExpression(new NotExpression(left), right)
    ));
  }

  private Expression norCase(Expression expression) {
    Expression left = recursiveMake(expression.getArg(0));
    Expression right = recursiveMake(expression.getArg(1));

    return recursiveMake(new AndExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

}
