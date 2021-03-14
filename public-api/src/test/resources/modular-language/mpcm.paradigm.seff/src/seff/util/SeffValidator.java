/**
 */
package seff.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import seff.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see seff.SeffPackage
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
	public static final String DIAGNOSTIC_SOURCE = "seff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactly One Stop Action' of 'Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOUR__EXACTLY_ONE_STOP_ACTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactly One Start Action' of 'Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOUR__EXACTLY_ONE_START_ACTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Each Action Except Start Actionand Stop Action Must Hhave APredecessor And Successor' of 'Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Action Predecessor Must Not Be Defined' of 'Start Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START_ACTION__START_ACTION_PREDECESSOR_MUST_NOT_BE_DEFINED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Action Successor Must Not Be Defined' of 'Stop Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STOP_ACTION__STOP_ACTION_SUCCESSOR_MUST_NOT_BE_DEFINED = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple Internal Occurrence Descriptions Per Failure Type Not Allowed' of 'Internal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ACTION__MULTIPLE_INTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sum Of Internal Action Failure Probabilities Must Not Exceed1' of 'Internal Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERNAL_ACTION__SUM_OF_INTERNAL_ACTION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Either Guarded Branches Or Probabilisitic Branch Transitions' of 'Branch Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BRANCH_ACTION__EITHER_GUARDED_BRANCHES_OR_PROBABILISITIC_BRANCH_TRANSITIONS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Probabilistic Branch Probabilities Must Sum Up To1' of 'Branch Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BRANCH_ACTION__ALL_PROBABILISTIC_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1 = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

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
			case SeffPackage.BEHAVIOUR:
				return validateBehaviour((Behaviour)value, diagnostics, context);
			case SeffPackage.ABSTRACT_ACTION:
				return validateAbstractAction((AbstractAction)value, diagnostics, context);
			case SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION:
				return validateAbstractInternalControlFlowAction((AbstractInternalControlFlowAction)value, diagnostics, context);
			case SeffPackage.START_ACTION:
				return validateStartAction((StartAction)value, diagnostics, context);
			case SeffPackage.STOP_ACTION:
				return validateStopAction((StopAction)value, diagnostics, context);
			case SeffPackage.INTERNAL_ACTION:
				return validateInternalAction((InternalAction)value, diagnostics, context);
			case SeffPackage.BRANCH_ACTION:
				return validateBranchAction((BranchAction)value, diagnostics, context);
			case SeffPackage.ABSTRACT_BRANCH_TRANSITION:
				return validateAbstractBranchTransition((AbstractBranchTransition)value, diagnostics, context);
			case SeffPackage.FORK_ACTION:
				return validateForkAction((ForkAction)value, diagnostics, context);
			case SeffPackage.FORKED_BEHAVIOUR:
				return validateForkedBehaviour((ForkedBehaviour)value, diagnostics, context);
			case SeffPackage.SYNCHRONISATION_POINT:
				return validateSynchronisationPoint((SynchronisationPoint)value, diagnostics, context);
			case SeffPackage.ABSTRACT_LOOP_ACTION:
				return validateAbstractLoopAction((AbstractLoopAction)value, diagnostics, context);
			case SeffPackage.LOOP_ACTION:
				return validateLoopAction((LoopAction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviour(Behaviour behaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_ExactlyOneStopAction(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_ExactlyOneStartAction(behaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(behaviour, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExactlyOneStopAction constraint of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviour_ExactlyOneStopAction(Behaviour behaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behaviour.ExactlyOneStopAction(diagnostics, context);
	}

	/**
	 * Validates the ExactlyOneStartAction constraint of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviour_ExactlyOneStartAction(Behaviour behaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behaviour.ExactlyOneStartAction(diagnostics, context);
	}

	/**
	 * Validates the EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor constraint of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviour_EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(Behaviour behaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return behaviour.EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAction(AbstractAction abstractAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInternalControlFlowAction(AbstractInternalControlFlowAction abstractInternalControlFlowAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractInternalControlFlowAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractInternalControlFlowAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartAction(StartAction startAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartAction_StartActionPredecessorMustNotBeDefined(startAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StartActionPredecessorMustNotBeDefined constraint of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartAction_StartActionPredecessorMustNotBeDefined(StartAction startAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return startAction.StartActionPredecessorMustNotBeDefined(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopAction(StopAction stopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStopAction_StopActionSuccessorMustNotBeDefined(stopAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StopActionSuccessorMustNotBeDefined constraint of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopAction_StopActionSuccessorMustNotBeDefined(StopAction stopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stopAction.StopActionSuccessorMustNotBeDefined(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalAction_MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalAction_SumOfInternalActionFailureProbabilitiesMustNotExceed1(internalAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction_MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalAction.MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(diagnostics, context);
	}

	/**
	 * Validates the SumOfInternalActionFailureProbabilitiesMustNotExceed1 constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction_SumOfInternalActionFailureProbabilitiesMustNotExceed1(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return internalAction.SumOfInternalActionFailureProbabilitiesMustNotExceed1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branchAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranchAction_EitherGuardedBranchesOrProbabilisiticBranchTransitions(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranchAction_AllProbabilisticBranchProbabilitiesMustSumUpTo1(branchAction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EitherGuardedBranchesOrProbabilisiticBranchTransitions constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction_EitherGuardedBranchesOrProbabilisiticBranchTransitions(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return branchAction.EitherGuardedBranchesOrProbabilisiticBranchTransitions(diagnostics, context);
	}

	/**
	 * Validates the AllProbabilisticBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction_AllProbabilisticBranchProbabilitiesMustSumUpTo1(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return branchAction.AllProbabilisticBranchProbabilitiesMustSumUpTo1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractBranchTransition(AbstractBranchTransition abstractBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkAction(ForkAction forkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(forkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkedBehaviour(ForkedBehaviour forkedBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkedBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_ExactlyOneStopAction(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_ExactlyOneStartAction(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviour_EachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(forkedBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronisationPoint(SynchronisationPoint synchronisationPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synchronisationPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(synchronisationPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractLoopAction(AbstractLoopAction abstractLoopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractLoopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractLoopAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopAction(LoopAction loopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loopAction, diagnostics, context);
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

} //SeffValidator
