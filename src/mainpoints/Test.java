package mainpoints;


import coverfromvhdl.CoversFromVHDListener;
import coverfromvhdl.SemanticCorrectnessVHDL;
import generated.VHDLBaseVisitor;
import generated.VHDLLexer;
import generated.VHDLParser;
import generated.VHDLVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

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
  }
}
