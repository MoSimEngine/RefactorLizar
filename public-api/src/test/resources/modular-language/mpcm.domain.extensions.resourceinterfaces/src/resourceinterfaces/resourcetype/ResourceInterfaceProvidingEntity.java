/**
 */
package resourceinterfaces.resourcetype;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import resources.resourcetype.ResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}</li>
 *   <li>{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceProvidingEntity()
 * @model
 * @generated
 */
public interface ResourceInterfaceProvidingEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.resourcetype.ResourceProvidedRole}.
	 * It is bidirectional and its opposite is '{@link resourceinterfaces.resourcetype.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Provided Roles Resource Interface Providing Entity</em>' containment reference list.
	 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity()
	 * @see resourceinterfaces.resourcetype.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole
	 * @model opposite="resourceInterfaceProvidingEntity__ResourceProvidedRole" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceProvidedRole> getResourceProvidedRoles__ResourceInterfaceProvidingEntity();

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' reference.
	 * @see #setResourceType(ResourceType)
	 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceProvidingEntity_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

} // ResourceInterfaceProvidingEntity
