package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;

/**
 * This defines a refactoring that can be applied to a project. This refactoring changes the project
 * structure and is not limited to a single file.
 */
public interface StructuralRefactoring {
    /**
     * Applies the refactoring to the project.
     *
     * @param project The project to apply the refactoring to.
     */
    void refactor(Project project);
}
