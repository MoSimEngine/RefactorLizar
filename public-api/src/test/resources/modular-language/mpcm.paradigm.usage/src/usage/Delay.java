/**
 */
package usage;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Delay represents a timing delay as a RandomVariable between two user actions. The Delay
 * is included into the usage model to express that users do not call system services in direct successions,
 * but usually need some time to determine their next action. User delays are for example useful,
 * if a performance analyst wants to determine the execution time for a complete scenario behaviour
 * (instead of a single service), which needs to include user delays.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usage.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}</li>
 * </ul>
 *
 * @see usage.UsagePackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Time Specification Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Specification Delay</em>' containment reference.
	 * @see #setTimeSpecification_Delay(PCMRandomVariable)
	 * @see usage.UsagePackage#getDelay_TimeSpecification_Delay()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getTimeSpecification_Delay();

	/**
	 * Sets the value of the '{@link usage.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Specification Delay</em>' containment reference.
	 * @see #getTimeSpecification_Delay()
	 * @generated
	 */
	void setTimeSpecification_Delay(PCMRandomVariable value);

} // Delay
