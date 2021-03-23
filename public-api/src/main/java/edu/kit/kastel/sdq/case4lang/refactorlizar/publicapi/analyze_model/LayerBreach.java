package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassToClassRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentToComponentRelation;

public class LayerBreach {

    private final ComponentToComponentRelation componentToComponentRelation;
    private final ClassToClassRelation classToClassRelation;

    public LayerBreach(
            ComponentToComponentRelation componentToComponentRelation,
            ClassToClassRelation classToClassRelation) {
        this.componentToComponentRelation = componentToComponentRelation;
        this.classToClassRelation = classToClassRelation;
    }

    public ClassToClassRelation getClassToClassRelation() {
        return classToClassRelation;
    }

    public ComponentToComponentRelation getComponentToComponentRelation() {
        return componentToComponentRelation;
    }
}
