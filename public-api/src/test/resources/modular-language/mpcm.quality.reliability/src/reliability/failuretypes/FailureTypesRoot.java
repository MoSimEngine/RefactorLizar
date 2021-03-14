/**
 */
package reliability.failuretypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Types Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.FailureTypesRoot#getFailureTypes <em>Failure Types</em>}</li>
 * </ul>
 *
 * @see reliability.failuretypes.FailuretypesPackage#getFailureTypesRoot()
 * @model
 * @generated
 */
public interface FailureTypesRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Failure Types</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.failuretypes.FailureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Types</em>' containment reference list.
	 * @see reliability.failuretypes.FailuretypesPackage#getFailureTypesRoot_FailureTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureType> getFailureTypes();

} // FailureTypesRoot
