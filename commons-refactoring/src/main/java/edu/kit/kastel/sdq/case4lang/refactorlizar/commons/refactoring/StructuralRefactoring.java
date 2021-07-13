package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public interface StructuralRefactoring {
  
  void refactor(ModularLanguage language, SimulatorModel model);
}
