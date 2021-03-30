package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

public class ClassRelation {

    private final String origin;
    private final String target;

    public ClassRelation(String origin, String target) {
        this.origin = origin;
        this.target = target;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTarget() {
        return target;
    }
}
