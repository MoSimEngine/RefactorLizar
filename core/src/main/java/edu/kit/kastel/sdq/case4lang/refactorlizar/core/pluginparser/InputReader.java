package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class InputReader {
    private static final String MANIFEST_MF_FILENAME = "MANIFEST.mf";

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private Collection<String> inputPaths;
    private BiPredicate<Path, BasicFileAttributes> filter = (a, b) -> true;
    private BiPredicate<Path, BasicFileAttributes> nameMatcher = this::isManifestFile;

    public InputReader(String... paths) {
        this(Arrays.asList(paths));
    }

    public InputReader(Collection<String> paths) {
        inputPaths = paths;
    }

    public InputReader(
            Collection<BiPredicate<Path, BasicFileAttributes>> filter, Collection<String> paths) {
        this(paths);
        // combine filter
        filter.forEach(v -> this.filter = this.filter.and(v));
    }

    public Collection<File> findManifestFiles() {
        Collection<File> manifestFiles = new ArrayList<>();
        for (String string : inputPaths) {
            try (Stream<Path> files =
                    Files.find(
                            Path.of(string),
                            Integer.MAX_VALUE,
                            nameMatcher.and(filter),
                            FileVisitOption.FOLLOW_LINKS)) {
                files.map(Path::toFile).forEach(manifestFiles::add);
            } catch (IOException e) {
                logger.atWarning().log(
                        "Ignoring input path %s  because of IO error. See stacktrace for details. %s",
                        string, e.getCause());
            }
        }
        return manifestFiles;
    }

    private boolean isManifestFile(Path path, BasicFileAttributes fileAttributes) {
        return path.getFileName().toString().equalsIgnoreCase(MANIFEST_MF_FILENAME)
                && fileAttributes.isRegularFile();
    }
}
