/**
 */
package seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForkedBehaviour can be considered as a program thread. All parameter characterisations from the surrounding RDSEFF are also valid inside the ForkedBehaviours and can be used to parameterise resource demands or control flow constructs. The parameter characterisations are the same in each ForkedBehaviour.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}</li>
 *   <li>{@link seff.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}</li>
 * </ul>
 *
 * @see seff.SeffPackage#getForkedBehaviour()
 * @model
 * @generated
 */
public interface ForkedBehaviour extends Behaviour {
	/**
	 * Returns the value of the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronisation Point Forked Behaviour</em>' container reference.
	 * @see #setSynchronisationPoint_ForkedBehaviour(SynchronisationPoint)
	 * @see seff.SeffPackage#getForkedBehaviour_SynchronisationPoint_ForkedBehaviour()
	 * @see seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint
	 * @model opposite="synchronousForkedBehaviours_SynchronisationPoint" transient="false" ordered="false"
	 * @generated
	 */
	SynchronisationPoint getSynchronisationPoint_ForkedBehaviour();

	/**
	 * Sets the value of the '{@link seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronisation Point Forked Behaviour</em>' container reference.
	 * @see #getSynchronisationPoint_ForkedBehaviour()
	 * @generated
	 */
	void setSynchronisationPoint_ForkedBehaviour(SynchronisationPoint value);

	/**
	 * Returns the value of the '<em><b>Fork Action Forked Behaivour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Action Forked Behaivour</em>' container reference.
	 * @see #setForkAction_ForkedBehaivour(ForkAction)
	 * @see seff.SeffPackage#getForkedBehaviour_ForkAction_ForkedBehaivour()
	 * @see seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction
	 * @model opposite="asynchronousForkedBehaviours_ForkAction" transient="false" ordered="false"
	 * @generated
	 */
	ForkAction getForkAction_ForkedBehaivour();

	/**
	 * Sets the value of the '{@link seff.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork Action Forked Behaivour</em>' container reference.
	 * @see #getForkAction_ForkedBehaivour()
	 * @generated
	 */
	void setForkAction_ForkedBehaivour(ForkAction value);

} // ForkedBehaviour
