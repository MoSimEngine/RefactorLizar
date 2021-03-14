/**
 */
package infrastructure.repository;

import repository.ProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}</li>
 * </ul>
 *
 * @see infrastructure.repository.RepositoryPackage#getInfrastructureProvidedRole()
 * @model
 * @generated
 */
public interface InfrastructureProvidedRole extends ProvidedRole {
	/**
	 * Returns the value of the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface Infrastructure Provided Role</em>' reference.
	 * @see #setProvidedInterface__InfrastructureProvidedRole(InfrastructureInterface)
	 * @see infrastructure.repository.RepositoryPackage#getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureInterface getProvidedInterface__InfrastructureProvidedRole();

	/**
	 * Sets the value of the '{@link infrastructure.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface Infrastructure Provided Role</em>' reference.
	 * @see #getProvidedInterface__InfrastructureProvidedRole()
	 * @generated
	 */
	void setProvidedInterface__InfrastructureProvidedRole(InfrastructureInterface value);

} // InfrastructureProvidedRole
