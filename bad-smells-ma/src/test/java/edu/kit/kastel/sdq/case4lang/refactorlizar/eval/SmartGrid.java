package edu.kit.kastel.sdq.case4lang.refactorlizar.eval;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.broken_modularity.WrongDependencyDirection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.deficient_encapsulation.DataClumbs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.degraded_modularity.FeatureScatter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mosim.refactorlizar.architecture.evaluation.Application;
import org.mosim.refactorlizar.architecture.evaluation.CalculationMode;
import org.mosim.refactorlizar.architecture.evaluation.Result;

public class SmartGrid {

    private Project project;

    @BeforeEach
    public void setUp() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/Smart-Grid-ICT-Resilience-Framework");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/smartgridSprache");
        project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();
    }

    @Test
    void brokenModularity() {
        Report report =
                new WrongDependencyDirection()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new WrongDependencyDirection().getSettings());
        int a = 3;
    }

    @Test
    void deficient_encapsulation() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        Files.writeString(Path.of("deficient_encapsulation.md"), report.getDescription());
        int a = 3;
    }

    @Test
    void deficient_encapsulation_repair() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        int a = 3;
    }

    @Test
    void degraded_modularity() throws IOException {
        Report report =
                new FeatureScatter()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new FeatureScatter().getSettings());
        Files.writeString(Path.of("degraded_modularity.md"), report.getDescription());
        int a = 3;
    }

    @Test
    void evaluateScenario() {
        String badSmell = "deficient_encapsulation";
        String scenarioNumber = "01";
        boolean isBefore = false;
        String path =
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/smartGrid/"
                        + badSmell
                        + "/"
                        + "scenario_"
                        + scenarioNumber;
        if (isBefore) {
            path += "/before";
        } else {
            path += "/after";
        }
        Result result = new Application().evaluate(CalculationMode.ONE_OFFSET, path);
        int a = 3;
        System.out.println("Complexity " + result.getComplexity().getValue());
        System.out.println("Cohesion " + result.getCohesion().getValue());
        System.out.println("Coupling " + result.getCoupling().getValue());
        /*
        Complexity 1017.1144465032035
        Cohesion 0.04705423753984772
        Coupling 132.38525082876478
        */
    }
}
