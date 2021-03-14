/**
 */
package softwareusage.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import softwareusage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see softwareusage.SoftwareusagePackage
 * @generated
 */
public class SoftwareusageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SoftwareusageValidator INSTANCE = new SoftwareusageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "softwareusage";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inter Arrival Time In Open Workload Needs To Be Specified' of 'Open Workload'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OPEN_WORKLOAD__INTER_ARRIVAL_TIME_IN_OPEN_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Population In Closed Workload Needs To Be Specified' of 'Closed Workload'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOSED_WORKLOAD__POPULATION_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Think Time In Closed Workload Needs To Be Specified' of 'Closed Workload'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOSED_WORKLOAD__THINK_TIME_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Level System Call Must Reference Provided Role Of ASystem' of 'Entry Level System Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_MUST_REFERENCE_PROVIDED_ROLE_OF_ASYSTEM = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entry Level System Call Signature Must Match Its Provided Role' of 'Entry Level System Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_SIGNATURE_MUST_MATCH_ITS_PROVIDED_ROLE = 5;

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
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareusageValidator() {
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
	  return SoftwareusagePackage.eINSTANCE;
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
			case SoftwareusagePackage.USAGE_MODEL:
				return validateUsageModel((UsageModel)value, diagnostics, context);
			case SoftwareusagePackage.USER_DATA:
				return validateUserData((UserData)value, diagnostics, context);
			case SoftwareusagePackage.USAGE_SCENARIO:
				return validateUsageScenario((UsageScenario)value, diagnostics, context);
			case SoftwareusagePackage.WORKLOAD:
				return validateWorkload((Workload)value, diagnostics, context);
			case SoftwareusagePackage.OPEN_WORKLOAD:
				return validateOpenWorkload((OpenWorkload)value, diagnostics, context);
			case SoftwareusagePackage.CLOSED_WORKLOAD:
				return validateClosedWorkload((ClosedWorkload)value, diagnostics, context);
			case SoftwareusagePackage.ENTRY_LEVEL_SYSTEM_CALL:
				return validateEntryLevelSystemCall((EntryLevelSystemCall)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageModel(UsageModel usageModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserData(UserData userData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageScenario(UsageScenario usageScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usageScenario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(usageScenario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkload(Workload workload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenWorkload(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(openWorkload, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpenWorkload_InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(openWorkload, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InterArrivalTimeInOpenWorkloadNeedsToBeSpecified constraint of '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenWorkload_InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return openWorkload.InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(closedWorkload, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateClosedWorkload_PopulationInClosedWorkloadNeedsToBeSpecified(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateClosedWorkload_ThinkTimeInClosedWorkloadNeedsToBeSpecified(closedWorkload, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PopulationInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload_PopulationInClosedWorkloadNeedsToBeSpecified(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return closedWorkload.PopulationInClosedWorkloadNeedsToBeSpecified(diagnostics, context);
	}

	/**
	 * Validates the ThinkTimeInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload_ThinkTimeInClosedWorkloadNeedsToBeSpecified(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return closedWorkload.ThinkTimeInClosedWorkloadNeedsToBeSpecified(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entryLevelSystemCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryLevelSystemCall_EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryLevelSystemCall_EntryLevelSystemCallSignatureMustMatchItsProvidedRole(entryLevelSystemCall, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EntryLevelSystemCallMustReferenceProvidedRoleOfASystem constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall_EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entryLevelSystemCall.EntryLevelSystemCallMustReferenceProvidedRoleOfASystem(diagnostics, context);
	}

	/**
	 * Validates the EntryLevelSystemCallSignatureMustMatchItsProvidedRole constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall_EntryLevelSystemCallSignatureMustMatchItsProvidedRole(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entryLevelSystemCall.EntryLevelSystemCallSignatureMustMatchItsProvidedRole(diagnostics, context);
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

} //SoftwareusageValidator
