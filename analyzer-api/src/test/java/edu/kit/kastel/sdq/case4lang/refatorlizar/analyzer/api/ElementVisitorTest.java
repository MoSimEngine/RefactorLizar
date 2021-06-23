// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package edu.kit.kastel.sdq.case4lang.refatorlizar.analyzer.api;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.ElementVisitor;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.factory.CoreFactory;

public class ElementVisitorTest {

    @Test
    public void canVisitClassTest() {
        CoreFactory factory = new Launcher().createFactory().Core();
        CtClass<?> testClass = factory.createClass();
        CtField<?> field = factory.createField();
        CtInterface<?> interfaze = factory.createInterface();
        ElementVisitor visitor =
                new ElementVisitor() {
                    @Override
                    public <T> void visitCtClass(CtClass<T> arg0) {
                        setResult(true);
                    }
                };
        assertAll(
                () -> {
                    field.accept(visitor);
                    assertFalse(visitor.canVisit());
                },
                () -> {
                    interfaze.accept(visitor);
                    assertFalse(visitor.canVisit());
                },
                () -> {
                    testClass.accept(visitor);
                    assertTrue(visitor.canVisit());
                });
    }
}
