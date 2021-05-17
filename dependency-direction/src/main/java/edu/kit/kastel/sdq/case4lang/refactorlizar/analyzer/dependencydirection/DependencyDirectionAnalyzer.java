package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import com.google.common.base.Splitter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashMap;
import java.util.Map;

public class DependencyDirectionAnalyzer extends AbstractAnalyzer {

    @Override
    public String getDescription() {
        return "TODO";
    }

    @Override
    public String getName() {
        return "Dependency Direction Analyzer";
    }

    @Override
    protected void checkSettings(Settings settings) {
        if (SearchLevels.of(settings.getSetting("level").get().getValue()) == null) {
            throw new IllegalArgumentException("No level setting was set");
        }
        if (settings.getSetting("layers").isEmpty()) {
            throw new IllegalArgumentException("No layer input was given");
        }
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
    public Settings getSettings() {
        return new Settings.SettingsBuilder()
                .addSetting(
                        "level",
                        true,
                        "defines the result level of the smell analyzer, available are: type, component and package")
                .addSetting(
                        "layers",
                        true,
                        "A list of layers separated by ','. The order is given by the input order. 'A,B,C' means that A is lower than B")
                .build();
    }

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorAST, Settings settings) {
        Map<String, Integer> levelValues = new HashMap<>();
        String layers = settings.getSetting("layers").get().getValue();
        int value = 0;
        for (String layer : Splitter.on(',').split(layers)) {
            levelValues.put(layer.trim().toLowerCase(), value++);
        }
        return new LevelAnalyzer(language, simulatorAST)
                .fullAnalysis(
                        SearchLevels.of(settings.getSetting("level").get().getValue()),
                        levelValues);
    }
}
