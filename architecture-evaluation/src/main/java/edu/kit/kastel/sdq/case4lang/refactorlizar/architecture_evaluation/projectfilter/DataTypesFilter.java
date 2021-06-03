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
