package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.exception.AnalyzerNotFoundException;

import javax.annotation.Nonnull;
import java.util.List;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.DependencyCyclesOnClassLevelAdapter.DEPENDENCY_CYCLE_ON_CLASS_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.DependencyCyclesOnComponentLevelAdapter.DEPENDENCY_CYCLE_ON_COMPONENT_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.FeatureScatteringAdapter.FEATURE_SCATTERING_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.LanguageBlobsOnClassLevelAdapter.LANGUAGE_BLOB_ON_CLASS_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.LanguageBlobsOnComponentLevelAdapter.LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.LayerBreachesAdapter.LAYER_BREACH_ANALYZER_ID;

public class AnalyzeApi {

    private final DependencyCyclesOnComponentLevelAdapter dependencyCycleOnComponentLevelAdapter;
    private final DependencyCyclesOnClassLevelAdapter dependencyCycleOnClassLevelAdapter;
    private final FeatureScatteringAdapter featureScatteringAdapter;
    private final LayerBreachesAdapter layerBreachesAdapter;
    private final LanguageBlobsOnClassLevelAdapter languageBlobsOnClassLevelAdapter;
    private final LanguageBlobsOnComponentLevelAdapter languageBlobsOnComponentLevelAdapter;

    public AnalyzeApi() {

        this.dependencyCycleOnComponentLevelAdapter = new DependencyCyclesOnComponentLevelAdapter();
        this.dependencyCycleOnClassLevelAdapter = new DependencyCyclesOnClassLevelAdapter();
        this.featureScatteringAdapter = new FeatureScatteringAdapter();
        this.layerBreachesAdapter = new LayerBreachesAdapter();
        this.languageBlobsOnClassLevelAdapter = new LanguageBlobsOnClassLevelAdapter();
        this.languageBlobsOnComponentLevelAdapter = new LanguageBlobsOnComponentLevelAdapter();
    }

    @Nonnull
    public DependencyCyclesOnComponentLevel detectDependencyCyclesOnComponentLevel() {

        checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ON_COMPONENT_LEVEL_ANALYZER_ID);
        return dependencyCycleOnComponentLevelAdapter.analyze();
    }

    @Nonnull
    public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel() {

        checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ON_CLASS_LEVEL_ANALYZER_ID);
        return dependencyCycleOnClassLevelAdapter.analyze();
    }


    @Nonnull
    public List<FeatureScattering> detectFeatureScattering() {

        checkThatAnalyzerIsAvailable(FEATURE_SCATTERING_ANALYZER_ID);
        return featureScatteringAdapter.analyze();
    }

    @Nonnull
    public LanguageBlobsOnComponentLevel detectLanguageBlobsOnComponentLevel() {

        checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID);
        return languageBlobsOnComponentLevelAdapter.analyze();
    }

    @Nonnull
    public LanguageBlobsOnClassLevel detectLanguageBlobsOnClassLevel() {

        checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ON_CLASS_LEVEL_ANALYZER_ID);
        return languageBlobsOnClassLevelAdapter.analyze();
    }

    @Nonnull
    public List<LayerBreach> detectLayerBreaches() {

        checkThatAnalyzerIsAvailable(LAYER_BREACH_ANALYZER_ID);
        return layerBreachesAdapter.analyze();
    }

    private void checkThatAnalyzerIsAvailable(String analyzerId) {

        boolean available = IAnalyzer.getAllAnalyzer().stream()
                .anyMatch(iAnalyzer -> iAnalyzer.getName().equals(analyzerId));

        if (!available) {
            throw new AnalyzerNotFoundException(analyzerId);
        }
    }
}
