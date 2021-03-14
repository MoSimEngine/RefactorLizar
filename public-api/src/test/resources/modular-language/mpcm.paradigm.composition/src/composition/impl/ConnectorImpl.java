/**
 */
package composition.impl;

import base.impl.EntityImpl;

import composition.ComposedStructure;
import composition.CompositionPackage;
import composition.Connector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link composition.impl.ConnectorImpl#getParentStructure__Connector <em>Parent Structure Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorImpl extends EntityImpl implements Connector {
	/**
	 * The cached value of the '{@link #getParentStructure__Connector() <em>Parent Structure Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStructure__Connector()
	 * @generated
	 * @ordered
	 */
	protected ComposedStructure parentStructure__Connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposedStructure getParentStructure__Connector() {
		if (parentStructure__Connector != null && parentStructure__Connector.eIsProxy()) {
			InternalEObject oldParentStructure__Connector = (InternalEObject)parentStructure__Connector;
			parentStructure__Connector = (ComposedStructure)eResolveProxy(oldParentStructure__Connector);
			if (parentStructure__Connector != oldParentStructure__Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR, oldParentStructure__Connector, parentStructure__Connector));
			}
		}
		return parentStructure__Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure basicGetParentStructure__Connector() {
		return parentStructure__Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentStructure__Connector(ComposedStructure newParentStructure__Connector) {
		ComposedStructure oldParentStructure__Connector = parentStructure__Connector;
		parentStructure__Connector = newParentStructure__Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR, oldParentStructure__Connector, parentStructure__Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
				if (resolve) return getParentStructure__Connector();
				return basicGetParentStructure__Connector();
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
			case CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
				setParentStructure__Connector((ComposedStructure)newValue);
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
			case CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
				setParentStructure__Connector((ComposedStructure)null);
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
			case CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR:
				return parentStructure__Connector != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
