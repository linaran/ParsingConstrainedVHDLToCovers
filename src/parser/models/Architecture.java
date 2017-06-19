package parser.models;


import espresso.boolFunction.Cover;
import parser.symboltable.scope.ArchitectureSymbol;
import parser.symboltable.symbol.InSymbol;
import parser.symboltable.symbol.OutSymbol;
import parser.symboltable.symbol.SignalSymbol;
import parser.symboltable.symbol.Symbol;

import java.util.*;

public class Architecture {

  private String architectureName;
  private String entityName;

  private List<ArchitectureAssignment> architectureAssignments = new ArrayList<>();

  private List<InSymbol> inSymbols = new ArrayList<>();
  private List<OutSymbol> outSymbols = new ArrayList<>();
  private List<SignalSymbol> signalSymbols = new ArrayList<>();

  private Map<String, Integer> inputNameToIndex = new HashMap<>();
  private Map<String, Integer> outputNameToIndex = new HashMap<>();

  private Cover[] coverCache;

  public Architecture(String entityName, String architectureName, ArchitectureSymbol architectureScope) {
    this.architectureName = architectureName;
    this.entityName = entityName;

    int inputIndex = 0;
    int outputIndex = 0;

    for (Symbol symbol : architectureScope.getLinkedScope()) {
      switch (symbol.getType()) {
        case IN:
          inSymbols.add((InSymbol) symbol);
          inputNameToIndex.put(symbol.getName(), inputIndex++);
          break;
        case OUT:
          outSymbols.add((OutSymbol) symbol);
          outputNameToIndex.put(symbol.getName(), outputIndex++);
          break;
      }
    }

    for (Symbol symbol : architectureScope) {
      signalSymbols.add((SignalSymbol) symbol);
      inputNameToIndex.put(symbol.getName(), inputIndex++);
    }
  }

  public void addArchitectureAssignment(ArchitectureAssignment assignment) {
    architectureAssignments.add(assignment);
  }

  public ArchitectureAssignment getArchitectureAssignment(int i) {
    return architectureAssignments.get(i);
  }

  public int getArchitectureAssignmentCount() {
    return architectureAssignments.size();
  }

  public int getInSymbolCount() {
    return inSymbols.size();
  }

  public int getOutSymbolCount() {
    return outSymbols.size();
  }

  public int getSignalSymbolCount() {
    return signalSymbols.size();
  }

  public InSymbol getInSymbol(int i) {
    return inSymbols.get(i);
  }

  public OutSymbol getOutSymbol(int i) {
    return outSymbols.get(i);
  }

  public SignalSymbol getSignalSymbol(int i) {
    return signalSymbols.get(i);
  }

  public Iterator<InSymbol> inIterator() {
    return inSymbols.iterator();
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

  public String getEntityName() {
    return entityName;
  }

  public int inputIdentifierToIndex(String symbolName) {
    return inputNameToIndex.getOrDefault(symbolName, -1);
  }

  public int outputIdentifierToIndex(String symbolName) {
    return outputNameToIndex.getOrDefault(symbolName, -1);
  }

  public Cover[] generateCovers() {
    coverCache = CoversFromArchitecture.instance().produceCovers(this);
    return coverCache;
  }

  /**
   * After {@link Architecture#generateCovers()} is called a cache
   * of that generation is created. If that method was never called
   * then this method will return null.
   *
   * @return Array of {@link Cover}.
   */
  public Cover[] getCoversCache() {
    return coverCache;
  }
}
