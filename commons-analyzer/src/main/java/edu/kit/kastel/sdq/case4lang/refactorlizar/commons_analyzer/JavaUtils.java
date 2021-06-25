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
package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class JavaUtils {

    private JavaUtils() {}

    public static boolean isVoidType(CtType<?> v) {
        return v.getQualifiedName().equals("void");
    }

    public static boolean isJavaType(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
    }

    public static CtPackage getTopLevelPackage(CtPackage ctPackage) {
        CtPackage currentPackage = ctPackage;
        while (currentPackage.getDeclaringPackage() != null
                && !currentPackage.getDeclaringPackage().isUnnamedPackage()) {
            currentPackage = currentPackage.getDeclaringPackage();
        }
        return currentPackage;
    }

    public static boolean isSimulatorType(SimulatorModel model, CtType<?> source) {
        return model.getTypeWithQualifiedName(source.getQualifiedName()) != null;
    }

    public static boolean isLanguageType(ModularLanguage language, CtType<?> target) {
        return language.getTypeWithQualifiedName(target.getQualifiedName()) != null;
    }

    public static boolean isSimulatorPackage(SimulatorModel model, CtPackage packag) {
        return model.getSimulatorComponents().stream()
                .anyMatch(candidate -> isParentOrSame(candidate.getJavaPackage(), packag));
    }

    public static boolean isLanguagePackage(ModularLanguage language, CtPackage packag) {
        return language.getLanguageComponents().stream()
                .anyMatch(candidate -> isParentOrSame(candidate.getJavaPackage(), packag));
    }

    public static boolean isSimulatorComponent(SimulatorModel model, Component simulatorComponent) {
        return model.getSimulatorComponents().stream()
                .anyMatch(candidate -> candidate.equals(simulatorComponent));
    }

    public static boolean isLanguageComponent(
            ModularLanguage language, Component languageComponent) {
        return language.getLanguageComponents().stream()
                .anyMatch(candidate -> candidate.equals(languageComponent));
    }

    public static boolean isParentOrSame(CtPackage candidate, CtPackage child) {
        return candidate.equals(child) || child.hasParent(candidate);
    }
}
