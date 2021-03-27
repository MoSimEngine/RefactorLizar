package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LanguageBlobsOnComponentLevel;

public class LanguageBlobsOnComponentLevelAdapter extends AnalyzeAdapter {

    public static final String LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID =
            "LanguageBlobAnalyzer";

    public LanguageBlobsOnComponentLevelAdapter(
            ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public LanguageBlobsOnComponentLevel analyze() {

        return null;
    }
}
