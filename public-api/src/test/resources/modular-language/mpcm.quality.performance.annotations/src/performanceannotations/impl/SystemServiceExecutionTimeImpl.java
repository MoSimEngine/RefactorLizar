/**
 */
package performanceannotations.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import performanceannotations.PerformanceannotationsPackage;
import performanceannotations.SystemServiceExecutionTime;

import performanceannotations.util.PerformanceannotationsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SystemServiceExecutionTimeImpl extends ServiceExecutionTimeImpl implements SystemServiceExecutionTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemServiceExecutionTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformanceannotationsPackage.Literals.SYSTEM_SERVICE_EXECUTION_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PerformanceannotationsValidator.DIAGNOSTIC_SOURCE,
						 PerformanceannotationsValidator.SYSTEM_SERVICE_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

} //SystemServiceExecutionTimeImpl
