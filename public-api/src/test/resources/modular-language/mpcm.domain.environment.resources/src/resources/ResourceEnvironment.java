/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.ResourceEnvironment#getResourceContainers <em>Resource Containers</em>}</li>
 *   <li>{@link resources.ResourceEnvironment#getCommunicationLinkResourceSpecifications <em>Communication Link Resource Specifications</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getResourceEnvironment()
 * @model
 * @generated
 */
public interface ResourceEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Containers</b></em>' containment reference list.
	 * The list contents are of type {@link resources.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Containers</em>' containment reference list.
	 * @see resources.ResourcesPackage#getResourceEnvironment_ResourceContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainers();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link resources.CommunicationLinkResourceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Specifications</em>' containment reference list.
	 * @see resources.ResourcesPackage#getResourceEnvironment_CommunicationLinkResourceSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLinkResourceSpecification> getCommunicationLinkResourceSpecifications();

} // ResourceEnvironment
