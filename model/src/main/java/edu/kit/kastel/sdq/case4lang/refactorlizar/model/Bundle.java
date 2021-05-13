package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.io.File;
import java.util.Collection;

public class Bundle {

    private String name;
    private String version;
    private Collection<String> exportedPackage;
    private Collection<String> requiredBundle;
    private Collection<String> internalRequiredBundles;
    private File manifestFile;
    private String layer;

    public Bundle(
            String name,
            String version,
            Collection<String> exportedPackage,
            Collection<String> requiredBundle,
            File manifestFile) {
        this.name = name;
        this.version = version;
        this.exportedPackage = exportedPackage;
        this.requiredBundle = requiredBundle;
        this.manifestFile = manifestFile;
    }

    public Bundle(
            String name,
            String version,
            String layer,
            Collection<String> exportedPackage,
            Collection<String> requiredBundle,
            File manifestFile) {
        this(name, version, exportedPackage, requiredBundle, manifestFile);
        this.layer = layer;
    }

    /** @return the name */
    public String getName() {
        return name;
    }

    /** @param name the name to set */
    public void setName(String name) {
        this.name = name;
    }

    /** @return the version */
    public String getVersion() {
        return version;
    }

    /** @param version the version to set */
    public void setVersion(String version) {
        this.version = version;
    }

    /** @return the exportedPackage */
    public Collection<String> getExportedPackage() {
        return exportedPackage;
    }

    /** @param exportedPackage the exportedPackage to set */
    public void setExportedPackage(Collection<String> exportedPackage) {
        this.exportedPackage = exportedPackage;
    }

    /** @return the requiredBundle */
    public Collection<String> getRequiredBundle() {
        return requiredBundle;
    }

    /** @param requiredBundle the requiredBundle to set */
    public void setRequiredBundle(Collection<String> requiredBundle) {
        this.requiredBundle = requiredBundle;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Bundle [exportedPackage="
                + exportedPackage
                + ", name="
                + name
                + ", requiredBundle="
                + requiredBundle
                + ", version="
                + version
                + "]";
    }
    /** @return the internalRequiredBundles */
    public Collection<String> getInternalRequiredBundles() {
        return internalRequiredBundles;
    }
    /** @param internalRequiredBundles the internalRequiredBundles to set */
    public void setInternalRequiredBundles(Collection<String> internalRequiredBundles) {
        this.internalRequiredBundles = internalRequiredBundles;
    }

    public String getSimpleName() {
        return name.substring(name.lastIndexOf('.') + 1).trim();
    }

    public File getManifestFile() {
        return manifestFile;
    }

    public String getLayer() {
        return layer;
    }
}
