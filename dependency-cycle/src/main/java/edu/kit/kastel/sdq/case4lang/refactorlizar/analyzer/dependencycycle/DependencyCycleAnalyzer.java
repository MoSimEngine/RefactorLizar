package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import com.google.auto.service.AutoService;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.ElementVisitor;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;

@AutoService(IAnalyzer.class)
public class DependencyCycleAnalyzer implements IAnalyzer {

    private ModularLanguage language;
    private SimulatorModel model;

    public DependencyCycleAnalyzer() {}

    @Deprecated(forRemoval = true)
    @Override
    public Report analyze(CtElement element) {
        // TODO: für paket und klasse anbieten
        return null;
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
        return "DependencyCycleAnalyzer";
    }

    @Deprecated(forRemoval = true)
    @Override
    public boolean canAnalyze(CtElement element) {
        // nicht sehr spannend
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
        return new CycleVisitor().fullAnalysis(model);
    }

    @Override
    public boolean supportsFullAnalysis() {
        return true;
    }

    @Override
    public Report fullAnalysis(SearchLevels level) {
        return new CycleVisitor(language, model).fullAnalysis(level);
    }

    @Override
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
}
