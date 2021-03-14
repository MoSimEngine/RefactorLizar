/**
 */
package resourceinterfaces.composition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resourceinterfaces.composition.CompositionPackage
 * @generated
 */
public interface CompositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionFactory eINSTANCE = resourceinterfaces.composition.impl.CompositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Required Resource Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Resource Delegation Connector</em>'.
	 * @generated
	 */
	RequiredResourceDelegationConnector createRequiredResourceDelegationConnector();

	/**
	 * Returns a new object of class '<em>Resource Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Required Delegation Connector</em>'.
	 * @generated
	 */
	ResourceRequiredDelegationConnector createResourceRequiredDelegationConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompositionPackage getCompositionPackage();

} //CompositionFactory
