/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.Refactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.creation.TypeCreation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification.Relations;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement.MoveMember;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement.MoveType;
import java.util.function.Consumer;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class ClassSplitBuilder {

    private CtType<?> source;
    private String targetQName;
    private CtType<?> target;
    private Consumer<Void> action = v -> {};

    public ClassSplitBuilder() {}

    public ClassSplitBuilder sourceClass(CtType<?> source) {
        this.source = source;
        return this;
    }

    public ClassSplitBuilder targetClass(String targetQName) {
        this.targetQName = targetQName;
        return this;
    }

    public ClassSplitBuilder renameSource(String newName) {
        action = action.andThen((v) -> source.setSimpleName(newName));
        return this;
    }

    public ClassSplitBuilder renameTarget(String newName) {
        action = action.andThen((v) -> target.setSimpleName(newName));
        return this;
    }

    public ClassSplitBuilder moveSourcePackage(String qPackageName) {
        action = action.andThen(v -> MoveType.movePackage(source, qPackageName));
        return this;
    }

    public ClassSplitBuilder moveTargetPackage(String qPackageName) {
        action = action.andThen(v -> MoveType.movePackage(target, qPackageName));
        return this;
    }

    public ClassSplitBuilder moveTypeMember(CtTypeMember member) {
        action = action.andThen(v -> MoveMember.moveMember(source, target, member));
        return this;
    }

    public ClassSplitBuilder setTargetAsSuperClass() {
        action = action.andThen(v -> Relations.setInheritance(target, source));
        return this;
    }

    public ClassSplitBuilder setSourceAsSuperClass() {
        action = action.andThen(v -> Relations.setInheritance(source, target));
        return this;
    }

    public Refactoring createClassSplit() {
        if (targetQName.isEmpty() || source == null) {
            throw new IllegalArgumentException("Source and target class must be set");
        }
        target = TypeCreation.classOfQualifiedName(source, targetQName);
        return () -> action.accept(null);
    }
}
