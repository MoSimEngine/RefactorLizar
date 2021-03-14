/**
 */
package reliability.failuretypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reliability.failuretypes.FailuretypesPackage;
import reliability.failuretypes.ResourceTimeoutFailureType;

import softwarerepository.PassiveResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Timeout Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.impl.ResourceTimeoutFailureTypeImpl#getPassiveResource__ResourceTimeoutFailureType <em>Passive Resource Resource Timeout Failure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceTimeoutFailureTypeImpl extends SoftwareInducedFailureTypeImpl implements ResourceTimeoutFailureType {
	/**
	 * The cached value of the '{@link #getPassiveResource__ResourceTimeoutFailureType() <em>Passive Resource Resource Timeout Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveResource__ResourceTimeoutFailureType()
	 * @generated
	 * @ordered
	 */
	protected PassiveResource passiveResource__ResourceTimeoutFailureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTimeoutFailureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailuretypesPackage.Literals.RESOURCE_TIMEOUT_FAILURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource getPassiveResource__ResourceTimeoutFailureType() {
		if (passiveResource__ResourceTimeoutFailureType != null && passiveResource__ResourceTimeoutFailureType.eIsProxy()) {
			InternalEObject oldPassiveResource__ResourceTimeoutFailureType = (InternalEObject)passiveResource__ResourceTimeoutFailureType;
			passiveResource__ResourceTimeoutFailureType = (PassiveResource)eResolveProxy(oldPassiveResource__ResourceTimeoutFailureType);
			if (passiveResource__ResourceTimeoutFailureType != oldPassiveResource__ResourceTimeoutFailureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, oldPassiveResource__ResourceTimeoutFailureType, passiveResource__ResourceTimeoutFailureType));
			}
		}
		return passiveResource__ResourceTimeoutFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource basicGetPassiveResource__ResourceTimeoutFailureType() {
		return passiveResource__ResourceTimeoutFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveResource__ResourceTimeoutFailureType(PassiveResource newPassiveResource__ResourceTimeoutFailureType) {
		PassiveResource oldPassiveResource__ResourceTimeoutFailureType = passiveResource__ResourceTimeoutFailureType;
		passiveResource__ResourceTimeoutFailureType = newPassiveResource__ResourceTimeoutFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE, oldPassiveResource__ResourceTimeoutFailureType, passiveResource__ResourceTimeoutFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
				if (resolve) return getPassiveResource__ResourceTimeoutFailureType();
				return basicGetPassiveResource__ResourceTimeoutFailureType();
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
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
				setPassiveResource__ResourceTimeoutFailureType((PassiveResource)newValue);
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
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
				setPassiveResource__ResourceTimeoutFailureType((PassiveResource)null);
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
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE:
				return passiveResource__ResourceTimeoutFailureType != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceTimeoutFailureTypeImpl
