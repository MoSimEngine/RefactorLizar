package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.class_view;

public class ClassId {

    private final String fqn;

    private ClassId(String fqn) {
        this.fqn = fqn;
    }

    public String getFqn() {
        return fqn;
    }

    public static ClassId of(String fqn) {
        return new ClassId(fqn);
    }
}
