/**
 */
package behaviourseff.util;

import behaviourseff.*;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import softwarerepository.util.SoftwarerepositoryValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see behaviourseff.BehaviourseffPackage
 * @generated
 */
public class BehaviourseffValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BehaviourseffValidator INSTANCE = new BehaviourseffValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "behaviourseff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Belongs To Role' of 'External Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_CALL_ACTION__SIGNATURE_BELONGS_TO_ROLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operation Required Role Must Be Referenced By Container' of 'External Call Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_CALL_ACTION__OPERATION_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_CONTAINER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Timeout Value Of Acquire Action Must Not Be Negative' of 'Acquire Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACQUIRE_ACTION__TIMEOUT_VALUE_OF_ACQUIRE_ACTION_MUST_NOT_BE_NEGATIVE = 3;

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
	protected SoftwarerepositoryValidator softwarerepositoryValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected de.uka.ipd.sdq.identifier.util.IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffValidator() {
		super();
		softwarerepositoryValidator = SoftwarerepositoryValidator.INSTANCE;
		identifierValidator = de.uka.ipd.sdq.identifier.util.IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BehaviourseffPackage.eINSTANCE;
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
			case BehaviourseffPackage.BEHAVIOUR_SEFF:
				return validateBehaviourSEFF((BehaviourSEFF)value, diagnostics, context);
			case BehaviourseffPackage.PROBABILISTIC_BRANCH_TRANSITION:
				return validateProbabilisticBranchTransition((ProbabilisticBranchTransition)value, diagnostics, context);
			case BehaviourseffPackage.GUARDED_BRANCH_TRANSITION:
				return validateGuardedBranchTransition((GuardedBranchTransition)value, diagnostics, context);
			case BehaviourseffPackage.COLLECTION_ITERATOR_ACTION:
				return validateCollectionIteratorAction((CollectionIteratorAction)value, diagnostics, context);
			case BehaviourseffPackage.CALL_ACTION:
				return validateCallAction((CallAction)value, diagnostics, context);
			case BehaviourseffPackage.CALL_RETURN_ACTION:
				return validateCallReturnAction((CallReturnAction)value, diagnostics, context);
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION:
				return validateExternalCallAction((ExternalCallAction)value, diagnostics, context);
			case BehaviourseffPackage.ACQUIRE_ACTION:
				return validateAcquireAction((AcquireAction)value, diagnostics, context);
			case BehaviourseffPackage.RELEASE_ACTION:
				return validateReleaseAction((ReleaseAction)value, diagnostics, context);
			case BehaviourseffPackage.SET_VARIABLE_ACTION:
				return validateSetVariableAction((SetVariableAction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviourSEFF(BehaviourSEFF behaviourSEFF, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviourSEFF, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviourSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= softwarerepositoryValidator.validateServiceEffectSpecification_ReferencedSignatureMustBelongToInterfaceReferencedByProvidedRole(behaviourSEFF, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilisticBranchTransition(ProbabilisticBranchTransition probabilisticBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(probabilisticBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(probabilisticBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardedBranchTransition(GuardedBranchTransition guardedBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(guardedBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(guardedBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionIteratorAction(CollectionIteratorAction collectionIteratorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionIteratorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(collectionIteratorAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(callAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallReturnAction(CallReturnAction callReturnAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callReturnAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(callReturnAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalCallAction_SignatureBelongsToRole(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalCallAction_OperationRequiredRoleMustBeReferencedByContainer(externalCallAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SignatureBelongsToRole constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction_SignatureBelongsToRole(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalCallAction.SignatureBelongsToRole(diagnostics, context);
	}

	/**
	 * Validates the OperationRequiredRoleMustBeReferencedByContainer constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction_OperationRequiredRoleMustBeReferencedByContainer(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalCallAction.OperationRequiredRoleMustBeReferencedByContainer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireAction(AcquireAction acquireAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acquireAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcquireAction_TimeoutValueOfAcquireActionMustNotBeNegative(acquireAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TimeoutValueOfAcquireActionMustNotBeNegative constraint of '<em>Acquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireAction_TimeoutValueOfAcquireActionMustNotBeNegative(AcquireAction acquireAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return acquireAction.TimeoutValueOfAcquireActionMustNotBeNegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseAction(ReleaseAction releaseAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(releaseAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(releaseAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetVariableAction(SetVariableAction setVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(setVariableAction, diagnostics, context);
		return result;
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

} //BehaviourseffValidator
