package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;
/**
 * This defines an immutable settings entry. An settings entry is a value with 2 flags: mandatory and
 * default value flag.
 *
 * <ul>
 *   <li>mandatory: a value must be set
 *   <li>default value: the current value is the starting value
 * </ul>
 */
public interface SettingsEntry {

    /** Returns true if the setting is mandatory and must have a value, false otherwise */
    public boolean isMandatory();

    /** Returns the set value as string */
    public String getValue();

    /** Returns true if the current value is the default value, false otherwise */
    public boolean isDefaultValue();
    /** Returns the textual explanation */
    public String getDescription();
}
