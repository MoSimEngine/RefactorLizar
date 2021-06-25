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
package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

public class MutableSettingsEntry implements SettingsEntry {

    private String value;
    private boolean defaultValue;
    private boolean mandatory;
    private String description;
    /**
     * Creates a new settingsentry from the given configuration.
     *
     * @param value the name and key of the setting.
     * @param defaultValue the default string for the setting.
     * @param mandatory true if the setting must be set.
     * @param description a textual explanation for the setting
     */
    private MutableSettingsEntry(
            String value, boolean defaultValue, boolean mandatory, String description) {
        this.value = value;
        this.defaultValue = defaultValue;
        this.mandatory = mandatory;
        this.description = description;
    }

    @Override
    /** @return true if the setting is mandatory and must have a value, false otherwise */
    public boolean isMandatory() {
        return mandatory;
    }

    @Override
    /** @return the set value as string */
    public String getValue() {
        return value;
    }

    @Override
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
