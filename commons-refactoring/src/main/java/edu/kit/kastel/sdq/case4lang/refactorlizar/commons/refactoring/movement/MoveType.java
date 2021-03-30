package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement;

import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class MoveType {
    private MoveType() {}

    public static void movePackage(CtType<?> type, String packageName) {
        movePackage(type, type.getFactory().Package().getOrCreate(packageName));
    }

    public static void movePackage(CtType<?> type, CtPackage ctPackage) {
        if (type.isTopLevel()) {
            type.setParent(ctPackage);
        }
    }
}
