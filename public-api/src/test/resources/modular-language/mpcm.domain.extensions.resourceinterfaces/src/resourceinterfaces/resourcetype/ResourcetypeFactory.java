/**
 */
package resourceinterfaces.resourcetype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resourceinterfaces.resourcetype.ResourcetypePackage
 * @generated
 */
public interface ResourcetypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypeFactory eINSTANCE = resourceinterfaces.resourcetype.impl.ResourcetypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Interface Resourcetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface Resourcetype Root</em>'.
	 * @generated
	 */
	ResourceInterfaceResourcetypeRoot createResourceInterfaceResourcetypeRoot();

	/**
	 * Returns a new object of class '<em>Resource Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface</em>'.
	 * @generated
	 */
	ResourceInterface createResourceInterface();

	/**
	 * Returns a new object of class '<em>Resource Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Signature</em>'.
	 * @generated
	 */
	ResourceSignature createResourceSignature();

	/**
	 * Returns a new object of class '<em>Resource Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Provided Role</em>'.
	 * @generated
	 */
	ResourceProvidedRole createResourceProvidedRole();

	/**
	 * Returns a new object of class '<em>Resource Interface Providing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface Providing Entity</em>'.
	 * @generated
	 */
	ResourceInterfaceProvidingEntity createResourceInterfaceProvidingEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcetypePackage getResourcetypePackage();

} //ResourcetypeFactory
