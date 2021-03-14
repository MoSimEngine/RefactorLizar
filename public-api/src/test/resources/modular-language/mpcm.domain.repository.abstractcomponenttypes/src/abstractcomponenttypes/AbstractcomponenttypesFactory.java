/**
 */
package abstractcomponenttypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstractcomponenttypes.AbstractcomponenttypesPackage
 * @generated
 */
public interface AbstractcomponenttypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractcomponenttypesFactory eINSTANCE = abstractcomponenttypes.impl.AbstractcomponenttypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provides Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Component Type</em>'.
	 * @generated
	 */
	ProvidesComponentType createProvidesComponentType();

	/**
	 * Returns a new object of class '<em>Complete Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complete Component Type</em>'.
	 * @generated
	 */
	CompleteComponentType createCompleteComponentType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractcomponenttypesPackage getAbstractcomponenttypesPackage();

} //AbstractcomponenttypesFactory
