package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import java.util.Collection;

public class Bundle {

  private String name;
  private String version;
  private Collection<String> exportedPackage;
  private Collection<String> requiredBundle;
  private Collection<String> internalRequiredBundles;
  /**
   * @param name
   * @param version
   * @param exportedPackage
   * @param requiredBundle
   */
  public Bundle(String name, String version, Collection<String> exportedPackage,
      Collection<String> requiredBundle) {
    this.name = name;
    this.version = version;
    this.exportedPackage = exportedPackage;
    this.requiredBundle = requiredBundle;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * @param version the version to set
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * @return the exportedPackage
   */
  public Collection<String> getExportedPackage() {
    return exportedPackage;
  }

  /**
   * @param exportedPackage the exportedPackage to set
   */
  public void setExportedPackage(Collection<String> exportedPackage) {
    this.exportedPackage = exportedPackage;
  }

  /**
   * @return the requiredBundle
   */
  public Collection<String> getRequiredBundle() {
    return requiredBundle;
  }

  /**
   * @param requiredBundle the requiredBundle to set
   */
  public void setRequiredBundle(Collection<String> requiredBundle) {
    this.requiredBundle = requiredBundle;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "Bundle [exportedPackage=" + exportedPackage + ", name=" + name + ", requiredBundle="
        + requiredBundle + ", version=" + version + "]";
  }
  /**
   * @return the interalRequiredBundles
   */
  public Collection<String> getInternalRequiredBundles() {
    return internalRequiredBundles;
  }
  /**
   * @param interalRequiredBundles the interalRequiredBundles to set
   */
  public void setInternalRequiredBundles(Collection<String> interalRequiredBundles) {
    this.internalRequiredBundles = interalRequiredBundles;
  }
  public String getSimpleName() {
    return name.substring(name.lastIndexOf('.') + 1).trim();
  }
}