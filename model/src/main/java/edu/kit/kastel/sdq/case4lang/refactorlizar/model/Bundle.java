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

    /** Returns the name */
    public String getName() {
        return name;
    }

    /** Returns the version */
    public String getVersion() {
        return version;
    }

    /**
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

    /**
     * Sets the internalRequiredBundles to the given bundles.
     *
     * @param internalRequiredBundles the internalRequiredBundles to set
     */
    public void setInternalRequiredBundles(Collection<String> internalRequiredBundles) {
        this.internalRequiredBundles = internalRequiredBundles;
    }

    /** Returns the exportedPackage names */
    public Collection<String> getExportedPackage() {
        return exportedPackage;
    }
    /** Returns the internalRequiredBundles names */
    public Collection<String> getInternalRequiredBundles() {
        return internalRequiredBundles;
    }

    /** Returns the requiredBundle names */
    public Collection<String> getRequiredBundle() {
        return requiredBundle;
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
