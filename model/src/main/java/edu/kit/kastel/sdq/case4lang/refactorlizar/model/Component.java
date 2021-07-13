package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import com.google.common.flogger.FluentLogger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Set;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtType;

public class Component implements PrettyPrintable {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private IMetaInformation metaInformation;
    private Set<CtType<?>> types;

    public Component(Set<CtType<?>> types, IMetaInformation metaInformation) {
        this.types = types;
        this.metaInformation = metaInformation;
    }

    public Set<CtType<?>> getTypes() {
        return types;
    }

    public IMetaInformation getMetaInformation() {
        return metaInformation;
    }

    /**
     * Returns the component name
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getName()
     */
    public String getName() {
        return metaInformation.getName();
    }
    /**
     * Returns the layer name of the given simulator feature or UNKNOWN if it`s not set.
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getLayer()
     */
    public String getLayer() {
        return metaInformation.getLayer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaInformation, types);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Component)) return false;
        Component other = (Component) obj;
        return Objects.equals(metaInformation, other.metaInformation)
                && Objects.equals(types, other.types);
    }

    @Override
    public String toString() {
        return "Component{" + "metaInformation=" + metaInformation + "}";
    }

    @Override
    public void prettyprint(Path path) {
        try {
            metaInformation.prettyprint(path);
            // hack for windows
            Path root = metaInformation.getRootPath().getRoot();
            Path newPath = metaInformation.getRootPath();
            if (root != null) {
                newPath = root.relativize(metaInformation.getRootPath());
            }
            Path outputPath =
                    Paths.get(path.toString(), newPath.toString()).resolve("src/main/java");
            createDirs(outputPath);
            for (CtType<?> type : types) {
                Path typePath = outputPath.resolve(convertQNameToFileName(type));
                createDirs(typePath.getParent());
                CtCompilationUnit cu = type.getFactory().CompilationUnit().getOrCreate(type);
                Files.writeString(typePath, cu.prettyprint());
            }
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Failed to write component to path %s", path);
        }
    }

    private String convertQNameToFileName(CtType<?> type) {
        return type.getQualifiedName().replace(".", File.separator) + ".java";
    }

    public void addType(CtType<?> type) {
        types.add(type);
    }

    public void removeType(CtType<?> type) {
        types.remove(type);
    }
}
