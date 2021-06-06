package edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser;

import com.google.common.flogger.FluentLogger;
import java.util.Collection;
import spoon.Launcher;
import spoon.OutputType;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.SpoonProgress;

/** ModelBuilder */
public class ModelBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private CtModel model;
    private Launcher launcher;

    public void buildModel(Iterable<String> paths) {
        logger.atInfo().log("start building model for path %s", paths);
        launcher = new Launcher();
        Environment env = launcher.getEnvironment();
        env.setComplianceLevel(11);
        env.setOutputType(OutputType.NO_OUTPUT);
        env.setNoClasspath(true);
        env.setShouldCompile(false);
        for (String path : paths) {
            launcher.addInputResource(path);
        }
        launcher.getEnvironment().setSpoonProgress(new SpoonProgressImplementation());
        model = launcher.buildModel();
        logger.atInfo().log(
                "finished building model for path %s, with model size: %d, in %d packages",
                paths, model.getAllTypes().size(), model.getAllPackages().size());
    }

    public Launcher getLauncher() {
        return launcher;
    }

    public Collection<CtType<?>> getAllTypes() {
        return model.getAllTypes();
    }

    public Collection<CtPackage> getAllPackages() {
        return model.getAllPackages();
    }

    private static final class SpoonProgressImplementation implements SpoonProgress {

        @Override
        public void end(Process process) {
            logger.atInfo().log("Finishing process %s", process);
        }

        @Override
        public void start(Process process) {
            logger.atInfo().log("Starting process %s", process);
        }
    }
}
