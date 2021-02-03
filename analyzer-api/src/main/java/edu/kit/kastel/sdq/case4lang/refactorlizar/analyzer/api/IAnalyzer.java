package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

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
import java.util.ServiceLoader.Provider;
import java.util.UUID;
import java.util.stream.Collectors;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtElement;

/**
 * IAnalyzer
 */
public interface IAnalyzer {

  public static Collection<IAnalyzer> getAllAnalyzer() {
    List<URL> fileNames = new ArrayList<>();
    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Path.of("."))) {
      for (Path each : directoryStream) {
        fileNames.add(each.toUri().toURL());
      }
    } catch (IOException ex) {
      System.out.println(ex);
    }
    URL[] array = fileNames.stream().toArray(size -> new URL[size]);
    IAnalyzer.class.getClassLoader();
    ClassLoader cl = new URLClassLoader(array, ClassLoader.getSystemClassLoader());
    return ServiceLoader.load(IAnalyzer.class, cl).stream().map(Provider::get)
        .collect(Collectors.toUnmodifiableList());
  }
  Report analyze(CtElement element);

  void init(ModularLanguage language, CtModel simulatorAST);
  String getDescription();
  String getName();


  public default UUID getIdentifier() {
    return UUID.randomUUID();
  }

  boolean canAnalyze(CtElement element);
}