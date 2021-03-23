package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter.PackageVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;

public class SimpleTest {

    @Test
    public void simpleLanguageTest() {
        Launcher languageLauncher = new Launcher();
        languageLauncher.addInputResource("./src/test/resources/SimpleExample/LanguageFeature");
        CtModel languageModel = languageLauncher.buildModel();

        Collection<Feature> feature = new ArrayList<>();
        feature.add(
                new Feature(
                        languageModel.getAllPackages().stream()
                                .filter(v -> v.getQualifiedName().contains("Feature"))
                                .findFirst()
                                .get(),
                        null));
        ModularLanguage lang = new ModularLanguage(feature);

        Launcher simulatorLauncher = new Launcher();
        simulatorLauncher.addInputResource(
                "./src/test/resources/SimpleExample/SimulatorComponentA");
        simulatorLauncher.addInputResource(
                "./src/test/resources/SimpleExample/SimulatorComponentB");
        CtModel simulatorModel = simulatorLauncher.buildModel();
        CtPackage packagA =
                simulatorModel.getAllPackages().stream()
                        .filter(v -> v.getQualifiedName().contains("ComponentA"))
                        .findFirst()
                        .get();
        CtPackage packagB =
                simulatorModel.getAllPackages().stream()
                        .filter(v -> v.getQualifiedName().contains("ComponentB"))
                        .findFirst()
                        .get();

        SimulatorModel model1 =
                new SimulatorModel(
                        simulatorModel.getAllPackages().stream()
                                .map(v -> new Feature(v, null))
                                .collect(Collectors.toList()));

        PackageVisitor visitor = new PackageVisitor(lang, model1);
        packagA.accept(visitor);
        assertNotNull(visitor.getReport());
        assertTrue(visitor.getReport().isSmellFound());
        System.out.println(visitor.getReport().toString());

        visitor = new PackageVisitor(lang, model1);
        packagB.accept(visitor);
        assertNotNull(visitor.getReport());
        assertTrue(visitor.getReport().isSmellFound());
        System.out.println(visitor.getReport().toString());
    }
}
