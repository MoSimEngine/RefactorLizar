package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.collect.Lists;
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
    private static final String INFO_FEATURE_FILENAME = "info.feature";

    private static final String MANIFEST_MF_FILENAME = "MANIFEST.mf";

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private Collection<String> inputPaths;
    private BiPredicate<Path, BasicFileAttributes> filter = (a, b) -> true;
    private BiPredicate<Path, BasicFileAttributes> eclipsePluginFileMatcher = this::isManifestFile;
    private BiPredicate<Path, BasicFileAttributes> featureInfoFileMatcher = this::isFeatureFile;

    public InputReader(String... paths) {
        this(Arrays.asList(paths));
    }

    public InputReader(Collection<String> paths) {
        inputPaths = paths;
    }

    public InputReader(Iterable<String> paths) {
        this(Lists.newArrayList(paths));
    }

    public Collection<File> findManifestFiles() {
        return findFilesWithNameMatcher(eclipsePluginFileMatcher);
    }

    private boolean isManifestFile(Path path, BasicFileAttributes fileAttributes) {
        return path.getFileName().toString().equalsIgnoreCase(MANIFEST_MF_FILENAME)
                && fileAttributes.isRegularFile();
    }

    public Collection<File> findFeatureFiles() {
        return findFilesWithNameMatcher(featureInfoFileMatcher);
    }

    private Collection<File> findFilesWithNameMatcher(
            BiPredicate<Path, BasicFileAttributes> fileMatcher) {
        Collection<File> result = new ArrayList<>();
        for (String string : inputPaths) {
            try (Stream<Path> files =
                    Files.find(
                            Path.of(string),
                            Integer.MAX_VALUE,
                            fileMatcher.and(filter),
                            FileVisitOption.FOLLOW_LINKS)) {
                files.map(Path::toFile).forEach(result::add);
            } catch (IOException e) {
                logger.atWarning().log(
                        "Ignoring input path %s because of IO error. See stacktrace for details. %s",
                        string, e.getMessage());
            }
        }
        return result;
    }

    private boolean isFeatureFile(Path path, BasicFileAttributes fileAttributes) {
        return path.getFileName().toString().equalsIgnoreCase(INFO_FEATURE_FILENAME)
                && fileAttributes.isRegularFile();
    }
}
