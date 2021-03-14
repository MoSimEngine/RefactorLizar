/**
 */
package infrastructure.seff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see infrastructure.seff.SeffPackage
 * @generated
 */
public interface SeffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffFactory eINSTANCE = infrastructure.seff.impl.SeffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure SEFF Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure SEFF Root</em>'.
	 * @generated
	 */
	InfrastructureSEFFRoot createInfrastructureSEFFRoot();

	/**
	 * Returns a new object of class '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Call</em>'.
	 * @generated
	 */
	InfrastructureCall createInfrastructureCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeffPackage getSeffPackage();

} //SeffFactory
