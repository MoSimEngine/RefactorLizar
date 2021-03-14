/**
 */
package infrastructure.repository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see infrastructure.repository.RepositoryPackage
 * @generated
 */
public interface RepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryFactory eINSTANCE = infrastructure.repository.impl.RepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure Repository Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Repository Root</em>'.
	 * @generated
	 */
	InfrastructureRepositoryRoot createInfrastructureRepositoryRoot();

	/**
	 * Returns a new object of class '<em>Infrastructure Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Component</em>'.
	 * @generated
	 */
	InfrastructureComponent createInfrastructureComponent();

	/**
	 * Returns a new object of class '<em>Infrastructure Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Interface</em>'.
	 * @generated
	 */
	InfrastructureInterface createInfrastructureInterface();

	/**
	 * Returns a new object of class '<em>Infrastructure Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Signature</em>'.
	 * @generated
	 */
	InfrastructureSignature createInfrastructureSignature();

	/**
	 * Returns a new object of class '<em>Infrastructure Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Provided Role</em>'.
	 * @generated
	 */
	InfrastructureProvidedRole createInfrastructureProvidedRole();

	/**
	 * Returns a new object of class '<em>Infrastructure Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Required Role</em>'.
	 * @generated
	 */
	InfrastructureRequiredRole createInfrastructureRequiredRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepositoryPackage getRepositoryPackage();

} //RepositoryFactory
