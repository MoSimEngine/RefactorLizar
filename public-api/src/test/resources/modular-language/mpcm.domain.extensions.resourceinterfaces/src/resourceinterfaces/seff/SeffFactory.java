/**
 */
package resourceinterfaces.seff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resourceinterfaces.seff.SeffPackage
 * @generated
 */
public interface SeffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffFactory eINSTANCE = resourceinterfaces.seff.impl.SeffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Interfaces SEFF Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interfaces SEFF Root</em>'.
	 * @generated
	 */
	ResourceInterfacesSEFFRoot createResourceInterfacesSEFFRoot();

	/**
	 * Returns a new object of class '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Call</em>'.
	 * @generated
	 */
	ResourceCall createResourceCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeffPackage getSeffPackage();

} //SeffFactory
