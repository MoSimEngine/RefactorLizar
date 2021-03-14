package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtElement;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.ServiceLoader.Provider;
import java.util.stream.Collectors;

/**
 * IAnalyzer
 */
public interface IAnalyzer {

  public static Collection<IAnalyzer> getAllAnalyzer() {

    Collection<IAnalyzer> analyzers = getAllAnalyzerFromClasspath();
    analyzers.addAll(getAllAnalyzerByPath("."));
    return analyzers //
        .stream() //
        .collect(Collectors.toUnmodifiableList());
  }

  private static Collection<IAnalyzer> getAllAnalyzerFromClasspath() {

    return ServiceLoader //
        .load(IAnalyzer.class) //
        .stream() //
        .map(Provider::get) //
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
    return ServiceLoader.load(IAnalyzer.class, cl).stream().map(Provider::get)
        .collect(Collectors.toList());
  }

  Report analyze(CtElement element);

  void init(ModularLanguage language, SimulatorModel simulatorAST);

  String getDescription();

  String getName();

  public default UUID getIdentifier() {
    return UUID.randomUUID();
  }

  default boolean supportsFullAnalysis() {
    return false;
  }

  default Report fullAnalysis() {
    return new UnsupportedAnalysisReport(getName());
  }

  boolean canAnalyze(CtElement element);
}
