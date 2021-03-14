/**
 */
package variables.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import variables.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see variables.VariablesPackage
 * @generated
 */
public class VariablesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VariablesValidator INSTANCE = new VariablesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "variables";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specification Must Not Be NULL' of 'PCM Random Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PCM_RANDOM_VARIABLE__SPECIFICATION_MUST_NOT_BE_NULL = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VariablesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VariablesPackage.VARIABLE_USAGE:
				return validateVariableUsage((VariableUsage)value, diagnostics, context);
			case VariablesPackage.VARIABLE_CHARACTERISATION:
				return validateVariableCharacterisation((VariableCharacterisation)value, diagnostics, context);
			case VariablesPackage.CHARACTERISED_VARIABLE:
				return validateCharacterisedVariable((CharacterisedVariable)value, diagnostics, context);
			case VariablesPackage.PCM_RANDOM_VARIABLE:
				return validatePCMRandomVariable((PCMRandomVariable)value, diagnostics, context);
			case VariablesPackage.VARIABLE_CHARACTERISATION_TYPE:
				return validateVariableCharacterisationType((VariableCharacterisationType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableUsage(VariableUsage variableUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableCharacterisation(VariableCharacterisation variableCharacterisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableCharacterisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterisedVariable(CharacterisedVariable characterisedVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterisedVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCMRandomVariable(PCMRandomVariable pcmRandomVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pcmRandomVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pcmRandomVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCMRandomVariable_SpecificationMustNotBeNULL(pcmRandomVariable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SpecificationMustNotBeNULL constraint of '<em>PCM Random Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCMRandomVariable_SpecificationMustNotBeNULL(PCMRandomVariable pcmRandomVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pcmRandomVariable.SpecificationMustNotBeNULL(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableCharacterisationType(VariableCharacterisationType variableCharacterisationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VariablesValidator
