package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.visualize.ComponentViewAdapter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.visualize.FeatureViewAdapter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_component_view.FeatureComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_view.FeatureView;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.NotImplementedException;

public class VisualizeApi {

    private final FeatureViewAdapter featureViewAdapter;
    private final ComponentViewAdapter componentViewAdapter;

    public VisualizeApi(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {

        featureViewAdapter = new FeatureViewAdapter(modularLanguage);
        componentViewAdapter = new ComponentViewAdapter(simulatorModel);
    }

    @Nonnull
    public FeatureView provideFeatureView() {
        return featureViewAdapter.provideFeatureView();
    }

    @Nonnull
    public ComponentView provideComponentView() {
        return componentViewAdapter.provideComponentView();
    }

    @Nonnull
    public FeatureComponentView provideFeatureComponentView() {
        throw new NotImplementedException();
    }

    @Nonnull
    public ClassView provideClassView(ClassId classId) {
        throw new NotImplementedException();
    }
}
