package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FeatureFileParser implements IMetaInformationParser {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    @Override
    public Optional<IMetaInformation> parse(Path featureFile) {
        Gson gson = new Gson();
        try (Stream<String> lines = Files.lines(featureFile)) {
            String json = lines.collect(Collectors.joining("\n"));
            String layer = gson.fromJson(json, FeatureFileJson.class).Layer;
            if (layer.isBlank()) {
                layer = "UNKNOWN";
            }
            return Optional.of(new FeatureFile(featureFile, layer));
        } catch (IOException | JsonSyntaxException e) {
            logger.atWarning().withCause(e).log();
            return Optional.empty();
        }
    }

    static class FeatureFileJson {
        private String Layer;
    }
}
