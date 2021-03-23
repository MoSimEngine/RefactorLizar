package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import java.util.List;

public class ClassView {

    private final ComponentId componentId;
    private final List<Class> classes;
    private final List<ClassToClassRelation> classToClassRelations;

    public ClassView(
            ComponentId componentId,
            List<Class> classes,
            List<ClassToClassRelation> classToClassRelations) {
        this.componentId = componentId;
        this.classes = classes;
        this.classToClassRelations = classToClassRelations;
    }

    public List<ClassToClassRelation> getClassToClassRelations() {
        return classToClassRelations;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public ComponentId getComponentId() {
        return componentId;
    }
}
