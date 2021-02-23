package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class RefactorLizar {
  public static void main(String[] args) {
    ModularLanguage lang = new ModularLanguage(new LanguageParser().parseLanguage(args[1]));
    SimulatorModel model = new SimulatorModel(new SimulatorParser().parseLanguage(args[2]));
    System.out.println(IAnalyzer.getAllAnalyzer(args[0]).size());
    IAnalyzer.getAllAnalyzer(args[0]).forEach(v -> {v.init(lang, model); if(v.supportsFullAnalysis()) {
      System.out.println(v.fullAnalysis());
    }});
  }
}
