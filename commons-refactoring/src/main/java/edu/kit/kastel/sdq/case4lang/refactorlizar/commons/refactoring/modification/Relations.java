package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification;

import java.util.Set;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

public class Relations {
    private Relations() {}

    public static void setInheritance(CtType<?> upper, CtType<?> lower) {
        lower.setSuperclass(upper.getReference());
    }

    public static void setInheritance(CtTypeReference<?> upper, CtType<?> lower) {
        lower.setSuperclass(upper);
    }

    public static void setImplementation(CtClass<?> target, CtInterface<?> intrface) {
        target.addSuperInterface(intrface.getReference());
    }

    public static void setExtension(CtInterface<?> upper, CtInterface<?> lower) {
        lower.setSuperclass(upper.getReference());
    }

    public static void setSuperInterfaces(CtType<?> to, Set<CtTypeReference<?>> superInterfaces) {
        to.setSuperInterfaces(superInterfaces);
    }
}
