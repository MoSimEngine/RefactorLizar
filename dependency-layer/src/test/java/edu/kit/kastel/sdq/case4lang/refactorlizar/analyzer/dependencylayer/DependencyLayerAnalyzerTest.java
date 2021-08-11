package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import static com.google.common.truth.Truth.assertThat;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DependencyLayerAnalyzerTest {

    @Nested
    class TypeLevel {
        @Test
        public void wrong_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/wrong_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "type");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correct_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/correct_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "type");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }

    @Nested
    class PackageLevel {
        @Test
        public void wrong_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/wrong_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "package");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correct_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/correct_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "package");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }

    @Nested
    class ComponentLevel {
        @Test
        public void wrong_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/wrong_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "component");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correct_layer() {
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/xppu/modular-language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/xppu/correct_layer",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyLayerAnalyzer dla = new DependencyLayerAnalyzer();
            Settings settings = dla.getSettings();
            settings.setValue("level", "component");
            Report report = dla.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }
}
