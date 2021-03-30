package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle;
import java.io.File;
import java.util.Optional;

/**
 * This defines a manifest.mf file parser. An implementation must convert the input file to a {@link
 * Bundle}.
 */
public interface ManifestParser {
    /**
     * Parses the given input file and converts it to a {@link Bundle}. If there is any parse error,
     * it must return {@link Optional#empty}.
     *
     * @param manifestFile a manifest.mf file
     * @return an optional containing the converted bundle or empty is there is any parse error.
     */
    public Optional<Bundle> parseManifest(File manifestFile);
}
