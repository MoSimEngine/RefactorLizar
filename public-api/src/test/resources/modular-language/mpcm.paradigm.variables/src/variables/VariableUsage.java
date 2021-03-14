/**
 */
package variables;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variable usages are used to characterise variables like input and output variables or component parameters. They contain the specification of the variable as VariableCharacterisation and also refer to the name of the characterised variable in its namedReference association. Note that it was an explicit design decision to refer to variable names instead of the actual variables (i.e., by refering to Parameter class). It eased the writing of transformations (DSolver as well as SimuCom) but put some complexity in the frontend for entering the variable usages.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variables.VariableUsage#getVariableCharacterisation_VariableUsage <em>Variable Characterisation Variable Usage</em>}</li>
 *   <li>{@link variables.VariableUsage#getNamedReference__VariableUsage <em>Named Reference Variable Usage</em>}</li>
 * </ul>
 *
 * @see variables.VariablesPackage#getVariableUsage()
 * @model
 * @generated
 */
public interface VariableUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Characterisation Variable Usage</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableCharacterisation}.
	 * It is bidirectional and its opposite is '{@link variables.VariableCharacterisation#getVariableUsage_VariableCharacterisation <em>Variable Usage Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association contains the information which abstract information on a specific variable is available. For example, whether we know something on the variable's value, its structure or memory footprint. There can be multiple characterisations of the same variable if more than one type of information is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Characterisation Variable Usage</em>' containment reference list.
	 * @see variables.VariablesPackage#getVariableUsage_VariableCharacterisation_VariableUsage()
	 * @see variables.VariableCharacterisation#getVariableUsage_VariableCharacterisation
	 * @model opposite="variableUsage_VariableCharacterisation" containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableCharacterisation> getVariableCharacterisation_VariableUsage();

	/**
	 * Returns the value of the '<em><b>Named Reference Variable Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Reference Variable Usage</em>' containment reference.
	 * @see #setNamedReference__VariableUsage(AbstractNamedReference)
	 * @see variables.VariablesPackage#getVariableUsage_NamedReference__VariableUsage()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractNamedReference getNamedReference__VariableUsage();

	/**
	 * Sets the value of the '{@link variables.VariableUsage#getNamedReference__VariableUsage <em>Named Reference Variable Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Reference Variable Usage</em>' containment reference.
	 * @see #getNamedReference__VariableUsage()
	 * @generated
	 */
	void setNamedReference__VariableUsage(AbstractNamedReference value);

} // VariableUsage
