/**
 */
package behaviourseff.impl;

import behaviourseff.AcquireAction;
import behaviourseff.BehaviourseffPackage;

import behaviourseff.util.BehaviourseffValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import seff.impl.AbstractInternalControlFlowActionImpl;

import softwarerepository.PassiveResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.impl.AcquireActionImpl#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireActionImpl extends AbstractInternalControlFlowActionImpl implements AcquireAction {
	/**
	 * The cached value of the '{@link #getPassiveresource_AcquireAction() <em>Passiveresource Acquire Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveresource_AcquireAction()
	 * @generated
	 * @ordered
	 */
	protected PassiveResource passiveresource_AcquireAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourseffPackage.Literals.ACQUIRE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource getPassiveresource_AcquireAction() {
		if (passiveresource_AcquireAction != null && passiveresource_AcquireAction.eIsProxy()) {
			InternalEObject oldPassiveresource_AcquireAction = (InternalEObject)passiveresource_AcquireAction;
			passiveresource_AcquireAction = (PassiveResource)eResolveProxy(oldPassiveresource_AcquireAction);
			if (passiveresource_AcquireAction != oldPassiveresource_AcquireAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION, oldPassiveresource_AcquireAction, passiveresource_AcquireAction));
			}
		}
		return passiveresource_AcquireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource basicGetPassiveresource_AcquireAction() {
		return passiveresource_AcquireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveresource_AcquireAction(PassiveResource newPassiveresource_AcquireAction) {
		PassiveResource oldPassiveresource_AcquireAction = passiveresource_AcquireAction;
		passiveresource_AcquireAction = newPassiveresource_AcquireAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION, oldPassiveresource_AcquireAction, passiveresource_AcquireAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TimeoutValueOfAcquireActionMustNotBeNegative(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BehaviourseffValidator.DIAGNOSTIC_SOURCE,
						 BehaviourseffValidator.ACQUIRE_ACTION__TIMEOUT_VALUE_OF_ACQUIRE_ACTION_MUST_NOT_BE_NEGATIVE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimeoutValueOfAcquireActionMustNotBeNegative", EObjectValidator.getObjectLabel(this, context) }),
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				if (resolve) return getPassiveresource_AcquireAction();
				return basicGetPassiveresource_AcquireAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				setPassiveresource_AcquireAction((PassiveResource)newValue);
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
			case BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				setPassiveresource_AcquireAction((PassiveResource)null);
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
			case BehaviourseffPackage.ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				return passiveresource_AcquireAction != null;
		}
		return super.eIsSet(featureID);
	}

} //AcquireActionImpl
