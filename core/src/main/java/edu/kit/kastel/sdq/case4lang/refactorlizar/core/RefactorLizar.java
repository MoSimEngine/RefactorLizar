package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class RefactorLizar {

    public static void main(String[] args) {

        ModularLanguage lang = new ModularLanguage(LanguageParser.parseLanguage(args[1]));
        SimulatorModel model = new SimulatorModel(SimulatorParser.parseSimulator(args[2]));

        System.out.println(IAnalyzer.getAllAnalyzer().size());

        IAnalyzer.getAllAnalyzer()
                .forEach(
                        v -> {
                            v.init(lang, model);
                            if (v.supportsFullAnalysis()) {
                                System.out.println(v.fullAnalysis());
                            }
                        });
    }
}
