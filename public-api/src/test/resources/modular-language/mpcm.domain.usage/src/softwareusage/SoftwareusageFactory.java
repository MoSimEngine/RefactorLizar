/**
 */
package softwareusage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see softwareusage.SoftwareusagePackage
 * @generated
 */
public interface SoftwareusageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareusageFactory eINSTANCE = softwareusage.impl.SoftwareusageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usage Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Model</em>'.
	 * @generated
	 */
	UsageModel createUsageModel();

	/**
	 * Returns a new object of class '<em>User Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Data</em>'.
	 * @generated
	 */
	UserData createUserData();

	/**
	 * Returns a new object of class '<em>Usage Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Scenario</em>'.
	 * @generated
	 */
	UsageScenario createUsageScenario();

	/**
	 * Returns a new object of class '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Workload</em>'.
	 * @generated
	 */
	OpenWorkload createOpenWorkload();

	/**
	 * Returns a new object of class '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Workload</em>'.
	 * @generated
	 */
	ClosedWorkload createClosedWorkload();

	/**
	 * Returns a new object of class '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Level System Call</em>'.
	 * @generated
	 */
	EntryLevelSystemCall createEntryLevelSystemCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwareusagePackage getSoftwareusagePackage();

} //SoftwareusageFactory
