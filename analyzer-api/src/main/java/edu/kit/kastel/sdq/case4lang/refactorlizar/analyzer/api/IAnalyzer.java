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
