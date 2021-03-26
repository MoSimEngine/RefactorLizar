package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnClassLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.FeatureScattering;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    }
}
