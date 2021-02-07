package tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter.PackageVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.LanguageFeature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;

public class SimpleTest {
  
  @Test
  public void simpleLanguageTest() {
    Launcher languageLauncher = new Launcher();
    languageLauncher.addInputResource("./src/test/resources/SimpleExample/LanguageFeature");
    CtModel languageModel = languageLauncher.buildModel();

    Collection<LanguageFeature> feature = new ArrayList<>();
    feature.add(new LanguageFeature(languageModel.getAllPackages().stream().filter(v->v.getQualifiedName().contains("Feature")).findFirst().get(),null));
    ModularLanguage lang = new ModularLanguage(feature);

    Launcher simulatorLauncher = new Launcher();
    simulatorLauncher.addInputResource("./src/test/resources/SimpleExample/SimulatorComponentA");
    simulatorLauncher.addInputResource("./src/test/resources/SimpleExample/SimulatorComponentB");
    CtModel simulatorModel = simulatorLauncher.buildModel();
    CtPackage packagA = simulatorModel.getAllPackages().stream().filter(v->v.getQualifiedName().contains("ComponentA")).findFirst().get();
    CtPackage packagB = simulatorModel.getAllPackages().stream().filter(v->v.getQualifiedName().contains("ComponentB")).findFirst().get();
    
    PackageVisitor visitor = new PackageVisitor(lang, simulatorModel);
    packagA.accept(visitor);
    assertNotNull(visitor.getReport());
    assertTrue(visitor.getReport().isSmellFound());
    System.out.println(visitor.getReport().toString());

    visitor = new PackageVisitor(lang, simulatorModel);
    packagB.accept(visitor);
    assertNotNull(visitor.getReport());
    assertTrue(visitor.getReport().isSmellFound());
    System.out.println(visitor.getReport().toString());
  }
}
