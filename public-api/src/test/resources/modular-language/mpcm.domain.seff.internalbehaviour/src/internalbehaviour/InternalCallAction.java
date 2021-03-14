/**
 */
package internalbehaviour;

import behaviourseff.CallAction;

import seff.AbstractInternalControlFlowAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A "SubSEFF"-Action: Realises an internal method call within a SEFF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internalbehaviour.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 *
 * @see internalbehaviour.InternalbehaviourPackage#getInternalCallAction()
 * @model
 * @generated
 */
public interface InternalCallAction extends CallAction, AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
	 * @see #setCalledResourceDemandingInternalBehaviour(InternalBehaviourSEFF)
	 * @see internalbehaviour.InternalbehaviourPackage#getInternalCallAction_CalledResourceDemandingInternalBehaviour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InternalBehaviourSEFF getCalledResourceDemandingInternalBehaviour();

	/**
	 * Sets the value of the '{@link internalbehaviour.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
	 * @see #getCalledResourceDemandingInternalBehaviour()
	 * @generated
	 */
	void setCalledResourceDemandingInternalBehaviour(InternalBehaviourSEFF value);

} // InternalCallAction
