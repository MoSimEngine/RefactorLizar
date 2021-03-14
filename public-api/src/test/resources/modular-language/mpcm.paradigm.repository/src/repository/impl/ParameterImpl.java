/**
 */
package repository.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import repository.Parameter;
import repository.ParameterModifier;
import repository.RepositoryPackage;

import repository.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.ParameterImpl#getDataType__Parameter <em>Data Type Parameter</em>}</li>
 *   <li>{@link repository.impl.ParameterImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link repository.impl.ParameterImpl#getModifier__Parameter <em>Modifier Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The cached value of the '{@link #getDataType__Parameter() <em>Data Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType__Parameter()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType__Parameter;

	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected String parameterName = PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier__Parameter() <em>Modifier Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier__Parameter()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterModifier MODIFIER_PARAMETER_EDEFAULT = ParameterModifier.NONE;

	/**
	 * The cached value of the '{@link #getModifier__Parameter() <em>Modifier Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier__Parameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterModifier modifier__Parameter = MODIFIER_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType__Parameter() {
		if (dataType__Parameter != null && dataType__Parameter.eIsProxy()) {
			InternalEObject oldDataType__Parameter = (InternalEObject)dataType__Parameter;
			dataType__Parameter = (DataType)eResolveProxy(oldDataType__Parameter);
			if (dataType__Parameter != oldDataType__Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER, oldDataType__Parameter, dataType__Parameter));
			}
		}
		return dataType__Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType__Parameter() {
		return dataType__Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType__Parameter(DataType newDataType__Parameter) {
		DataType oldDataType__Parameter = dataType__Parameter;
		dataType__Parameter = newDataType__Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER, oldDataType__Parameter, dataType__Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterName(String newParameterName) {
		String oldParameterName = parameterName;
		parameterName = newParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PARAMETER__PARAMETER_NAME, oldParameterName, parameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterModifier getModifier__Parameter() {
		return modifier__Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifier__Parameter(ParameterModifier newModifier__Parameter) {
		ParameterModifier oldModifier__Parameter = modifier__Parameter;
		modifier__Parameter = newModifier__Parameter == null ? MODIFIER_PARAMETER_EDEFAULT : newModifier__Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.PARAMETER__MODIFIER_PARAMETER, oldModifier__Parameter, modifier__Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER:
				if (resolve) return getDataType__Parameter();
				return basicGetDataType__Parameter();
			case RepositoryPackage.PARAMETER__PARAMETER_NAME:
				return getParameterName();
			case RepositoryPackage.PARAMETER__MODIFIER_PARAMETER:
				return getModifier__Parameter();
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
			case RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER:
				setDataType__Parameter((DataType)newValue);
				return;
			case RepositoryPackage.PARAMETER__PARAMETER_NAME:
				setParameterName((String)newValue);
				return;
			case RepositoryPackage.PARAMETER__MODIFIER_PARAMETER:
				setModifier__Parameter((ParameterModifier)newValue);
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
			case RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER:
				setDataType__Parameter((DataType)null);
				return;
			case RepositoryPackage.PARAMETER__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
				return;
			case RepositoryPackage.PARAMETER__MODIFIER_PARAMETER:
				setModifier__Parameter(MODIFIER_PARAMETER_EDEFAULT);
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
			case RepositoryPackage.PARAMETER__DATA_TYPE_PARAMETER:
				return dataType__Parameter != null;
			case RepositoryPackage.PARAMETER__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
			case RepositoryPackage.PARAMETER__MODIFIER_PARAMETER:
				return modifier__Parameter != MODIFIER_PARAMETER_EDEFAULT;
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
		result.append(" (parameterName: ");
		result.append(parameterName);
		result.append(", modifier__Parameter: ");
		result.append(modifier__Parameter);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
