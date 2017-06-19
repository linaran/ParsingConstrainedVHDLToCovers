package mainpoints;


import espresso.boolFunction.Cover;
import espresso.minimizers.espressoMinimizer.SingleOutputEspressoMinimizer;
import parser.ArchitectureFromVHDL;
import parser.models.Architecture;
import parser.models.ArchitectureAssignment;
import parser.booleantree.DnfForm;
import parser.models.CoverMinimization;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Test {

  public static void main(String[] args) throws IOException {
//    Architecture architecture = ArchitectureFromVHDL.instance()
//        .loadArchitectureFromString(readFile("vhdl-example/dataflow.vhd"));
    Architecture architecture = ArchitectureFromVHDL.instance().loadArchitectureFromFile("vhdl-example/dataflow.vhd");
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

  static String readFile(String path) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, StandardCharsets.UTF_8);
  }
}
