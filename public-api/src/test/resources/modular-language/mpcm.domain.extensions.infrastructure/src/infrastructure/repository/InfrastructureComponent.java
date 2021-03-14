/**
 */
package infrastructure.repository;

import org.eclipse.emf.ecore.EObject;

import softwarerepository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.repository.InfrastructureComponent#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see infrastructure.repository.RepositoryPackage#getInfrastructureComponent()
 * @model
 * @generated
 */
public interface InfrastructureComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ImplementationComponentType)
	 * @see infrastructure.repository.RepositoryPackage#getInfrastructureComponent_Owner()
	 * @model required="true"
	 * @generated
	 */
	ImplementationComponentType getOwner();

	/**
	 * Sets the value of the '{@link infrastructure.repository.InfrastructureComponent#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ImplementationComponentType value);

} // InfrastructureComponent
