package parser.dnfform;


import parser.symboltable.scope.ArchitectureSymbol;
import parser.symboltable.symbol.InSymbol;
import parser.symboltable.symbol.OutSymbol;
import parser.symboltable.symbol.SignalSymbol;
import parser.symboltable.symbol.Symbol;

import java.util.*;

public class Architecture {

  private String architectureName;

  private List<ArchitectureAssignment> architectureAssignments = new ArrayList<>();

  private List<InSymbol> inputSymbols = new ArrayList<>();
  private List<OutSymbol> outSymbols = new ArrayList<>();
  private List<SignalSymbol> signalSymbols = new ArrayList<>();

  private Map<String, Integer> nameToIndex = new HashMap<>();

  public Architecture(String architectureName, ArchitectureSymbol architectureScope) {
    this.architectureName = architectureName;

    int index = 0;

    for (Symbol symbol : architectureScope.getLinkedScope()) {
      switch (symbol.getType()) {
        case IN:
          inputSymbols.add((InSymbol) symbol);
          nameToIndex.put(symbol.getName(), index++);
          break;
        case OUT:
          outSymbols.add((OutSymbol) symbol);
          break;
      }
    }

    for (Symbol symbol : architectureScope) {
      signalSymbols.add((SignalSymbol) symbol);
      nameToIndex.put(symbol.getName(), index++);
    }
  }

  public void addArchitectureAssignment(ArchitectureAssignment assignment) {
    architectureAssignments.add(assignment);
  }

  public ArchitectureAssignment getArchitectureAssignment(int i) {
    return architectureAssignments.get(i);
  }

  public InSymbol getInputSymbol(int i) {
    return inputSymbols.get(i);
  }

  public OutSymbol getOutSymbol(int i) {
    return outSymbols.get(i);
  }

  public SignalSymbol getSignalSymbol(int i) {
    return signalSymbols.get(i);
  }

  public Iterator<InSymbol> inputIterator() {
    return inputSymbols.iterator();
  }

  public Iterator<OutSymbol> outputIterator() {
    return outSymbols.iterator();
  }

  public Iterator<SignalSymbol> signalIterator() {
    return signalSymbols.iterator();
  }

  public Iterator<ArchitectureAssignment> assignmentIterator() {
    return architectureAssignments.iterator();
  }

  public String getArchitectureName() {
    return architectureName;
  }

  public int identifierNameToIndex(String symbolName) {
    return nameToIndex.getOrDefault(symbolName, -1);
  }
}
