package edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser;

import java.util.Collection;
import com.google.common.flogger.FluentLogger;
import spoon.Launcher;
import spoon.OutputType;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

/**
 * ModelBuilder
 */
public class ModelBuilder {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  private CtModel model;

  public void buildModel(String path) {
    logger.atInfo().log("start building model for path %s", path);
    Launcher launcher = new Launcher();
    Environment env = launcher.getEnvironment();
    env.setComplianceLevel(11);
    env.setOutputType(OutputType.NO_OUTPUT);
    env.setNoClasspath(true);
    launcher.addInputResource(path);
    model = launcher.buildModel();
    logger.atInfo().log("finished building model for path %s, with model size: %d, in %d packages",
        path, model.getAllTypes().size(), model.getAllPackages().size());
  }

  Collection<CtType<?>> getAllTypes() {
    return model.getAllTypes();
  }

  Collection<CtPackage> getAllPackages() {
    return model.getAllPackages();
  }
}
