package tests;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle.DependencyCycleAnalyzer;
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
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "type");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No cycle found");
    }

    @Test
    public void packageLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "package");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No cycle found");
    }

    @Test
    public void componentLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "component");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No cycle found");
    }
}
