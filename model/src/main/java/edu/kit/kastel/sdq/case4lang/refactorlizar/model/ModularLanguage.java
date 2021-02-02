package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;

public class ModularLanguage {
  
  private Collection<LanguageFeature> languageFeatures;


  
  /**
   * @return the bundles
   */
  public Collection<LanguageFeature> getLanguageFeature() {
    return languageFeatures;
  }



  /**
   * @param languageFeatures
   */
  public ModularLanguage(Collection<LanguageFeature> languageFeatures) {
    this.languageFeatures = languageFeatures;
  }
}
