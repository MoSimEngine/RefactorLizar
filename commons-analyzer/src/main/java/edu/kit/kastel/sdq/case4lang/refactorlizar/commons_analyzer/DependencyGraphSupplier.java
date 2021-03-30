package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.reference.CtTypeReference;

public class DependencyGraphSupplier {

    private ModularLanguage language;
    private SimulatorModel model;

    public static MutableNetwork<CtType<?>, EdgeValue> getDependencyGraph(
            ModularLanguage language, SimulatorModel model) {
        // TODO: check if graph is dirty and needs recalc
        return new DependencyGraphSupplier().createDependencyGraph(language, model);
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
                                .filter(
                                        type -> {
                                            if (hasEdgeConnecting(graph, member, type)) {
                                                return getEdgeValues(graph, member, type)
                                                        .contains(EdgeValue.of(member));
                                            }
                                            return true;
                                        })
                                .forEach(type -> createEdge(graph, member, type)));

        return graph;
    }

    private boolean createEdge(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtTypeMember member, CtType<?> type) {
        return graph.addEdge(member.getTopLevelType(), type, EdgeValue.of(member));
    }

    private boolean hasEdgeConnecting(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtTypeMember member, CtType<?> type) {
        return graph.hasEdgeConnecting(member.getTopLevelType(), type);
    }

    private Set<EdgeValue> getEdgeValues(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtTypeMember member, CtType<?> type) {
        return graph.edgesConnecting(member.getTopLevelType(), type);
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

    private List<CtType<?>> getAllTypes(SimulatorModel model) {
        return model.getAllElements(CtPackage.class).stream()
                .map(v -> v.getTypes())
                .flatMap(v -> v.stream())
                .collect(Collectors.toList());
    }
}
