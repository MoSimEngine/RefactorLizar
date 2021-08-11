package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtFieldReference;

public class LayerClassSplitTest {

    @Test
    void testCreateRefactoring() {
        LayerArchitecture architecture = new LayerArchitecture("domain,paradigm,quality");
        Project project = buildProject(List.of(), List.of("src/test/resources/projects/layer"));
        SimulatorModel model = project.getSimulatorModel();
        CtType<?> splitType =
                model.getComponents().iterator().next().getTypes().stream()
                        .filter(v -> v.getSimpleName().equals("TestClass"))
                        .findFirst()
                        .get();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, splitType);
        refactoring.createRefactoring().refactor(project);
        assertThat(model.getTypeWithQualifiedName("layer.TestClass")).isNull();
    }

    @Test
    void testNoLayerClass() {
        // contract: a no layer class must be unmodified
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        Project project = buildProject(List.of(), List.of("src/test/resources/projects/noLayer"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        LayerClassSplit refactoring =
                new LayerClassSplit(architecture, typesBefore.iterator().next());
        refactoring.createRefactoring().refactor(project);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).isEqualTo(typesBefore);
        assertThat(typesBefore).hasSize(1);
    }

    @Test
    void testModifiers() {
        // contract: each splitted class must have the same modifiers as the original class
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        Project project = buildProject(List.of(), List.of("src/test/resources/projects/modifiers"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).doesNotContain(startType);
        for (CtType<?> type : typesAfter) {
            assertThat(type.getModifiers()).isEqualTo(startType.getModifiers());
        }
    }

    @Test
    void testGenerics() {
        // contract: each splitted class must have the same generics as the original class
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        Project project =
                buildProject(List.of(), List.of("src/test/resources/projects/simpleGenerics"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).doesNotContain(startType);
        for (CtType<?> type : typesAfter) {
            assertThat(type.getFormalCtTypeParameters())
                    .isEqualTo(startType.getFormalCtTypeParameters());
        }
    }

    @Test
    void testClassReplacement() {
        // contract: a class with 3 layers gets splitted in 4 classes
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        Project project = buildProject(List.of(), List.of("src/test/resources/projects/modifiers"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).doesNotContain(startType);
        assertThat(typesAfter).hasSize(3);
    }

    @Test
    void testSimpleFieldMovement() {
        // contract: fields get moved to the correct layer class
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        Project project =
                buildProject(List.of(), List.of("src/test/resources/projects/simpleFields"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        for (CtType<?> type : typesAfter) {
            assertThat(type.getDeclaredFields()).hasSize(1);
            for (CtFieldReference<?> field : type.getDeclaredFields()) {
                assertThat(field.getFieldDeclaration().isProtected()).isTrue();
            }
        }
    }

    @Test
    void testFieldMovesField() {
        // contract: fields get moved to the correct layer class if a upper layer ses a lower field
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        Project project =
                buildProject(List.of(), List.of("src/test/resources/projects/fieldUsesField"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        assertThat(
                        model.getTypeWithQualifiedName("fieldUsesField.DomainFieldUsage")
                                .getDeclaredFields())
                .hasSize(1);
        assertThat(
                        model.getTypeWithQualifiedName("fieldUsesField.QualityFieldUsage")
                                .getDeclaredFields())
                .hasSize(2);
    }

    @Test
    void testSuperClassDoesNotMove() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        Project project =
                buildProject(
                        List.of(
                                "src/test/resources/projects/simulatorExtendsLanguageClass/simulator"),
                        List.of(
                                "src/test/resources/projects/simulatorExtendsLanguageClass/simulator"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        assertThat(
                        model.getTypeWithQualifiedName("simulator.CommonsSimulatorClass")
                                .getDeclaredExecutables())
                .hasSize(2);
    }

    @Test
    void testStaticFieldReference() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        Project project =
                buildProject(
                        List.of(),
                        List.of("src/test/resources/projects/staticFieldReference/src/"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        assertDoesNotThrow(() -> refactoring.createRefactoring().refactor(project));
    }

    @Test
    void testGenericSuperclass() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,quality");
        Project project =
                buildProject(
                        List.of(), List.of("src/test/resources/projects/genericSuperclass/src/"));
        SimulatorModel model = project.getSimulatorModel();
        CtType<?> startType = model.getTypeWithQualifiedName("genericSuperclass.Lower");
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        assertDoesNotThrow(() -> refactoring.createRefactoring().refactor(project));
    }

    @Test
    void testSingelton() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,quality");
        Project project =
                buildProject(List.of(), List.of("src/test/resources/projects/singelton/src/"));
        SimulatorModel model = project.getSimulatorModel();
        CtType<?> startType = model.getTypeWithQualifiedName("singelton.Singelton");
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(project);
        assertThat(getAllTypes(model)).hasSize(1);
    }

    @Test
    void testAdjustedRecursiveGeneric() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        Project project =
                buildProject(
                        List.of(),
                        List.of("src/test/resources/projects/adjustedRecursivGeneric/src/"));
        SimulatorModel model = project.getSimulatorModel();
        List<CtType<?>> typesBefore = new ArrayList<>(getAllTypes(model));
        Collections.sort(typesBefore, (o1, o2) -> -1);
        for (CtType<?> type : typesBefore) {
            LayerClassSplit refactoring = new LayerClassSplit(architecture, type);
            assertDoesNotThrow(() -> refactoring.createRefactoring().refactor(project));
        }
    }

    private Project buildProject(List<String> languagePaths, List<String> simulatorPaths) {
        return new ProjectParser()
                .setLanguageKind(InputKind.FEATURE_FILE)
                .setSimulatorKind(InputKind.FEATURE_FILE)
                .addLanguagePaths(languagePaths)
                .addSimulatorPaths(simulatorPaths)
                .parse();
    }

    private HashSet<CtType<?>> getAllTypes(SimulatorModel model) {
        return model.getComponents().stream()
                .flatMap(v -> v.getTypes().stream())
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
    }
}
