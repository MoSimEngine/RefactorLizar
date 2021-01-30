package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.util.Collection;
import java.util.UUID;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.model.LanguageFeature;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;

/**
 * IAnalyzer
 */
public interface IAnalyzer {

  Report analyze(Collection<LanguageFeature> languageFeature, CtModel simulatorAST);

  String getDescription();
  String getName();


  public default UUID getIdentifier() {
    return UUID.randomUUID();
  }

  boolean canAnalyze(CtElement element);
}