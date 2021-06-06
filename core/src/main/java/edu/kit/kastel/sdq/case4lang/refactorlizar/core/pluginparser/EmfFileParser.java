package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.jar.Manifest;
import org.apache.commons.lang3.StringUtils;

public class EmfFileParser implements IMetaInformationParser {

    private static final String LAYER_NAME = "Layer";
    private static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Override
    public Optional<IMetaInformation> parse(Path file) {

        try {
            Manifest manifest = new Manifest(new FileInputStream(file.toFile()));
            String layer = parseLayer(manifest);
            String bundleName = parseBundleName(manifest);
            return Optional.of(new EmfFile(file, layer, bundleName));
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
            return Optional.empty();
        }
    }

    private String parseLayer(Manifest manifest) {
        return StringUtils.defaultString(
                manifest.getMainAttributes().getValue(LAYER_NAME), "UNKNOWN");
    }

    private String parseBundleName(Manifest manifest) {
        return manifest.getMainAttributes().getValue(BUNDLE_SYMBOLIC_NAME).replaceAll(";.*", "");
    }
}
