package mainpoints;


import espresso.boolFunction.Cover;
import espresso.minimizers.espressoMinimizer.SingleOutputEspressoMinimizer;
import generated.VHDLBaseVisitor;
import generated.VHDLLexer;
import generated.VHDLParser;
import generated.VHDLVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.ParseFormulasVisitor;
import parser.SemanticCorrectnessVHDL;
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
    VHDLLexer lexer = new VHDLLexer(CharStreams.fromFileName("vhdl-example/dataflow.vhd"));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    VHDLParser parser = new VHDLParser(tokens);

    listener(parser);
  }

  public static void visitor(VHDLParser parser) {
    VHDLVisitor<Integer> visitor = new VHDLBaseVisitor<>();
    visitor.visitFile(parser.file());
  }

  public static void listener(VHDLParser parser) {
    VHDLParser.FileContext fileContext = parser.file();
    ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
    SemanticCorrectnessVHDL listener = new SemanticCorrectnessVHDL();

    parseTreeWalker.walk(listener, fileContext);
    ParseTreeProperty<Scope> scopes = listener.getScopes();
    GlobalScope globalScope = listener.getGlobalScope();

    if (scopes == null || globalScope == null) {
      return;
    }

    ParseFormulasVisitor visitor = new ParseFormulasVisitor(scopes);
    visitor.visit(fileContext);
    Architecture architecture = visitor.getArchitecture();

    for (Iterator<ArchitectureAssignment> iter = architecture.assignmentIterator();
         iter.hasNext();
        ) {
      ArchitectureAssignment assignment = iter.next();
      assignment.setExpression(DnfForm.instance().make(assignment.getExpression()));
      System.out.println(assignment.getExpression());
    }

    System.out.println("To Cover");
    Cover[] covers = CoversFromArchitecture.instance().produceCovers(architecture);
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
