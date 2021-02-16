package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob.PackageVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;

public class SimpleTest {
  
  @Test
  public void simpleLanguageTest() {
    Launcher launcher = new Launcher();
    launcher.addInputResource("./src/test/resources/SimpleExample");
    CtModel model = launcher.buildModel();
    Collection<Feature> feature = new ArrayList<>();
    feature.add(new Feature(model.getAllPackages().stream().filter(v->v.getQualifiedName().contains("FeatureA")).findFirst().get(),null));
    feature.add(new Feature(model.getAllPackages().stream().filter(v->v.getQualifiedName().contains("FeatureB")).findFirst().get(),null));
    ModularLanguage lang = new ModularLanguage(feature);
    CtPackage packag = model.getAllPackages().stream().filter(v->v.getQualifiedName().contains("Simulator")).findFirst().get();
    PackageVisitor visitor = new PackageVisitor(lang);
    packag.accept(visitor);
    assertNotNull(visitor.getReport());
    assertTrue(visitor.getReport().isSmellFound());
    System.out.println(visitor.getReport().toString());
    SimulatorModel simulatorModel = new SimulatorModel(model.getAllPackages().stream().map(v -> new Feature(v,null)).collect(Collectors.toList()));
    visitor = new PackageVisitor(lang);
    visitor.analyzeFullModel(simulatorModel);
    assertNotNull(visitor.getReport());
    assertTrue(visitor.getReport().isSmellFound());
    System.out.println(visitor.getReport().toString());
  }
}
