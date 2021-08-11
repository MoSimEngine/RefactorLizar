package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification;

import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.reference.CtTypeReference;

public class Modifiers {
    private Modifiers() {
        // prevent instantiation
    }
    /**
     * Copies all generic type parameters from the given type to the given type.
     *
     * @param from the type to copy the generic type parameters from
     * @param to the type to copy the generic type parameters to
     */
    public static void copyGenerics(CtType<?> from, CtType<?> to) {
        to.setFormalCtTypeParameters(from.getFormalCtTypeParameters());
    }
    /**
     * Copies all modifiers from the given type to the given type.
     *
     * @param from the type to copy the modifiers from
     * @param to the type to copy the modifiers to
     */
    public static void copyModifiers(CtType<?> from, CtType<?> to) {
        to.setExtendedModifiers(from.getExtendedModifiers());
    }
    /**
     * Creates a generic type reference from the given type.
     *
     * @param type the type to create the generic type reference from
     * @return the generic type reference
     */
    public static CtTypeReference<?> createGenericReference(CtType<?> type) {
        CtTypeReference<?> genericTypeRef = type.getReference();
        for (CtTypeParameter typeParam : type.getFormalCtTypeParameters()) {
            genericTypeRef.addActualTypeArgument(typeParam.getReference());
        }
        return genericTypeRef;
    }
}
