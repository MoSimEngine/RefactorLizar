/**
 */
package reliability.seff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reliability.seff.SeffPackage
 * @generated
 */
public interface SeffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffFactory eINSTANCE = reliability.seff.impl.SeffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Internal Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Failure Occurrence Description</em>'.
	 * @generated
	 */
	InternalFailureOccurrenceDescription createInternalFailureOccurrenceDescription();

	/**
	 * Returns a new object of class '<em>Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recovery Action</em>'.
	 * @generated
	 */
	RecoveryAction createRecoveryAction();

	/**
	 * Returns a new object of class '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recovery Action Behaviour</em>'.
	 * @generated
	 */
	RecoveryActionBehaviour createRecoveryActionBehaviour();

	/**
	 * Returns a new object of class '<em>Failure Handling External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Handling External Call Action</em>'.
	 * @generated
	 */
	FailureHandlingExternalCallAction createFailureHandlingExternalCallAction();

	/**
	 * Returns a new object of class '<em>Acquire Action Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Action Timeout</em>'.
	 * @generated
	 */
	AcquireActionTimeout createAcquireActionTimeout();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeffPackage getSeffPackage();

} //SeffFactory
