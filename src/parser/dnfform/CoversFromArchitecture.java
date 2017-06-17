package parser.dnfform;


import espresso.boolFunction.Cover;
import espresso.boolFunction.InputState;
import espresso.boolFunction.cube.Cube;
import parser.booleantree.Expression;
import parser.booleantree.formulas.NotExpression;
import parser.booleantree.formulas.VariableExpression;

import static espresso.boolFunction.InputState.*;
import static parser.booleantree.Expression.Type.*;

public class CoversFromArchitecture {
  private static CoversFromArchitecture instance = new CoversFromArchitecture();

  public static CoversFromArchitecture instance() {
    return instance;
  }

  private CoversFromArchitecture() {
  }

  private Architecture architecture;

  public Cover[] produceCovers(Architecture paramArchitecture) {
    architecture = paramArchitecture;

    int assignmentCount = architecture.getArchitectureAssignmentCount();
    Cover[] covers = new Cover[assignmentCount];

    for (int i = 0; i < assignmentCount; i++) {
      ArchitectureAssignment assignment = architecture.getArchitectureAssignment(i);
      Expression expression = assignment.getExpression();

      if (expression.getType() == OR) {
        covers[i] = processOrExpression(expression);
      } else if (expression.getType() == AND) {
        Cube cube = processAndExpression(expression);
        covers[i] = new Cover(cube);
      } else if (expression.getType() == FALSE) {
        covers[i] = new Cover(getTotalInputCount(), 1);
      } else if (expression.getType() == TRUE) {
        Cube cube = new Cube(getTotalInputCount(), 1);
        covers[i] = new Cover(cube);
      } else {
        onlyDnfSupported();
      }
    }

    return covers;
  }

  private void onlyDnfSupported() {
    throw new UnsupportedOperationException("Only DNF forms supported. See DnfForm#make.");
  }

  private Cube processAndExpression(Expression expression) {
    int inputCount = architecture.getInSymbolCount() + architecture.getSignalSymbolCount();
    Cube cube = new Cube(inputCount, 1);

    for (int i = 0; i < expression.getArgCount(); i++) {
      Expression variable = expression.getArg(i);
      String variableName = retrieveName(variable);
      int cubeIndex = architecture.inputIdentifierToIndex(variableName);
      boolean isNegated = isNegated(variable);

      InputState newState = isNegated ? ZERO : ONE;
      InputState oldState = cube.getInputState(cubeIndex);

      if (oldState != DONTCARE && InputState.and(oldState, newState) == ZERO) {
        setCubeInputsAsZero(cube);
        return cube;
      } else {
        cube.setInput(newState, cubeIndex);
      }
    }

    return cube;
  }

  private Cover processOrExpression(Expression expression) {
    int inputCount = architecture.getInSymbolCount() + architecture.getSignalSymbolCount();
    Cover cover = new Cover(inputCount, 1);

    for (int i = 0; i < expression.getArgCount(); i++) {
      Expression child = expression.getArg(i);

      if (child.getType() == VARIABLE || child.getType() == NOT) {
        String variableName = retrieveName(child);
        int cubeIndex = architecture.inputIdentifierToIndex(variableName);
        InputState newState = isNegated(child) ? ZERO : ONE;

        Cube cube = new Cube(inputCount, 1);
        cube.setInput(newState, cubeIndex);
        cover.add(cube);
      } else if (child.getType() == AND) {
        Cube cube = processAndExpression(child);
        cover.add(cube);
      } else if (child.getType() == TRUE) {
        cover.add(new Cube(inputCount, 1));
      } else if (child.getType() != FALSE) {
        onlyDnfSupported();
      }
    }

    return cover;
  }

  private boolean isNegated(Expression variable) {
    if (variable.getType() == VARIABLE) {
      return false;
    } else if (variable.getType() == NOT) {
      return true;
    } else {
      throw new UnsupportedOperationException(
          "Method accepts VARIABLE or negate with NOT Expression types."
      );
    }
  }

  private String retrieveName(Expression variable) {
    if (variable instanceof VariableExpression) {
      return ((VariableExpression) variable).getName();
    } else if (variable instanceof NotExpression) {
      return retrieveName(variable.getArg(0));
    } else {
      throw new UnsupportedOperationException(
          "Method accepts VARIABLE or negated with NOT VARIABLE Expression types."
      );
    }
  }

  private void setCubeInputsAsZero(Cube cube) {
    for (int i = 0; i < cube.inputLength(); i++) {
      cube.setInput(ZERO, i);
    }
  }

  private int getTotalInputCount() {
    return architecture.getInSymbolCount() + architecture.getSignalSymbolCount();
  }

}
