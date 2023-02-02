package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_modularity;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class MissingModularity extends AbstractAnalyzer {

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        return new LevelAnalyzer(language, simulatorModel).fullAnalysis();
    }

    @Override
    protected void checkSettings(Settings settings) {}
}
