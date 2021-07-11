package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class EmfFile implements IMetaInformation {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private Path filePath;
    private String layerName;
    private String name;

    public EmfFile(Path filePath, String layerName, String name) {
        this.filePath = Objects.requireNonNull(filePath);
        this.layerName = Objects.requireNonNull(layerName);
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public String getLayer() {
        return layerName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLayer(String layer) {
        this.layerName = Objects.requireNonNull(layer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, layerName, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmfFile)) return false;
        EmfFile other = (EmfFile) obj;
        return Objects.equals(filePath, other.filePath)
                && Objects.equals(layerName, other.layerName)
                && Objects.equals(name, other.name);
    }

    @Override
    public Path getRootPath() {
        // emf files are in /src/METAINF/ Folder
        return filePath.getParent();
    }

    @Override
    public void prettyprint(Path path) {
        try {
            Manifest manifest = new Manifest(new FileInputStream(filePath.toFile()));
            if (!layerName.equals("UNKNOWN")) {
                Attributes attributes = manifest.getMainAttributes();
                attributes.putValue("Layer", layerName);
            }
            // hack for windows
            Path root = filePath.getRoot();
            Path newPath = filePath;
            if (root != null) {
                newPath = root.relativize(filePath).normalize();
            }
            Path outputPath = Paths.get(path.toString(), newPath.toString());
            createDirs(outputPath);
            manifest.write(Files.newOutputStream(outputPath));
        } catch (IOException e) {
            logger.atWarning().withCause(e).log("Could not write to file: %s", path);
        }
    }
}
