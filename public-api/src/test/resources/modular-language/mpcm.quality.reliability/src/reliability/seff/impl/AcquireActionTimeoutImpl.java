/**
 */
package reliability.seff.impl;

import behaviourseff.AcquireAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reliability.seff.AcquireActionTimeout;
import reliability.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire Action Timeout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.seff.impl.AcquireActionTimeoutImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link reliability.seff.impl.AcquireActionTimeoutImpl#getTimeoutValue <em>Timeout Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireActionTimeoutImpl extends MinimalEObjectImpl.Container implements AcquireActionTimeout {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected AcquireAction owner;

	/**
	 * The default value of the '{@link #getTimeoutValue() <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMEOUT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeoutValue() <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutValue()
	 * @generated
	 * @ordered
	 */
	protected double timeoutValue = TIMEOUT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireActionTimeoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.ACQUIRE_ACTION_TIMEOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireAction getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (AcquireAction)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireAction basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AcquireAction newOwner) {
		AcquireAction oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeoutValue() {
		return timeoutValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutValue(double newTimeoutValue) {
		double oldTimeoutValue = timeoutValue;
		timeoutValue = newTimeoutValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE, oldTimeoutValue, timeoutValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE:
				return getTimeoutValue();
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
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER:
				setOwner((AcquireAction)newValue);
				return;
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE:
				setTimeoutValue((Double)newValue);
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
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER:
				setOwner((AcquireAction)null);
				return;
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE:
				setTimeoutValue(TIMEOUT_VALUE_EDEFAULT);
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
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__OWNER:
				return owner != null;
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE:
				return timeoutValue != TIMEOUT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (timeoutValue: ");
		result.append(timeoutValue);
		result.append(')');
		return result.toString();
	}

} //AcquireActionTimeoutImpl
