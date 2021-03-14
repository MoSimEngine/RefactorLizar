/**
 */
package seff;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronisation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component developers can use a SynchronisationPoint to join synchronously ForkedBehaviours and specify a result of the computations with its attached VariableUsages.
 * See ForkAction for a more detailed description. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link seff.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint <em>Output Parameter Usage Synchronisation Point</em>}</li>
 *   <li>{@link seff.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}</li>
 *   <li>{@link seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}</li>
 * </ul>
 *
 * @see seff.SeffPackage#getSynchronisationPoint()
 * @model
 * @generated
 */
public interface SynchronisationPoint extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter Usage Synchronisation Point</em>' containment reference list.
	 * @see seff.SeffPackage#getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getOutputParameterUsage_SynchronisationPoint();

	/**
	 * Returns the value of the '<em><b>Fork Action Synchronisation Point</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link seff.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Action Synchronisation Point</em>' container reference.
	 * @see #setForkAction_SynchronisationPoint(ForkAction)
	 * @see seff.SeffPackage#getSynchronisationPoint_ForkAction_SynchronisationPoint()
	 * @see seff.ForkAction#getSynchronisingBehaviours_ForkAction
	 * @model opposite="synchronisingBehaviours_ForkAction" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ForkAction getForkAction_SynchronisationPoint();

	/**
	 * Sets the value of the '{@link seff.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork Action Synchronisation Point</em>' container reference.
	 * @see #getForkAction_SynchronisationPoint()
	 * @generated
	 */
	void setForkAction_SynchronisationPoint(ForkAction value);

	/**
	 * Returns the value of the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list.
	 * The list contents are of type {@link seff.ForkedBehaviour}.
	 * It is bidirectional and its opposite is '{@link seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Forked Behaviours Synchronisation Point</em>' containment reference list.
	 * @see seff.SeffPackage#getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint()
	 * @see seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour
	 * @model opposite="synchronisationPoint_ForkedBehaviour" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ForkedBehaviour> getSynchronousForkedBehaviours_SynchronisationPoint();

} // SynchronisationPoint
