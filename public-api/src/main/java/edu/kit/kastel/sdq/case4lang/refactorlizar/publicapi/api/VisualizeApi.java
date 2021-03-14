package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.FeatureViewAdapter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_component_view.FeatureComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import org.apache.commons.lang3.NotImplementedException;

import javax.annotation.Nonnull;

public class VisualizeApi {

  private ModularLanguage modularLanguage;
  private final FeatureViewAdapter featureViewAdapter;

  public VisualizeApi(ModularLanguage modularLanguage) {

    this.modularLanguage = modularLanguage;
    featureViewAdapter = new FeatureViewAdapter(modularLanguage);
  }

  @Nonnull public FeatureView provideFeatureView() {
    return featureViewAdapter.provideFeatureView();
  }

  @Nonnull public ComponentView provideComponentView() {
    throw new NotImplementedException();
  }

  @Nonnull public FeatureComponentView provideFeatureComponentView() {
    throw new NotImplementedException();
  }

  @Nonnull public ClassView provideClassView(ClassId classId) {
    throw new NotImplementedException();
  }

}
