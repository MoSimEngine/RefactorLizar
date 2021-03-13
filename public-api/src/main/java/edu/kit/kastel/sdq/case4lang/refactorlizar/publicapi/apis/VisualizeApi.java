package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.apis;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_component_view.FeatureComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import org.apache.commons.lang3.NotImplementedException;

import javax.annotation.Nonnull;

public class VisualizeApi {

  @Nonnull public FeatureView provideFeatureView() {
   throw new NotImplementedException();
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
