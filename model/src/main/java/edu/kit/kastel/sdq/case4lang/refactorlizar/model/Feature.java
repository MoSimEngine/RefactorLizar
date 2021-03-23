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
}
