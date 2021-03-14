/**
 */
package infrastructure.seff.impl;

import behaviourseff.impl.CallActionImpl;

import infrastructure.repository.InfrastructureRequiredRole;
import infrastructure.repository.InfrastructureSignature;

import infrastructure.seff.InfrastructureCall;
import infrastructure.seff.SeffPackage;

import infrastructure.seff.util.SeffValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import seff.AbstractInternalControlFlowAction;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.seff.impl.InfrastructureCallImpl#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.impl.InfrastructureCallImpl#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.impl.InfrastructureCallImpl#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.impl.InfrastructureCallImpl#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureCallImpl extends CallActionImpl implements InfrastructureCall {
	/**
	 * The cached value of the '{@link #getSignature__InfrastructureCall() <em>Signature Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureSignature signature__InfrastructureCall;

	/**
	 * The cached value of the '{@link #getNumberOfCalls__InfrastructureCall() <em>Number Of Calls Infrastructure Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCalls__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable numberOfCalls__InfrastructureCall;

	/**
	 * The cached value of the '{@link #getAction__InfrastructureCall() <em>Action Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected AbstractInternalControlFlowAction action__InfrastructureCall;

	/**
	 * The cached value of the '{@link #getRequiredRole__InfrastructureCall() <em>Required Role Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRequiredRole requiredRole__InfrastructureCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.INFRASTRUCTURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSignature getSignature__InfrastructureCall() {
		if (signature__InfrastructureCall != null && signature__InfrastructureCall.eIsProxy()) {
			InternalEObject oldSignature__InfrastructureCall = (InternalEObject)signature__InfrastructureCall;
			signature__InfrastructureCall = (InfrastructureSignature)eResolveProxy(oldSignature__InfrastructureCall);
			if (signature__InfrastructureCall != oldSignature__InfrastructureCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
			}
		}
		return signature__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSignature basicGetSignature__InfrastructureCall() {
		return signature__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature__InfrastructureCall(InfrastructureSignature newSignature__InfrastructureCall) {
		InfrastructureSignature oldSignature__InfrastructureCall = signature__InfrastructureCall;
		signature__InfrastructureCall = newSignature__InfrastructureCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getNumberOfCalls__InfrastructureCall() {
		return numberOfCalls__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall, NotificationChain msgs) {
		PCMRandomVariable oldNumberOfCalls__InfrastructureCall = numberOfCalls__InfrastructureCall;
		numberOfCalls__InfrastructureCall = newNumberOfCalls__InfrastructureCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, oldNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall) {
		if (newNumberOfCalls__InfrastructureCall != numberOfCalls__InfrastructureCall) {
			NotificationChain msgs = null;
			if (numberOfCalls__InfrastructureCall != null)
				msgs = ((InternalEObject)numberOfCalls__InfrastructureCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, null, msgs);
			if (newNumberOfCalls__InfrastructureCall != null)
				msgs = ((InternalEObject)newNumberOfCalls__InfrastructureCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, null, msgs);
			msgs = basicSetNumberOfCalls__InfrastructureCall(newNumberOfCalls__InfrastructureCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, newNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction getAction__InfrastructureCall() {
		if (action__InfrastructureCall != null && action__InfrastructureCall.eIsProxy()) {
			InternalEObject oldAction__InfrastructureCall = (InternalEObject)action__InfrastructureCall;
			action__InfrastructureCall = (AbstractInternalControlFlowAction)eResolveProxy(oldAction__InfrastructureCall);
			if (action__InfrastructureCall != oldAction__InfrastructureCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, oldAction__InfrastructureCall, action__InfrastructureCall));
			}
		}
		return action__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction basicGetAction__InfrastructureCall() {
		return action__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction__InfrastructureCall(AbstractInternalControlFlowAction newAction__InfrastructureCall) {
		AbstractInternalControlFlowAction oldAction__InfrastructureCall = action__InfrastructureCall;
		action__InfrastructureCall = newAction__InfrastructureCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, oldAction__InfrastructureCall, action__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRequiredRole getRequiredRole__InfrastructureCall() {
		if (requiredRole__InfrastructureCall != null && requiredRole__InfrastructureCall.eIsProxy()) {
			InternalEObject oldRequiredRole__InfrastructureCall = (InternalEObject)requiredRole__InfrastructureCall;
			requiredRole__InfrastructureCall = (InfrastructureRequiredRole)eResolveProxy(oldRequiredRole__InfrastructureCall);
			if (requiredRole__InfrastructureCall != oldRequiredRole__InfrastructureCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
			}
		}
		return requiredRole__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRequiredRole basicGetRequiredRole__InfrastructureCall() {
		return requiredRole__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole newRequiredRole__InfrastructureCall) {
		InfrastructureRequiredRole oldRequiredRole__InfrastructureCall = requiredRole__InfrastructureCall;
		requiredRole__InfrastructureCall = newRequiredRole__InfrastructureCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SignatureMustBelongToUsedRequiredRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SeffValidator.INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignatureMustBelongToUsedRequiredRole", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ReferencedRequiredRoleMustBeRequiredByComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SeffValidator.INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ReferencedRequiredRoleMustBeRequiredByComponent", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SeffValidator.INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return basicSetNumberOfCalls__InfrastructureCall(null, msgs);
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
			case SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				if (resolve) return getSignature__InfrastructureCall();
				return basicGetSignature__InfrastructureCall();
			case SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return getNumberOfCalls__InfrastructureCall();
			case SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				if (resolve) return getAction__InfrastructureCall();
				return basicGetAction__InfrastructureCall();
			case SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				if (resolve) return getRequiredRole__InfrastructureCall();
				return basicGetRequiredRole__InfrastructureCall();
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
			case SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				setSignature__InfrastructureCall((InfrastructureSignature)newValue);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				setNumberOfCalls__InfrastructureCall((PCMRandomVariable)newValue);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				setAction__InfrastructureCall((AbstractInternalControlFlowAction)newValue);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)newValue);
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
			case SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				setSignature__InfrastructureCall((InfrastructureSignature)null);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				setNumberOfCalls__InfrastructureCall((PCMRandomVariable)null);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				setAction__InfrastructureCall((AbstractInternalControlFlowAction)null);
				return;
			case SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)null);
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
			case SeffPackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				return signature__InfrastructureCall != null;
			case SeffPackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return numberOfCalls__InfrastructureCall != null;
			case SeffPackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				return action__InfrastructureCall != null;
			case SeffPackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				return requiredRole__InfrastructureCall != null;
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureCallImpl
