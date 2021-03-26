package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnClassLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DependencyCyclesOnClassLevelTest extends BaseTest {

    private static RefactorLizar refactorLizar;

    @BeforeAll
    public static void beforeAll() {
        refactorLizar = provideRefactorLizar("dependency-cycle-on-class-level");
    }

    @Test
    public void test() {

        DependencyCyclesOnClassLevel dependencyCyclesOnClassLevel =
                refactorLizar.analyzeApi().detectDependencyCyclesOnClassLevel();

        assertEquals(1, dependencyCyclesOnClassLevel.getDependencyCycles().size());
        assertEquals(2, dependencyCyclesOnClassLevel.getDependencyCycles().get(0).getIds().size());
    }
}
