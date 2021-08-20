package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query;

import java.util.List;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.filter.TypeFilter;

/** This util class defines util methods to work with {@link CtElement}s. */
public class Elements {
    private Elements() {
        // no instances
    }
    /**
     * Gets a list of all referenced fields by a given {@link CtElement}.
     *
     * @param element the element to get the fields from.
     * @return a list of all referenced fields.
     */
    public static List<CtFieldReference<?>> getReferencedFields(CtElement element) {
        return element.getElements(new TypeFilter<>(CtFieldReference.class));
    }
}
