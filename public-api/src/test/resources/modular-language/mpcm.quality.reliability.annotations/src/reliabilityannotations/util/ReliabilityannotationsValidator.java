/**
 */
package reliabilityannotations.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import reliability.util.ReliabilityValidator;

import reliabilityannotations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see reliabilityannotations.ReliabilityannotationsPackage
 * @generated
 */
public class ReliabilityannotationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ReliabilityannotationsValidator INSTANCE = new ReliabilityannotationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "reliabilityannotations";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specified Reliability Annotation Must Reference Required Role Of ASystem' of 'Service Reliability Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_RELIABILITY_ANNOTATION__SPECIFIED_RELIABILITY_ANNOTATION_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sum Of Reliability Annotation Failure Probabilities Must Not Exceed1' of 'Service Reliability Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_RELIABILITY_ANNOTATION__SUM_OF_RELIABILITY_ANNOTATION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple External Occurrence Descriptions Per Failure Type Not Allowed' of 'Service Reliability Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_RELIABILITY_ANNOTATION__MULTIPLE_EXTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Resource Timeout Failure Allowed For External Failure Occurrence Description' of 'External Failure Occurrence Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityannotationsValidator() {
		super();
		reliabilityValidator = ReliabilityValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ReliabilityannotationsPackage.eINSTANCE;
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
			case ReliabilityannotationsPackage.SERVICE_RELIABILITY_ANNOTATION:
				return validateServiceReliabilityAnnotation((ServiceReliabilityAnnotation)value, diagnostics, context);
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return validateExternalFailureOccurrenceDescription((ExternalFailureOccurrenceDescription)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceReliabilityAnnotation(ServiceReliabilityAnnotation serviceReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceReliabilityAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceReliabilityAnnotation_SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceReliabilityAnnotation_SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(serviceReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceReliabilityAnnotation_MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(serviceReliabilityAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem constraint of '<em>Service Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceReliabilityAnnotation_SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(ServiceReliabilityAnnotation serviceReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceReliabilityAnnotation.SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(diagnostics, context);
	}

	/**
	 * Validates the SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1 constraint of '<em>Service Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceReliabilityAnnotation_SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(ServiceReliabilityAnnotation serviceReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceReliabilityAnnotation.SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(diagnostics, context);
	}

	/**
	 * Validates the MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Service Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceReliabilityAnnotation_MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(ServiceReliabilityAnnotation serviceReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceReliabilityAnnotation.MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalFailureOccurrenceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= reliabilityValidator.validateFailureOccurrenceDescription_EnsureValidFailureProbabilityRange(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalFailureOccurrenceDescription_NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(externalFailureOccurrenceDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription constraint of '<em>External Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalFailureOccurrenceDescription_NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalFailureOccurrenceDescription.NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(diagnostics, context);
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

} //ReliabilityannotationsValidator
