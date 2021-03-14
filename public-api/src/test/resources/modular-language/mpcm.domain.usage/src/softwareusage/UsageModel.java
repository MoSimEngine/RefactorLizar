/**
 */
package softwareusage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The UsageModel specifies the whole user interaction with a system from a performance viewpoint. It consists of a number of concurrently executed UsageScenarios and a set of global UserData specifications. Each UsageScenario includes a workload and a scenario behaviour. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwareusage.UsageModel#getUsageScenario_UsageModel <em>Usage Scenario Usage Model</em>}</li>
 *   <li>{@link softwareusage.UsageModel#getUserData_UsageModel <em>User Data Usage Model</em>}</li>
 * </ul>
 *
 * @see softwareusage.SoftwareusagePackage#getUsageModel()
 * @model
 * @generated
 */
public interface UsageModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Usage Scenario Usage Model</b></em>' containment reference list.
	 * The list contents are of type {@link softwareusage.UsageScenario}.
	 * It is bidirectional and its opposite is '{@link softwareusage.UsageScenario#getUsageModel_UsageScenario <em>Usage Model Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Scenario Usage Model</em>' containment reference list.
	 * @see softwareusage.SoftwareusagePackage#getUsageModel_UsageScenario_UsageModel()
	 * @see softwareusage.UsageScenario#getUsageModel_UsageScenario
	 * @model opposite="usageModel_UsageScenario" containment="true" ordered="false"
	 * @generated
	 */
	EList<UsageScenario> getUsageScenario_UsageModel();

	/**
	 * Returns the value of the '<em><b>User Data Usage Model</b></em>' containment reference list.
	 * The list contents are of type {@link softwareusage.UserData}.
	 * It is bidirectional and its opposite is '{@link softwareusage.UserData#getUsageModel_UserData <em>Usage Model User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Usage Model</em>' containment reference list.
	 * @see softwareusage.SoftwareusagePackage#getUsageModel_UserData_UsageModel()
	 * @see softwareusage.UserData#getUsageModel_UserData
	 * @model opposite="usageModel_UserData" containment="true" ordered="false"
	 * @generated
	 */
	EList<UserData> getUserData_UsageModel();

} // UsageModel
