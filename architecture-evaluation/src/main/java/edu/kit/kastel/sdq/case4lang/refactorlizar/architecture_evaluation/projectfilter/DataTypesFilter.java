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
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter;

import com.google.common.flogger.FluentLogger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtType;

public class DataTypesFilter {

    private DataTypesFilter() {}

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public static void removeDataTypes(Collection<CtType<?>> types, String dataPatternsPath) {
        if (dataPatternsPath.isBlank()) {
            return;
        }
        try (Stream<String> lines = Files.lines(Path.of(dataPatternsPath))) {
            Predicate<String> pattern =
                    lines.map(Pattern::compile)
                            .map(Pattern::asMatchPredicate)
                            .reduce(v -> false, (a, b) -> a.or(b));
            types.removeIf(type -> pattern.test(type.getQualifiedName()));
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
        }
    }

    public static void removeJDKTypes(Collection<CtType<?>> types) {
        types.removeIf(DataTypesFilter::extracted);
    }

    private static boolean extracted(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
    }
}
