package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

/** IAnalyzer */
public interface IAnalyzer {

    public static Collection<IAnalyzer> getAllAnalyzer() {

        Collection<IAnalyzer> analyzers = getAllAnalyzerFromClasspath();
        analyzers.addAll(getAllAnalyzerByPath("."));
        return analyzers.stream().collect(Collectors.toUnmodifiableList());
    }

    private static Collection<IAnalyzer> getAllAnalyzerFromClasspath() {

        return ServiceLoader.load(IAnalyzer.class).stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

    private static Collection<IAnalyzer> getAllAnalyzerByPath(String path) {
        List<URL> fileNames = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Path.of(path))) {
            for (Path each : directoryStream) {
                fileNames.add(each.toUri().toURL());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        URL[] array = fileNames.toArray(new URL[0]);
        IAnalyzer.class.getClassLoader();
        ClassLoader cl = new URLClassLoader(array, ClassLoader.getSystemClassLoader());
        return ServiceLoader.load(IAnalyzer.class, cl).stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }

    String getDescription();

    String getName();

    default boolean supportsFullAnalysis() {
        return false;
    }

    default boolean supportsFullAnalysisLevel(SearchLevels level) {
        return true;
    }

    default Report fullAnalysis() {
        return new UnsupportedAnalysisReport(getName());
    }

    default Report fullAnalysis(SearchLevels level) {
        return new UnsupportedAnalysisReport(getName());
    }

    default Settings getSettings() {
        return new Settings.SettingsBuilder().build();
    }
}
