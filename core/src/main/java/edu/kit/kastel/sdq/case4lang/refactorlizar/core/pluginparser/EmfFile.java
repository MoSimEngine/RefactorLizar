// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import java.nio.file.Path;
import java.util.Objects;

public class EmfFile implements IMetaInformation {

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
    public Path getFilePath() {
        return filePath;
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
}
