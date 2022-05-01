package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_abstraction;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

public class Repair {

    public void repair(
            ModularLanguage language,
            SimulatorModel simulatorModel,
            CtMethod<?> primitiveObession) {
        Component component = simulatorModel.getComponents().iterator().next();
        Set<CtType<?>> types =
                simulatorModel.getComponents().stream()
                        .map(Component::getTypes)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toSet());
        Factory factory = types.iterator().next().getFactory();
        CtClass<?> clazz =
                createClass(getFirstPrimitiveParameter(primitiveObession), component, factory);
        createConstructor(getFirstPrimitiveParameter(primitiveObession).getType(), factory, clazz);
        createFieldsAndGetter(
                getFirstPrimitiveParameter(primitiveObession).getType(), factory, clazz);
    }

    private CtParameter<?> getFirstPrimitiveParameter(CtMethod<?> primitiveObession) {
        return primitiveObession.getParameters().stream()
                .filter(v -> v.getType() != null)
                .filter(
                        v ->
                                v.getType().isPrimitive()
                                        || v.getType().getSimpleName().equals("String"))
                .findFirst()
                .get();
    }

    private CtClass<?> createClass(CtParameter<?> name, Component component, Factory factory) {
        CtClass<?> clazz = factory.createClass();
        CtPackage ctPackage = component.getTypes().iterator().next().getPackage();
        clazz.setParent(ctPackage);
        String clazzName = name.getSimpleName();
        clazz.setSimpleName(clazzName);
        return clazz;
    }

    private void createConstructor(
            CtTypeReference<?> primitive, Factory factory, CtClass<?> clazz) {
        CtConstructor<?> constructor = factory.Constructor().createDefault(clazz);
        factory.createParameter(constructor, primitive, primitive.getSimpleName().toLowerCase());
        constructor.setBody(factory.createBlock());
        constructor.getParameters().stream()
                .map(
                        v ->
                                "this."
                                        + v.getSimpleName().toLowerCase()
                                        + "="
                                        + v.getSimpleName().toLowerCase())
                .map(factory::createCodeSnippetStatement)
                .forEach(constructor.getBody()::addStatement);
    }

    private void createFieldsAndGetter(
            CtTypeReference<?> primitive, Factory factory, CtClass<?> clazz) {
        factory.Field()
                .create(
                        clazz,
                        Set.of(ModifierKind.PRIVATE),
                        primitive,
                        primitive.getSimpleName().toLowerCase(),
                        null);
        CtMethod<?> getter =
                factory.Method()
                        .create(
                                clazz,
                                Set.of(ModifierKind.PUBLIC),
                                primitive,
                                "get" + primitive.getSimpleName().toLowerCase(),
                                List.of(),
                                Set.of());
        getter.setBody(
                factory.createCodeSnippetStatement(
                        "return " + primitive.getSimpleName().toLowerCase()));
    }
}
