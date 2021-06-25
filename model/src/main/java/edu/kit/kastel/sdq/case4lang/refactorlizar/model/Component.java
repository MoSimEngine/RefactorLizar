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
package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Objects;
import spoon.reflect.declaration.CtPackage;

public class Component {

    private CtPackage javaPackage;
    private IMetaInformation metaInformation;

    /**
     * Create a new component for the given package and metaInformation.
     *
     * @param javaPackage the java files
     * @param metaInformation meta informations containing layer and path
     */
    public Component(CtPackage javaPackage, IMetaInformation metaInformation) {
        this.javaPackage = javaPackage;
        this.metaInformation = metaInformation;
    }

    /** Returns the java package */
    public CtPackage getJavaPackage() {
        return javaPackage;
    }

    /**
     * Returns the component name
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getName()
     */
    public String getName() {
        return metaInformation.getName().isBlank()
                ? javaPackage.getSimpleName()
                : metaInformation.getName();
    }
    /**
     * Returns the layer name of the given simulator feature or UNKNOWN if it`s not set.
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getLayer()
     */
    public String getLayer() {
        return metaInformation.getLayer();
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(metaInformation, javaPackage);
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Component)) return false;
        Component other = (Component) obj;
        return Objects.equals(metaInformation, other.metaInformation)
                && Objects.equals(javaPackage, other.javaPackage);
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Component [MetaInformation="
                + metaInformation
                + ", javaPackage="
                + javaPackage
                + "]";
    }
}
