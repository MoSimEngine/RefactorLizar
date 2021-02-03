package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;

public class RefactorLizar {
  public static void main(String[] args) {
    IAnalyzer.getAllAnalyzer().forEach(System.out::println);
  }
}
