package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.nio.file.Path;

/** This defines meta information for a project. */
public interface IMetaInformation {

    String getLayer();

    String getName();

    Path getFilePath();

    public default String getSimpleName() {
        return getName().substring(getName().lastIndexOf('.') + 1).trim();
    }

    void setLayer(String layer);
}
