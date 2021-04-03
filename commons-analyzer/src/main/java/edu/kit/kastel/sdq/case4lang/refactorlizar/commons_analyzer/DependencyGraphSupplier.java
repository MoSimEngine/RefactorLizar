package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.reference.CtTypeReference;

public class DependencyGraphSupplier {

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();
    private static ModularLanguage cachedLanguage;
    private static SimulatorModel cachedModel;
    private static MutableNetwork<CtType<?>, EdgeValue> graph;

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
        cachedModel = model;
        cachedLanguage = language;
        return Graphs.copyOf(graph);
    }

    private static boolean checkIfSimulatorIsSame(SimulatorModel model) {
        return Objects.hashCode(cachedModel) == Objects.hashCode(model);
    }

    private static boolean checkIfLanguageIsSame(ModularLanguage language) {
        return Objects.hashCode(cachedLanguage) == Objects.hashCode(language);
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
        return new HashSet<>(model.getAllElements(CtType.class));
    }
}
