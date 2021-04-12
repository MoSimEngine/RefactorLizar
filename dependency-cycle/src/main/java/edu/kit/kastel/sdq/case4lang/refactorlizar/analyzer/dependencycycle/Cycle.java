package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class Cycle {

    private List<DependencyEdge<CtType<?>>> dependencyEdges = new LinkedList<>();
    private ModularLanguage language;
    private SimulatorModel model;

    public Cycle(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    void addEdge(DependencyEdge<CtType<?>> edge) {
        dependencyEdges.add(edge);
    }

    List<DependencyEdge<CtType<?>>> getCycle() {
        return dependencyEdges;
    }

    private void sort() {
        List<DependencyEdge<CtType<?>>> edges = new LinkedList<>();
        List<DependencyEdge<CtType<?>>> availableEdges = new ArrayList<>(dependencyEdges);
        DependencyEdge<CtType<?>> firstEdge = getCycle().get(0);
        DependencyEdge<CtType<?>> currentEdge = firstEdge;
        while (!availableEdges.isEmpty()) {
            DependencyEdge<CtType<?>> successor = findSuccessor(availableEdges, currentEdge);
            edges.add(currentEdge);
            availableEdges.remove(currentEdge);
            if (successor == null) {
                return;
            }
            currentEdge = successor;
            dependencyEdges = edges;
        }
    }

    private DependencyEdge<CtType<?>> findSuccessor(
            List<DependencyEdge<CtType<?>>> edges, DependencyEdge<CtType<?>> currentEdge) {
        return edges.stream().filter(v -> isSuccessor(currentEdge, v)).findAny().orElse(null);
    }

    private boolean isSuccessor(
            DependencyEdge<CtType<?>> currentEdge, DependencyEdge<CtType<?>> candidate) {
        return candidate.getSource().equals(currentEdge.getTarget());
    }

    String printOnTypeLevel() {
        sort();
        List<DependencyEdge<CtType<?>>> copy = new ArrayList<>(dependencyEdges);
        copy.removeIf(v -> v.getValue().isEmpty());
        return copy.stream()
                .map(
                        v ->
                                "\t"
                                        + v.getSource().getQualifiedName()
                                        + "\t"
                                        + " -> "
                                        + "\t"
                                        + v.getTarget().getQualifiedName()
                                        + "\n"
                                        + "\t\twith the following members:\n"
                                        + generateTypeMemberString(v.getValue()))
                .collect(Collectors.joining("\n", "\n>>>>>>Cycle Start:\n", "\n<<<<<<<Cycle End"));
    }

    private String generateTypeMemberString(Collection<EdgeValue> edgeValues) {
        return edgeValues.stream()
                .map(EdgeValue::getMember)
                .map(
                        member ->
                                "\t\t"
                                        + member.getDeclaringType().getQualifiedName()
                                        + "#"
                                        + member.getSimpleName()
                                        + "  "
                                        + member.getPosition().getLine())
                .collect(Collectors.joining("\n"));
    }

    String printOnPackageLevel() {
        sort();
        List<DependencyEdge<CtType<?>>> copy = new ArrayList<>(dependencyEdges);
        copy.removeIf(v -> v.getValue().isEmpty());
        Map<Entry<CtPackage, CtPackage>, List<CtType<?>>> cycles = new HashMap<>();
        for (DependencyEdge<CtType<?>> dependencyEdge : copy) {
            cycles.putIfAbsent(
                    createPackageEntry(dependencyEdge), generateTypeList(dependencyEdge));
            cycles.merge(
                    createPackageEntry(dependencyEdge),
                    generateTypeList(dependencyEdge),
                    mergeLists());
        }
        cycles.entrySet().removeIf(v -> v.getKey().getKey().equals(v.getKey().getValue()));
        return cycles.entrySet().stream()
                .map(v -> generateString(v.getKey(), v.getValue()))
                .collect(Collectors.joining("\n", "\n>>>>>>Cycle Start:\n", "\n<<<<<<<Cycle End"));
    }

    private String generateTypeString(List<CtType<?>> value) {
        return value.stream()
                .map(CtType::getQualifiedName)
                .map(v -> "\t\t" + v)
                .collect(Collectors.joining("\n"));
    }

    private String generateString(Entry<CtPackage, CtPackage> entry, List<CtType<?>> types) {
        return "\t"
                + entry.getKey().getQualifiedName()
                + "\t"
                + " -> "
                + "\t"
                + entry.getValue().getQualifiedName()
                + "\n"
                + "\t\twith the following classes:\n"
                + generateTypeString(types);
    }

    private BiFunction<? super List<CtType<?>>, ? super List<CtType<?>>, ? extends List<CtType<?>>>
            mergeLists() {
        return (o1, o2) -> Stream.concat(o1.stream(), o2.stream()).collect(Collectors.toList());
    }

    private List<CtType<?>> generateTypeList(DependencyEdge<CtType<?>> dependencyEdge) {
        return dependencyEdge.getValue().stream()
                .map(member -> member.getMember().getDeclaringType())
                .distinct()
                .collect(Collectors.toList());
    }

    private Entry<CtPackage, CtPackage> createPackageEntry(
            DependencyEdge<CtType<?>> dependencyEdge) {
        return Map.entry(
                dependencyEdge.getSource().getPackage(), dependencyEdge.getTarget().getPackage());
    }
}
