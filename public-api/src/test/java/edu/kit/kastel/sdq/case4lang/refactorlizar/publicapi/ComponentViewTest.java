package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentViewTest extends BaseTest {


  @Test public void test() {

    ComponentView componentView = refactorLizar.visualizeApi().provideComponentView();

    assertEquals(1, componentView.getComponents().size());
    assertEquals(0, componentView.getComponentToComponentRelations().size());
  }
}
