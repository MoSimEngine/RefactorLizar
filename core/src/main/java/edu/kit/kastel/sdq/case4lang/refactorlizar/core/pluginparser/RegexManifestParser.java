package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.jar.Manifest;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/** This defines an regex based manifest parser. For value retrieving regex are used. */
public class RegexManifestParser implements ManifestParser {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public Optional<Bundle> parseManifest(File manifestFile) {
        try {
            Manifest manifest = new Manifest(new FileInputStream(manifestFile));
            String bundleName = parseBundleName(manifest);
            String bundleVersion = parseBundleVersion(manifest);
            String layer = parseLayer(manifest);
            Collection<String> exportedPackages = parseExportedPackages(manifest);
            Collection<String> requiredBundles = parseRequiredBundle(manifest);
            return Optional.of(
                    new Bundle(
                            bundleName,
                            bundleVersion,
                            layer,
                            exportedPackages,
                            requiredBundles,
                            manifestFile));
        } catch (IOException e) {
            logger.atWarning().log(
                    "Cant parse %s. Reason %s", manifestFile.getAbsolutePath(), e.getCause());
            return Optional.empty();
        }
    }

    private String parseLayer(Manifest manifest) {
        return StringUtils.defaultString(
                manifest.getMainAttributes().getValue(OSGIKeys.LAYER_NAME.toString()), "UNKNOWN");
    }

    private Collection<String> parseExportedPackages(Manifest manifest) {
        String exportedPackages =
                manifest.getMainAttributes().getValue(OSGIKeys.EXPORT_PACKAGE.toString());
        exportedPackages = exportedPackages == null ? "" : exportedPackages;
        // OSGI spec allows quoted commas
        return Pattern.compile("\"[^\"]*\"|[^,]+")
                .matcher(exportedPackages)
                .results()
                .map(MatchResult::group)
                .map(v -> v.replaceAll(";version=.*", ""))
                .map(v -> v.replaceAll(";specification-version=.*", ""))
                .collect(Collectors.toList());
    }

    private Collection<String> parseRequiredBundle(Manifest manifest) {
        String requiredPackages =
                manifest.getMainAttributes().getValue(OSGIKeys.REQUIRE_BUNDLE.toString());
        requiredPackages = requiredPackages == null ? "" : requiredPackages;
        // OSGI spec allows quoted commas
        return Pattern.compile("\"[^\"]*\"|[^,]+")
                .matcher(requiredPackages)
                .results()
                .map(MatchResult::group)
                // remove the version things
                .map(v -> v.replaceAll(";.*", ""))
                .collect(Collectors.toList());
    }

    private String parseBundleName(Manifest manifest) {
        return manifest.getMainAttributes()
                .getValue(OSGIKeys.BUNDLE_SYMBOLIC_NAME.toString())
                .replaceAll(";.*", "");
    }

    private String parseBundleVersion(Manifest manifest) {
        return manifest.getMainAttributes().getValue(OSGIKeys.BUNDLE_VERSION.toString());
    }

    /**
     * This enum defines keys for manifests lookups while parsing. A key is a single String value.
     * To get the value use {@link #toString}.
     */
    private enum OSGIKeys {
        REQUIRE_BUNDLE("Require-Bundle"),
        EXPORT_PACKAGE("Export-Package"),
        BUNDLE_VERSION("Bundle-Version"),
        BUNDLE_SYMBOLIC_NAME("Bundle-SymbolicName"),
        LAYER_NAME("Layer");
        private String keyName;

        OSGIKeys(String keyName) {
            this.keyName = keyName;
        }

        @Override
        public String toString() {
            return keyName;
        }
    }
}
