package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob.PackageVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void packageLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        PackageVisitor visitor = new PackageVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.PACKAGE);
        assertNotNull(visitor.getReport());
    }

    @Test
    public void componentLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        PackageVisitor visitor = new PackageVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.COMPONENT);
        assertNotNull(visitor.getReport());
    }

    @Test
    public void typeLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        LanguageParser.parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        SimulatorParser.parseSimulator("src/test/resources/xppu/simulator"));
        PackageVisitor visitor = new PackageVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.TYPE);
        assertNotNull(visitor.getReport());
    }
}
