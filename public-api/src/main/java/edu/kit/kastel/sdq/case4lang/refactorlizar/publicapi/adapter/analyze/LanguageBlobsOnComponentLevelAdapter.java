package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.LanguageBlob;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.LanguageBlobsOnComponentLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_view.FeatureId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LanguageBlobsOnComponentLevelAdapter extends AnalyzeAdapter {

    public static final String LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID =
            "LanguageBlobAnalyzer";

    public LanguageBlobsOnComponentLevelAdapter(
            ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public LanguageBlobsOnComponentLevel analyze() {

        Report report = loadAnalyzer(LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID).fullAnalysis();

        List<LanguageBlob<ComponentId>> languageBlobs = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : report.getLanguageBlobs().entrySet()) {

            ComponentId componentId = ComponentId.of(entry.getKey());
            Set<FeatureId> featureIds =
                    entry.getValue().stream().map(FeatureId::of).collect(Collectors.toSet());

            languageBlobs.add(LanguageBlob.of(featureIds, componentId));
        }

        return new LanguageBlobsOnComponentLevel(languageBlobs);
    }
}
