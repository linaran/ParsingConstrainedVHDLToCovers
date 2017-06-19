package mainpoints;


import espresso.boolFunction.Cover;
import espresso.minimizers.espressoMinimizer.SingleOutputEspressoMinimizer;
import parser.ArchitectureFromVHDL;
import parser.models.Architecture;
import parser.models.ArchitectureAssignment;
import parser.booleantree.DnfForm;
import parser.models.CoverMinimization;

import java.io.IOException;
import java.util.Iterator;

public class Test {

  public static void main(String[] args) throws IOException {
    Architecture architecture = ArchitectureFromVHDL.instance().loadArchitecture("vhdl-example/dataflow.vhd");
    listener(architecture);
  }

  public static void listener(Architecture architecture) {
    for (Iterator<ArchitectureAssignment> iter = architecture.assignmentIterator();
         iter.hasNext();
        ) {
      ArchitectureAssignment assignment = iter.next();
      assignment.setExpression(DnfForm.instance().make(assignment.getExpression()));
      System.out.println(assignment.getExpression());
    }

    System.out.println("To Cover");
//    Cover[] covers = CoversFromArchitecture.instance().produceCovers(architecture);
    Cover[] covers = architecture.generateCovers();
    printCoverArray(covers);

    System.out.println("Minimization");
    CoverMinimization minimizer = new CoverMinimization(SingleOutputEspressoMinimizer.getInstance());
    minimizer.minimizeCovers(covers);
    printCoverArray(covers);

    System.out.println("Done");
  }

  public static void printCoverArray(Cover[] covers) {
    for (Cover cover : covers) {
      System.out.println(cover);
    }
  }
}
