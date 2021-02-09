package SimpleExample.ComponentC;

import SimpleExample.SimulatorComponentB.ComponentB;

public class ComponentC {
  
  public void simulate() {
    // C calls B
    new ComponentB().simulate();
  }
}
