package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.nio.file.Path;

/** This defines meta information for a project. */
public interface IMetaInformation extends PrettyPrintable {

    String getLayer();

    String getName();

    public default String getSimpleName() {
        return getName().substring(getName().lastIndexOf('.') + 1).trim();
    }

    Path getRootPath();

    void setLayer(String layer);
}
