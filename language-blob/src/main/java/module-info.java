module edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob {
  // die sind leider nicht stable => fixen!
  requires spoon.core;
  requires edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;
  requires edu.kit.kastel.sdq.case4lang.refactorlizar.model;
  exports edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;
  provides edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer with edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob.LanguageBlobAnalyzer;
}