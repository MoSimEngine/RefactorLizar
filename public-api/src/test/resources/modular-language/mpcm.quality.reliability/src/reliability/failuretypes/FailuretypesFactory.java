/**
 */
package reliability.failuretypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reliability.failuretypes.FailuretypesPackage
 * @generated
 */
public interface FailuretypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailuretypesFactory eINSTANCE = reliability.failuretypes.impl.FailuretypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Types Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Types Root</em>'.
	 * @generated
	 */
	FailureTypesRoot createFailureTypesRoot();

	/**
	 * Returns a new object of class '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Induced Failure Type</em>'.
	 * @generated
	 */
	NetworkInducedFailureType createNetworkInducedFailureType();

	/**
	 * Returns a new object of class '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Induced Failure Type</em>'.
	 * @generated
	 */
	HardwareInducedFailureType createHardwareInducedFailureType();

	/**
	 * Returns a new object of class '<em>Software Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Induced Failure Type</em>'.
	 * @generated
	 */
	SoftwareInducedFailureType createSoftwareInducedFailureType();

	/**
	 * Returns a new object of class '<em>Resource Timeout Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Timeout Failure Type</em>'.
	 * @generated
	 */
	ResourceTimeoutFailureType createResourceTimeoutFailureType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FailuretypesPackage getFailuretypesPackage();

} //FailuretypesFactory
