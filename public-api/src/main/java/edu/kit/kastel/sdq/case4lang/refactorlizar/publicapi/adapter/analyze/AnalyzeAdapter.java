package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class AnalyzeAdapter {

    protected final ModularLanguage modularLanguage;
    protected final SimulatorModel simulatorModel;

    protected AnalyzeAdapter(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        this.modularLanguage = modularLanguage;
        this.simulatorModel = simulatorModel;
    }

    protected IAnalyzer loadAnalyzer(String analyzerId) {

        IAnalyzer iAnalyzer =
                IAnalyzer.getAllAnalyzer().stream()
                        .filter(a -> a.getName().equals(analyzerId))
                        .findFirst()
                        .get();

        iAnalyzer.init(modularLanguage, simulatorModel);
        return iAnalyzer;
    }
}
