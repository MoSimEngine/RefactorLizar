/**
 */
package repository.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import repository.InterfaceRequiringEntity;
import repository.RepositoryPackage;
import repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.RequiredRoleImpl#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequiredRoleImpl extends RoleImpl implements RequiredRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.REQUIRED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceRequiringEntity getRequiringEntity_RequiredRole() {
		if (eContainerFeatureID() != RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE) return null;
		return (InterfaceRequiringEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiringEntity_RequiredRole(InterfaceRequiringEntity newRequiringEntity_RequiredRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRequiringEntity_RequiredRole, RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiringEntity_RequiredRole(InterfaceRequiringEntity newRequiringEntity_RequiredRole) {
		if (newRequiringEntity_RequiredRole != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE && newRequiringEntity_RequiredRole != null)) {
			if (EcoreUtil.isAncestor(this, newRequiringEntity_RequiredRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequiringEntity_RequiredRole != null)
				msgs = ((InternalEObject)newRequiringEntity_RequiredRole).eInverseAdd(this, RepositoryPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, InterfaceRequiringEntity.class, msgs);
			msgs = basicSetRequiringEntity_RequiredRole(newRequiringEntity_RequiredRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE, newRequiringEntity_RequiredRole, newRequiringEntity_RequiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRequiringEntity_RequiredRole((InterfaceRequiringEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				return basicSetRequiringEntity_RequiredRole(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, InterfaceRequiringEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				return getRequiringEntity_RequiredRole();
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
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				setRequiringEntity_RequiredRole((InterfaceRequiringEntity)newValue);
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
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				setRequiringEntity_RequiredRole((InterfaceRequiringEntity)null);
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
			case RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE:
				return getRequiringEntity_RequiredRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredRoleImpl
