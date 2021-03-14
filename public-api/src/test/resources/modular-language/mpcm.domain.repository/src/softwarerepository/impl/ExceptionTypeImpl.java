/**
 */
package softwarerepository.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import softwarerepository.ExceptionType;
import softwarerepository.SoftwarerepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.impl.ExceptionTypeImpl#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link softwarerepository.impl.ExceptionTypeImpl#getExceptionMessage <em>Exception Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionTypeImpl extends MinimalEObjectImpl.Container implements ExceptionType {
	/**
	 * The default value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionName() <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionName()
	 * @generated
	 * @ordered
	 */
	protected String exceptionName = EXCEPTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionMessage() <em>Exception Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionMessage() <em>Exception Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionMessage()
	 * @generated
	 * @ordered
	 */
	protected String exceptionMessage = EXCEPTION_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarerepositoryPackage.Literals.EXCEPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionName() {
		return exceptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionName(String newExceptionName) {
		String oldExceptionName = exceptionName;
		exceptionName = newExceptionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_NAME, oldExceptionName, exceptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionMessage(String newExceptionMessage) {
		String oldExceptionMessage = exceptionMessage;
		exceptionMessage = newExceptionMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_MESSAGE, oldExceptionMessage, exceptionMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_NAME:
				return getExceptionName();
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_MESSAGE:
				return getExceptionMessage();
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
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_NAME:
				setExceptionName((String)newValue);
				return;
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_MESSAGE:
				setExceptionMessage((String)newValue);
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
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_NAME:
				setExceptionName(EXCEPTION_NAME_EDEFAULT);
				return;
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_MESSAGE:
				setExceptionMessage(EXCEPTION_MESSAGE_EDEFAULT);
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
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_NAME:
				return EXCEPTION_NAME_EDEFAULT == null ? exceptionName != null : !EXCEPTION_NAME_EDEFAULT.equals(exceptionName);
			case SoftwarerepositoryPackage.EXCEPTION_TYPE__EXCEPTION_MESSAGE:
				return EXCEPTION_MESSAGE_EDEFAULT == null ? exceptionMessage != null : !EXCEPTION_MESSAGE_EDEFAULT.equals(exceptionMessage);
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
		result.append(" (exceptionName: ");
		result.append(exceptionName);
		result.append(", exceptionMessage: ");
		result.append(exceptionMessage);
		result.append(')');
		return result.toString();
	}

} //ExceptionTypeImpl
