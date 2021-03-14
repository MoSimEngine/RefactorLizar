/**
 */
package reliability.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import reliability.failuretypes.FailureType;

import repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.repository.FailureDeclaration#getTypes <em>Types</em>}</li>
 *   <li>{@link reliability.repository.FailureDeclaration#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see reliability.repository.RepositoryPackage#getFailureDeclaration()
 * @model
 * @generated
 */
public interface FailureDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link reliability.failuretypes.FailureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see reliability.repository.RepositoryPackage#getFailureDeclaration_Types()
	 * @model
	 * @generated
	 */
	EList<FailureType> getTypes();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Signature)
	 * @see reliability.repository.RepositoryPackage#getFailureDeclaration_Owner()
	 * @model required="true"
	 * @generated
	 */
	Signature getOwner();

	/**
	 * Sets the value of the '{@link reliability.repository.FailureDeclaration#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Signature value);

} // FailureDeclaration
