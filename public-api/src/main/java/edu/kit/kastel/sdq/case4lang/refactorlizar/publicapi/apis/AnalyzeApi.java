package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.apis;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import org.apache.commons.lang3.NotImplementedException;

import javax.annotation.Nonnull;
import java.util.List;

public class AnalyzeApi {

  @Nonnull public DependencyCyclesOnComponentLevel detectDependencyCyclesOnComponentLevel() {
   throw new NotImplementedException();
  }

  @Nonnull public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel() {
   throw new NotImplementedException();
  }

  @Nonnull
  public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel(ComponentId componentId) {
   throw new NotImplementedException();
  }

  @Nonnull public List<FeatureScattering> detectFeatureScattering() {
   throw new NotImplementedException();
  }

  @Nonnull public LanguageBlobsOnComponentLevel detectLanguageBlobsOnComponentLevel() {
   throw new NotImplementedException();
  }

  @Nonnull public LanguageBlobsOnClassLevel detectLanguageBlobsOnClassLevel() {
   throw new NotImplementedException();
  }

  @Nonnull public List<LayerBreach> detectLayerBreaches() {
   throw new NotImplementedException();
  }


}
