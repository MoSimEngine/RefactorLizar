package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.common;

public class Relation<O, T> {

    private final O origin;
    private final T target;

    public Relation(O origin, T target) {
        this.origin = origin;
        this.target = target;
    }

    public O getOrigin() {
        return origin;
    }

    public T getTarget() {
        return target;
    }
}
