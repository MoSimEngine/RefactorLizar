package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

public class ClassSplitTest {

    @Test
    public void classSplitTest() {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/projects/simpleProject");
        CtModel model = launcher.buildModel();
        CtType<?> type = model.getAllTypes().iterator().next();
        CtField<?> field1 = type.getField("a");
        CtMethod<?> method = type.getMethodsByName("A").get(0);
        ClassSplitBuilder builder = new ClassSplitBuilder();
        builder.sourceClass(type)
                .targetClass("edu.kit.dsis.Target")
                .moveTypeMember(field1)
                .moveTypeMember(method)
                .createClassSplit()
                .refactor();
        assertEquals(model.getAllTypes().size(), 2);
        assertEquals(type.getTypeMembers().size(), 3);
    }
}
