package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_view.FeatureId;
import java.util.Set;
import java.util.stream.Collectors;

public class FeatureScattering {

    private final FeatureId featureId;
    private final Set<ComponentId> componentIds;

    public FeatureScattering(FeatureId featureId, Set<ComponentId> componentIds) {
        this.featureId = featureId;
        this.componentIds = componentIds;
    }

    public static FeatureScattering of(String featureId, Set<String> componentIds) {
        return new FeatureScattering(
                FeatureId.of(featureId),
                componentIds.stream().map(ComponentId::of).collect(Collectors.toSet()));
    }

    public FeatureId getFeatureId() {
        return featureId;
    }

    public Set<ComponentId> getComponentIds() {
        return componentIds;
    }
}
