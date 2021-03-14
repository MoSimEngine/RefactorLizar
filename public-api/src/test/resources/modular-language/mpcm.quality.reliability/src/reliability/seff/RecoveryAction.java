/**
 */
package reliability.seff;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import seff.AbstractInternalControlFlowAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Recover block actions are a generic failure handling technique. A recovery block consists of a a primary algorithm and one
 * or more alternatives that can be used in case of failure. If the primary algorithm fails, the next alternative is chosen.
 * Here the alternatives also support failure types. Alternatives may specify which kind of failures they can handle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}</li>
 *   <li>{@link reliability.seff.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}</li>
 * </ul>
 *
 * @see reliability.seff.SeffPackage#getRecoveryAction()
 * @model
 * @generated
 */
public interface RecoveryAction extends AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Primary Behaviour Recovery Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Behaviour Recovery Action</em>' reference.
	 * @see #setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour)
	 * @see reliability.seff.SeffPackage#getRecoveryAction_PrimaryBehaviour__RecoveryAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RecoveryActionBehaviour getPrimaryBehaviour__RecoveryAction();

	/**
	 * Sets the value of the '{@link reliability.seff.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Behaviour Recovery Action</em>' reference.
	 * @see #getPrimaryBehaviour__RecoveryAction()
	 * @generated
	 */
	void setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour value);

	/**
	 * Returns the value of the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.seff.RecoveryActionBehaviour}.
	 * It is bidirectional and its opposite is '{@link reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action Behaviours Recovery Action</em>' containment reference list.
	 * @see reliability.seff.SeffPackage#getRecoveryAction_RecoveryActionBehaviours__RecoveryAction()
	 * @see reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour
	 * @model opposite="recoveryAction__RecoveryActionBehaviour" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<RecoveryActionBehaviour> getRecoveryActionBehaviours__RecoveryAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.primaryBehaviour__RecoveryAction &lt;&gt; null'"
	 * @generated
	 */
	boolean PrimaryBehaviourOfRecoveryActionMustBeSet(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecoveryAction
