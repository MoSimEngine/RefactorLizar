package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Objects;
import spoon.reflect.declaration.CtPackage;

public class Component {

    private CtPackage javaPackage;
    private Bundle bundle;

    /**
     * Creates a new simulator component for the given package and bundle.
     *
     * @param javaPackage a java package containing the source
     * @param bundle a bundle containing the meta information
     */
    public Component(CtPackage javaPackage, Bundle bundle) {
        this.javaPackage = javaPackage;
        this.bundle = bundle;
    }

    /** Returns the java package */
    public CtPackage getJavaPackage() {
        return javaPackage;
    }

    /**
     * Returns the component name
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle#getName()
     */
    public String getName() {
        return bundle.getName();
    }
    /**
     * Returns the layer name of the given simulator feature or UNKNOWN if it`s not set.
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle#getLayer()
     */
    public String getLayer() {
        return bundle.getLayer();
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(bundle, javaPackage);
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
        return Objects.equals(bundle, other.bundle)
                && Objects.equals(javaPackage, other.javaPackage);
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Component [bundle=" + bundle + ", javaPackage=" + javaPackage + "]";
    }
}
