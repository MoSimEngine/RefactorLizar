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

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Report {

    private String text;
    private String description;
    private Collection<Solution> solutions;
    private boolean smellFound;
    private Collection<List<String>> cycles;
    private Map<String, Set<String>> featureScatterings = Collections.emptyMap();
    private Map<String, Set<String>> languageBlobs = Collections.emptyMap();

    public Report(String text, String description, boolean smellFound) {
        this.text = text;
        this.description = description;
        solutions = Collections.emptyList();
        this.smellFound = smellFound;
    }

    public Report(
            String text, String description, boolean smellFound, Collection<List<String>> cycles) {
        this.text = text;
        this.description = description;
        solutions = Collections.emptyList();
        this.smellFound = smellFound;
        this.cycles = cycles;
    }

    public Map<String, Set<String>> getLanguageBlobs() {
        return languageBlobs;
    }

    public void setLanguageBlobs(Map<String, Set<String>> languageBlobs) {
        this.languageBlobs = languageBlobs;
    }

    public Map<String, Set<String>> getFeatureScatterings() {
        return featureScatterings;
    }

    public void setFeatureScatterings(Map<String, Set<String>> featureScatterings) {
        this.featureScatterings = featureScatterings;
    }

    public Collection<Solution> getSolutions() {
        return solutions;
    }

    public String getDescription() {
        return description;
    }

    public String getText() {
        return text;
    }

    public void addSolution(Solution solution) {
        solutions.add(solution);
    }

    public boolean isSmellFound() {
        return smellFound;
    }

    public Collection<List<String>> getCycles() {
        return cycles;
    }

    @Override
    public String toString() {
        return "Report [description="
                + description
                + ", smellFound="
                + smellFound
                + ", solutions="
                + solutions
                + ", text="
                + text
                + "]";
    }
}
