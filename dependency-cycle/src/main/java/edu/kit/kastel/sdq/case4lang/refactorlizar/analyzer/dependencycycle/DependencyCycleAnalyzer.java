package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import com.google.auto.service.AutoService;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.ElementVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;

@AutoService(IAnalyzer.class)
public class DependencyCycleAnalyzer implements IAnalyzer {

  private ModularLanguage language;
  private CtModel model;

  public DependencyCycleAnalyzer() {

  }

  @Override
  public Report analyze(CtElement element) {
    //TODO: für paket und klasse anbieten
    return null;
  }

  @Override
  public void init(ModularLanguage language, CtModel simulatorAST) {
    this.language = language;
    this.model = simulatorAST;
  }

  @Override
  public String getDescription() {
    return "";
  }

  @Override
  public String getName() {
    return "DependencyCycleAnalyzer";
  }

  @Override
  public boolean canAnalyze(CtElement element) {
    // nicht sehr spannend
    ElementVisitor visitor = new ElementVisitor() {
      @Override
      public void visitCtPackage(CtPackage arg0) {
        this.setResult(true);
      }
    };
    element.accept(visitor);
    return visitor.canVisit();
  }

  @Override
  public Report fullAnalysis() {
    return new CycleVisitor().fullAnalysis(model);
  }

  @Override
  public boolean supportsFullAnalysis() {
    return true;
  }

  

}
