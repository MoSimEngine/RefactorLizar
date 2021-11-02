package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.LayerSelection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Elements;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
public class Eval {
  @Test
  public void main() {
    String langPath = "F:/OneDrive - bwedu/Uni zeugs/Hiwi/Software/SmartGrid/SmartGridLang/metamodel/refactored";
    String simulatorPath = "F:/OneDrive - bwedu/Uni zeugs/Hiwi/Software/eval/smartgrid-angepasst/Smart-Grid-ICT-Resilience-Framework/bundles";
    List<String> classQNameList = List.of(
      "smartgrid.attackersimulation.ViralHacker",
      "smartgrid.attackersimulation.LocalHacker"
    );
    String scenarioNumber = "10";
    LayerArchitecture architecture = new LayerArchitecture("paradigm,domain");

    Project project = buildProject(List.of(langPath), List.of(simulatorPath));
    SimulatorModel model = project.getSimulatorModel();
    //for(String classQName : model.getComponents().stream().map(v -> v.getTypes()).flatMap(Set::stream).map(v -> v.getQualifiedName()).collect(Collectors.toList())) {
    for(String classQName : classQNameList) {

      CtType<?> startType = model.getTypeWithQualifiedName(classQName);
    LayerClassSplit refactoring = new LayerClassSplit(architecture, startType, new Selection());
    refactoring.createRefactoring().refactor(project);
    }
    project.getSimulatorModel().prettyprint(Path.of("F:/OneDrive - bwedu/Uni zeugs/Hiwi/Software/eval/smartgrid-refactored/scenario"+scenarioNumber)); 
  }

  private static Project buildProject(List<String> languagePaths, List<String> simulatorPaths) {
    return new ProjectParser()
            .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
            .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
            .addLanguagePaths(languagePaths)
            .addSimulatorPaths(simulatorPaths)
            .parse();
}

  private static class Selection implements LayerSelection {

    public Layer getLayerForElement(
            Project project, CtElement element, LayerArchitecture layers, Layer defaultLayer) {
        Set<CtTypeReference<?>> referencedTypes = element.getReferencedTypes();
        List<CtFieldReference<?>> fieldReferences = Elements.getReferencedFields(element);
        fieldReferences.forEach(v -> referencedTypes.addAll(v.getReferencedTypes()));
        fieldReferences.forEach(v -> referencedTypes.add(v.getType()));
        referencedTypes.removeIf(Objects::isNull);
        Layer lowestLayer = defaultLayer;
        for (Layer layer : layers.getLayers()) {
            if (checkLayerExistence(referencedTypes, layer)) {
                lowestLayer = layer;
            }
        }
        return lowestLayer;
    }

    private boolean checkLayerExistence(Set<CtTypeReference<?>> referencedTypes, Layer layer) {
        return referencedTypes.stream().anyMatch(reference -> containsLayerName(layer, reference));
    }

    private boolean containsLayerName(Layer layer, CtTypeReference<?> reference) {
        return convertToLayerName(reference).contains(layer.getName() + ".");
    }

    @Override
    public Iterable<Layer> getUsedLayers(Project project, CtElement element,
        LayerArchitecture layers) {
          Set<CtTypeReference<?>> referencedTypes = element.getReferencedTypes();
          List<CtFieldReference<?>> fieldReferences = Elements.getReferencedFields(element);
          fieldReferences.forEach(v -> referencedTypes.addAll(v.getReferencedTypes()));
          fieldReferences.forEach(v -> referencedTypes.add(v.getType()));
          referencedTypes.removeIf(Objects::isNull);
          List<Layer> lowestLayer = new ArrayList<>();
          for (Layer layer : layers.getLayers()) {
              if (checkLayerExistence(referencedTypes, layer)) {
                  lowestLayer.add(layer);
              }
          }
          return lowestLayer;
    }

  }

  private static String convertToLayerName(CtTypeReference<?> reference) {
    if(reference.getQualifiedName().contains("graph.")) {
      return "paradigm." + reference.getQualifiedName();
    }
    if(reference.getQualifiedName().contains("topo.")) {
      return "domain." + reference.getQualifiedName();
    }
    if(reference.getQualifiedName().contains("base.")) {
      return "paradigm." + reference.getQualifiedName();
    }
    return "";
  }
}
