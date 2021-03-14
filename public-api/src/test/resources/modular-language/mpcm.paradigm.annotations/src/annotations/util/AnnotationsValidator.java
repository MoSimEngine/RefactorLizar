/**
 */
package annotations.util;

import annotations.*;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AnnotationsValidator INSTANCE = new AnnotationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "annotations";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiple Reliability Annotations Per External Call Not Allowed' of 'Annotation Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANNOTATION_ROOT__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED = 1;

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
	public AnnotationsValidator() {
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
	  return AnnotationsPackage.eINSTANCE;
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
			case AnnotationsPackage.ANNOTATION_ROOT:
				return validateAnnotationRoot((AnnotationRoot)value, diagnostics, context);
			case AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION:
				return validateServicePropertyAnnotation((ServicePropertyAnnotation)value, diagnostics, context);
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION:
				return validateServiceOutputParameterAbstraction((ServiceOutputParameterAbstraction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationRoot(AnnotationRoot annotationRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(annotationRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(annotationRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnnotationRoot_MultipleReliabilityAnnotationsPerExternalCallNotAllowed(annotationRoot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MultipleReliabilityAnnotationsPerExternalCallNotAllowed constraint of '<em>Annotation Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationRoot_MultipleReliabilityAnnotationsPerExternalCallNotAllowed(AnnotationRoot annotationRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return annotationRoot.MultipleReliabilityAnnotationsPerExternalCallNotAllowed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePropertyAnnotation(ServicePropertyAnnotation servicePropertyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servicePropertyAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOutputParameterAbstraction(ServiceOutputParameterAbstraction serviceOutputParameterAbstraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceOutputParameterAbstraction, diagnostics, context);
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

} //AnnotationsValidator
