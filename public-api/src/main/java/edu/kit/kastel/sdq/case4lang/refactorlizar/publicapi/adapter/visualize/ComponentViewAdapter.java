package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.visualize;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorComponent;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentToComponentRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentViewAdapter {

    private final SimulatorModel simulatorModel;

    public ComponentViewAdapter(SimulatorModel simulatorModel) {
        this.simulatorModel = simulatorModel;
    }

    public ComponentView provideComponentView() {

        Collection<SimulatorComponent> simulatorComponents =
                simulatorModel.getSimulatorComponents();

        List<Component> components =
                simulatorComponents.stream().map(this::convert).collect(Collectors.toList());

        List<ComponentToComponentRelation> componentToComponentRelations = new ArrayList<>();

        for (CtPackage ctPackage : simulatorModel.getAllElements(CtPackage.class)) {

            simulatorModel.findEdges(ctPackage).stream()
                    .map(target -> buildEdge(ctPackage.getQualifiedName(), target))
                    .forEach(componentToComponentRelations::add);
        }

        return new ComponentView(components, componentToComponentRelations);
    }

    private ComponentToComponentRelation buildEdge(String origin, String target) {

        return ComponentToComponentRelation.of(ComponentId.of(origin), ComponentId.of(target));
    }

    private Component convert(SimulatorComponent simulatorComponent) {

        ComponentId componentId = ComponentId.of(simulatorComponent.getFqn());
        return Component.of(
                componentId, simulatorComponent.getName(), simulatorComponent.getLayer());
    }
}
