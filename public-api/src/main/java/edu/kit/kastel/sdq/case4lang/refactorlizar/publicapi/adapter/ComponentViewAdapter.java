package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentToComponentRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComponentViewAdapter {

  private final SimulatorModel simulatorModel;

  public ComponentViewAdapter(SimulatorModel simulatorModel) {
    this.simulatorModel = simulatorModel;
  }

  public ComponentView provideComponentView() {

    List<CtPackage> ctPackagesTopLevel = simulatorModel //
        .getAllElements(CtPackage.class) //
        .stream() //
        .filter(ctPackage -> ctPackage.getParent() != null || !ctPackage.isUnnamedPackage()) //
        .collect(Collectors.toList());

    List<Component> components = ctPackagesTopLevel.stream().map(this::convert) //
        .collect(Collectors.toList());

    List<ComponentToComponentRelation> componentToComponentRelations = simulatorModel //
        .getAllElements(CtPackage.class) //
        .stream() //
        .flatMap(ctPackage -> findEdges(ctPackage, ctPackagesTopLevel).stream()) //
        .collect(Collectors.toList());

    return new ComponentView(components, componentToComponentRelations);
  }

  private Set<ComponentToComponentRelation> findEdges(CtPackage ctPackage,
      List<CtPackage> ctPackagesTopLevel) {

    ComponentId self = ComponentId.of(ctPackage.getQualifiedName());

    Stream<? extends CtType<?>> referencedTypes = ctPackage //
        .getReferencedTypes() //
        .stream() //
        .map(CtTypeReference::getDeclaration) //
        .filter(Objects::nonNull);

    Set<ComponentToComponentRelation> result = new HashSet<>();

    referencedTypes.forEach(referencedType ->

      ctPackagesTopLevel.stream().filter(referencedType::hasParent) //
          .map(ctPackageTopLevel -> ComponentToComponentRelation
              .of(self, ComponentId.of(ctPackageTopLevel.getQualifiedName()))) //
          // TODO: This should be done by the backend.
          .filter(c -> !c.getTarget().equals(c.getOrigin()))
          .forEach(result::add)
    );

    return result;
  }

  private Component convert(CtPackage ctPackage) {

    ComponentId componentId = ComponentId.of(ctPackage.getQualifiedName());

    // TODO: Add layer information.
    return Component.of(componentId, ctPackage.getSimpleName(), "todo");
  }
}
