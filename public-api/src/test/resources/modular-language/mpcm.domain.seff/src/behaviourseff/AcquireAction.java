/**
 */
package behaviourseff;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import seff.AbstractInternalControlFlowAction;

import softwarerepository.PassiveResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     In&nbsp;an&nbsp;RDSEFF,&nbsp;component&nbsp;developers&nbsp;can&nbsp;specify&nbsp;an&nbsp;AcquireAction,&nbsp;which&nbsp;references&nbsp;a&nbsp;passive&nbsp;resource&nbsp;types.&nbsp;Once&nbsp;analysis&nbsp;tools&nbsp;execute&nbsp;this&nbsp;action,&nbsp;they&nbsp;decrease&nbsp;the&nbsp;amount&nbsp;of&nbsp;items&nbsp;available&nbsp;from&nbsp;the&nbsp;referenced&nbsp;passive&nbsp;resource&nbsp;type&nbsp;by&nbsp;one,&nbsp;if&nbsp;at&nbsp;least&nbsp;one&nbsp;item&nbsp;is&nbsp;available.&nbsp;If&nbsp;none&nbsp;item&nbsp;is&nbsp;available,&nbsp;because&nbsp;other,&nbsp;concurrently&nbsp;executed&nbsp;requests&nbsp;have&nbsp;acquired&nbsp;all&nbsp;of&nbsp;them,&nbsp;analysis&nbsp;tools&nbsp;enqueue&nbsp;the&nbsp;current&nbsp;request&nbsp;(first-come-first-serve&nbsp;scheduling&nbsp;policy)&nbsp;and&nbsp;block&nbsp;it's&nbsp;further&nbsp;execution.
 * </p>
 * <p>
 *     Acquisition&nbsp;and&nbsp;release&nbsp;of&nbsp;passive&nbsp;resources&nbsp;happen&nbsp;instantaneously&nbsp;and&nbsp;do&nbsp;not&nbsp;consume&nbsp;any&nbsp;time&nbsp;except&nbsp;for&nbsp;waiting&nbsp;delays&nbsp;before&nbsp;actual&nbsp;acquisition.&nbsp;Resource&nbsp;locking&nbsp;may&nbsp;introduce&nbsp;deadlocks&nbsp;when&nbsp;simulating&nbsp;the&nbsp;model,&nbsp;however,&nbsp;for&nbsp;performance&nbsp;analysis&nbsp;with&nbsp;the&nbsp;PCM&nbsp;it&nbsp;is&nbsp;assumed&nbsp;that&nbsp;no&nbsp;deadlocks&nbsp;occur.&nbsp;Otherwise,&nbsp;the&nbsp;model&nbsp;first&nbsp;needs&nbsp;to&nbsp;be&nbsp;fixed&nbsp;accordingly&nbsp;before&nbsp;carrying&nbsp;out&nbsp;the&nbsp;performance&nbsp;prediction.
 * </p>
 * <p>
 *     A reliability-related extension is the timeout mechanism that may be associated to an AcquireAction through the
 *     "timeout" and "timeoutValue" attributes. See the documentation of the "timeout" attribute for further information.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.AcquireAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}</li>
 * </ul>
 *
 * @see behaviourseff.BehaviourseffPackage#getAcquireAction()
 * @model
 * @generated
 */
public interface AcquireAction extends AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Passiveresource Acquire Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passiveresource Acquire Action</em>' reference.
	 * @see #setPassiveresource_AcquireAction(PassiveResource)
	 * @see behaviourseff.BehaviourseffPackage#getAcquireAction_Passiveresource_AcquireAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PassiveResource getPassiveresource_AcquireAction();

	/**
	 * Sets the value of the '{@link behaviourseff.AcquireAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passiveresource Acquire Action</em>' reference.
	 * @see #getPassiveresource_AcquireAction()
	 * @generated
	 */
	void setPassiveresource_AcquireAction(PassiveResource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.timeoutValue.oclAsType(Real) &gt;= 0.0'"
	 * @generated
	 */
	boolean TimeoutValueOfAcquireActionMustNotBeNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AcquireAction
