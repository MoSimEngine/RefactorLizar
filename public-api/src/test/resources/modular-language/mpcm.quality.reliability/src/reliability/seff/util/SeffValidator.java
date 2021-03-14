/**
 */
package reliability.seff.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import reliability.seff.*;

import reliability.util.ReliabilityValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see reliability.seff.SeffPackage
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
	public static final String DIAGNOSTIC_SOURCE = "reliability.seff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Resource Timeout Failure Allowed For Internal Failure Occurrence Description' of 'Internal Failure Occurrence Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Primary Behaviour Of Recovery Action Must Be Set' of 'Recovery Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECOVERY_ACTION__PRIMARY_BEHAVIOUR_OF_RECOVERY_ACTION_MUST_BE_SET = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recovery Action Behaviour Has Only One Predecessor' of 'Recovery Action Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_HAS_ONLY_ONE_PREDECESSOR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recovery Action Behaviour Is Not Successor Of Itself' of 'Recovery Action Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_IS_NOT_SUCCESSOR_OF_ITSELF = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Successors Of Recovery Action Behaviour Handle Disjoint Failure Types' of 'Recovery Action Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECOVERY_ACTION_BEHAVIOUR__SUCCESSORS_OF_RECOVERY_ACTION_BEHAVIOUR_HANDLE_DISJOINT_FAILURE_TYPES = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
	protected ReliabilityValidator reliabilityValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected seff.util.SeffValidator seffValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffValidator() {
		super();
		reliabilityValidator = ReliabilityValidator.INSTANCE;
		identifierValidator = IdentifierValidator.INSTANCE;
		seffValidator = seff.util.SeffValidator.INSTANCE;
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
			case SeffPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return validateInternalFailureOccurrenceDescription((InternalFailureOccurrenceDescription)value, diagnostics, context);
			case SeffPackage.RECOVERY_ACTION:
				return validateRecoveryAction((RecoveryAction)value, diagnostics, context);
			case SeffPackage.RECOVERY_ACTION_BEHAVIOUR:
				return validateRecoveryActionBehaviour((RecoveryActionBehaviour)value, diagnostics, context);
			case SeffPackage.FAILURE_HANDLING_ENTITY:
				return validateFailureHandlingEntity((FailureHandlingEntity)value, diagnostics, context);
			case SeffPackage.FAILURE_HANDLING_EXTERNAL_CALL_ACTION:
				return validateFailureHandlingExternalCallAction((FailureHandlingExternalCallAction)value, diagnostics, context);
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT:
				return validateAcquireActionTimeout((AcquireActionTimeout)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription internalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalFailureOccurrenceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= reliabilityValidator.validateFailureOccurrenceDescription_EnsureValidFailureProbabilityRange(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalFailureOccurrenceDescription_NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(internalFailureOccurrenceDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription constraint of '<em>Internal Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalFailureOccurrenceDescription_NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription internalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalFailureOccurrenceDescription.NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryAction(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recoveryAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryAction_PrimaryBehaviourOfRecoveryActionMustBeSet(recoveryAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PrimaryBehaviourOfRecoveryActionMustBeSet constraint of '<em>Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryAction_PrimaryBehaviourOfRecoveryActionMustBeSet(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recoveryAction.PrimaryBehaviourOfRecoveryActionMustBeSet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recoveryActionBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateBehaviour_ExactlyOneStopAction(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateBehaviour_ExactlyOneStartAction(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateBehaviour_EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_RecoveryActionBehaviourHasOnlyOnePredecessor(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_RecoveryActionBehaviourIsNotSuccessorOfItself(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(recoveryActionBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RecoveryActionBehaviourHasOnlyOnePredecessor constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_RecoveryActionBehaviourHasOnlyOnePredecessor(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recoveryActionBehaviour.RecoveryActionBehaviourHasOnlyOnePredecessor(diagnostics, context);
	}

	/**
	 * Validates the RecoveryActionBehaviourIsNotSuccessorOfItself constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_RecoveryActionBehaviourIsNotSuccessorOfItself(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recoveryActionBehaviour.RecoveryActionBehaviourIsNotSuccessorOfItself(diagnostics, context);
	}

	/**
	 * Validates the SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recoveryActionBehaviour.SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureHandlingEntity(FailureHandlingEntity failureHandlingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureHandlingEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(failureHandlingEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureHandlingExternalCallAction(FailureHandlingExternalCallAction failureHandlingExternalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureHandlingExternalCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureHandlingExternalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(failureHandlingExternalCallAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireActionTimeout(AcquireActionTimeout acquireActionTimeout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acquireActionTimeout, diagnostics, context);
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
