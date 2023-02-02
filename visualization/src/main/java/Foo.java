import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;

public class Foo {

    public static void main(String[] args) throws IOException {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Hiwi/Software/SmartGrid/Smart-Grid-ICT-Resilience-Framework");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Hiwi/Software/SmartGrid/SmartGridLang/metamodel/refactored");
        Project project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();
        System.setProperty("org.graphstream.ui", "javafx");
        System.setProperty("org.graphstream.debug", "true");
        Graph graph = new MultiGraph("Tutorial 1", false, true);
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");
        graph.display();

        // renderGraphComponent(project.getLanguage(), project.getSimulatorModel());
        // File imgFile = new File("graph.png");
        // imgFile.createNewFile();
        // Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        // g.addVertex("v1");
        // g.addVertex("v2");
        // g.addEdge("v1", "v2");
        // JGraphXAdapter<String, DefaultEdge> graphAdapter = new JGraphXAdapter<>(g);
        // mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        // layout.execute(graphAdapter.getDefaultParent());
        // renderHrefGraph(g);
    }
    /*
    public static void renderGraph(ModularLanguage language, SimulatorModel model)
        throws IOException {
      MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
          DependencyGraphSupplier.getPackageGraph(language, model);
      Graph<CtPackage, Edge<CtPackage, CtType<?>>> jgrapht = new MutableNetworkAdapter<>(graph);

      DOTExporter<CtPackage, Edge<CtPackage, CtType<?>>> exporter = new DOTExporter<>();
      exporter.setVertexAttributeProvider(v -> {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("label", DefaultAttribute.createAttribute("\"" + v.getQualifiedName() + "\""));
        return map;
      });
      exporter.setEdgeAttributeProvider(v -> {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("label", DefaultAttribute.createAttribute(
            "\"" + v.getCause().getQualifiedName() + "#" + v.getCause().getSimpleName() + "\""));
        return map;
      });
      exporter.setVertexIdProvider(v -> "\"" + v.getQualifiedName() + "\"");
      exporter.setEdgeIdProvider(
          v -> "\"" + v.getCause().getQualifiedName() + "#" + v.getCause().getSimpleName() + "\"");
      Writer writer = new StringWriter();
      exporter.exportGraph(jgrapht, writer);
      Files.writeString(Path.of("graph.dot"), writer.toString());
    }

    public static void renderGraphComponent(ModularLanguage language, SimulatorModel model)
        throws IOException {
      MutableNetwork<Component, Edge<Component, CtPackage>> graph =
          DependencyGraphSupplier.getComponentGraph(language, model);
          graph.edges().stream().filter( v-> v.getCause().getSimpleName().startsWith("java.")).collect(Collectors.toList()).forEach(graph::removeEdge);
      Graph<Component, Edge<Component, CtPackage>> jgrapht = new MutableNetworkAdapter<>(graph);

      DOTExporter<Component, Edge<Component, CtPackage>> exporter = new DOTExporter<>();
      exporter.setVertexAttributeProvider(v -> {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("label", DefaultAttribute.createAttribute("\"" + v.getName() + "\""));
        return map;
      });
      exporter.setEdgeAttributeProvider(v -> {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("label", DefaultAttribute.createAttribute(
            "\"" + v.getCause().getQualifiedName() + "#" + v.getCause().getSimpleName() + "\""));
        return map;
      });
      exporter.setVertexIdProvider(v -> "\"" + v.getName() + "\"");
      exporter.setEdgeIdProvider(
          v -> "\"" + v.getCause().getQualifiedName() + "#" + v.getCause().getSimpleName() + "\"");
      Writer writer = new StringWriter();
      exporter.exportGraph(jgrapht, writer);
      Files.writeString(Path.of("graph.dot"), writer.toString());
    }


    private static void renderHrefGraph(Graph<String, DefaultEdge> hrefGraph) throws IOException {

      DOTExporter<String, DefaultEdge> exporter = new DOTExporter<>(v -> v);
      exporter.setVertexAttributeProvider((v) -> {
        Map<String, Attribute> map = new LinkedHashMap<>();
        map.put("label", DefaultAttribute.createAttribute(v.toString()));
        return map;
      });
      Writer writer = new StringWriter();
      exporter.exportGraph(hrefGraph, writer);
      Files.writeString(Path.of("graph.dot"), writer.toString());
      System.out.println(writer.toString());
    }
    */
}
