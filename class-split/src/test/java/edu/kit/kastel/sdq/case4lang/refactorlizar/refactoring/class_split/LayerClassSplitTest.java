package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtType;

public class LayerClassSplitTest {
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
        Truth.assertThat(model.getTypeWithQualifiedName("layer.TestClass")).isNull();
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
}
