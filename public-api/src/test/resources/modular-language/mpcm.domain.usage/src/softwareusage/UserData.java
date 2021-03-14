/**
 */
package softwareusage;

import composition.AssemblyContext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserData characterises data
 * used in specific assembly contexts in the system. This data is the same for all UsageScenarios, i.e.,
 * multiple users accessing the same components access the same data. This UserData refers to component
 * parameters of the system publicized by the software architect (see mpcm::parameters package). The domain expert
 * characterises the values of component parameters related to business concepts (e.g., user specific data,
 * data specific for a business domain), whereas the software architect characterises the values of component
 * parameters related to technical concepts (e.g., size of caches, size of a thread pool, configuration data,
 * etc.). One UserData instance includes all parameter characterisation for the annotated entity. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwareusage.UserData#getAssemblyContext_userData <em>Assembly Context user Data</em>}</li>
 *   <li>{@link softwareusage.UserData#getUsageModel_UserData <em>Usage Model User Data</em>}</li>
 *   <li>{@link softwareusage.UserData#getUserDataParameterUsages_UserData <em>User Data Parameter Usages User Data</em>}</li>
 * </ul>
 *
 * @see softwareusage.SoftwareusagePackage#getUserData()
 * @model
 * @generated
 */
public interface UserData extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Context user Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context user Data</em>' reference.
	 * @see #setAssemblyContext_userData(AssemblyContext)
	 * @see softwareusage.SoftwareusagePackage#getUserData_AssemblyContext_userData()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_userData();

	/**
	 * Sets the value of the '{@link softwareusage.UserData#getAssemblyContext_userData <em>Assembly Context user Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context user Data</em>' reference.
	 * @see #getAssemblyContext_userData()
	 * @generated
	 */
	void setAssemblyContext_userData(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Usage Model User Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link softwareusage.UsageModel#getUserData_UsageModel <em>User Data Usage Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Model User Data</em>' container reference.
	 * @see #setUsageModel_UserData(UsageModel)
	 * @see softwareusage.SoftwareusagePackage#getUserData_UsageModel_UserData()
	 * @see softwareusage.UsageModel#getUserData_UsageModel
	 * @model opposite="userData_UsageModel" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UsageModel getUsageModel_UserData();

	/**
	 * Sets the value of the '{@link softwareusage.UserData#getUsageModel_UserData <em>Usage Model User Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Model User Data</em>' container reference.
	 * @see #getUsageModel_UserData()
	 * @generated
	 */
	void setUsageModel_UserData(UsageModel value);

	/**
	 * Returns the value of the '<em><b>User Data Parameter Usages User Data</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Parameter Usages User Data</em>' containment reference list.
	 * @see softwareusage.SoftwareusagePackage#getUserData_UserDataParameterUsages_UserData()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getUserDataParameterUsages_UserData();

} // UserData
