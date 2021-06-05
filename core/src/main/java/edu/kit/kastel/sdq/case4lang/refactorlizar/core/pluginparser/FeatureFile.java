package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.nio.file.Path;
import java.util.Objects;

/** FeatureFile */
public class FeatureFile implements IMetaInformation {

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
    public Path getFilePath() {
        return filePath;
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
}
