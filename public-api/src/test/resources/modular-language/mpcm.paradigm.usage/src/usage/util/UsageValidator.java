/**
 */
package usage.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import usage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see usage.UsagePackage
 * @generated
 */
public class UsageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UsageValidator INSTANCE = new UsageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "usage";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestart' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTART = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exactlyonestop' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__EXACTLYONESTOP = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Eachuseractionexcept Startand Stopmusthaveapredecessorandsuccessor' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Has No Predecessor' of 'Start'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int START__START_HAS_NO_PREDECESSOR = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Has No Successor' of 'Stop'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STOP__STOP_HAS_NO_SUCCESSOR = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Branch Probabilities Must Sum Up To1' of 'Branch'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BRANCH__ALL_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1 = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

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
	public UsageValidator() {
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
	  return UsagePackage.eINSTANCE;
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
			case UsagePackage.SCENARIO_BEHAVIOUR:
				return validateScenarioBehaviour((ScenarioBehaviour)value, diagnostics, context);
			case UsagePackage.ABSTRACT_USER_ACTION:
				return validateAbstractUserAction((AbstractUserAction)value, diagnostics, context);
			case UsagePackage.START:
				return validateStart((Start)value, diagnostics, context);
			case UsagePackage.STOP:
				return validateStop((Stop)value, diagnostics, context);
			case UsagePackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case UsagePackage.BRANCH_TRANSITION:
				return validateBranchTransition((BranchTransition)value, diagnostics, context);
			case UsagePackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case UsagePackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scenarioBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestart(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_Exactlyonestop(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(scenarioBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Exactlyonestart constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_Exactlyonestart(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.Exactlyonestart(diagnostics, context);
	}

	/**
	 * Validates the Exactlyonestop constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_Exactlyonestop(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.Exactlyonestop(diagnostics, context);
	}

	/**
	 * Validates the EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractUserAction(AbstractUserAction abstractUserAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractUserAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractUserAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateStart_StartHasNoPredecessor(start, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StartHasNoPredecessor constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart_StartHasNoPredecessor(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return start.StartHasNoPredecessor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateStop_StopHasNoSuccessor(stop, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StopHasNoSuccessor constraint of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop_StopHasNoSuccessor(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stop.StopHasNoSuccessor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_AllBranchProbabilitiesMustSumUpTo1(branch, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_AllBranchProbabilitiesMustSumUpTo1(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return branch.AllBranchProbabilitiesMustSumUpTo1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchTransition(BranchTransition branchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branchTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(delay, diagnostics, context);
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

} //UsageValidator
