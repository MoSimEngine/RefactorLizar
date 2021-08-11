package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Set;

/** This represents an object that can be queried by refactorlizar queries. */
public interface Queryable {
    /** Returns all components from the given {@link Queryable}. */
    Set<Component> getComponents();
}
