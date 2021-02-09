package tests;

import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle.CycleVisitor;
import spoon.Launcher;
import spoon.reflect.CtModel;

public class SimpleTest {
  
  @Test
  public void simpleLanguageTest() {

    Launcher simulatorLauncher = new Launcher();
    simulatorLauncher.addInputResource("./src/test/resources/SimpleExample");
    CtModel simulatorModel = simulatorLauncher.buildModel();
    CycleVisitor visitor = new CycleVisitor();
    System.out.println(visitor.fullAnalysis(simulatorModel).toString());
  }
}
