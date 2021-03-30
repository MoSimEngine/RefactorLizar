package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.DependencyCyclesOnComponentLevel;
import org.apache.commons.lang3.NotImplementedException;

public class DependencyCyclesOnComponentLevelAdapter extends AnalyzeAdapter {

    public static final String DEPENDENCY_CYCLE_ON_COMPONENT_LEVEL_ANALYZER_ID =
            "DependencyCycleAnalyzer";

    public DependencyCyclesOnComponentLevelAdapter(
            ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public DependencyCyclesOnComponentLevel analyze() {
        throw new NotImplementedException();
    }
}
