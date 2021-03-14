/**
 */
package performanceannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see performanceannotations.PerformanceannotationsPackage
 * @generated
 */
public interface PerformanceannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformanceannotationsFactory eINSTANCE = performanceannotations.impl.PerformanceannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Service Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Service Execution Time</em>'.
	 * @generated
	 */
	SystemServiceExecutionTime createSystemServiceExecutionTime();

	/**
	 * Returns a new object of class '<em>Component Service Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Service Execution Time</em>'.
	 * @generated
	 */
	ComponentServiceExecutionTime createComponentServiceExecutionTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PerformanceannotationsPackage getPerformanceannotationsPackage();

} //PerformanceannotationsFactory
