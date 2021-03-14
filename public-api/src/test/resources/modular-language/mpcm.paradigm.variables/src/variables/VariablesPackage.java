/**
 */
package variables;

import de.uka.ipd.sdq.stoex.StoexPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The parameter package allows to model data dependent performance characteristics of software systems. It is mainly used to specify performance dependencies on input and output parameters of single service calls. It can also be used to describe dependencies on the state of components by the use of component parameters. The latter describe stochastically a component state which does not change over time. 
 * 
 * Parameters are described by the use of variable usages which on the one side contain a performance abstraction of the variable's value and on the other side the name of the variable for refering to the variable. Characterisations available include Structure (information on the data's internal structure like "sorted" or "unsorted" for an array), Number of Elements (size of a collection), Value (the actuall variable value), Bytesize (the variable's memory footprint), or type (the type of the variable in polymorphic cases).
 * 
 * Example for variable usages may be a.NUMBER_OF_ELEMENTS = 10 (array "a" contains 10 elements), tree.STRUCTURE = "balanced" (tree "tree" is a balanced tree), and so on.
 * <!-- end-model-doc -->
 * @see variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.paradigm.variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.paradigm.variables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesPackage eINSTANCE = variables.impl.VariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link variables.impl.VariableUsageImpl <em>Variable Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variables.impl.VariableUsageImpl
	 * @see variables.impl.VariablesPackageImpl#getVariableUsage()
	 * @generated
	 */
	int VARIABLE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Variable Characterisation Variable Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Named Reference Variable Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE = 1;

	/**
	 * The number of structural features of the '<em>Variable Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link variables.impl.VariableCharacterisationImpl <em>Variable Characterisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variables.impl.VariableCharacterisationImpl
	 * @see variables.impl.VariablesPackageImpl#getVariableCharacterisation()
	 * @generated
	 */
	int VARIABLE_CHARACTERISATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Specification Variable Characterisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION = 1;

	/**
	 * The feature id for the '<em><b>Variable Usage Variable Characterisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION = 2;

	/**
	 * The number of structural features of the '<em>Variable Characterisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link variables.impl.CharacterisedVariableImpl <em>Characterised Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variables.impl.CharacterisedVariableImpl
	 * @see variables.impl.VariablesPackageImpl#getCharacterisedVariable()
	 * @generated
	 */
	int CHARACTERISED_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Id Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE__ID_VARIABLE = StoexPackage.VARIABLE__ID_VARIABLE;

	/**
	 * The feature id for the '<em><b>Characterisation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE = StoexPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characterised Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE_FEATURE_COUNT = StoexPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link variables.impl.PCMRandomVariableImpl <em>PCM Random Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variables.impl.PCMRandomVariableImpl
	 * @see variables.impl.VariablesPackageImpl#getPCMRandomVariable()
	 * @generated
	 */
	int PCM_RANDOM_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RANDOM_VARIABLE__SPECIFICATION = StoexPackage.RANDOM_VARIABLE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RANDOM_VARIABLE__EXPRESSION = StoexPackage.RANDOM_VARIABLE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>PCM Random Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_RANDOM_VARIABLE_FEATURE_COUNT = StoexPackage.RANDOM_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link variables.VariableCharacterisationType <em>Variable Characterisation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see variables.VariableCharacterisationType
	 * @see variables.impl.VariablesPackageImpl#getVariableCharacterisationType()
	 * @generated
	 */
	int VARIABLE_CHARACTERISATION_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link variables.VariableUsage <em>Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Usage</em>'.
	 * @see variables.VariableUsage
	 * @generated
	 */
	EClass getVariableUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link variables.VariableUsage#getVariableCharacterisation_VariableUsage <em>Variable Characterisation Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Characterisation Variable Usage</em>'.
	 * @see variables.VariableUsage#getVariableCharacterisation_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_VariableCharacterisation_VariableUsage();

	/**
	 * Returns the meta object for the containment reference '{@link variables.VariableUsage#getNamedReference__VariableUsage <em>Named Reference Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Reference Variable Usage</em>'.
	 * @see variables.VariableUsage#getNamedReference__VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_NamedReference__VariableUsage();

	/**
	 * Returns the meta object for class '{@link variables.VariableCharacterisation <em>Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Characterisation</em>'.
	 * @see variables.VariableCharacterisation
	 * @generated
	 */
	EClass getVariableCharacterisation();

	/**
	 * Returns the meta object for the attribute '{@link variables.VariableCharacterisation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see variables.VariableCharacterisation#getType()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EAttribute getVariableCharacterisation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link variables.VariableCharacterisation#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Variable Characterisation</em>'.
	 * @see variables.VariableCharacterisation#getSpecification_VariableCharacterisation()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EReference getVariableCharacterisation_Specification_VariableCharacterisation();

	/**
	 * Returns the meta object for the container reference '{@link variables.VariableCharacterisation#getVariableUsage_VariableCharacterisation <em>Variable Usage Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Usage Variable Characterisation</em>'.
	 * @see variables.VariableCharacterisation#getVariableUsage_VariableCharacterisation()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EReference getVariableCharacterisation_VariableUsage_VariableCharacterisation();

	/**
	 * Returns the meta object for class '{@link variables.CharacterisedVariable <em>Characterised Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterised Variable</em>'.
	 * @see variables.CharacterisedVariable
	 * @generated
	 */
	EClass getCharacterisedVariable();

	/**
	 * Returns the meta object for the attribute '{@link variables.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characterisation Type</em>'.
	 * @see variables.CharacterisedVariable#getCharacterisationType()
	 * @see #getCharacterisedVariable()
	 * @generated
	 */
	EAttribute getCharacterisedVariable_CharacterisationType();

	/**
	 * Returns the meta object for class '{@link variables.PCMRandomVariable <em>PCM Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Random Variable</em>'.
	 * @see variables.PCMRandomVariable
	 * @generated
	 */
	EClass getPCMRandomVariable();

	/**
	 * Returns the meta object for enum '{@link variables.VariableCharacterisationType <em>Variable Characterisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Characterisation Type</em>'.
	 * @see variables.VariableCharacterisationType
	 * @generated
	 */
	EEnum getVariableCharacterisationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariablesFactory getVariablesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link variables.impl.VariableUsageImpl <em>Variable Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variables.impl.VariableUsageImpl
		 * @see variables.impl.VariablesPackageImpl#getVariableUsage()
		 * @generated
		 */
		EClass VARIABLE_USAGE = eINSTANCE.getVariableUsage();

		/**
		 * The meta object literal for the '<em><b>Variable Characterisation Variable Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE = eINSTANCE.getVariableUsage_VariableCharacterisation_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Named Reference Variable Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE = eINSTANCE.getVariableUsage_NamedReference__VariableUsage();

		/**
		 * The meta object literal for the '{@link variables.impl.VariableCharacterisationImpl <em>Variable Characterisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variables.impl.VariableCharacterisationImpl
		 * @see variables.impl.VariablesPackageImpl#getVariableCharacterisation()
		 * @generated
		 */
		EClass VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CHARACTERISATION__TYPE = eINSTANCE.getVariableCharacterisation_Type();

		/**
		 * The meta object literal for the '<em><b>Specification Variable Characterisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation_Specification_VariableCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Variable Usage Variable Characterisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation_VariableUsage_VariableCharacterisation();

		/**
		 * The meta object literal for the '{@link variables.impl.CharacterisedVariableImpl <em>Characterised Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variables.impl.CharacterisedVariableImpl
		 * @see variables.impl.VariablesPackageImpl#getCharacterisedVariable()
		 * @generated
		 */
		EClass CHARACTERISED_VARIABLE = eINSTANCE.getCharacterisedVariable();

		/**
		 * The meta object literal for the '<em><b>Characterisation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE = eINSTANCE.getCharacterisedVariable_CharacterisationType();

		/**
		 * The meta object literal for the '{@link variables.impl.PCMRandomVariableImpl <em>PCM Random Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variables.impl.PCMRandomVariableImpl
		 * @see variables.impl.VariablesPackageImpl#getPCMRandomVariable()
		 * @generated
		 */
		EClass PCM_RANDOM_VARIABLE = eINSTANCE.getPCMRandomVariable();

		/**
		 * The meta object literal for the '{@link variables.VariableCharacterisationType <em>Variable Characterisation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see variables.VariableCharacterisationType
		 * @see variables.impl.VariablesPackageImpl#getVariableCharacterisationType()
		 * @generated
		 */
		EEnum VARIABLE_CHARACTERISATION_TYPE = eINSTANCE.getVariableCharacterisationType();

	}

} //VariablesPackage
