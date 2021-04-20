package tests;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter.FeatureScatterAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void typeLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/modular-language"));
        SimulatorModel model =
                new SimulatorModel(SimulatorParser.parseSimulator("src/test/resources/simulator"));
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "type");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("Found 0 feature scatter ");
    }

    @Test
    public void packageLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/modular-language"));
        SimulatorModel model =
                new SimulatorModel(SimulatorParser.parseSimulator("src/test/resources/simulator"));
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "package");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("Found 0 feature scatter ");
    }

    @Test
    public void componentLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/modular-language"));
        SimulatorModel model =
                new SimulatorModel(SimulatorParser.parseSimulator("src/test/resources/simulator"));
        FeatureScatterAnalyzer fca = new FeatureScatterAnalyzer();
        Settings settings = fca.getSettings();
        settings.setValue("level", "component");
        Report report = fca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).contains("Found 0 feature scatter ");
    }
}
