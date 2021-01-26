package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.util.Collection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.model.LanguageFeature;
import spoon.reflect.CtModel;

/**
 * IAnalyzer
 */
public interface IAnalyzer {

  Report analyze(Collection<LanguageFeature> languageFeature, CtModel simulatorAST);
}