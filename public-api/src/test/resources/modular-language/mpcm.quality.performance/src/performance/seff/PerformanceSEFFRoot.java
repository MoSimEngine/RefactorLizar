/**
 */
package performance.seff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.seff.PerformanceSEFFRoot#getResourceDemandingSEFFs <em>Resource Demanding SEF Fs</em>}</li>
 * </ul>
 *
 * @see performance.seff.SeffPackage#getPerformanceSEFFRoot()
 * @model
 * @generated
 */
public interface PerformanceSEFFRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Demanding SEF Fs</b></em>' containment reference list.
	 * The list contents are of type {@link performance.seff.ResourceDemandingSEFF}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demanding SEF Fs</em>' containment reference list.
	 * @see performance.seff.SeffPackage#getPerformanceSEFFRoot_ResourceDemandingSEFFs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceDemandingSEFF> getResourceDemandingSEFFs();

} // PerformanceSEFFRoot
