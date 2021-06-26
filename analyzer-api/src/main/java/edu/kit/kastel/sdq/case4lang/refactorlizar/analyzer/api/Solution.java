/**
 * SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

public interface Solution {

    String getHeadline();

    String getDescription();

    void apply();
}
