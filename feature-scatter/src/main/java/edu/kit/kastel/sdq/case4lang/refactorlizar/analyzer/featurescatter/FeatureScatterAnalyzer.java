package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.auto.service.AutoService;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

@AutoService(IAnalyzer.class)
public class FeatureScatterAnalyzer extends AbstractAnalyzer {

    public FeatureScatterAnalyzer() {}

    @Override
    public String getDescription() {
        return "A feature scatter is defined as the usage of a language feature in multiple simulator components";
    }

    @Override
    public String getName() {
        return "FeatureScatterAnalyzer";
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

    @Override
    protected void checkSettings(Settings settings) {
        if (SearchLevels.of(settings.getSetting("level").get().getValue()) == null) {
            throw new IllegalArgumentException("No level setting was set");
        }
    }

    @Override
    public Settings getSettings() {
        return new Settings.SettingsBuilder()
                .addSetting(
                        "level",
                        true,
                        "defines the result level of the smell analyzer, available are: type, component and package")
                .build();
    }

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorAST, Settings settings) {
        return new LevelAnalyzer(language, simulatorAST)
                .fullAnalysis(SearchLevels.of(settings.getSetting("level").get().getValue()));
    }
}
