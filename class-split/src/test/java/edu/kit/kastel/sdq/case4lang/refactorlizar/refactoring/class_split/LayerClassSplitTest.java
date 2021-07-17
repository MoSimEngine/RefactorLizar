package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThat;

import com.google.common.truth.Correspondence;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtFieldReference;

public class LayerClassSplitTest {

    private static final Correspondence<CtType<?>, CtType<?>> HAS_SAME_MODIFIERS() {
        return Correspondence.from(
                (u, v) -> !v.getModifiers().containsAll(u.getModifiers()), "modifiers");
    }
    ;

    @Test
    void testCreateRefactoring() {
        LayerArchitecture architecture = new LayerArchitecture("domain,paradigm,quality");
        SimulatorModel model =
                SimulatorParser.parseSimulator("src/test/resources/layer", InputKind.FEATURE_FILE);
        CtType<?> splitType =
                model.getSimulatorComponents().iterator().next().getTypes().stream()
                        .filter(v -> v.getSimpleName().equals("TestClass"))
                        .findFirst()
                        .get();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, splitType);
        refactoring.createRefactoring().refactor(null, model);
        assertThat(model.getTypeWithQualifiedName("layer.TestClass")).isNull();
        ;
    }

    @Test
    void testCreateRefactoring2() {
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/szenario16/before", InputKind.FEATURE_FILE);
        Set<CtType<?>> types =
                new HashSet<>(model.getSimulatorComponents().iterator().next().getTypes());
        for (CtType<?> ctType : types) {
            LayerClassSplit refactoring = new LayerClassSplit(architecture, ctType);
            refactoring.createRefactoring().refactor(null, model);
        }
        model.prettyprint(Path.of("./szenario16"));
    }

    @Test
    void testNoLayerClass() {
        // contract: a no layer class must be unmodified
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        SimulatorModel model = createSimulator("src/test/resources/noLayer");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        LayerClassSplit refactoring =
                new LayerClassSplit(architecture, typesBefore.iterator().next());
        refactoring.createRefactoring().refactor(null, model);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).isEqualTo(typesBefore);
        assertThat(typesBefore).hasSize(1);
    }

    @Test
    void testModifiers() {
        // contract: each splitted class must have the same modifiers as the original class
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");
        SimulatorModel model = createSimulator("src/test/resources/modifiers");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
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
        SimulatorModel model = createSimulator("src/test/resources/simpleGenerics");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
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
        SimulatorModel model = createSimulator("src/test/resources/modifiers");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
        Set<CtType<?>> typesAfter = getAllTypes(model);
        assertThat(typesAfter).doesNotContain(startType);
        assertThat(typesAfter).hasSize(4);
    }

    @Test
    void testSimpleFieldMovement() {
        // contract: fields get moved to the correct layer class
        LayerArchitecture architecture = new LayerArchitecture("paradigm,domain,quality");
        SimulatorModel model = createSimulator("src/test/resources/simpleFields");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
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
        SimulatorModel model = createSimulator("src/test/resources/fieldUsesField");
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
        assertThat(
                        model.getTypeWithQualifiedName("fieldUsesField.CommonsFieldUsage")
                                .getDeclaredFields())
                .isEmpty();
        assertThat(
                        model.getTypeWithQualifiedName("fieldUsesField.ParadigmFieldUsage")
                                .getDeclaredFields())
                .hasSize(0);
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
                        List.of("src/test/resources/simulatorExtendsLanguageClass/simulator"),
                        List.of("src/test/resources/simulatorExtendsLanguageClass/simulator"));
        SimulatorModel model = project.getSimulatorModel();
        Set<CtType<?>> typesBefore = getAllTypes(model);
        CtType<?> startType = typesBefore.iterator().next();
        LayerClassSplit refactoring = new LayerClassSplit(architecture, startType);
        refactoring.createRefactoring().refactor(null, model);
        assertThat(
                        model.getTypeWithQualifiedName("simulator.CommonsSimulatorClass")
                                .getDeclaredExecutables())
                .hasSize(1);
    }

    private Project buildProject(List<String> languagePaths, List<String> simulatorPaths) {
        return new ProjectParser()
                .setLanguageKind(InputKind.FEATURE_FILE)
                .setSimulatorKind(InputKind.FEATURE_FILE)
                .addLanguagePaths(languagePaths)
                .addSimulatorPaths(simulatorPaths)
                .parse();
    }

    private boolean isProtected(CtModifiable v) {
        return v.getModifiers().contains(ModifierKind.PROTECTED);
    }

    private HashSet<CtType<?>> getAllTypes(SimulatorModel model) {
        return model.getSimulatorComponents().stream()
                .flatMap(v -> v.getTypes().stream())
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    private SimulatorModel createSimulator(String path) {
        return SimulatorParser.parseSimulator(path, InputKind.FEATURE_FILE);
    }
}
