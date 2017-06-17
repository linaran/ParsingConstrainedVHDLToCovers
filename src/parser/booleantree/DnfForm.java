package parser.booleantree;


import parser.booleantree.formulas.*;

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
    switch (expression.getType()) {
      case VARIABLE:
        expressionArgCheck(expression);
        return variableCase(expression);
      case AND:
//        expressionArgCheck(expression);
        return andCase(expression);
      case OR:
//        expressionArgCheck(expression);
        return orCase(expression);
      case NAND:
        expressionArgCheck(expression);
        return nandCase(expression);
      case NOR:
        expressionArgCheck(expression);
        return norCase(expression);
      case XOR:
        expressionArgCheck(expression);
        return xorCase(expression);
      case NOT:
        expressionArgCheck(expression);
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
//    Expression left = recursiveMake(expression.getArg(0));
//    Expression right = recursiveMake(expression.getArg(1));
//
//    List<Expression> expressions = new ArrayList<>();
//    expressionExtraction(left, expressions, OR);
//    expressionExtraction(right, expressions, OR);

    List<Expression> dnfChildren = new ArrayList<>();
    for (Expression arg : expression) {
      dnfChildren.add(recursiveMake(arg));
    }

    List<Expression> expressions = new ArrayList<>();
    for (Expression dnfChild : dnfChildren) {
      expressionExtraction(dnfChild, expressions, OR);
    }

    return new OrExpression(expressions);
  }

  private Expression andCase(Expression expression) {
    List<Expression> dnfChildren = new ArrayList<>();
    boolean hasOr = false;
    for (int i = 0; i < expression.getArgCount(); i++) {
      dnfChildren.add(recursiveMake(expression.getArg(i)));
      if (dnfChildren.get(i).getType() == OR) {
        hasOr = true;
      }
    }

    if (hasOr) {
      List<List<Expression>> extractedExpressionsLists = new ArrayList<>();
      for (Expression dnfChild : dnfChildren) {
        List<Expression> childExpressions = new ArrayList<>();
        expressionExtraction(dnfChild, childExpressions, OR);
        extractedExpressionsLists.add(childExpressions);
      }

      List<List<Expression>> expressionPermutations = new ArrayList<>();
      permutationGenerator(
          extractedExpressionsLists,
          expressionPermutations,
          0,
          new ArrayList<>()
      );

      List<Expression> andExpressions = new ArrayList<>();
      for (List<Expression> expressions : expressionPermutations) {
        andExpressions.add(recursiveMake(new AndExpression(expressions)));
      }

      return new OrExpression(andExpressions);
    } else {
      List<Expression> extractedExpressions = new ArrayList<>();
      for (Expression dnfChild : dnfChildren) {
        expressionExtraction(dnfChild, extractedExpressions, AND);
      }

      return new AndExpression(extractedExpressions);
    }
  }

  private void permutationGenerator(
      List<List<Expression>> lists,
      List<List<Expression>> result,
      int depth,
      List<Expression> current
  ) {
    if (depth == lists.size()) {
      result.add(new ArrayList<>(current));
      return;
    }

    for (int i = 0; i < lists.get(depth).size(); i++) {
      current.add(lists.get(depth).get(i));
      permutationGenerator(lists, result, depth + 1, current);
      current.remove(current.size() - 1);
    }
  }

  private void expressionExtraction(
      Expression expression,
      List<Expression> expressions,
      Expression.Type type
  ) {
    if (expression.getType() == type) {
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
    Expression.Type type = arg.getType();
    if (type != AND && type != NOT && type != OR && type != VARIABLE) {
      arg = recursiveMake(arg);
    }

    switch (arg.getType()) {
      case VARIABLE:
        return expression;
      case AND:
        return recursiveMake(new OrExpression(negatedArgsOf(arg)));
      case OR:
        return recursiveMake(new AndExpression(negatedArgsOf(arg)));
      case NOT:
        return recursiveMake(arg.getArg(0));
      default:
        throw new EnumConstantNotPresentException(
            Expression.Type.class,
            "Enum not supported."
        );
    }
  }

  private List<Expression> negatedArgsOf(Expression expression) {
    List<Expression> retValue = new ArrayList<>();

    for (int i = 0; i < expression.getArgCount(); i++) {
      Expression arg = expression.getArg(i);
      retValue.add(new NotExpression(arg));
    }

    return retValue;
  }

  //  Special operators
  private Expression nandCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return recursiveMake(new OrExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

  private Expression xorCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return recursiveMake(new OrExpression(
        new AndExpression(left, new NotExpression(right)),
        new AndExpression(new NotExpression(left), right)
    ));
  }

  private Expression norCase(Expression expression) {
    Expression left = expression.getArg(0);
    Expression right = expression.getArg(1);

    return recursiveMake(new AndExpression(
        new NotExpression(left),
        new NotExpression(right)
    ));
  }

}
