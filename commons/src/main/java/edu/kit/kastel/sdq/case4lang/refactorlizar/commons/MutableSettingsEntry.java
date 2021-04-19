package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;


public class MutableSettingsEntry implements SettingsEntry {

    private String value;
    private boolean defaultValue;
    private boolean mandatory;
    private String description;
    /**
     * Creates a new settingsentry from the given configuration.
     *
     * @param value
     * @param defaultValue
     * @param mandatory
     */
    private MutableSettingsEntry(String value, boolean defaultValue, boolean mandatory, String description) {
        this.value = value;
        this.defaultValue = defaultValue;
        this.mandatory = mandatory;
        this.description = description;
    }

    /** @return true if the setting is mandatory and must have a value, false otherwise */
    public boolean isMandatory() {
        return mandatory;
    }

    /** @return the set value as string */
    public String getValue() {
        return value;
    }

    /** @return true if the current value is the default value, false otherwise */
    public boolean isDefaultValue() {
        return defaultValue;
    }
    /**
     * Sets the settings entry to the given value and the defaultvalue flag as false
     *
     * @param value the given value to set as setting value.
     */
    public void setValue(String value) {
        this.value = value;
        this.defaultValue = true;
    }

    public static MutableSettingsEntry of(String value, String description) {
        return new MutableSettingsEntry(value, true, false, description);
    }

    public static MutableSettingsEntry of(boolean mandatory, String description) {
        return new MutableSettingsEntry("", false, mandatory, description);
    }

    public static MutableSettingsEntry of(String description) {
        return new MutableSettingsEntry("", true, false, description);
    }

    @Override
    public String getDescription() {
        return description;
    }
}
