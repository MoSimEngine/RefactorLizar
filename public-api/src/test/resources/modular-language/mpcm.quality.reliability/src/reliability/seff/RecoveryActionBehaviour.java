/**
 */
package reliability.seff;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import seff.Behaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Recovery block alternative haviours represent alternatives of recovery blocks. They are resource demanding behaviours,
 *     thus any behaviour can be defined as an alternative.
 * </p>
 * <p>
 *     The alternatives of a recovery block form a chain. They are failure handling entities, i.e.&nbsp;they can handle
 *     failures that occur in previous alternatives. If one alternative fails, the next alternative is executed that can
 *     handle the failure type.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}</li>
 *   <li>{@link reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}</li>
 * </ul>
 *
 * @see reliability.seff.SeffPackage#getRecoveryActionBehaviour()
 * @model
 * @generated
 */
public interface RecoveryActionBehaviour extends FailureHandlingEntity, Behaviour {
	/**
	 * Returns the value of the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
	 * The list contents are of type {@link reliability.seff.RecoveryActionBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Handling Alternatives Recovery Action Behaviour</em>' reference list.
	 * @see reliability.seff.SeffPackage#getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RecoveryActionBehaviour> getFailureHandlingAlternatives__RecoveryActionBehaviour();

	/**
	 * Returns the value of the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reliability.seff.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
	 * @see #setRecoveryAction__RecoveryActionBehaviour(RecoveryAction)
	 * @see reliability.seff.SeffPackage#getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour()
	 * @see reliability.seff.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction
	 * @model opposite="recoveryActionBehaviours__RecoveryAction" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RecoveryAction getRecoveryAction__RecoveryActionBehaviour();

	/**
	 * Sets the value of the '{@link reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
	 * @see #getRecoveryAction__RecoveryActionBehaviour()
	 * @generated
	 */
	void setRecoveryAction__RecoveryActionBehaviour(RecoveryAction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.recoveryAction__RecoveryActionBehaviour.recoveryActionBehaviours__RecoveryAction-&gt;\r\n\texists(x,y:RecoveryActionBehaviour | x&lt;&gt;y\r\n\t\tand x.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self)\r\n\t\tand y.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self))'"
	 * @generated
	 */
	boolean RecoveryActionBehaviourHasOnlyOnePredecessor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self)'"
	 * @generated
	 */
	boolean RecoveryActionBehaviourIsNotSuccessorOfItself(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;\r\n\texists(x,y:RecoveryActionBehaviour | x&lt;&gt;y and\r\n\tx.failureTypes_FailureHandlingEntity-&gt;\r\n\t\texists(f:mpcm::reliability::FailureType |\r\n\t\ty.failureTypes_FailureHandlingEntity-&gt;includes(f)))'"
	 * @generated
	 */
	boolean SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecoveryActionBehaviour
