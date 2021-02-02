package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import spoon.reflect.declaration.CtPackage;

public class LanguageFeature {
  
  private CtPackage javaPackage;
  private Bundle bundle;


  /**
   * @return the javaPackage
   */
  public CtPackage getJavaPackage() {
    return javaPackage;
  }
  /**
   * @return the bundle
   */
  public Bundle getBundle() {
    return bundle;
  }

  /**
   * @param javaPackage
   * @param bundle
   */
  public LanguageFeature(CtPackage javaPackage, Bundle bundle) {
    this.javaPackage = javaPackage;
    this.bundle = bundle;
  }
}
