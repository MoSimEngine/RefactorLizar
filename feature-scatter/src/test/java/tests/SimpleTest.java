package tests;

import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void simpleLanguageTest() {
        //        Launcher languageLauncher = new Launcher();
        //
        // languageLauncher.addInputResource("./src/test/resources/SimpleExample/LanguageFeature");
        //        CtModel languageModel = languageLauncher.buildModel();
        //
        //        Collection<LanguageFeature> feature = new ArrayList<>();
        //        feature.add(
        //                new LanguageFeature(
        //                        languageModel.getAllPackages().stream()
        //                                .filter(v -> v.getQualifiedName().contains("Feature"))
        //                                .findFirst()
        //                                .get(),
        //                        null));
        //        ModularLanguage lang = new ModularLanguage(feature);
        //
        //        Launcher simulatorLauncher = new Launcher();
        //        simulatorLauncher.addInputResource(
        //                "./src/test/resources/SimpleExample/SimulatorComponentA");
        //        simulatorLauncher.addInputResource(
        //                "./src/test/resources/SimpleExample/SimulatorComponentB");
        //        CtModel simulatorModel = simulatorLauncher.buildModel();
        //        CtPackage packagA =
        //                simulatorModel.getAllPackages().stream()
        //                        .filter(v -> v.getQualifiedName().contains("ComponentA"))
        //                        .findFirst()
        //                        .get();
        //        CtPackage packagB =
        //                simulatorModel.getAllPackages().stream()
        //                        .filter(v -> v.getQualifiedName().contains("ComponentB"))
        //                        .findFirst()
        //                        .get();
        //
        //        SimulatorModel model1 =
        //                new SimulatorModel(
        //                        simulatorModel.getAllPackages().stream()
        //                                .map(v -> new Feature(v, null))
        //                                .collect(Collectors.toList()));
        //
        //        PackageVisitor visitor = new PackageVisitor(javaSourceCodeCache, lang, model1);
        //        packagA.accept(visitor);
        //        assertNotNull(visitor.getReport());
        //        assertTrue(visitor.getReport().isSmellFound());
        //        System.out.println(visitor.getReport().toString());
        //
        //        visitor = new PackageVisitor(javaSourceCodeCache, lang, model1);
        //        packagB.accept(visitor);
        //        assertNotNull(visitor.getReport());
        //        assertTrue(visitor.getReport().isSmellFound());
        //        System.out.println(visitor.getReport().toString());
    }
}
