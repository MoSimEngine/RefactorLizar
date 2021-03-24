package tests;

public class SimpleTest {

    //    @Test
    //    public void simpleLanguageTest() {
    //        Launcher launcher = new Launcher();
    //        launcher.addInputResource("./src/test/resources/SimpleExample");
    //        CtModel model = launcher.buildModel();
    //        Collection<Feature> feature = new ArrayList<>();
    //        feature.add(
    //                new Feature(
    //                        model.getAllPackages().stream()
    //                                .filter(v -> v.getQualifiedName().contains("FeatureA"))
    //                                .findFirst()
    //                                .get(),
    //                        null));
    //        feature.add(
    //                new Feature(
    //                        model.getAllPackages().stream()
    //                                .filter(v -> v.getQualifiedName().contains("FeatureB"))
    //                                .findFirst()
    //                                .get(),
    //                        null));
    //        ModularLanguage lang = new ModularLanguage(feature);
    //        CtPackage packag =
    //                model.getAllPackages().stream()
    //                        .filter(v -> v.getQualifiedName().contains("Simulator"))
    //                        .findFirst()
    //                        .get();
    //        PackageVisitor visitor = new PackageVisitor(javaSourceCodeCache, lang);
    //        packag.accept(visitor);
    //        assertNotNull(visitor.getReport());
    //        assertTrue(visitor.getReport().isSmellFound());
    //        System.out.println(visitor.getReport().toString());
    //        SimulatorModel simulatorModel =
    //                new SimulatorModel(
    //                        model.getAllPackages().stream()
    //                                .map(v -> new Feature(v, null))
    //                                .collect(Collectors.toList()));
    //        visitor = new PackageVisitor(javaSourceCodeCache, lang);
    //        visitor.analyzeFullModel(simulatorModel);
    //        assertNotNull(visitor.getReport());
    //        assertTrue(visitor.getReport().isSmellFound());
    //        System.out.println(visitor.getReport().toString());
    //    }
    //
    //    // Ignored
    //    // @Test
    //    public void debug() {
    //        ModularLanguage lang =
    //                new ModularLanguage(
    //                        new
    // LanguageParser().parseLanguage("./src/test/resources/mPCM_build"));
    //        SimulatorModel model =
    //                new SimulatorModel(
    //                        new
    // SimulatorParser().parseLanguage("./src/test/resources/mSimuLizar"));
    //        var foo = new PackageVisitor(javaSourceCodeCache, lang);
    //        foo.analyzeFullModel(model);
    //        Report report = foo.getReport();
    //        int a = 3;
    //    }
}
