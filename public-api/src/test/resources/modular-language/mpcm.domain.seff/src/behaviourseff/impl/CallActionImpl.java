/**
 */
package behaviourseff.impl;

import base.impl.EntityImpl;

import behaviourseff.BehaviourseffPackage;
import behaviourseff.CallAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourseff.impl.CallActionImpl#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallActionImpl extends EntityImpl implements CallAction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourseffPackage.Literals.CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getInputVariableUsages__CallAction() {
		if (inputVariableUsages__CallAction == null) {
			inputVariableUsages__CallAction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION);
		}
		return inputVariableUsages__CallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return ((InternalEList<?>)getInputVariableUsages__CallAction()).basicRemove(otherEnd, msgs);
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
			case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return getInputVariableUsages__CallAction();
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
			case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				getInputVariableUsages__CallAction().clear();
				getInputVariableUsages__CallAction().addAll((Collection<? extends VariableUsage>)newValue);
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
			case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				getInputVariableUsages__CallAction().clear();
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
			case BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION:
				return inputVariableUsages__CallAction != null && !inputVariableUsages__CallAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallActionImpl
