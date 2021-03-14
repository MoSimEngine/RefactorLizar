/**
 */
package reliability.seff.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import reliability.seff.RecoveryAction;
import reliability.seff.RecoveryActionBehaviour;
import reliability.seff.SeffPackage;

import reliability.seff.util.SeffValidator;

import seff.impl.AbstractInternalControlFlowActionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.impl.RecoveryActionImpl#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}</li>
 *   <li>{@link reliability.seff.impl.RecoveryActionImpl#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecoveryActionImpl extends AbstractInternalControlFlowActionImpl implements RecoveryAction {
	/**
	 * The cached value of the '{@link #getPrimaryBehaviour__RecoveryAction() <em>Primary Behaviour Recovery Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBehaviour__RecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected RecoveryActionBehaviour primaryBehaviour__RecoveryAction;

	/**
	 * The cached value of the '{@link #getRecoveryActionBehaviours__RecoveryAction() <em>Recovery Action Behaviours Recovery Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryActionBehaviours__RecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RecoveryActionBehaviour> recoveryActionBehaviours__RecoveryAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoveryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.RECOVERY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryActionBehaviour getPrimaryBehaviour__RecoveryAction() {
		if (primaryBehaviour__RecoveryAction != null && primaryBehaviour__RecoveryAction.eIsProxy()) {
			InternalEObject oldPrimaryBehaviour__RecoveryAction = (InternalEObject)primaryBehaviour__RecoveryAction;
			primaryBehaviour__RecoveryAction = (RecoveryActionBehaviour)eResolveProxy(oldPrimaryBehaviour__RecoveryAction);
			if (primaryBehaviour__RecoveryAction != oldPrimaryBehaviour__RecoveryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION, oldPrimaryBehaviour__RecoveryAction, primaryBehaviour__RecoveryAction));
			}
		}
		return primaryBehaviour__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryActionBehaviour basicGetPrimaryBehaviour__RecoveryAction() {
		return primaryBehaviour__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour newPrimaryBehaviour__RecoveryAction) {
		RecoveryActionBehaviour oldPrimaryBehaviour__RecoveryAction = primaryBehaviour__RecoveryAction;
		primaryBehaviour__RecoveryAction = newPrimaryBehaviour__RecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION, oldPrimaryBehaviour__RecoveryAction, primaryBehaviour__RecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecoveryActionBehaviour> getRecoveryActionBehaviours__RecoveryAction() {
		if (recoveryActionBehaviours__RecoveryAction == null) {
			recoveryActionBehaviours__RecoveryAction = new EObjectContainmentWithInverseEList<RecoveryActionBehaviour>(RecoveryActionBehaviour.class, this, SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, SeffPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR);
		}
		return recoveryActionBehaviours__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PrimaryBehaviourOfRecoveryActionMustBeSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_OF_RECOVERY_ACTION_MUST_BE_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PrimaryBehaviourOfRecoveryActionMustBeSet", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecoveryActionBehaviours__RecoveryAction()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return ((InternalEList<?>)getRecoveryActionBehaviours__RecoveryAction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				if (resolve) return getPrimaryBehaviour__RecoveryAction();
				return basicGetPrimaryBehaviour__RecoveryAction();
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return getRecoveryActionBehaviours__RecoveryAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				setPrimaryBehaviour__RecoveryAction((RecoveryActionBehaviour)newValue);
				return;
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				getRecoveryActionBehaviours__RecoveryAction().clear();
				getRecoveryActionBehaviours__RecoveryAction().addAll((Collection<? extends RecoveryActionBehaviour>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				setPrimaryBehaviour__RecoveryAction((RecoveryActionBehaviour)null);
				return;
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				getRecoveryActionBehaviours__RecoveryAction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SeffPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				return primaryBehaviour__RecoveryAction != null;
			case SeffPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return recoveryActionBehaviours__RecoveryAction != null && !recoveryActionBehaviours__RecoveryAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecoveryActionImpl
