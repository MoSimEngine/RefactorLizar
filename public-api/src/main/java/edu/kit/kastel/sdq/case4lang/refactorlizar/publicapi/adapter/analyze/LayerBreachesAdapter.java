package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LayerBreach;
import java.util.List;

public class LayerBreachesAdapter extends AnalyzeAdapter {

    public static final String LAYER_BREACH_ANALYZER_ID = "LayerBreachAnalyzer";

    public LayerBreachesAdapter(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public List<LayerBreach> analyze() {

        return null;
    }
}
