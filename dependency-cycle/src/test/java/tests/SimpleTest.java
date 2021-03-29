package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Collection;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle.CycleVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.Launcher;
import spoon.reflect.CtModel;

public class SimpleTest {

    @Test
    public void simpleLanguageTest() {

        Launcher simulatorLauncher = new Launcher();
        simulatorLauncher.addInputResource("./src/test/resources/SimpleExample");
        CtModel simulatorModel = simulatorLauncher.buildModel();
        Collection<Feature> features =
                simulatorModel.getAllPackages().stream()
                        .map(v -> new Feature(v, null))
                        .collect(Collectors.toList());
        SimulatorModel model = new SimulatorModel(features);
        CycleVisitor visitor = new CycleVisitor();
        System.out.println(visitor.fullAnalysis(model).toString());
    }


    @Test
    public void typeLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        new LanguageParser().parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        new SimulatorParser().parseLanguage("src/test/resources/xppu/simulator"));
        CycleVisitor visitor = new CycleVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.TYPE);
        assertNotNull(visitor.getReport());
    }
    @Test
    public void packageLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        new LanguageParser().parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        new SimulatorParser().parseLanguage("src/test/resources/xppu/simulator"));
        CycleVisitor visitor = new CycleVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.PACKAGE);
        assertNotNull(visitor.getReport());
    }

    @Test
    public void componentLevelReport() {
        ModularLanguage lang =
                new ModularLanguage(
                        new LanguageParser().parseLanguage("src/test/resources/xppu/modular-language"));
        SimulatorModel model =
                new SimulatorModel(
                        new SimulatorParser().parseLanguage("src/test/resources/xppu/simulator"));
        CycleVisitor visitor = new CycleVisitor(lang, model);
        visitor.fullAnalysis(SearchLevels.COMPONENT);
        assertNotNull(visitor.getReport());
    }
}
