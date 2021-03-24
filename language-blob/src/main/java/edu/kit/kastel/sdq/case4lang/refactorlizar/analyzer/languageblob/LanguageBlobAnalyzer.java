package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.auto.service.AutoService;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.ElementVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.JavaSourceCodeCache;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;

@AutoService(IAnalyzer.class)
public class LanguageBlobAnalyzer implements IAnalyzer {

    private JavaSourceCodeCache javaSourceCodeCache;
    private ModularLanguage language;
    private SimulatorModel model;

    public LanguageBlobAnalyzer() {}

    @Override
    public Report analyze(CtElement element) {
        PackageVisitor visitor = new PackageVisitor(javaSourceCodeCache, language);
        element.accept(visitor);
        return visitor.getReport();
    }

    @Override
    public void init(
            JavaSourceCodeCache javaSourceCodeCache,
            ModularLanguage language,
            SimulatorModel simulatorAST) {
        this.javaSourceCodeCache = javaSourceCodeCache;
        this.language = language;
        this.model = simulatorAST;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getName() {
        return "LanguageBlobAnalyzer";
    }

    @Override
    public boolean canAnalyze(CtElement element) {
        ElementVisitor visitor =
                new ElementVisitor() {
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
        PackageVisitor visitor = new PackageVisitor(javaSourceCodeCache, language);
        visitor.analyzeFullModel(model);
        return visitor.getReport();
    }

    @Override
    public boolean supportsFullAnalysis() {
        return true;
    }
}
