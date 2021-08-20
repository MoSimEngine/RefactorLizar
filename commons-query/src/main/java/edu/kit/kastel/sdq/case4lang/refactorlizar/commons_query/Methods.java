package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query;

import java.util.List;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class Methods {

    private Methods() {
        // no instances
    }

    public static List<CtExecutableReference<?>> getReferencedMethods(CtMethod<?> method) {
        return method.getElements(new TypeFilter<>(CtExecutableReference.class));
    }
}
