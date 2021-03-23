package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.visualize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ComponentViewTest extends BaseTest {

    private static RefactorLizar refactorLizar;

    @BeforeAll
    public static void beforeAll() {
        refactorLizar = provideRefactorLizar("component-view");
    }

    @Test
    public void test() {

        ComponentView componentView = refactorLizar.visualizeApi().provideComponentView();

        assertEquals(1, componentView.getComponents().size());
        assertEquals(0, componentView.getComponentToComponentRelations().size());
    }
}
