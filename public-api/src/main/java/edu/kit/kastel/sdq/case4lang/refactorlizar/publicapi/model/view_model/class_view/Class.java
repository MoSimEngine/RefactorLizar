package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view;

public class Class {

    private final ClassId identifier;

    private Class(ClassId identifier) {
        this.identifier = identifier;
    }

    public static Class of(ClassId classId) {
        return new Class(classId);
    }

    public ClassId getIdentifier() {
        return identifier;
    }
}
