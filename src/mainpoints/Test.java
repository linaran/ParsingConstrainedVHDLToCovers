package mainpoints;


import espresso.boolFunction.Cover;
import espresso.minimizers.espressoMinimizer.SingleOutputEspressoMinimizer;
import generated.VHDLBaseVisitor;
import generated.VHDLLexer;
import generated.VHDLParser;
import generated.VHDLVisitor;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.ArchitectureFromVHDL;
import parser.ParseFormulasVisitor;
import parser.SemanticCorrectnessVHDL;
import parser.ThrowingErrorListener;
import parser.dnfform.Architecture;
import parser.dnfform.ArchitectureAssignment;
import parser.booleantree.DnfForm;
import parser.dnfform.CoverMinimization;
import parser.dnfform.CoversFromArchitecture;
import parser.symboltable.scope.GlobalScope;
import parser.symboltable.scope.Scope;

import java.io.IOException;
import java.util.Arrays;
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
