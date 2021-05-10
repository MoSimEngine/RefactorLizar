package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class DependencyLayerAnalyzer extends AbstractAnalyzer {

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getName() {
        return "DependencyLayerAnalyzer";
    }

    @Override
    protected void checkSettings(Settings settings) {
        if (SearchLevels.of(settings.getSetting("level").get().getValue()) == null) {
            throw new IllegalArgumentException("No level setting was set");
        }
    }

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean supportsFullAnalysis() {
        return true;
    }

    @Override
    public boolean supportsFullAnalysisLevel(SearchLevels level) {
        switch (level) {
            case TYPE:
                return true;
            case COMPONENT:
                return true;
            case PACKAGE:
                return true;
            default:
                return false;
        }
    }
}
