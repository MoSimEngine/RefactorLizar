/**
 */
package infrastructure.seff.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import infrastructure.seff.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see infrastructure.seff.SeffPackage
 * @generated
 */
public class SeffValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SeffValidator INSTANCE = new SeffValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "infrastructure.seff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Must Belong To Used Required Role' of 'Infrastructure Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Referenced Required Role Must Be Required By Component' of 'Infrastructure Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Role Combination Must Be Unique Within Abstract Internal Control Flow Action' of 'Infrastructure Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SeffPackage.eINSTANCE;
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
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT:
				return validateInfrastructureSEFFRoot((InfrastructureSEFFRoot)value, diagnostics, context);
			case SeffPackage.INFRASTRUCTURE_CALL:
				return validateInfrastructureCall((InfrastructureCall)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureSEFFRoot(InfrastructureSEFFRoot infrastructureSEFFRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infrastructureSEFFRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_SignatureMustBelongToUsedRequiredRole(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_ReferencedRequiredRoleMustBeRequiredByComponent(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(infrastructureCall, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SignatureMustBelongToUsedRequiredRole constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_SignatureMustBelongToUsedRequiredRole(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureCall.SignatureMustBelongToUsedRequiredRole(diagnostics, context);
	}

	/**
	 * Validates the ReferencedRequiredRoleMustBeRequiredByComponent constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_ReferencedRequiredRoleMustBeRequiredByComponent(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureCall.ReferencedRequiredRoleMustBeRequiredByComponent(diagnostics, context);
	}

	/**
	 * Validates the SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureCall.SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(diagnostics, context);
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

} //SeffValidator
