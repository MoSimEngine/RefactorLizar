package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.reference.CtTypeReference;

public class DependencyGraphSupplier {

    private static final String REUSING_GRAPH = "Reusing type graph";
    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();
    private static ModularLanguage cachedLanguage;
    private static SimulatorModel cachedModel;
    private static MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> typeGraph;
    private static MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> packageGraph;
    private static MutableNetwork<Component, Edge<Component, CtPackage>> componentGraph;

    /** Returns the type graph */
    public static synchronized MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>>
            getTypeGraph(ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language) && graphIsPresent(typeGraph)) {
            LOGGER.atInfo().log(REUSING_GRAPH);
            return Graphs.copyOf(typeGraph);
        }
        clearCache();
        cacheData(language, model);
        typeGraph = new DependencyGraphSupplier().createTypeGraph(language, model);
        return Graphs.copyOf(typeGraph);
    }

    /** Returns the package graph */
    public static synchronized MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>>
            getPackageGraph(ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language) && graphIsPresent(packageGraph)) {
            LOGGER.atInfo().log(REUSING_GRAPH);
            return Graphs.copyOf(packageGraph);
        }
        clearCache();
        cacheData(language, model);
        packageGraph = new DependencyGraphSupplier().createPackageGraph(language, model);
        return Graphs.copyOf(packageGraph);
    }

    /** Returns the component graph */
    public static synchronized MutableNetwork<Component, Edge<Component, CtPackage>>
            getComponentGraph(ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language) && graphIsPresent(componentGraph)) {
            LOGGER.atInfo().log(REUSING_GRAPH);
            return Graphs.copyOf(componentGraph);
        }
        clearCache();
        cacheData(language, model);
        componentGraph = new DependencyGraphSupplier().createComponentGraph(language, model);
        return Graphs.copyOf(componentGraph);
    }

    private static boolean graphIsPresent(Network<?, ?> graph) {
        return graph != null;
    }

    private static void cacheData(ModularLanguage language, SimulatorModel model) {
        cachedModel = model;
        cachedLanguage = language;
    }

    private static void clearCache() {
        typeGraph = null;
        packageGraph = null;
        componentGraph = null;
    }

    private static boolean checkIfSimulatorIsSame(SimulatorModel model) {
        return Objects.hashCode(cachedModel) == Objects.hashCode(model);
    }

    private static boolean checkIfLanguageIsSame(ModularLanguage language) {
        return Objects.hashCode(cachedLanguage) == Objects.hashCode(language);
    }

    private static boolean checkIfCacheIsStale(SimulatorModel model, ModularLanguage language) {
        return checkIfLanguageIsSame(language) && checkIfSimulatorIsSame(model);
    }

    private boolean isInnerClass(CtTypeMember member, CtType<?> type) {
        return member.getTopLevelType().equals(type);
    }

    private Function<? super CtTypeReference<?>, CtType<?>> retrieveTypes(
            ModularLanguage language, SimulatorModel model) {
        return type -> {
            CtType<?> clazz = type.getTypeDeclaration();
            if (clazz == null) {
                clazz = model.getTypeWithQualifiedName(type.getQualifiedName());
            }
            if (clazz == null) {
                clazz = language.getTypeWithQualifiedName(type.getQualifiedName());
            }
            return clazz;
        };
    }

    private List<CtTypeMember> getAllTypeMembers(Collection<CtType<?>> types) {
        return types.stream()
                .map(CtType::getTypeMembers)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private Set<CtType<?>> getAllTypes(SimulatorModel model) {
        return model.getComponents().stream()
                .map(Component::getTypes)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }

    private MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> createTypeGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        Collection<CtType<?>> types = getAllTypes(model);
        Collection<CtTypeMember> classMembers = getAllTypeMembers(types);
        classMembers.forEach(
                member ->
                        member.getReferencedTypes().stream()
                                .map(retrieveTypes(language, model))
                                .filter(Objects::nonNull)
                                .filter(target -> !isInnerClass(member, target))
                                .filter(
                                        target ->
                                                !graphHasEdge(
                                                        graph,
                                                        member.getTopLevelType(),
                                                        target,
                                                        member))
                                .forEach(
                                        target ->
                                                graph.addEdge(
                                                        member.getTopLevelType(),
                                                        target,
                                                        new Edge<>(
                                                                member.getTopLevelType(),
                                                                target,
                                                                member))));

        return graph;
    }

    private MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> createPackageGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        for (CtType<?> source : getAllTypes(model)) {
            if (source.getPackage() == null) {
                continue;
            }
            source.getReferencedTypes().stream()
                    .map(retrieveTypes(language, model))
                    .filter(Objects::nonNull)
                    .filter(target -> target.getPackage() != null)
                    .filter(target -> !source.getPackage().equals(target.getPackage()))
                    .filter(
                            target ->
                                    !graphHasEdge(
                                            graph,
                                            source.getPackage(),
                                            target.getPackage(),
                                            source))
                    .forEach(
                            target ->
                                    graph.addEdge(
                                            source.getPackage(),
                                            target.getPackage(),
                                            new Edge<>(
                                                    source.getPackage(),
                                                    target.getPackage(),
                                                    source)));
        }
        return graph;
    }

    private MutableNetwork<Component, Edge<Component, CtPackage>> createComponentGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Component, Edge<Component, CtPackage>> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        for (CtType<?> source : getAllTypes(model)) {
            if (source.getPackage() == null) {
                continue;
            }
            Optional<Component> sourceComponent = Components.findComponent(model, source);
            if (sourceComponent.isEmpty()) {
                continue;
            }
            source.getReferencedTypes().stream()
                    .map(retrieveTypes(language, model))
                    .filter(Objects::nonNull)
                    .filter(target -> target.getPackage() != null)
                    .map(target -> Components.findComponent(model, language, target))
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .filter(
                            target ->
                                    !graphHasEdge(
                                            graph,
                                            sourceComponent.get(),
                                            target,
                                            source.getPackage()))
                    .filter(target -> !sourceComponent.get().equals(target))
                    .forEach(
                            target ->
                                    graph.addEdge(
                                            sourceComponent.get(),
                                            target,
                                            new Edge<>(
                                                    sourceComponent.get(),
                                                    target,
                                                    source.getPackage())));
        }
        return graph;
    }

    private <T, U, R> boolean graphHasEdge(
            Network<T, Edge<U, R>> graph, T source, T target, R value) {
        if (source == null || target == null) {
            // types like T or void have no packages
            return true;
        }
        return graph.nodes().containsAll(List.of(source, target))
                && graph.edgesConnecting(source, target)
                        .contains(new Edge<T, R>(source, target, value));
    }
}
