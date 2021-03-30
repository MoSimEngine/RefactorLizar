package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.visualize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClassViewTest extends BaseTest {

    private static RefactorLizar refactorLizar;

    @BeforeAll
    public static void beforeAll() {
        refactorLizar = provideRefactorLizar("class-view");
    }

    @Test
    public void test() {

        ClassView classView = refactorLizar.visualizeApi().provideClassView(ComponentId.of("xppu"));

        assertEquals(4, classView.getClasses().size());
        assertEquals(2, classView.getClassToClassRelations().size());
    }
}
