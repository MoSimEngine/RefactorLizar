/**
 */
package environment;

import base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model&nbsp;element&nbsp;representing&nbsp;communication&nbsp;links&nbsp;like&nbsp;LAN,&nbsp;WAN,&nbsp;WiFi&nbsp;etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.LinkingResource#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}</li>
 *   <li>{@link environment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getLinkingResource()
 * @model
 * @generated
 */
public interface LinkingResource extends Entity {
	/**
	 * Returns the value of the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Resource Containers Linking Resource</em>' reference list.
	 * @see environment.EnvironmentPackage#getLinkingResource_ConnectedResourceContainers_LinkingResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Container> getConnectedResourceContainers_LinkingResource();

	/**
	 * Returns the value of the '<em><b>Resource Environment Linking Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link environment.Environment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment Linking Resource</em>' container reference.
	 * @see #setResourceEnvironment_LinkingResource(Environment)
	 * @see environment.EnvironmentPackage#getLinkingResource_ResourceEnvironment_LinkingResource()
	 * @see environment.Environment#getLinkingResources__ResourceEnvironment
	 * @model opposite="linkingResources__ResourceEnvironment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getResourceEnvironment_LinkingResource();

	/**
	 * Sets the value of the '{@link environment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment Linking Resource</em>' container reference.
	 * @see #getResourceEnvironment_LinkingResource()
	 * @generated
	 */
	void setResourceEnvironment_LinkingResource(Environment value);

} // LinkingResource
