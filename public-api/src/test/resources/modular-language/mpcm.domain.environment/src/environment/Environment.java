/**
 */
package environment;

import base.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Repository element of&nbsp;the resource environment
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Environment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}</li>
 *   <li>{@link environment.Environment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
	 * The list contents are of type {@link environment.LinkingResource}.
	 * It is bidirectional and its opposite is '{@link environment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linking Resources Resource Environment</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getEnvironment_LinkingResources__ResourceEnvironment()
	 * @see environment.LinkingResource#getResourceEnvironment_LinkingResource
	 * @model opposite="resourceEnvironment_LinkingResource" containment="true" ordered="false"
	 * @generated
	 */
	EList<LinkingResource> getLinkingResources__ResourceEnvironment();

	/**
	 * Returns the value of the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Container}.
	 * It is bidirectional and its opposite is '{@link environment.Container#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Resource Environment</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getEnvironment_ResourceContainer_ResourceEnvironment()
	 * @see environment.Container#getResourceEnvironment_ResourceContainer
	 * @model opposite="resourceEnvironment_ResourceContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<Container> getResourceContainer_ResourceEnvironment();

} // Environment
