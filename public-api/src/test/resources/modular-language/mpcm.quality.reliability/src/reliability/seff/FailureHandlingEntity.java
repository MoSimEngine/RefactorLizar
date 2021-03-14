/**
 */
package reliability.seff;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import reliability.failuretypes.FailureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Handling Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Failure handling entities are any program constructs that can handle failures. Instances of failure handling entities
 *     specify any number of failure types that can be handled.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}</li>
 * </ul>
 *
 * @see reliability.seff.SeffPackage#getFailureHandlingEntity()
 * @model abstract="true"
 * @generated
 */
public interface FailureHandlingEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * The list contents are of type {@link reliability.failuretypes.FailureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Types Failure Handling Entity</em>' reference list.
	 * @see reliability.seff.SeffPackage#getFailureHandlingEntity_FailureTypes_FailureHandlingEntity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FailureType> getFailureTypes_FailureHandlingEntity();

} // FailureHandlingEntity
