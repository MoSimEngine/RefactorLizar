package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class RefactorLizar {
  public static void main(String[] args) {
    ModularLanguage lang = new ModularLanguage(new LanguageParser().parseLanguage(args[0]));
    SimulatorModel model = new SimulatorModel(new LanguageParser().parseLanguage(args[1]));
    IAnalyzer.getAllAnalyzer().forEach(v -> {v.init(lang, model); if(v.supportsFullAnalysis()) {
      System.out.println(v.fullAnalysis());
    }});
  }
}
