/**
 */
package resourceinterfaces.composition.impl;

import composition.ComposedStructure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import resourceinterfaces.composition.CompositionPackage;
import resourceinterfaces.composition.ResourceRequiredDelegationConnector;

import resourceinterfaces.repository.ResourceRequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRequiredDelegationConnectorImpl extends MinimalEObjectImpl.Container implements ResourceRequiredDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector() <em>Inner Resource Required Role Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequiredRole innerResourceRequiredRole_ResourceRequiredDelegationConnector;

	/**
	 * The cached value of the '{@link #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector() <em>Outer Resource Required Role Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequiredRole outerResourceRequiredRole_ResourceRequiredDelegationConnector;

	/**
	 * The cached value of the '{@link #getParentStructure_ResourceRequiredDelegationConnector() <em>Parent Structure Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStructure_ResourceRequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected ComposedStructure parentStructure_ResourceRequiredDelegationConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequiredDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.RESOURCE_REQUIRED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRole getInnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
		if (innerResourceRequiredRole_ResourceRequiredDelegationConnector != null && innerResourceRequiredRole_ResourceRequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector = (InternalEObject)innerResourceRequiredRole_ResourceRequiredDelegationConnector;
			innerResourceRequiredRole_ResourceRequiredDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector);
			if (innerResourceRequiredRole_ResourceRequiredDelegationConnector != oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector, innerResourceRequiredRole_ResourceRequiredDelegationConnector));
			}
		}
		return innerResourceRequiredRole_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRole basicGetInnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
		return innerResourceRequiredRole_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole newInnerResourceRequiredRole_ResourceRequiredDelegationConnector) {
		ResourceRequiredRole oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector = innerResourceRequiredRole_ResourceRequiredDelegationConnector;
		innerResourceRequiredRole_ResourceRequiredDelegationConnector = newInnerResourceRequiredRole_ResourceRequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldInnerResourceRequiredRole_ResourceRequiredDelegationConnector, innerResourceRequiredRole_ResourceRequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRole getOuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
		if (outerResourceRequiredRole_ResourceRequiredDelegationConnector != null && outerResourceRequiredRole_ResourceRequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector = (InternalEObject)outerResourceRequiredRole_ResourceRequiredDelegationConnector;
			outerResourceRequiredRole_ResourceRequiredDelegationConnector = (ResourceRequiredRole)eResolveProxy(oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector);
			if (outerResourceRequiredRole_ResourceRequiredDelegationConnector != oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector, outerResourceRequiredRole_ResourceRequiredDelegationConnector));
			}
		}
		return outerResourceRequiredRole_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRole basicGetOuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
		return outerResourceRequiredRole_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole newOuterResourceRequiredRole_ResourceRequiredDelegationConnector) {
		ResourceRequiredRole oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector = outerResourceRequiredRole_ResourceRequiredDelegationConnector;
		outerResourceRequiredRole_ResourceRequiredDelegationConnector = newOuterResourceRequiredRole_ResourceRequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldOuterResourceRequiredRole_ResourceRequiredDelegationConnector, outerResourceRequiredRole_ResourceRequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure getParentStructure_ResourceRequiredDelegationConnector() {
		if (parentStructure_ResourceRequiredDelegationConnector != null && parentStructure_ResourceRequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldParentStructure_ResourceRequiredDelegationConnector = (InternalEObject)parentStructure_ResourceRequiredDelegationConnector;
			parentStructure_ResourceRequiredDelegationConnector = (ComposedStructure)eResolveProxy(oldParentStructure_ResourceRequiredDelegationConnector);
			if (parentStructure_ResourceRequiredDelegationConnector != oldParentStructure_ResourceRequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldParentStructure_ResourceRequiredDelegationConnector, parentStructure_ResourceRequiredDelegationConnector));
			}
		}
		return parentStructure_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure basicGetParentStructure_ResourceRequiredDelegationConnector() {
		return parentStructure_ResourceRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure newParentStructure_ResourceRequiredDelegationConnector) {
		ComposedStructure oldParentStructure_ResourceRequiredDelegationConnector = parentStructure_ResourceRequiredDelegationConnector;
		parentStructure_ResourceRequiredDelegationConnector = newParentStructure_ResourceRequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR, oldParentStructure_ResourceRequiredDelegationConnector, parentStructure_ResourceRequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getInnerResourceRequiredRole_ResourceRequiredDelegationConnector();
				return basicGetInnerResourceRequiredRole_ResourceRequiredDelegationConnector();
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getOuterResourceRequiredRole_ResourceRequiredDelegationConnector();
				return basicGetOuterResourceRequiredRole_ResourceRequiredDelegationConnector();
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getParentStructure_ResourceRequiredDelegationConnector();
				return basicGetParentStructure_ResourceRequiredDelegationConnector();
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
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setInnerResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)newValue);
				return;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setOuterResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)newValue);
				return;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setParentStructure_ResourceRequiredDelegationConnector((ComposedStructure)newValue);
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
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setInnerResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)null);
				return;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setOuterResourceRequiredRole_ResourceRequiredDelegationConnector((ResourceRequiredRole)null);
				return;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				setParentStructure_ResourceRequiredDelegationConnector((ComposedStructure)null);
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
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				return innerResourceRequiredRole_ResourceRequiredDelegationConnector != null;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				return outerResourceRequiredRole_ResourceRequiredDelegationConnector != null;
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				return parentStructure_ResourceRequiredDelegationConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceRequiredDelegationConnectorImpl
