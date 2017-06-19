package parser.booleantree.formulas;


import parser.booleantree.Expression;

import java.util.*;

import static parser.booleantree.Expression.Type.FALSE;
import static parser.booleantree.Expression.Type.NOT;
import static parser.booleantree.Expression.Type.VARIABLE;

public class NoDuplicateVariableAndExpression extends AndExpression {
  private Set<String> foundPositives = new HashSet<>();
  private Set<String> foundNegatives = new HashSet<>();

  public NoDuplicateVariableAndExpression(Expression... expressions) {
    super(expressions);
    removeDuplicateVariables(args);
  }

  public NoDuplicateVariableAndExpression(Collection<? extends Expression> expressions) {
    super(expressions);
    removeDuplicateVariables(args);
  }

  private void removeDuplicateVariables(List<Expression> args) {
    for (Iterator<Expression> it = args.iterator(); it.hasNext(); ) {
      Expression arg = it.next();

      Boolean argPolarity = getArgVariablePolarity(arg);
      if (argPolarity == null) continue;

      VariableExpression variable;
      if (argPolarity.equals(true)) {
        variable = (VariableExpression) arg;
        if (foundPositives.contains(variable.getName())) {
          it.remove();
        } else {
          foundPositives.add(variable.getName());
        }
      } else if (argPolarity.equals(false)) {
        variable = (VariableExpression) arg.getArg(0);
        if (foundNegatives.contains(variable.getName())) {
          it.remove();
        } else {
          foundNegatives.add(variable.getName());
        }
      }
    }

//    AND expression must have at least 2 arguments.
    if (args.size() == 1) {
      args.add(new TrueConstant());
    }
  }

  /**
   * True is positive which means arg is {@link VariableExpression}.
   * False is negative which means arg is {@link NotExpression} with
   * a child {@link VariableExpression}.
   * <p>
   * Null means that arg isn't a positive or negative variable but something
   * a bit more complicated like {@link AndExpression} or {@link OrExpression}.
   *
   * @param arg {@link Expression}.
   * @return {@link Boolean}.
   */
  private Boolean getArgVariablePolarity(Expression arg) {
    if (arg.getType() == VARIABLE) {
      return true;
    }

    if (arg.getType() == NOT && arg.getArg(0).getType() == VARIABLE) {
      return false;
    }

    return null;
  }

  public boolean isConstantFalse() {
    for (Expression arg : this) {
      if (arg.getType() == FALSE) {
        return true;
      }
    }

    for (String name : foundPositives) {
      if (foundNegatives.contains(name)) {
        return true;
      }
    }

    return false;
  }
}
