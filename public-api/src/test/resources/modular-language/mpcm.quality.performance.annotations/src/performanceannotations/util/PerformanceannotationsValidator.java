/**
 */
package performanceannotations.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import performanceannotations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see performanceannotations.PerformanceannotationsPackage
 * @generated
 */
public class PerformanceannotationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PerformanceannotationsValidator INSTANCE = new PerformanceannotationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "performanceannotations";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Specified Execution Time Must Reference Required Role Of ASystem' of 'System Service Execution Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SYSTEM_SERVICE_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM = 1;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceannotationsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PerformanceannotationsPackage.eINSTANCE;
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
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME:
				return validateServiceExecutionTime((ServiceExecutionTime)value, diagnostics, context);
			case PerformanceannotationsPackage.SYSTEM_SERVICE_EXECUTION_TIME:
				return validateSystemServiceExecutionTime((SystemServiceExecutionTime)value, diagnostics, context);
			case PerformanceannotationsPackage.COMPONENT_SERVICE_EXECUTION_TIME:
				return validateComponentServiceExecutionTime((ComponentServiceExecutionTime)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceExecutionTime(ServiceExecutionTime serviceExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceExecutionTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemServiceExecutionTime(SystemServiceExecutionTime systemServiceExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemServiceExecutionTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemServiceExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemServiceExecutionTime_SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(systemServiceExecutionTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem constraint of '<em>System Service Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemServiceExecutionTime_SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(SystemServiceExecutionTime systemServiceExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return systemServiceExecutionTime.SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentServiceExecutionTime(ComponentServiceExecutionTime componentServiceExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentServiceExecutionTime, diagnostics, context);
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

} //PerformanceannotationsValidator
