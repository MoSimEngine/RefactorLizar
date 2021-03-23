package tests;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle.CycleVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
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
}
