package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.auto.service.AutoService;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.ElementVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;

@AutoService(IAnalyzer.class)
public class LanguageBlobAnalyzer implements IAnalyzer {

    private ModularLanguage language;
    private SimulatorModel model;

    public LanguageBlobAnalyzer() {}

    @Override
    public Report analyze(CtElement element) {
        PackageVisitor visitor = new PackageVisitor(language);
        element.accept(visitor);
        return visitor.getReport();
    }

    @Override
    public void init(ModularLanguage language, SimulatorModel simulatorAST) {
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
        PackageVisitor visitor = new PackageVisitor(language);
        visitor.analyzeFullModel(model);
        return visitor.getReport();
    }

    @Override
    public boolean supportsFullAnalysis() {
        return true;
    }

    @Override
    public void init(ModularLanguage language, SimulatorModel simulatorAST, Settings settings) {
        this.language = language;
        this.model = simulatorAST;
    }

    public boolean supportsFullAnalysisLevel(SearchLevels level) {
        switch (level) {
            case TYPE:
                return true;
            case COMPONENT:
                return true;
            case PACKAGE:
                return true;
            default:
                return false;
        }
    }

    @Override
    public Report fullAnalysis(SearchLevels level) {
        return new PackageVisitor(language, model).fullAnalysis(level);
    }
}
