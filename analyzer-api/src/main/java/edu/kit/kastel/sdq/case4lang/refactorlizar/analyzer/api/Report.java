package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Report {

    private String text;
    private String description;
    private Collection<Solution> solutions;
    private boolean smellFound;
    private Collection<List<String>> cycles;

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
