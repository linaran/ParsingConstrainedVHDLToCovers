package parser.models;


import espresso.boolFunction.Cover;
import espresso.minimizers.minimizerInterface.BooleanOnSetMinimizer;

import java.util.Set;

public class CoverMinimization {

  private BooleanOnSetMinimizer minimizer;

  public CoverMinimization(BooleanOnSetMinimizer minimizer) {
    this.minimizer = minimizer;
  }

  public void minimizeCovers(Cover[] covers, Set<Integer> coverChoices) {
    if (coverChoices.size() == 0) {
      minimizeCovers(covers);
      return;
    }

    for (int i = 0; i < covers.length; i++) {
      if (coverChoices.contains(i)) {
        covers[i] = minimizer.minimize(covers[i]);
      }
    }
  }

  public void minimizeCovers(Cover[] covers) {
    for (int i = 0; i < covers.length; i++) {
      covers[i] = minimizer.minimize(covers[i]);
    }
  }
}
