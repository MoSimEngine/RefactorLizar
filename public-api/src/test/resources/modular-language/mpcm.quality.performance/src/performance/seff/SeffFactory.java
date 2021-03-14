/**
 */
package performance.seff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see performance.seff.SeffPackage
 * @generated
 */
public interface SeffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffFactory eINSTANCE = performance.seff.impl.SeffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Performance SEFF Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance SEFF Root</em>'.
	 * @generated
	 */
	PerformanceSEFFRoot createPerformanceSEFFRoot();

	/**
	 * Returns a new object of class '<em>Resource Demanding SEFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Demanding SEFF</em>'.
	 * @generated
	 */
	ResourceDemandingSEFF createResourceDemandingSEFF();

	/**
	 * Returns a new object of class '<em>Parametric Resource Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric Resource Demand</em>'.
	 * @generated
	 */
	ParametricResourceDemand createParametricResourceDemand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeffPackage getSeffPackage();

} //SeffFactory
