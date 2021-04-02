package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import spoon.reflect.declaration.CtPackage;

public class Feature {

    private CtPackage javaPackage;
    private Bundle bundle;

    /** @return the javaPackage */
    public CtPackage getJavaPackage() {
        return javaPackage;
    }
    /** @return the bundle */
    public Bundle getBundle() {
        return bundle;
    }

    /**
     * @param javaPackage
     * @param bundle
     */
    public Feature(CtPackage javaPackage, Bundle bundle) {
        this.javaPackage = javaPackage;
        this.bundle = bundle;
    }
    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "LanguageFeature [bundle=" + bundle + ", javaPackage=" + javaPackage + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bundle == null) ? 0 : bundle.hashCode());
        result = prime * result + ((javaPackage == null) ? 0 : javaPackage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Feature other = (Feature) obj;
        if (bundle == null) {
            if (other.bundle != null) return false;
        } else if (!bundle.equals(other.bundle)) return false;
        if (javaPackage == null) {
            if (other.javaPackage != null) return false;
        } else if (!javaPackage.equals(other.javaPackage)) return false;
        return true;
    }
}
