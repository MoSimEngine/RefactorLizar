/**
 */
package resourceinterfaces.repository;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import repository.InterfaceRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an annotation (simulating a stereotype) of ResourceInterfaceRequiringEntity onto InterfaceRequiringEntity
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 *   <li>{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getInterfaceRequiringEntity <em>Interface Requiring Entity</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.repository.RepositoryPackage#getResourceInterfaceRequiringEntity()
 * @model
 * @generated
 */
public interface ResourceInterfaceRequiringEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.repository.ResourceRequiredRole}.
	 * It is bidirectional and its opposite is '{@link resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Required Roles Resource Interface Requiring Entity</em>' containment reference list.
	 * @see resourceinterfaces.repository.RepositoryPackage#getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity()
	 * @see resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole
	 * @model opposite="resourceInterfaceRequiringEntity__ResourceRequiredRole" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity();

	/**
	 * Returns the value of the '<em><b>Interface Requiring Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Requiring Entity</em>' reference.
	 * @see #setInterfaceRequiringEntity(InterfaceRequiringEntity)
	 * @see resourceinterfaces.repository.RepositoryPackage#getResourceInterfaceRequiringEntity_InterfaceRequiringEntity()
	 * @model required="true"
	 * @generated
	 */
	InterfaceRequiringEntity getInterfaceRequiringEntity();

	/**
	 * Sets the value of the '{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getInterfaceRequiringEntity <em>Interface Requiring Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Requiring Entity</em>' reference.
	 * @see #getInterfaceRequiringEntity()
	 * @generated
	 */
	void setInterfaceRequiringEntity(InterfaceRequiringEntity value);

} // ResourceInterfaceRequiringEntity
