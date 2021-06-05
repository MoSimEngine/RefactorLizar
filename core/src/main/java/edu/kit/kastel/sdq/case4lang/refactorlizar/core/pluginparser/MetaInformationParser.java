package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.io.File;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * This class defines the main entry point for the manifest analysis. It analyses the given paths
 * and create a meta model from it.
 */
public class MetaInformationParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public Collection<IMetaInformation> analyzeFeatureFiles(String... paths) {
        InputReader reader = new InputReader(paths);
        IMetaInformationParser parser = new FeatureFileParser();
        return reader.findFeatureFiles().stream()
                .map(File::toPath)
                .map(parser::parse)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }

    public Collection<IMetaInformation> analyzeEmfFiles(String... paths) {
        InputReader reader = new InputReader(paths);
        IMetaInformationParser parser = new EmfFileParser();
        return reader.findManifestFiles().stream()
                .map(File::toPath)
                .map(parser::parse)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }
}
