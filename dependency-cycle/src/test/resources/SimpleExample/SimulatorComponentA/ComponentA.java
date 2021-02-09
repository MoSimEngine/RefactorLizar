package SimpleExample.SimulatorComponentA;

import SimpleExample.ComponentC.ComponentC;
import SimpleExample.SimulatorComponentB.ComponentB;

public class ComponentA {
  
  public void simulate() {
    // A calls C 
    new ComponentC().simulate();
    new ComponentA().simulate();
    new ComponentB().simulate();
  }
}
