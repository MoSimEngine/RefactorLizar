/**
 */
package performanceannotations;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SystemSpecifiedExecutionTime allows software architect and performance analysts to specify the response time (distribution) of services called at the system boundaries. This allows abstracting from the system externals and restricts the focus to the software architecture under consideration.
 * 
 * Note:
 * - That's the starting point for Performance-Kennlinien I guess...
 * <!-- end-model-doc -->
 *
 *
 * @see performanceannotations.PerformanceannotationsPackage#getSystemServiceExecutionTime()
 * @model
 * @generated
 */
public interface SystemServiceExecutionTime extends ServiceExecutionTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(mpcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(mpcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(mpcm::system::System))\r\n'"
	 * @generated
	 */
	boolean SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SystemServiceExecutionTime
