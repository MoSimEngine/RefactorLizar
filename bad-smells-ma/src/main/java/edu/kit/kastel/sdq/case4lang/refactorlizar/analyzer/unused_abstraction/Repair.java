package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.unused_abstraction;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;

public class Repair {

    public void repair(ModularLanguage language, SimulatorModel simulatorModel, CtElement element) {
        element.delete();
    }
}
