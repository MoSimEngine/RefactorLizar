package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.visualize;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureToFeatureRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import java.util.List;
import java.util.stream.Collectors;

public class FeatureViewAdapter {

    private final ModularLanguage modularLanguage;

    public FeatureViewAdapter(ModularLanguage modularLanguage) {
        this.modularLanguage = modularLanguage;
    }

    public FeatureView provideFeatureView() {

        List<Feature> features =
                modularLanguage.getLanguageFeature().stream()
                        .map(this::convert)
                        .collect(Collectors.toList());

        List<FeatureToFeatureRelation> featureToFeatureRelations =
                modularLanguage.getLanguageFeature().stream()
                        .flatMap(feature -> findEdges(feature).stream())
                        .collect(Collectors.toList());

        return new FeatureView(features, featureToFeatureRelations);
    }

    private List<FeatureToFeatureRelation> findEdges(
            edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature input) {

        FeatureId self = FeatureId.of(input.getBundle().getName());

        return input.getBundle().getInternalRequiredBundles().stream()
                .map(
                        internalRequiredBundle ->
                                FeatureToFeatureRelation.of(
                                        self, FeatureId.of(internalRequiredBundle)))
                .collect(Collectors.toList());
    }

    private Feature convert(edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature input) {

        FeatureId featureId = FeatureId.of(input.getBundle().getName());
        return Feature.of(featureId);
    }
}
