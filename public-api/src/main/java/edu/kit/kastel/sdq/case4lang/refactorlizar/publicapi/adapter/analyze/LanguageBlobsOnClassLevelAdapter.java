package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LanguageBlobsOnClassLevel;

public class LanguageBlobsOnClassLevelAdapter extends AnalyzeAdapter {

    public static final String LANGUAGE_BLOB_ON_CLASS_LEVEL_ANALYZER_ID = "LanguageBlobAnalyzer";

    public LanguageBlobsOnClassLevelAdapter(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public LanguageBlobsOnClassLevel analyze() {

        return null;
    }
}
