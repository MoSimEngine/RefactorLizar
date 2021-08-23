package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

public class FeatureScatterAnalyzerTest {

    @Test
    void typeLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/projects//modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/projects//simulator", InputKind.ECLIPSE_PLUGIN);
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "type");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).contains("Found 2 feature scatter");
    }

    @Test
    void packageLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/projects//modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/projects//simulator", InputKind.ECLIPSE_PLUGIN);
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "package");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).contains("Found 1 feature scatter");
    }

    @Test
    void componentLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/projects//modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/projects//simulator", InputKind.ECLIPSE_PLUGIN);
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "component");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).contains("Found 1 feature scatter");
    }
}
