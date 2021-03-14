/**
 */
package softwarerepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see softwarerepository.SoftwarerepositoryPackage
 * @generated
 */
public interface SoftwarerepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarerepositoryFactory eINSTANCE = softwarerepository.impl.SoftwarerepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Softwarerepository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Softwarerepository</em>'.
	 * @generated
	 */
	Softwarerepository createSoftwarerepository();

	/**
	 * Returns a new object of class '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Type</em>'.
	 * @generated
	 */
	ExceptionType createExceptionType();

	/**
	 * Returns a new object of class '<em>Exception Occurence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Occurence</em>'.
	 * @generated
	 */
	ExceptionOccurence createExceptionOccurence();

	/**
	 * Returns a new object of class '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Component</em>'.
	 * @generated
	 */
	BasicComponent createBasicComponent();

	/**
	 * Returns a new object of class '<em>Passive Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Resource</em>'.
	 * @generated
	 */
	PassiveResource createPassiveResource();

	/**
	 * Returns a new object of class '<em>Operation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Interface</em>'.
	 * @generated
	 */
	OperationInterface createOperationInterface();

	/**
	 * Returns a new object of class '<em>Operation Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Signature</em>'.
	 * @generated
	 */
	OperationSignature createOperationSignature();

	/**
	 * Returns a new object of class '<em>Operation Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Provided Role</em>'.
	 * @generated
	 */
	OperationProvidedRole createOperationProvidedRole();

	/**
	 * Returns a new object of class '<em>Operation Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Required Role</em>'.
	 * @generated
	 */
	OperationRequiredRole createOperationRequiredRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwarerepositoryPackage getSoftwarerepositoryPackage();

} //SoftwarerepositoryFactory
