/**
 */
package behaviourseff;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 * </ul>
 *
 * @see behaviourseff.BehaviourseffPackage#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends Entity {
	/**
	 * Returns the value of the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Variable Usages Call Action</em>' containment reference list.
	 * @see behaviourseff.BehaviourseffPackage#getCallAction_InputVariableUsages__CallAction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getInputVariableUsages__CallAction();

} // CallAction
