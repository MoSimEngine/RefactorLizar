package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.creation;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtInterface;

public class TypeCreation {

    private TypeCreation() {}

    public static CtClass<?> classOfQualifiedName(CtElement factorySource, String qName) {
        return factorySource.getFactory().Class().create(qName);
    }

    public static CtInterface<?> interfaceOfQualifiedName(CtElement factorySource, String qName) {
        return factorySource.getFactory().Interface().create(qName);
    }
}
