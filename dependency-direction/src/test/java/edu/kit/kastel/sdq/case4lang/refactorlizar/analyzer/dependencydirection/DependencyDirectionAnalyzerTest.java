package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

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

public class DependencyDirectionAnalyzerTest {
    @Nested
    class TypeLevel {
        @Test
        public void wrongDirection() {
            /*
            * Type user.Foo in domain layer is used in xppu.Bar at paradigm layer
              Layer input is domain, paradigm this means domain is a lower layer then paradigm
             ---------
             |paradigm|  Bar
             ---------
                |
             ----------
             | domain  | Foo
             ----------
             Bar uses an lower layer and breaches the strict layering.
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/wrong_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "type");
            settings.setValue("layers", "domain,paradigm");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correctDirection() {
            /*
            * Type user.Foo in paradigm layer is used in xppu.Bar at domain layer
              Layer input is paradigm,domain this means paradigm is a lower layer then domain
             ---------
             |domain |  Bar
             ---------
                |
             ----------
             | paradigm| Foo
             ----------
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/correct_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "type");
            settings.setValue("layers", "paradigm,domain");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }

    @Nested
    class PackageLevel {
        @Test
        public void wrongDirection() {
            /*
            * Type user.Foo in domain layer is used in xppu.Bar at paradigm layer
              Layer input is domain, paradigm this means domain is a lower layer then paradigm
             ---------
             |paradigm|  Bar
             ---------
                |
             ----------
             | domain  | Foo
             ----------
             Bar uses an lower layer and breaches the strict layering.
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/wrong_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "package");
            settings.setValue("layers", "domain,paradigm");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correctDirection() {
            /*
            * Type user.Foo in paradigm layer is used in xppu.Bar at domain layer
              Layer input is paradigm,domain this means paradigm is a lower layer then domain
             ---------
             |domain |  Bar
             ---------
                |
             ----------
             | paradigm| Foo
             ----------
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/correct_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "package");
            settings.setValue("layers", "paradigm,domain");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }

    @Nested
    class ComponentLevel {
        @Test
        public void wrongDirection() {
            /*
            * Type user.Foo in domain layer is used in xppu.Bar at paradigm layer
              Layer input is domain, paradigm this means domain is a lower layer then paradigm
             ---------
             |paradigm|  Bar
             ---------
                |
             ----------
             | domain  | Foo
             ----------
             Bar uses an lower layer and breaches the strict layering.
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/wrong_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "component");
            settings.setValue("layers", "domain,paradigm");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isTrue();
        }

        @Test
        public void correctDirection() {
            /*
            * Type user.Foo in paradigm layer is used in xppu.Bar at domain layer
              Layer input is paradigm,domain this means paradigm is a lower layer then domain
             ---------
             |domain |  Bar
             ---------
                |
             ----------
             | paradigm| Foo
             ----------
             */
            ModularLanguage language =
                    LanguageParser.parseLanguage(
                            "src/test/resources/projects/modular_language",
                            InputKind.ECLIPSE_PLUGIN);
            SimulatorModel simulator =
                    SimulatorParser.parseSimulator(
                            "src/test/resources/projects/correct_direction",
                            InputKind.ECLIPSE_PLUGIN);
            DependencyDirectionAnalyzer dda = new DependencyDirectionAnalyzer();
            Settings settings = dda.getSettings();
            settings.setValue("level", "component");
            settings.setValue("layers", "paradigm,domain");
            Report report = dda.analyze(language, simulator, settings);
            assertThat(report).isNotNull();
            assertThat(report.isSmellFound()).isFalse();
        }
    }
}
