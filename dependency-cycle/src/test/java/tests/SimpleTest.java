package tests;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle.DependencyCycleAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void typeLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);

        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "type");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("no dependency cycle found");
    }

    @Test
    public void packageLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);

        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "package");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("no dependency cycle found");
    }

    @Test
    public void componentLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);
        DependencyCycleAnalyzer dca = new DependencyCycleAnalyzer();
        Settings settings = dca.getSettings();
        settings.setValue("level", "component");
        Report report = dca.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).contains("no dependency cycle found");
    }
}
