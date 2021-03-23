package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle;
import java.io.File;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class defines the main entry point for the manifest analysis. It analyses the given paths
 * and create a meta model from it.
 */
public class BundleParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    /**
     * Analyses the given input paths. The method searches recursive for manifest files, so the
     * input paths can point to upper folders.
     *
     * @param paths a varargs of paths.
     */
    public Collection<Bundle> analyzeManifests(String... paths) {
        InputReader reader = new InputReader(paths);
        ManifestParser parser = new RegexManifestParser();
        Collection<File> manifestFiles = reader.findManifestFiles();
        Collection<Bundle> bundles =
                manifestFiles.stream()
                        .map(parser::parseManifest)
                        .flatMap(Optional::stream)
                        .collect(Collectors.toList());
        bundles.forEach(v -> logger.atFinest().log("%s", v));
        PostProcessor<Bundle> filter = new PresentBundlePostProcessor();
        filter.process(bundles);
        bundles.forEach(v -> logger.atFinest().log("%s", v));
        return bundles;
    }
}
