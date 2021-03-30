package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.visualize;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.Class;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassToClassRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view.ClassView;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import java.util.List;
import java.util.stream.Collectors;

public class ClassViewAdapter {

    private final SimulatorModel simulatorModel;

    public ClassViewAdapter(SimulatorModel simulatorModel) {
        this.simulatorModel = simulatorModel;
    }

    public ClassView provideClassView(ComponentId componentId) {

        List<Class> classes = determineClasses(componentId);
        List<ClassToClassRelation> classToClassRelations =
                determineClassToClassRelations(componentId);

        return new ClassView(componentId, classes, classToClassRelations);
    }

    private List<ClassToClassRelation> determineClassToClassRelations(ComponentId componentId) {
        return simulatorModel.getClassToClassRelations(componentId.getName()).stream()
                .map(
                        classRelation ->
                                ClassToClassRelation.of(
                                        ClassId.of(classRelation.getOrigin()),
                                        ClassId.of(classRelation.getTarget())))
                .collect(Collectors.toList());
    }

    private List<Class> determineClasses(ComponentId componentId) {
        return simulatorModel.getClassesForSimulatorComponent(componentId.getName()).stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private Class convert(String classFqn) {

        ClassId classId = ClassId.of(classFqn);
        return Class.of(classId);
    }
}
