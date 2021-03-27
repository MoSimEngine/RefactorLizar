package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureId;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FeatureScattering {

    private final FeatureId featureId;
    private final Set<ClassId> classIds;

    public FeatureScattering(FeatureId featureId, Set<ClassId> classIds) {
        this.featureId = featureId;
        this.classIds = classIds;
    }

    public static FeatureScattering of(String featureId, Set<String> classIds) {
        return new FeatureScattering(
                FeatureId.of(featureId),
                classIds.stream().map(ClassId::of).collect(Collectors.toSet())
        );
    }
}
