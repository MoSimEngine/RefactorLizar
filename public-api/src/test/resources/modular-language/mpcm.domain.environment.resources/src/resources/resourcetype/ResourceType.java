/**
 */
package resources.resourcetype;

import base.Entity;

import de.uka.ipd.sdq.units.UnitCarryingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract superclass of any resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.resourcetype.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}</li>
 * </ul>
 *
 * @see resources.resourcetype.ResourcetypePackage#getResourceType()
 * @model abstract="true"
 * @generated
 */
public interface ResourceType extends Entity, UnitCarryingElement {
	/**
	 * Returns the value of the '<em><b>Resource Repository Resource Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resources.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Repository Resource Type</em>' container reference.
	 * @see #setResourceRepository_ResourceType(ResourceRepository)
	 * @see resources.resourcetype.ResourcetypePackage#getResourceType_ResourceRepository_ResourceType()
	 * @see resources.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository
	 * @model opposite="availableResourceTypes_ResourceRepository" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceRepository getResourceRepository_ResourceType();

	/**
	 * Sets the value of the '{@link resources.resourcetype.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Repository Resource Type</em>' container reference.
	 * @see #getResourceRepository_ResourceType()
	 * @generated
	 */
	void setResourceRepository_ResourceType(ResourceRepository value);

} // ResourceType
