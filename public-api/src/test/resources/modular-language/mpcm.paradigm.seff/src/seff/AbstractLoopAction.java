/**
 */
package seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Loop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract parent class of any loop (e.g. LoopAction)
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link seff.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}</li>
 * </ul>
 *
 * @see seff.SeffPackage#getAbstractLoopAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractLoopAction extends AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link seff.Behaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Behaviour Loop</em>' containment reference.
	 * @see #setBodyBehaviour_Loop(Behaviour)
	 * @see seff.SeffPackage#getAbstractLoopAction_BodyBehaviour_Loop()
	 * @see seff.Behaviour#getAbstractLoopAction_ResourceDemandingBehaviour
	 * @model opposite="abstractLoopAction_ResourceDemandingBehaviour" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Behaviour getBodyBehaviour_Loop();

	/**
	 * Sets the value of the '{@link seff.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Behaviour Loop</em>' containment reference.
	 * @see #getBodyBehaviour_Loop()
	 * @generated
	 */
	void setBodyBehaviour_Loop(Behaviour value);

} // AbstractLoopAction
