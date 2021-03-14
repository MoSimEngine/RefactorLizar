/**
 */
package reliability.seff;

import behaviourseff.AcquireAction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire Action Timeout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.AcquireActionTimeout#getOwner <em>Owner</em>}</li>
 *   <li>{@link reliability.seff.AcquireActionTimeout#getTimeoutValue <em>Timeout Value</em>}</li>
 * </ul>
 *
 * @see reliability.seff.SeffPackage#getAcquireActionTimeout()
 * @model
 * @generated
 */
public interface AcquireActionTimeout extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(AcquireAction)
	 * @see reliability.seff.SeffPackage#getAcquireActionTimeout_Owner()
	 * @model required="true"
	 * @generated
	 */
	AcquireAction getOwner();

	/**
	 * Sets the value of the '{@link reliability.seff.AcquireActionTimeout#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(AcquireAction value);

	/**
	 * Returns the value of the '<em><b>Timeout Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     Specifies a timeout value, in case the AcquireAction has a timeout (see the documentation of the "timeout" attribute
	 *     for further information).
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Value</em>' attribute.
	 * @see #setTimeoutValue(double)
	 * @see reliability.seff.SeffPackage#getAcquireActionTimeout_TimeoutValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTimeoutValue();

	/**
	 * Sets the value of the '{@link reliability.seff.AcquireActionTimeout#getTimeoutValue <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Value</em>' attribute.
	 * @see #getTimeoutValue()
	 * @generated
	 */
	void setTimeoutValue(double value);

} // AcquireActionTimeout
