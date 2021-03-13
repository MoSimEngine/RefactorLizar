package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.*;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.exception.AnalyzerNotFoundException;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import org.apache.commons.lang3.NotImplementedException;

import javax.annotation.Nonnull;
import java.util.List;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefatorLizar.ANALYZER_PATH;

public class AnalyzeApi {

  private static final String DEPENDENCY_CYCLE_ANALYZER_ID = "DependencyCycleAnalyzer";
  private static final String FEATURE_SCATTERING_ANALYZER_ID = "FeatureScatterAnalyzer";
  private static final String LANGUAGE_BLOB_ANALYZER_ID = "LanguageBlobAnalyzer";
  private static final String LAYER_BREACH_ANALYZER_ID = "LayerBreachAnalyzer";

  @Nonnull public DependencyCyclesOnComponentLevel detectDependencyCyclesOnComponentLevel() {

    checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel() {

    checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull
  public DependencyCyclesOnClassLevel detectDependencyCyclesOnClassLevel(ComponentId componentId) {

    checkThatAnalyzerIsAvailable(DEPENDENCY_CYCLE_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull public List<FeatureScattering> detectFeatureScattering() {

    checkThatAnalyzerIsAvailable(FEATURE_SCATTERING_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull public LanguageBlobsOnComponentLevel detectLanguageBlobsOnComponentLevel() {

    checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull public LanguageBlobsOnClassLevel detectLanguageBlobsOnClassLevel() {

    checkThatAnalyzerIsAvailable(LANGUAGE_BLOB_ANALYZER_ID);
    throw new NotImplementedException();
  }

  @Nonnull public List<LayerBreach> detectLayerBreaches() {

    checkThatAnalyzerIsAvailable(LAYER_BREACH_ANALYZER_ID);
    throw new NotImplementedException();
  }


  private void checkThatAnalyzerIsAvailable(String analyzerId) {

    boolean available = IAnalyzer //
        .getAllAnalyzer(ANALYZER_PATH) //
        .stream() //
        .anyMatch(iAnalyzer -> iAnalyzer.getName().equals(analyzerId));

    if (!available) {
      throw new AnalyzerNotFoundException(analyzerId);
    }
  }
}
