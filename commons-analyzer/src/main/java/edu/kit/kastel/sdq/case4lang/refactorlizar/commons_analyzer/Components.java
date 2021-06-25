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
import java.util.Optional;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class Components {

    private Components() {}

    public static Optional<Component> findComponent(SimulatorModel model, CtType<?> type) {
        return findComponent(model, type.getPackage());
    }

    public static Optional<Component> findComponent(ModularLanguage language, CtType<?> type) {
        return findComponent(language, type.getPackage());
    }

    public static Optional<Component> findComponent(
            SimulatorModel model, ModularLanguage language, CtType<?> type) {
        return findComponent(language, type).or(() -> findComponent(model, type));
    }

    public static Optional<Component> findComponent(
            SimulatorModel model, ModularLanguage language, CtPackage packag) {
        return findComponent(language, packag).or(() -> findComponent(model, packag));
    }

    public static Optional<Component> findComponent(SimulatorModel model, CtPackage packag) {
        return model.getSimulatorComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }

    public static Optional<Component> findComponent(ModularLanguage language, CtPackage packag) {
        return language.getLanguageComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }
}
