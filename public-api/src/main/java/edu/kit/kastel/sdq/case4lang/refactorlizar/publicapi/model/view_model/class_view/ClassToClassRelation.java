package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.common.Relation;

public class ClassToClassRelation extends Relation<ClassId, ClassId> {

    public ClassToClassRelation(ClassId origin, ClassId target) {
        super(origin, target);
    }
}
