package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query;

import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtConstructor;

/** This defines multiple util methods for querying constructors. */
public class Constructors {
    private Constructors() {
        // util class, no instances
    }
    /**
     * Checks if the given constructor includes a {@code super} call. The number of parameters in
     * the supercall is not relevant.
     *
     * @param constructor the constructor to check
     * @return true if the constructor includes a super call, false otherwise
     */
    public static boolean hasSuperCall(CtConstructor<?> constructor) {
        CtBlock<?> body = constructor.getBody();
        if (body.getStatements().isEmpty()) {
            return false;
        }
        return body.getStatement(0).toString().contains("super(");
    }
}
