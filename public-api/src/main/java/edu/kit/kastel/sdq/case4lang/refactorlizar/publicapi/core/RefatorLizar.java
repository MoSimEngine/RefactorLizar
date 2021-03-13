package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.apis.AnalyzeApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.apis.RefactorApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.apis.VisualizeApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceSimulator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceType;

import javax.annotation.Nonnull;
import java.util.List;

public class RefatorLizar {

  private RefatorLizar() {

  }

  @Nonnull public static List<InputSourceType> listSupportedInputSourceTypes() {
    return null;
  }

  @Nonnull public static RefatorLizar load(InputSourceSimulator inputSourceSimulator,
      InputSourceModularLanguage inputSourceModularLanguage) {
    return null;
  }

  @Nonnull public AnalyzeApi analyzeApi() {
    return null;
  }

  @Nonnull public RefactorApi refactorApi() {
    return null;
  }

  @Nonnull public VisualizeApi visualizeApi() {
    return null;
  }

}
