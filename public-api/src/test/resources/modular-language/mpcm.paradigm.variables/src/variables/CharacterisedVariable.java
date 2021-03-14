/**
 */
package variables;

import de.uka.ipd.sdq.stoex.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characterised Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A characterised variable is a special variable which contains a performance abstraction of a data type. It can be transformed in a named reference and a variable characterisation. It has to end always with a variable characterisation type. Examples are "a.NUMBER_OF_ELEMENTS" or "array.STRUCTURE".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link variables.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}</li>
 * </ul>
 *
 * @see variables.VariablesPackage#getCharacterisedVariable()
 * @model
 * @generated
 */
public interface CharacterisedVariable extends EObject, Variable {
	/**
	 * Returns the value of the '<em><b>Characterisation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link variables.VariableCharacterisationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the characterisation of the characterised variable. The type can be any of the varibale characterisation types, i.e., STRUCTURE, NUMBER_OF_ELEMENTS, TYPE, VALUE, or BYTESIZE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characterisation Type</em>' attribute.
	 * @see variables.VariableCharacterisationType
	 * @see #setCharacterisationType(VariableCharacterisationType)
	 * @see variables.VariablesPackage#getCharacterisedVariable_CharacterisationType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableCharacterisationType getCharacterisationType();

	/**
	 * Sets the value of the '{@link variables.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characterisation Type</em>' attribute.
	 * @see variables.VariableCharacterisationType
	 * @see #getCharacterisationType()
	 * @generated
	 */
	void setCharacterisationType(VariableCharacterisationType value);

} // CharacterisedVariable
