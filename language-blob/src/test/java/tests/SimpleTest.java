package tests;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob.LanguageBlobAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    void packageLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        LanguageBlobAnalyzer lba = new LanguageBlobAnalyzer();
        Settings settings = lba.getSettings();
        settings.setValue("level", "package");
        Report report = lba.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No language blob was found");
    }

    @Test
    void componentLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        LanguageBlobAnalyzer lba = new LanguageBlobAnalyzer();
        Settings settings = lba.getSettings();
        settings.setValue("level", "component");
        Report report = lba.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No language blob was found");
    }

    @Test
    void typeLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        LanguageBlobAnalyzer lba = new LanguageBlobAnalyzer();
        Settings settings = lba.getSettings();
        settings.setValue("level", "type");
        Report report = lba.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No language blob was found");
    }
}
