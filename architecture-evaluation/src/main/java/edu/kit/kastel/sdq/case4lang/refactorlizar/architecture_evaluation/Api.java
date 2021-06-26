/**
 * SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;
/**
 * A method or class marked with {@code @Api} is part of the public api. These can be considered as
 * stable as and without breaking changes. Everything without it should be considered as private and
 * unstable.
 */
public @interface Api {}
