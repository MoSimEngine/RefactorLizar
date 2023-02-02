package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public abstract class AbstractAnalyzer implements IAnalyzer {

    public Report analyze(
            ModularLanguage language, SimulatorModel simulatorAST, Settings settings) {
        checkSettings(settings);
        return fullAnalysis(language, simulatorAST, settings);
    }

    protected abstract void checkSettings(Settings settings);

    protected abstract Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings);

    @Override
    public String getDescription() {
        return "MISSING";
    }

    @Override
    public String getName() {
        return "MISSING";
    }
}
