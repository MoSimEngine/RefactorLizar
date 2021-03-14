/**
 */
package variables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see variables.VariablesPackage
 * @generated
 */
public interface VariablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesFactory eINSTANCE = variables.impl.VariablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Usage</em>'.
	 * @generated
	 */
	VariableUsage createVariableUsage();

	/**
	 * Returns a new object of class '<em>Variable Characterisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Characterisation</em>'.
	 * @generated
	 */
	VariableCharacterisation createVariableCharacterisation();

	/**
	 * Returns a new object of class '<em>Characterised Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characterised Variable</em>'.
	 * @generated
	 */
	CharacterisedVariable createCharacterisedVariable();

	/**
	 * Returns a new object of class '<em>PCM Random Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Random Variable</em>'.
	 * @generated
	 */
	PCMRandomVariable createPCMRandomVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariablesPackage getVariablesPackage();

} //VariablesFactory
