/**
 */
package reliability.failuretypes.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import reliability.failuretypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see reliability.failuretypes.FailuretypesPackage
 * @generated
 */
public class FailuretypesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FailuretypesValidator INSTANCE = new FailuretypesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "reliability.failuretypes";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Network Induced Failure Type Has Communication Link Resource Type' of 'Network Induced Failure Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK_INDUCED_FAILURE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_HAS_COMMUNICATION_LINK_RESOURCE_TYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hardware Induced Failure Type Has Processing Resource Type' of 'Hardware Induced Failure Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HARDWARE_INDUCED_FAILURE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_HAS_PROCESSING_RESOURCE_TYPE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

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
	public FailuretypesValidator() {
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
	  return FailuretypesPackage.eINSTANCE;
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT:
				return validateFailureTypesRoot((FailureTypesRoot)value, diagnostics, context);
			case FailuretypesPackage.FAILURE_TYPE:
				return validateFailureType((FailureType)value, diagnostics, context);
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE:
				return validateNetworkInducedFailureType((NetworkInducedFailureType)value, diagnostics, context);
			case FailuretypesPackage.HARDWARE_INDUCED_FAILURE_TYPE:
				return validateHardwareInducedFailureType((HardwareInducedFailureType)value, diagnostics, context);
			case FailuretypesPackage.SOFTWARE_INDUCED_FAILURE_TYPE:
				return validateSoftwareInducedFailureType((SoftwareInducedFailureType)value, diagnostics, context);
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE:
				return validateResourceTimeoutFailureType((ResourceTimeoutFailureType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureTypesRoot(FailureTypesRoot failureTypesRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(failureTypesRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureType(FailureType failureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(failureType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInducedFailureType(NetworkInducedFailureType networkInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkInducedFailureType_NetworkInducedFailureTypeHasCommunicationLinkResourceType(networkInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NetworkInducedFailureTypeHasCommunicationLinkResourceType constraint of '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInducedFailureType_NetworkInducedFailureTypeHasCommunicationLinkResourceType(NetworkInducedFailureType networkInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkInducedFailureType.NetworkInducedFailureTypeHasCommunicationLinkResourceType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareInducedFailureType(HardwareInducedFailureType hardwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hardwareInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validateHardwareInducedFailureType_HardwareInducedFailureTypeHasProcessingResourceType(hardwareInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HardwareInducedFailureTypeHasProcessingResourceType constraint of '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareInducedFailureType_HardwareInducedFailureTypeHasProcessingResourceType(HardwareInducedFailureType hardwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hardwareInducedFailureType.HardwareInducedFailureTypeHasProcessingResourceType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareInducedFailureType(SoftwareInducedFailureType softwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(softwareInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(softwareInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTimeoutFailureType(ResourceTimeoutFailureType resourceTimeoutFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceTimeoutFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceTimeoutFailureType, diagnostics, context);
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

} //FailuretypesValidator
