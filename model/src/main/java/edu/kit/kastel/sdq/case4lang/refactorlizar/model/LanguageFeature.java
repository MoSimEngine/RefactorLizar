package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.List;

public class LanguageFeature {

    //  private final CtPackage javaPackage;
    private final Bundle bundle;
    private final List<LanguageFeature> dependencies;

    public LanguageFeature(Bundle bundle, List<LanguageFeature> dependencies) {
        //    this.javaPackage = javaPackage;
        this.bundle = bundle;
        this.dependencies = dependencies;
    }

    //  public CtPackage getJavaPackage() {
    //    return javaPackage;
    //  }

    public Bundle getBundle() {
        return bundle;
    }

    @Override
    public String toString() {
        return "LanguageFeature [bundle=" + bundle + "]";
    }
}
