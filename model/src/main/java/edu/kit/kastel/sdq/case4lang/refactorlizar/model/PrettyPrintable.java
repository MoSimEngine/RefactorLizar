package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.nio.file.Path;

public interface PrettyPrintable {
    /**
     * Prints an element to the given path
     *
     * @param path the path to print to.
     */
    void prettyprint(Path path);

    /**
     * Util method to create missing directories.
     *
     * @param path where missing directories should be created.
     */
    default void createDirs(Path path) {
        if (!path.toFile().exists()) {
            path.toFile().mkdirs();
        }
    }
}
