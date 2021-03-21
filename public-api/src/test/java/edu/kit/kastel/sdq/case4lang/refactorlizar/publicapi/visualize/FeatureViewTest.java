package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.visualize;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatureViewTest extends BaseTest {

  private static RefactorLizar refactorLizar;

  @BeforeAll public static void beforeAll() {
    refactorLizar = provideRefactorLizar("feature-view");
  }

  @Test public void test() {

    FeatureView featureView = refactorLizar.visualizeApi().provideFeatureView();

    assertEquals(2, featureView.getFeatures().size());
    assertEquals(1, featureView.getFeatureToFeatureRelations().size());
  }
}
