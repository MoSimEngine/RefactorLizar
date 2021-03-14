/**
 */
package reliability.failuretypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reliability.failuretypes.FailureType;
import reliability.failuretypes.FailureTypesRoot;
import reliability.failuretypes.FailuretypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Types Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.impl.FailureTypesRootImpl#getFailureTypes <em>Failure Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureTypesRootImpl extends MinimalEObjectImpl.Container implements FailureTypesRoot {
	/**
	 * The cached value of the '{@link #getFailureTypes() <em>Failure Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureType> failureTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureTypesRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailuretypesPackage.Literals.FAILURE_TYPES_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureType> getFailureTypes() {
		if (failureTypes == null) {
			failureTypes = new EObjectContainmentEList<FailureType>(FailureType.class, this, FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES);
		}
		return failureTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES:
				return ((InternalEList<?>)getFailureTypes()).basicRemove(otherEnd, msgs);
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES:
				return getFailureTypes();
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES:
				getFailureTypes().clear();
				getFailureTypes().addAll((Collection<? extends FailureType>)newValue);
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES:
				getFailureTypes().clear();
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT__FAILURE_TYPES:
				return failureTypes != null && !failureTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureTypesRootImpl
