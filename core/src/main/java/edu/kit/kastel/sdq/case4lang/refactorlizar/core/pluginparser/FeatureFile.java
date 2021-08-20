package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import com.google.gson.Gson;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/** FeatureFile */
public class FeatureFile implements IMetaInformation {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private Path filePath;
    private String layerName;

    public FeatureFile(Path filePath, String layerName) {
        this.filePath = Objects.requireNonNull(filePath);
        this.layerName = Objects.requireNonNull(layerName);
    }

    @Override
    public String getLayer() {
        return this.layerName;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setLayer(String layer) {
        this.layerName = Objects.requireNonNull(layer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, layerName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof FeatureFile)) return false;
        FeatureFile other = (FeatureFile) obj;
        return Objects.equals(filePath, other.filePath)
                && Objects.equals(layerName, other.layerName);
    }

    @Override
    public void prettyprint(Path path) {
        String json = new Gson().toJson(new JsonHolder(layerName));

        try {
            // hack for windows
            Path root = filePath.getRoot();
            Path newPath = filePath;
            if (root != null) {
                newPath = root.relativize(filePath).normalize();
            }
            Path outputPath = Paths.get(path.toString(), newPath.toString());
            createDirs(outputPath);
            Files.write(
                    outputPath.resolve("info.feature"), json.getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            logger.atWarning().withCause(e).log("Could not write to file: %s", path);
        }
    }

    @Override
    public Path getRootPath() {
        // emf files are in /src
        return filePath;
    }

    private static class JsonHolder {
        private String Layer;

        public JsonHolder(String layerName) {
            this.Layer = layerName;
        }
        /** Returns the layer. */
        public String getLayer() {
            return Layer;
        }
    }
}
