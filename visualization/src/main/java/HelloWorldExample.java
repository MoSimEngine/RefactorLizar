import static org.neo4j.driver.Values.parameters;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

public class HelloWorldExample implements AutoCloseable {
    private final Driver driver;

    public HelloWorldExample(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

    @Override
    public void close() throws Exception {
        driver.close();
    }

    public void printGreeting(final String message) {
        try (Session session = driver.session()) {
            String greeting =
                    session.writeTransaction(
                            tx -> {
                                Result result =
                                        tx.run(
                                                "CREATE (a:Greeting) "
                                                        + "SET a.message = $message "
                                                        + "RETURN a.message + ', from node ' + id(a)",
                                                parameters("message", message));
                                return result.single().get(0).asString();
                            });

            System.out.println(greeting);
        }
    }

    public void addSimulatorType() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mSimuLizar");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mPCM_build");
        Project project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();

        try (Session session = driver.session()) {
            session.writeTransaction(
                    tx -> {
                        tx.run("Match (a:Simulator) " + "Delete a");
                        return "aaa";
                    });
            var graph =
                    DependencyGraphSupplier.getTypeGraph(
                            project.getLanguage(), project.getSimulatorModel());
            graph.nodes().stream()
                    .filter(
                            v ->
                                    project.getSimulatorModel()
                                                    .getTypeWithQualifiedName(v.getQualifiedName())
                                            != null)
                    .forEach(
                            node ->
                                    session.writeTransaction(
                                            tx -> {
                                                Result result =
                                                        tx.run(
                                                                "CREATE (a:Simulator) "
                                                                        + "SET a.name = $name "
                                                                        + "SET a.tooltip = $tooltip"
                                                                        + " RETURN a.name + ', from node ' + id(a)",
                                                                parameters(
                                                                        "name",
                                                                        node.getQualifiedName(),
                                                                        "tooltip",
                                                                        node.getQualifiedName()));
                                                return result.single().get(0).asString();
                                            }));
            graph.nodes().stream()
                    .filter(
                            v ->
                                    project.getLanguage()
                                                    .getTypeWithQualifiedName(v.getQualifiedName())
                                            != null)
                    .forEach(
                            node ->
                                    session.writeTransaction(
                                            tx -> {
                                                Result result =
                                                        tx.run(
                                                                "CREATE (a:Language) "
                                                                        + "SET a.name = $name "
                                                                        + "SET a.tooltip = $tooltip"
                                                                        + " RETURN a.name + ', from node ' + id(a)",
                                                                parameters(
                                                                        "name",
                                                                        node.getQualifiedName(),
                                                                        "tooltip",
                                                                        node.getQualifiedName()));
                                                return result.single().get(0).asString();
                                            }));

            graph.nodes().stream()
                    .filter(
                            v ->
                                    project.getSimulatorModel()
                                                    .getTypeWithQualifiedName(v.getQualifiedName())
                                            != null)
                    .forEach(
                            node ->
                                    graph.successors(node)
                                            .forEach(
                                                    successor ->
                                                            session.writeTransaction(
                                                                    tx -> {
                                                                        Result result =
                                                                                tx.run(
                                                                                        "MATCH (a:Simulator), (b:Language) "
                                                                                                + "WHERE a.name = $name AND b.name = $name2 "
                                                                                                + "CREATE (a)-[r:DEPENDS_ON]->(b) "
                                                                                                + "RETURN a.name + ', from node ' + id(a)",
                                                                                        parameters(
                                                                                                "name",
                                                                                                node
                                                                                                        .getQualifiedName(),
                                                                                                "name2",
                                                                                                successor
                                                                                                        .getQualifiedName()));
                                                                        return "";
                                                                    })));
        }
    }

    public void addSimulatorComponent() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mSimuLizar");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mPCM_build");
        Project project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();

        try (Session session = driver.session()) {
            session.writeTransaction(
                    tx -> {
                        tx.run("Match (a:Simulator) " + "Delete a");
                        return "aaa";
                    });
            var graph =
                    DependencyGraphSupplier.getComponentGraph(
                            project.getLanguage(), project.getSimulatorModel());
            Set<Component> foo =
                    graph.nodes().stream()
                            .filter(v -> !v.getTypes().isEmpty())
                            .filter(
                                    v ->
                                            project.getSimulatorModel()
                                                            .getTypeWithQualifiedName(
                                                                    v.getTypes()
                                                                            .iterator()
                                                                            .next()
                                                                            .getQualifiedName())
                                                    != null)
                            .collect(Collectors.toSet());
            foo.forEach(
                    node ->
                            session.writeTransaction(
                                    tx -> {
                                        Result result =
                                                tx.run(
                                                        "CREATE (a:Simulator) "
                                                                + "SET a.name = $name "
                                                                + "SET a.tooltip = $tooltip"
                                                                + " RETURN a.name + ', from node ' + id(a)",
                                                        parameters(
                                                                "name",
                                                                node.getName(),
                                                                "tooltip",
                                                                node.getName()));
                                        return result.single().get(0).asString();
                                    }));
            graph.nodes().stream()
                    .filter(v -> !foo.contains(v))
                    .forEach(
                            node ->
                                    session.writeTransaction(
                                            tx -> {
                                                Result result =
                                                        tx.run(
                                                                "CREATE (a:Language) "
                                                                        + "SET a.name = $name "
                                                                        + "SET a.tooltip = $tooltip"
                                                                        + " RETURN a.name + ', from node ' + id(a)",
                                                                parameters(
                                                                        "name",
                                                                        node.getName(),
                                                                        "tooltip",
                                                                        node.getName()));
                                                return result.single().get(0).asString();
                                            }));

            graph.nodes().stream()
                    .forEach(
                            node ->
                                    graph.successors(node)
                                            .forEach(
                                                    successor ->
                                                            session.writeTransaction(
                                                                    tx -> {
                                                                        Result result =
                                                                                tx.run(
                                                                                        "MATCH (a:Simulator), (b:Language) "
                                                                                                + "WHERE a.name = $name AND b.name = $name2 "
                                                                                                + "CREATE (a)-[r:DEPENDS_ON]->(b) "
                                                                                                + "RETURN a.name + ', from node ' + id(a)",
                                                                                        parameters(
                                                                                                "name",
                                                                                                node
                                                                                                        .getName(),
                                                                                                "name2",
                                                                                                successor
                                                                                                        .getName()));
                                                                        return "";
                                                                    })));
        }
    }

    public static void main(String... args) throws Exception {
        try (HelloWorldExample greeter =
                new HelloWorldExample("bolt://localhost:7687", "neo4j", "test")) {
            // greeter.addSimulatorType();
            greeter.addSimulatorComponent();
            // greeter.printGreeting("hello, world");
        }
    }
}
