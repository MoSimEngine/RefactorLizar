package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureView;
import org.junit.jupiter.api.Test;

public class FeatureViewTest extends BaseTest {

    @Test
    public void test() {

        FeatureView featureView = refactorLizar.visualizeApi().provideFeatureView();

        assertEquals(2, featureView.getFeatures().size());
        assertEquals(1, featureView.getFeatureToFeatureRelations().size());
    }
}
