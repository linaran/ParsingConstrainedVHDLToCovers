package parser;


import generated.VHDLLexer;
import generated.VHDLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.booleantree.DnfForm;
import parser.models.Architecture;
import parser.models.ArchitectureAssignment;
import parser.symboltable.scope.GlobalScope;
import parser.symboltable.scope.Scope;

import java.io.IOException;
import java.util.Iterator;

public class ArchitectureFromVHDL {

  private static ArchitectureFromVHDL instance = new ArchitectureFromVHDL();

  public static ArchitectureFromVHDL instance() {
    return instance;
  }

  private ArchitectureFromVHDL() {
  }

  public Architecture loadArchitectureFromFile(String source) throws IOException {
    VHDLLexer lexer = new VHDLLexer(CharStreams.fromFileName(source));
    return loadArchitecture(lexer);
  }

  public Architecture loadArchitectureFromString(String inputText) {
    VHDLLexer lexer = new VHDLLexer(CharStreams.fromString(inputText));
    return loadArchitecture(lexer);
  }

  private Architecture loadArchitecture(VHDLLexer lexer) {
    lexer.removeErrorListeners();
    lexer.addErrorListener(ThrowingErrorListener.instance);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    VHDLParser parser = new VHDLParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(ThrowingErrorListener.instance);

    VHDLParser.FileContext fileContext = parser.file();
    ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
    SemanticCorrectnessVHDL listener = new SemanticCorrectnessVHDL();

    parseTreeWalker.walk(listener, fileContext);
    ParseTreeProperty<Scope> scopes = listener.getScopes();
    GlobalScope globalScope = listener.getGlobalScope();

    if (scopes == null || globalScope == null) {
      throw new UnsupportedOperationException("Unable to create scopes.");
    }

    ParseFormulasVisitor visitor = new ParseFormulasVisitor(scopes);
    visitor.visit(fileContext);

    Architecture architecture = visitor.getArchitecture();
    for (Iterator<ArchitectureAssignment> iter = architecture.assignmentIterator();
         iter.hasNext();
        ) {
      ArchitectureAssignment assignment = iter.next();
      assignment.setExpression(DnfForm.instance().make(assignment.getExpression()));
    }

    return architecture;
  }
}
