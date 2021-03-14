/**
 */
package internalbehaviour;

import behaviourseff.BehaviourSEFF;

import softwarerepository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Behaviour SEFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing component-internal behaviour not accessible from the component's interface. Comparable to internal method in object-oriented programming. This behaviour can be called from within a resource demanding behaviour using an InternalCallAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internalbehaviour.InternalBehaviourSEFF#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see internalbehaviour.InternalbehaviourPackage#getInternalBehaviourSEFF()
 * @model
 * @generated
 */
public interface InternalBehaviourSEFF extends BehaviourSEFF {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(OperationSignature)
	 * @see internalbehaviour.InternalbehaviourPackage#getInternalBehaviourSEFF_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationSignature getSignature();

	/**
	 * Sets the value of the '{@link internalbehaviour.InternalBehaviourSEFF#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(OperationSignature value);

} // InternalBehaviourSEFF
