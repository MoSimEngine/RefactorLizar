/**
 */
package resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Environment</em>'.
	 * @generated
	 */
	ResourceEnvironment createResourceEnvironment();

	/**
	 * Returns a new object of class '<em>Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Container</em>'.
	 * @generated
	 */
	ResourceContainer createResourceContainer();

	/**
	 * Returns a new object of class '<em>Processing Resource Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Specification</em>'.
	 * @generated
	 */
	ProcessingResourceSpecification createProcessingResourceSpecification();

	/**
	 * Returns a new object of class '<em>HDD Processing Resource Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDD Processing Resource Specification</em>'.
	 * @generated
	 */
	HDDProcessingResourceSpecification createHDDProcessingResourceSpecification();

	/**
	 * Returns a new object of class '<em>Communication Link Resource Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link Resource Specification</em>'.
	 * @generated
	 */
	CommunicationLinkResourceSpecification createCommunicationLinkResourceSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
