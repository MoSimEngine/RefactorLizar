package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement;

import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class MoveMember {

    private MoveMember() {}

    public static void moveMember(CtType<?> source, CtType<?> destination, CtTypeMember member) {
        // TODO: check if member exist
        source.removeTypeMember(member);
        destination.addTypeMember(member);
    }

    public static void moveMember(
            CtType<?> source, CtType<?> destination, CtTypeMember member, int position) {
        // TODO: check if member exist
        source.removeTypeMember(member);
        destination.addTypeMemberAt(position, member);
    }
}
