/**
 */
package behaviourseff.impl;

import behaviourseff.BehaviourseffPackage;
import behaviourseff.CallAction;
import behaviourseff.CallReturnAction;
import behaviourseff.ExternalCallAction;

import behaviourseff.util.BehaviourseffValidator;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import seff.impl.AbstractActionImpl;

import softwarerepository.OperationRequiredRole;
import softwarerepository.OperationSignature;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.impl.ExternalCallActionImpl#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 *   <li>{@link behaviourseff.impl.ExternalCallActionImpl#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}</li>
 *   <li>{@link behaviourseff.impl.ExternalCallActionImpl#getCalledService_ExternalService <em>Called Service External Service</em>}</li>
 *   <li>{@link behaviourseff.impl.ExternalCallActionImpl#getRole_ExternalService <em>Role External Service</em>}</li>
 *   <li>{@link behaviourseff.impl.ExternalCallActionImpl#getRetryCount <em>Retry Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallActionImpl extends AbstractActionImpl implements ExternalCallAction {
	/**
	 * The cached value of the '{@link #getInputVariableUsages__CallAction() <em>Input Variable Usages Call Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariableUsages__CallAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> inputVariableUsages__CallAction;

	/**
	 * The cached value of the '{@link #getReturnVariableUsage__CallReturnAction() <em>Return Variable Usage Call Return Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVariableUsage__CallReturnAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> returnVariableUsage__CallReturnAction;

	/**
	 * The cached value of the '{@link #getCalledService_ExternalService() <em>Called Service External Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledService_ExternalService()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature calledService_ExternalService;

	/**
	 * The cached value of the '{@link #getRole_ExternalService() <em>Role External Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_ExternalService()
	 * @generated
	 * @ordered
	 */
	protected OperationRequiredRole role_ExternalService;

	/**
	 * The default value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetryCount() <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryCount()
	 * @generated
	 * @ordered
	 */
	protected int retryCount = RETRY_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourseffPackage.Literals.EXTERNAL_CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getInputVariableUsages__CallAction() {
		if (inputVariableUsages__CallAction == null) {
			inputVariableUsages__CallAction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION);
		}
		return inputVariableUsages__CallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getReturnVariableUsage__CallReturnAction() {
		if (returnVariableUsage__CallReturnAction == null) {
			returnVariableUsage__CallReturnAction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION);
		}
		return returnVariableUsage__CallReturnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getCalledService_ExternalService() {
		if (calledService_ExternalService != null && calledService_ExternalService.eIsProxy()) {
			InternalEObject oldCalledService_ExternalService = (InternalEObject)calledService_ExternalService;
			calledService_ExternalService = (OperationSignature)eResolveProxy(oldCalledService_ExternalService);
			if (calledService_ExternalService != oldCalledService_ExternalService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE, oldCalledService_ExternalService, calledService_ExternalService));
			}
		}
		return calledService_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetCalledService_ExternalService() {
		return calledService_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledService_ExternalService(OperationSignature newCalledService_ExternalService) {
		OperationSignature oldCalledService_ExternalService = calledService_ExternalService;
		calledService_ExternalService = newCalledService_ExternalService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE, oldCalledService_ExternalService, calledService_ExternalService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole getRole_ExternalService() {
		if (role_ExternalService != null && role_ExternalService.eIsProxy()) {
			InternalEObject oldRole_ExternalService = (InternalEObject)role_ExternalService;
			role_ExternalService = (OperationRequiredRole)eResolveProxy(oldRole_ExternalService);
			if (role_ExternalService != oldRole_ExternalService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE, oldRole_ExternalService, role_ExternalService));
			}
		}
		return role_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole basicGetRole_ExternalService() {
		return role_ExternalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_ExternalService(OperationRequiredRole newRole_ExternalService) {
		OperationRequiredRole oldRole_ExternalService = role_ExternalService;
		role_ExternalService = newRole_ExternalService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE, oldRole_ExternalService, role_ExternalService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryCount() {
		return retryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryCount(int newRetryCount) {
		int oldRetryCount = retryCount;
		retryCount = newRetryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT, oldRetryCount, retryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SignatureBelongsToRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BehaviourseffValidator.EXTERNAL_CALL_ACTION__SIGNATURE_BELONGS_TO_ROLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignatureBelongsToRole", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean OperationRequiredRoleMustBeReferencedByContainer(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BehaviourseffValidator.EXTERNAL_CALL_ACTION__OPERATION_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_CONTAINER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OperationRequiredRoleMustBeReferencedByContainer", EObjectValidator.getObjectLabel(this, context) }),
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
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return ((InternalEList<?>)getInputVariableUsages__CallAction()).basicRemove(otherEnd, msgs);
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
				return ((InternalEList<?>)getReturnVariableUsage__CallReturnAction()).basicRemove(otherEnd, msgs);
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
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return getInputVariableUsages__CallAction();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
				return getReturnVariableUsage__CallReturnAction();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				if (resolve) return getCalledService_ExternalService();
				return basicGetCalledService_ExternalService();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				if (resolve) return getRole_ExternalService();
				return basicGetRole_ExternalService();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				return getRetryCount();
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
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				getInputVariableUsages__CallAction().clear();
				getInputVariableUsages__CallAction().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
				getReturnVariableUsage__CallReturnAction().clear();
				getReturnVariableUsage__CallReturnAction().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				setCalledService_ExternalService((OperationSignature)newValue);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				setRole_ExternalService((OperationRequiredRole)newValue);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				setRetryCount((Integer)newValue);
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
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				getInputVariableUsages__CallAction().clear();
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
				getReturnVariableUsage__CallReturnAction().clear();
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				setCalledService_ExternalService((OperationSignature)null);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				setRole_ExternalService((OperationRequiredRole)null);
				return;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				setRetryCount(RETRY_COUNT_EDEFAULT);
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
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return inputVariableUsages__CallAction != null && !inputVariableUsages__CallAction.isEmpty();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION:
				return returnVariableUsage__CallReturnAction != null && !returnVariableUsage__CallReturnAction.isEmpty();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE:
				return calledService_ExternalService != null;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE:
				return role_ExternalService != null;
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETRY_COUNT:
				return retryCount != RETRY_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CallAction.class) {
			switch (derivedFeatureID) {
				case BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION: return BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;
				default: return -1;
			}
		}
		if (baseClass == CallReturnAction.class) {
			switch (derivedFeatureID) {
				case BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION: return BehaviourseffPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CallAction.class) {
			switch (baseFeatureID) {
				case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION: return BehaviourseffPackage.EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;
				default: return -1;
			}
		}
		if (baseClass == CallReturnAction.class) {
			switch (baseFeatureID) {
				case BehaviourseffPackage.CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION: return BehaviourseffPackage.EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (retryCount: ");
		result.append(retryCount);
		result.append(')');
		return result.toString();
	}

} //ExternalCallActionImpl
