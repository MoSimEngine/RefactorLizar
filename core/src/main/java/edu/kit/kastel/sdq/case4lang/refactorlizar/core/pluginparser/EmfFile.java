/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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
