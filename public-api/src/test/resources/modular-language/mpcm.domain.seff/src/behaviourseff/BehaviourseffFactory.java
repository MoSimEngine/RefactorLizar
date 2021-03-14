/**
 */
package behaviourseff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviourseff.BehaviourseffPackage
 * @generated
 */
public interface BehaviourseffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourseffFactory eINSTANCE = behaviourseff.impl.BehaviourseffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviour SEFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour SEFF</em>'.
	 * @generated
	 */
	BehaviourSEFF createBehaviourSEFF();

	/**
	 * Returns a new object of class '<em>Probabilistic Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Branch Transition</em>'.
	 * @generated
	 */
	ProbabilisticBranchTransition createProbabilisticBranchTransition();

	/**
	 * Returns a new object of class '<em>Guarded Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded Branch Transition</em>'.
	 * @generated
	 */
	GuardedBranchTransition createGuardedBranchTransition();

	/**
	 * Returns a new object of class '<em>Collection Iterator Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Iterator Action</em>'.
	 * @generated
	 */
	CollectionIteratorAction createCollectionIteratorAction();

	/**
	 * Returns a new object of class '<em>Call Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Return Action</em>'.
	 * @generated
	 */
	CallReturnAction createCallReturnAction();

	/**
	 * Returns a new object of class '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Call Action</em>'.
	 * @generated
	 */
	ExternalCallAction createExternalCallAction();

	/**
	 * Returns a new object of class '<em>Acquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Action</em>'.
	 * @generated
	 */
	AcquireAction createAcquireAction();

	/**
	 * Returns a new object of class '<em>Release Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Action</em>'.
	 * @generated
	 */
	ReleaseAction createReleaseAction();

	/**
	 * Returns a new object of class '<em>Set Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Variable Action</em>'.
	 * @generated
	 */
	SetVariableAction createSetVariableAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourseffPackage getBehaviourseffPackage();

} //BehaviourseffFactory
