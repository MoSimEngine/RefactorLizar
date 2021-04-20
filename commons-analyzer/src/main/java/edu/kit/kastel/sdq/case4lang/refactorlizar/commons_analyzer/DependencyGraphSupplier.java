package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.HashSet;
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

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();
    private static ModularLanguage cachedLanguage;
    private static SimulatorModel cachedModel;
    private static MutableNetwork<CtType<?>, EdgeValue> graph;
    private static MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> typeGraph;
    private static MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> packageGraph;
    private static MutableNetwork<Feature, Edge<Feature, CtPackage>> componentGraph;

    public static MutableNetwork<CtType<?>, EdgeValue> getDependencyGraph(
            ModularLanguage language, SimulatorModel model) {
        if (checkIfLanguageIsSame(language)) {
            if (checkIfSimulatorIsSame(model)) {
                if (graph != null) {
                    LOGGER.atInfo().log("Reusing graph");
                    return Graphs.copyOf(graph);
                }
            }
        }
        graph = new DependencyGraphSupplier().createDependencyGraph(language, model);
        cacheData(language, model);
        return Graphs.copyOf(graph);
    }
    /** @return the typeGraph */
    public static MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> getTypeGraph(
            ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language)) {
            if (typeGraph != null) {
                LOGGER.atInfo().log("Reusing type graph");
                return Graphs.copyOf(typeGraph);
            }
        }
        clearCache();
        cacheData(language, model);
        typeGraph = new DependencyGraphSupplier().createTypeGraph(language, model);
        return Graphs.copyOf(typeGraph);
    }
    /** @return the typeGraph */
    public static MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> getPackageGraph(
            ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language)) {
            if (packageGraph != null) {
                LOGGER.atInfo().log("Reusing type graph");
                return Graphs.copyOf(packageGraph);
            }
        }
        clearCache();
        cacheData(language, model);
        packageGraph = new DependencyGraphSupplier().createPackageGraph(language, model);
        return Graphs.copyOf(packageGraph);
    }

    /** @return the typeGraph */
    public static MutableNetwork<Feature, Edge<Feature, CtPackage>> getComponentGraph(
            ModularLanguage language, SimulatorModel model) {
        if (checkIfCacheIsStale(model, language)) {
            if (componentGraph != null) {
                LOGGER.atInfo().log("Reusing type graph");
                return Graphs.copyOf(componentGraph);
            }
        }
        clearCache();
        cacheData(language, model);
        componentGraph = new DependencyGraphSupplier().createComponentGraph(language, model);
        return Graphs.copyOf(componentGraph);
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
        return checkIfLanguageIsSame(language) || checkIfSimulatorIsSame(model);
    }

    private MutableNetwork<CtType<?>, EdgeValue> createDependencyGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        Collection<CtType<?>> types = getAllTypes(model);
        Collection<CtTypeMember> classMembers = getAllTypeMembers(types);
        classMembers.forEach(
                member ->
                        member.getReferencedTypes().stream()
                                .map(retrieveTypes(language, model))
                                .filter(Objects::nonNull)
                                .filter(type -> !isInnerClass(member, type))
                                .forEach(type -> createEdge(graph, member, type)));

        return graph;
    }

    private boolean createEdge(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtTypeMember member, CtType<?> type) {
        EdgeValue edgeValue = EdgeValue.of(member.getTopLevelType(), type, member);
        if (graph.nodes().contains(type)
                && graph.nodes().contains(member.getTopLevelType())
                && graph.edgesConnecting(member.getTopLevelType(), type).contains(edgeValue)) {
            return false;
        }
        return graph.addEdge(member.getTopLevelType(), type, edgeValue);
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
                .map(type -> type.getTypeMembers())
                .flatMap(v -> v.stream())
                .collect(Collectors.toList());
    }

    private Set<CtType<?>> getAllTypes(SimulatorModel model) {
        Set<CtType<?>> types = new HashSet<>();
        model.getAllElements(CtType.class).stream().forEach(types::add);
        return types;
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

    public MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> createPackageGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        for (CtType<?> source : getAllTypes(model)) {
            source.getReferencedTypes().stream()
                    .map(retrieveTypes(language, model))
                    .filter(Objects::nonNull)
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

    public MutableNetwork<Feature, Edge<Feature, CtPackage>> createComponentGraph(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Feature, Edge<Feature, CtPackage>> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        for (CtType<?> source : getAllTypes(model)) {
            Optional<Feature> sourceComponent = findSimulatorFeature(source.getPackage(), model);
            if (sourceComponent.isEmpty()) {
                continue;
            }
            source.getReferencedTypes().stream()
                    .map(retrieveTypes(language, model))
                    .filter(Objects::nonNull)
                    .map(target -> findLanguageFeature(target.getPackage(), language))
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .filter(
                            target ->
                                    !graphHasEdge(
                                            graph,
                                            sourceComponent.get(),
                                            target,
                                            source.getPackage()))
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

    private Optional<Feature> findSimulatorFeature(CtPackage packag, SimulatorModel model) {
        return model.getLanguageFeature().stream()
                .filter(
                        v ->
                                v.getJavaPackage().equals(packag)
                                        || packag.hasParent(v.getJavaPackage()))
                .findFirst();
    }

    private Optional<Feature> findLanguageFeature(CtPackage packag, ModularLanguage language) {
        return language.getLanguageFeature().stream()
                .filter(
                        v ->
                                v.getJavaPackage().equals(packag)
                                        || packag.hasParent(v.getJavaPackage()))
                .findFirst();
    }

    private <T, U, R> boolean graphHasEdge(
            Network<T, Edge<U, R>> graph, T source, T target, R value) {
        return graph.nodes().containsAll(List.of(source, target))
                && graph.edgesConnecting(source, target)
                        .contains(new Edge<T, R>(source, target, value));
    }
}
