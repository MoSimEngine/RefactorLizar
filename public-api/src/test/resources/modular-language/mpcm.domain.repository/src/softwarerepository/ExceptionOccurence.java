/**
 */
package softwarerepository;

import org.eclipse.emf.ecore.EObject;

import repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Occurence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.ExceptionOccurence#getType <em>Type</em>}</li>
 *   <li>{@link softwarerepository.ExceptionOccurence#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getExceptionOccurence()
 * @model
 * @generated
 */
public interface ExceptionOccurence extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ExceptionType)
	 * @see softwarerepository.SoftwarerepositoryPackage#getExceptionOccurence_Type()
	 * @model required="true"
	 * @generated
	 */
	ExceptionType getType();

	/**
	 * Sets the value of the '{@link softwarerepository.ExceptionOccurence#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ExceptionType value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Signature)
	 * @see softwarerepository.SoftwarerepositoryPackage#getExceptionOccurence_Owner()
	 * @model required="true"
	 * @generated
	 */
	Signature getOwner();

	/**
	 * Sets the value of the '{@link softwarerepository.ExceptionOccurence#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Signature value);

} // ExceptionOccurence
