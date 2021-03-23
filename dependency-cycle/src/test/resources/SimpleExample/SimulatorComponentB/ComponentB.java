package SimpleExample.SimulatorComponentB;

import SimpleExample.SimulatorComponentA.ComponentA;

public class ComponentB {

    public void simulate() {
        // B calls A
        new ComponentA().simulate();
    }
}
