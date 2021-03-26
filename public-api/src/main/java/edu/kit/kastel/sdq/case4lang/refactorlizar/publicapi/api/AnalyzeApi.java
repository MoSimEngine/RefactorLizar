package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.DependencyCyclesOnClassLevelAdapter.DEPENDENCY_CYCLE_ON_CLASS_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.DependencyCyclesOnComponentLevelAdapter.DEPENDENCY_CYCLE_ON_COMPONENT_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.FeatureScatteringAdapter.FEATURE_SCATTERING_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.LanguageBlobsOnClassLevelAdapter.LANGUAGE_BLOB_ON_CLASS_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.LanguageBlobsOnComponentLevelAdapter.LANGUAGE_BLOB_ON_COMPONENT_LEVEL_ANALYZER_ID;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.LayerBreachesAdapter.LAYER_BREACH_ANALYZER_ID;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.exception.AnalyzerNotFoundException;
import java.util.List;
import javax.annotation.Nonnull;

public class AnalyzeApi {

    private final DependencyCyclesOnComponentLevelAdapter dependencyCycleOnComponentLevelAdapter;
    private final DependencyCyclesOnClassLevelAdapter dependencyCycleOnClassLevelAdapter;
    private final FeatureScatteringAdapter featureScatteringAdapter;
    private final LayerBreachesAdapter layerBreachesAdapter;
    private final LanguageBlobsOnClassLevelAdapter languageBlobsOnClassLevelAdapter;
    private final LanguageBlobsOnComponentLevelAdapter languageBlobsOnComponentLevelAdapter;

    public AnalyzeApi(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {

        this.dependencyCycleOnComponentLevelAdapter = new DependencyCyclesOnComponentLevelAdapter(modularLanguage, simulatorModel);
        this.dependencyCycleOnClassLevelAdapter = new DependencyCyclesOnClassLevelAdapter(modularLanguage, simulatorModel);
        this.featureScatteringAdapter = new FeatureScatteringAdapter(modularLanguage, simulatorModel);
        this.layerBreachesAdapter = new LayerBreachesAdapter(modularLanguage, simulatorModel);
        this.languageBlobsOnClassLevelAdapter = new LanguageBlobsOnClassLevelAdapter(modularLanguage, simulatorModel);
        this.languageBlobsOnComponentLevelAdapter = new LanguageBlobsOnComponentLevelAdapter(modularLanguage, simulatorModel);
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

        boolean available =
                IAnalyzer.getAllAnalyzer().stream()
                        .anyMatch(iAnalyzer -> iAnalyzer.getName().equals(analyzerId));

        if (!available) {
            throw new AnalyzerNotFoundException(analyzerId);
        }
    }
}
