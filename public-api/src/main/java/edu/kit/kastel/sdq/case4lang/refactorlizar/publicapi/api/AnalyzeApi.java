package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.DependencyCycleOnComponentLevelAdapter.DEPENDENCY_CYCLE_ANALYZER_ID;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.DependencyCycleOnComponentLevelAdapter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnClassLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnComponentLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.FeatureScattering;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LanguageBlobsOnClassLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LanguageBlobsOnComponentLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.LayerBreach;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.exception.AnalyzerNotFoundException;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.NotImplementedException;

public class AnalyzeApi {

    private static final String FEATURE_SCATTERING_ANALYZER_ID = "FeatureScatterAnalyzer";
    private static final String LANGUAGE_BLOB_ANALYZER_ID = "LanguageBlobAnalyzer";
    private static final String LAYER_BREACH_ANALYZER_ID = "LayerBreachAnalyzer";

    private final DependencyCycleOnComponentLevelAdapter dependencyCycleOnComponentLevelAdapter;

    public AnalyzeApi(
            DependencyCycleOnComponentLevelAdapter dependencyCycleOnComponentLevelAdapter) {
        this.dependencyCycleOnComponentLevelAdapter = dependencyCycleOnComponentLevelAdapter;
    }

    @Nonnull
    public DependencyCyclesOnComponentLevel detectDependencyCyclesOnComponentLevel() {

        checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
        return dependencyCycleOnComponentLevelAdapter.analyze();
    }

    @Nonnull
    public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel() {

        checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
        throw new NotImplementedException();
    }

    @Nonnull
    public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel(
            ComponentId componentId) {

        checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
        throw new NotImplementedException();
    }

    @Nonnull
    public List<FeatureScattering> detectFeatureScattering() {

        checkThatAnalyzerIsAvailable(FEATURE_SCATTERING_ANALYZER_ID);
        throw new NotImplementedException();
    }

    @Nonnull
    public LanguageBlobsOnComponentLevel detectLanguageBlobsOnComponentLevel() {

        checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ANALYZER_ID);
        throw new NotImplementedException();
    }

    @Nonnull
    public LanguageBlobsOnClassLevel detectLanguageBlobsOnClassLevel() {

        checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ANALYZER_ID);
        throw new NotImplementedException();
    }

    @Nonnull
    public List<LayerBreach> detectLayerBreaches() {

        checkThatAnalyzerIsAvailable(LAYER_BREACH_ANALYZER_ID);
        throw new NotImplementedException();
    }

    private void checkThatAnalyzerIsAvailable(String analyzerId) {

        boolean available =
                IAnalyzer.getAllAnalyzer().stream()
                        .anyMatch(iAnalyzer -> iAnalyzer.getName().equals(analyzerId));

        if (!available) {
            throw new AnalyzerNotFoundException(analyzerId);
        }
    }
}
