/**
 */
package behaviourseff;

import seff.Behaviour;

import softwarerepository.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour SEFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.BehaviourSEFF#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see behaviourseff.BehaviourseffPackage#getBehaviourSEFF()
 * @model
 * @generated
 */
public interface BehaviourSEFF extends ServiceEffectSpecification {
	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' containment reference.
	 * @see #setBehaviour(Behaviour)
	 * @see behaviourseff.BehaviourseffPackage#getBehaviourSEFF_Behaviour()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Behaviour getBehaviour();

	/**
	 * Sets the value of the '{@link behaviourseff.BehaviourSEFF#getBehaviour <em>Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' containment reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(Behaviour value);

} // BehaviourSEFF
