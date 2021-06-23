// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package tests;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob.LanguageBlobAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    void packageLevelReport() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);
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
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);
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
                LanguageParser.parseLanguage(
                        "src/test/resources/xppu/modular-language", InputKind.ECLIPSE_PLUGIN);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/xppu/simulator", InputKind.ECLIPSE_PLUGIN);
        LanguageBlobAnalyzer lba = new LanguageBlobAnalyzer();
        Settings settings = lba.getSettings();
        settings.setValue("level", "type");
        Report report = lba.analyze(lang, model, settings);
        Truth.assertThat(report).isNotNull();
        Truth.assertThat(report.getDescription()).doesNotContain("No language blob was found");
    }
}
