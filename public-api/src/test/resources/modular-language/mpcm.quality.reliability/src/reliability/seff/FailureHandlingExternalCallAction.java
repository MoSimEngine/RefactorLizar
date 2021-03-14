/**
 */
package reliability.seff;

import behaviourseff.ExternalCallAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Handling External Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.FailureHandlingExternalCallAction#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see reliability.seff.SeffPackage#getFailureHandlingExternalCallAction()
 * @model
 * @generated
 */
public interface FailureHandlingExternalCallAction extends FailureHandlingEntity {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ExternalCallAction)
	 * @see reliability.seff.SeffPackage#getFailureHandlingExternalCallAction_Owner()
	 * @model required="true"
	 * @generated
	 */
	ExternalCallAction getOwner();

	/**
	 * Sets the value of the '{@link reliability.seff.FailureHandlingExternalCallAction#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ExternalCallAction value);

} // FailureHandlingExternalCallAction
