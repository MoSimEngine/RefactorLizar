package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.FeatureScattering;

public class FeatureScatteringAdapter extends AnalyzeAdapter {

    public static final String FEATURE_SCATTERING_ANALYZER_ID = "FeatureScatterAnalyzer";

    public FeatureScatteringAdapter(
            ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public List<FeatureScattering> analyze() {

        Report report = loadAnalyzer(FEATURE_SCATTERING_ANALYZER_ID).fullAnalysis();

        List<FeatureScattering> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : report.getFeatureScatterings().entrySet()) {
            result.add(FeatureScattering.of(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
