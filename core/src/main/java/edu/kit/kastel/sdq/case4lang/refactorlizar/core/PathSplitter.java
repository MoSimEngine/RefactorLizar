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
package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import com.google.common.flogger.FluentLogger;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PathSplitter {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private Set<Path> simulatorPaths;
    private Set<Path> languagePaths;

    private Path simulatorPath;
    private Path languagePath;
    private SplitMode splitmode;

    public PathSplitter(Path simulatorPath, Path languagePath) {
        this.simulatorPath = Objects.requireNonNull(simulatorPath);
        this.languagePath = Objects.requireNonNull(languagePath);
        simulatorPaths = new HashSet<>();
        languagePaths = new HashSet<>();
    }

    public PathSplitter simulatorInLanguage() {
        splitmode = SplitMode.SIMULATOR_IN_LANGUAGE;
        return this;
    }

    public PathSplitter languageInSimulator() {
        splitmode = SplitMode.LANGUAGE_IN_SIMULATOR;
        return this;
    }

    public PathSplitter split() {
        if (splitmode.equals(SplitMode.SIMULATOR_IN_LANGUAGE)) {
            checkInvariants(languagePath, simulatorPath);
            splitSimulatorInLanguage();
        }
        if (splitmode.equals(SplitMode.LANGUAGE_IN_SIMULATOR)) {
            checkInvariants(simulatorPath, languagePath);
            splitLanguageInSimulator();
        }
        return this;
    }

    private void checkInvariants(Path parent, Path child) {
        if (!child.startsWith(parent)) {
            throw new IllegalArgumentException(
                    "Path " + child + "is not a child of Path " + parent);
        }
    }

    private void splitSimulatorInLanguage() {

        SimpleFileVisitor<Path> visitor =
                new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                            throws IOException {
                        if (dir.equals(simulatorPath)) {
                            simulatorPaths.add(simulatorPath);
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                        if (!simulatorPath.startsWith(dir)) {
                            languagePaths.add(dir);
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                        return FileVisitResult.CONTINUE;
                    }
                };
        try {
            Files.walkFileTree(languagePath, visitor);
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
        }
    }

    private void splitLanguageInSimulator() {

        SimpleFileVisitor<Path> visitor =
                new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                            throws IOException {
                        if (dir.equals(languagePath)) {
                            languagePaths.add(languagePath);
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                        if (!languagePath.startsWith(dir)) {
                            simulatorPaths.add(dir);
                            return FileVisitResult.SKIP_SUBTREE;
                        }
                        return FileVisitResult.CONTINUE;
                    }
                };
        try {
            Files.walkFileTree(simulatorPath, visitor);
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
        }
    }

    public Set<Path> getLanguagePaths() {
        return languagePaths;
    }

    public Set<Path> getSimulatorPaths() {
        return simulatorPaths;
    }

    private enum SplitMode {
        LANGUAGE_IN_SIMULATOR,
        SIMULATOR_IN_LANGUAGE;
    }
}
