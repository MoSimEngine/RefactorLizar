package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

public class MoveMemberTest {

    @Test
    public void moveField() {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/movement");
        CtModel model = launcher.buildModel();

        CtType<?> origin =
                model.getAllTypes().stream()
                        .filter(v -> v.getSimpleName().equals("ClassA"))
                        .findFirst()
                        .get();
        CtType<?> target =
                model.getAllTypes().stream()
                        .filter(v -> v.getSimpleName().equals("ClassB"))
                        .findFirst()
                        .get();
        CtField<?> field = origin.getField("a");

        assertAll(
                () -> origin.getTypeMembers().stream().anyMatch(v -> v.equals(field)),
                () -> target.getTypeMembers().stream().noneMatch(v -> v.equals(field)));

        MoveMember.moveMember(origin, target, field);

        assertAll(
                () -> origin.getTypeMembers().stream().noneMatch(v -> v.equals(field)),
                () -> target.getTypeMembers().stream().anyMatch(v -> v.equals(field)));
    }

    @Test
    public void moveMethod() {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/movement");
        CtModel model = launcher.buildModel();

        CtType<?> origin =
                model.getAllTypes().stream()
                        .filter(v -> v.getSimpleName().equals("ClassA"))
                        .findFirst()
                        .get();
        CtType<?> target =
                model.getAllTypes().stream()
                        .filter(v -> v.getSimpleName().equals("ClassB"))
                        .findFirst()
                        .get();
        CtMethod<?> method = origin.getMethodsByName("bar").get(0);

        assertAll(
                () -> origin.getTypeMembers().stream().anyMatch(v -> v.equals(method)),
                () -> target.getTypeMembers().stream().noneMatch(v -> v.equals(method)));

        MoveMember.moveMember(origin, target, method);

        assertAll(
                () -> origin.getTypeMembers().stream().noneMatch(v -> v.equals(method)),
                () -> target.getTypeMembers().stream().anyMatch(v -> v.equals(method)));
    }
}
