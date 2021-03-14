/**
 */
package resourceinterfaces.repository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resourceinterfaces.repository.RepositoryPackage
 * @generated
 */
public interface RepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryFactory eINSTANCE = resourceinterfaces.repository.impl.RepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Interfaces Repository Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interfaces Repository Root</em>'.
	 * @generated
	 */
	ResourceInterfacesRepositoryRoot createResourceInterfacesRepositoryRoot();

	/**
	 * Returns a new object of class '<em>Resource Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Required Role</em>'.
	 * @generated
	 */
	ResourceRequiredRole createResourceRequiredRole();

	/**
	 * Returns a new object of class '<em>Resource Interface Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface Requiring Entity</em>'.
	 * @generated
	 */
	ResourceInterfaceRequiringEntity createResourceInterfaceRequiringEntity();

	/**
	 * Returns a new object of class '<em>Resource Interface Providing Requiring Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface Providing Requiring Entity</em>'.
	 * @generated
	 */
	ResourceInterfaceProvidingRequiringEntity createResourceInterfaceProvidingRequiringEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepositoryPackage getRepositoryPackage();

} //RepositoryFactory
