package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.deficient_encapsulation;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.InvocationFilter;
import spoon.reflect.visitor.filter.TypeFilter;

public class Repair {

    public void repair(
            ModularLanguage language,
            SimulatorModel simulatorModel,
            List<CtTypeReference<?>> dataclumbs) {
        Component component = simulatorModel.getComponents().iterator().next();
        Set<CtType<?>> types =
                simulatorModel.getComponents().stream()
                        .map(Component::getTypes)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toSet());
        Factory factory = types.iterator().next().getFactory();
        CtClass<?> clazz = createClass(dataclumbs, component, factory);
        createFieldsAndGetter(dataclumbs, factory, clazz);
        createConstructor(dataclumbs, factory, clazz);
        for (CtType<?> ctType : types) {
            for (CtMethod<?> ctMethod : ctType.getMethods()) {
                if (ctMethod.getParameters().stream()
                        .map(CtTypedElement::getType)
                        .collect(Collectors.toList())
                        .equals(dataclumbs)) {
                    CtMethod<?> replacement = ctMethod.clone();
                    if (ctMethod.getBody() == null) {
                        continue;
                    }
                    replaceMethodParameters(factory, clazz, replacement);
                    ctMethod.replace(replacement);
                    replaceInvocations(types, factory, clazz, ctMethod);
                }
            }
        }
    }

    private void replaceInvocations(
            Set<CtType<?>> types, Factory factory, CtClass<?> clazz, CtMethod<?> ctMethod) {
        types.stream()
                .map(type -> type.getElements(new InvocationFilter(ctMethod)))
                .flatMap(Collection::stream)
                .forEach(
                        invocation -> {
                            CtInvocation<?> cloned = invocation.clone();
                            invocation.replace(
                                    factory.createConstructorCall(
                                            clazz.getReference(),
                                            cloned.getArguments().toArray(CtExpression[]::new)));
                        });
    }

    private void replaceMethodParameters(
            Factory factory, CtClass<?> clazz, CtMethod<?> replacement) {
        replacement.setParameters(
                List.of(
                        factory.createParameter(
                                replacement,
                                clazz.getReference(),
                                clazz.getSimpleName().toLowerCase())));
        replacement
                .getBody()
                .getElements(new TypeFilter<>(CtParameterReference.class))
                .forEach(
                        v -> {
                            CtMethod<?> getter =
                                    clazz.getMethods().stream()
                                            .filter(
                                                    method ->
                                                            v.getType() != null
                                                                    && v.getType()
                                                                            .equals(
                                                                                    method
                                                                                            .getType()))
                                            .findFirst()
                                            .orElse(null);
                            if (getter == null) {
                                return;
                            }
                            factory.createCodeSnippetStatement(
                                    replacement.getParameters().get(0).getSimpleName()
                                            + "."
                                            + getter.getSimpleName()
                                            + "();");
                        });
    }

    private CtClass<?> createClass(
            List<CtTypeReference<?>> dataclumbs, Component component, Factory factory) {
        CtClass<?> clazz = factory.createClass();
        CtPackage ctPackage = component.getTypes().iterator().next().getPackage();
        clazz.setParent(ctPackage);
        String clazzName =
                dataclumbs.stream()
                        .map(CtTypeReference::getSimpleName)
                        .collect(Collectors.joining());
        clazz.setSimpleName(clazzName);
        return clazz;
    }

    private void createConstructor(
            List<CtTypeReference<?>> dataclumbs, Factory factory, CtClass<?> clazz) {
        CtConstructor<?> constructor = factory.Constructor().createDefault(clazz);
        dataclumbs.forEach(
                v -> factory.createParameter(constructor, v, v.getSimpleName().toLowerCase()));
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
            List<CtTypeReference<?>> dataclumbs, Factory factory, CtClass<?> clazz) {
        for (CtTypeReference<?> typeReference : dataclumbs) {
            factory.Field()
                    .create(
                            clazz,
                            Set.of(ModifierKind.PRIVATE),
                            typeReference,
                            typeReference.getSimpleName().toLowerCase(),
                            null);
            CtMethod<?> getter =
                    factory.Method()
                            .create(
                                    clazz,
                                    Set.of(ModifierKind.PUBLIC),
                                    typeReference,
                                    "get" + typeReference.getSimpleName().toLowerCase(),
                                    List.of(),
                                    Set.of());
            getter.setBody(
                    factory.createCodeSnippetStatement(
                            "return " + typeReference.getSimpleName().toLowerCase()));
        }
    }
}
