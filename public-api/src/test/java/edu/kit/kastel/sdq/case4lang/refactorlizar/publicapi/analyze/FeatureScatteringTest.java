package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.FeatureScattering;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FeatureScatteringTest extends BaseTest {

    private static RefactorLizar refactorLizar;

    @BeforeAll
    public static void beforeAll() {
        refactorLizar = provideRefactorLizar("feature-scattering");
    }

    @Test
    public void test() {

        List<FeatureScattering> featureScatterings =
                refactorLizar.analyzeApi().detectFeatureScattering();

        assertEquals(1, featureScatterings.size());
        assertEquals("aps", featureScatterings.get(0).getFeatureId().getName());
        assertEquals(2, featureScatterings.get(0).getComponentIds().size());
    }
}
