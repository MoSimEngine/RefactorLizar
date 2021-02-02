package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import static java.util.stream.Collectors.toUnmodifiableList;
import java.util.Collection;
import java.util.ServiceLoader;
import java.util.UUID;
import java.util.ServiceLoader.Provider;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;

/**
 * IAnalyzer
 */
public interface IAnalyzer {

  public static Collection<IAnalyzer> getAllAnalyzer() {
    return ServiceLoader.load(IAnalyzer.class).stream().map(Provider::get).collect(toUnmodifiableList());
  }
  Report analyze(CtElement element);

  void init(ModularLanguage language, CtModel simulatorAST);
  String getDescription();
  String getName();


  public default UUID getIdentifier() {
    return UUID.randomUUID();
  }

  boolean canAnalyze(CtElement element);
}