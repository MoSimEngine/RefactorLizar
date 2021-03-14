/**
 */
package resources;

import environment.Container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.ResourceContainer#getContainer <em>Container</em>}</li>
 *   <li>{@link resources.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}</li>
 *   <li>{@link resources.ResourceContainer#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getResourceContainer()
 * @model
 * @generated
 */
public interface ResourceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see resources.ResourcesPackage#getResourceContainer_Container()
	 * @model required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link resources.ResourceContainer#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * The list contents are of type {@link resources.ProcessingResourceSpecification}.
	 * It is bidirectional and its opposite is '{@link resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Resource Specifications Resource Container</em>' containment reference list.
	 * @see resources.ResourcesPackage#getResourceContainer_ActiveResourceSpecifications_ResourceContainer()
	 * @see resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification
	 * @model opposite="resourceContainer_ProcessingResourceSpecification" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProcessingResourceSpecification> getActiveResourceSpecifications_ResourceContainer();

	/**
	 * Returns the value of the '<em><b>Hdd Resource Specifications</b></em>' reference list.
	 * The list contents are of type {@link resources.HDDProcessingResourceSpecification}.
	 * It is bidirectional and its opposite is '{@link resources.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdd Resource Specifications</em>' reference list.
	 * @see resources.ResourcesPackage#getResourceContainer_HddResourceSpecifications()
	 * @see resources.HDDProcessingResourceSpecification#getResourceContainer
	 * @model opposite="resourceContainer"
	 * @generated
	 */
	EList<HDDProcessingResourceSpecification> getHddResourceSpecifications();

} // ResourceContainer
