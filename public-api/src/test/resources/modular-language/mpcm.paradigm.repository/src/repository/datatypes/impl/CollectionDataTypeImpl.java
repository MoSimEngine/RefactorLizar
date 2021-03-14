/**
 */
package repository.datatypes.impl;

import base.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import repository.datatypes.CollectionDataType;
import repository.datatypes.DataType;
import repository.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.datatypes.impl.CollectionDataTypeImpl#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionDataTypeImpl extends EntityImpl implements CollectionDataType {
	/**
	 * The cached value of the '{@link #getInnerType_CollectionDataType() <em>Inner Type Collection Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerType_CollectionDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType innerType_CollectionDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.COLLECTION_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getInnerType_CollectionDataType() {
		if (innerType_CollectionDataType != null && innerType_CollectionDataType.eIsProxy()) {
			InternalEObject oldInnerType_CollectionDataType = (InternalEObject)innerType_CollectionDataType;
			innerType_CollectionDataType = (DataType)eResolveProxy(oldInnerType_CollectionDataType);
			if (innerType_CollectionDataType != oldInnerType_CollectionDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
			}
		}
		return innerType_CollectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetInnerType_CollectionDataType() {
		return innerType_CollectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerType_CollectionDataType(DataType newInnerType_CollectionDataType) {
		DataType oldInnerType_CollectionDataType = innerType_CollectionDataType;
		innerType_CollectionDataType = newInnerType_CollectionDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE, oldInnerType_CollectionDataType, innerType_CollectionDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				if (resolve) return getInnerType_CollectionDataType();
				return basicGetInnerType_CollectionDataType();
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
			case DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				setInnerType_CollectionDataType((DataType)newValue);
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
			case DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				setInnerType_CollectionDataType((DataType)null);
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
			case DatatypesPackage.COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE:
				return innerType_CollectionDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionDataTypeImpl
