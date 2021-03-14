/**
 */
package resourceinterfaces.seff.util;

import de.uka.ipd.sdq.identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import resourceinterfaces.seff.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see resourceinterfaces.seff.SeffPackage
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
	public static final String DIAGNOSTIC_SOURCE = "resourceinterfaces.seff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Signature Belongs To Resource Required Role' of 'Resource Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_CALL__RESOURCE_SIGNATURE_BELONGS_TO_RESOURCE_REQUIRED_ROLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Required Role Must Be Referenced By Component' of 'Resource Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_COMPONENT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature Role Combination Must Be Unique Within Abstract Internal Control Flow Action' of 'Resource Call'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 3;

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
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT:
				return validateResourceInterfacesSEFFRoot((ResourceInterfacesSEFFRoot)value, diagnostics, context);
			case SeffPackage.RESOURCE_CALL:
				return validateResourceCall((ResourceCall)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceInterfacesSEFFRoot(ResourceInterfacesSEFFRoot resourceInterfacesSEFFRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceInterfacesSEFFRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_ResourceSignatureBelongsToResourceRequiredRole(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_ResourceRequiredRoleMustBeReferencedByComponent(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(resourceCall, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceSignatureBelongsToResourceRequiredRole constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_ResourceSignatureBelongsToResourceRequiredRole(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceCall.ResourceSignatureBelongsToResourceRequiredRole(diagnostics, context);
	}

	/**
	 * Validates the ResourceRequiredRoleMustBeReferencedByComponent constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_ResourceRequiredRoleMustBeReferencedByComponent(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceCall.ResourceRequiredRoleMustBeReferencedByComponent(diagnostics, context);
	}

	/**
	 * Validates the SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceCall.SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(diagnostics, context);
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
