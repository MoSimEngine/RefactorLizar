/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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
