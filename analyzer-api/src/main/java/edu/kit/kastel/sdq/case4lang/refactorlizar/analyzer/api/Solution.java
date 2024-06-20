package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public interface Solution {

    String getHeadline();

    String getDescription();

    void apply(ModularLanguage language, SimulatorModel simulatorModel);
}
