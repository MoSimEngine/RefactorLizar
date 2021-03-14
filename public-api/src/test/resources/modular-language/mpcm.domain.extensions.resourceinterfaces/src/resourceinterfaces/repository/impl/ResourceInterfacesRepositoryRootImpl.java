/**
 */
package resourceinterfaces.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resourceinterfaces.repository.RepositoryPackage;
import resourceinterfaces.repository.ResourceInterfaceRequiringEntity;
import resourceinterfaces.repository.ResourceInterfacesRepositoryRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Interfaces Repository Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.repository.impl.ResourceInterfacesRepositoryRootImpl#getResourceinterfacerequiringentity <em>Resourceinterfacerequiringentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInterfacesRepositoryRootImpl extends MinimalEObjectImpl.Container implements ResourceInterfacesRepositoryRoot {
	/**
	 * The cached value of the '{@link #getResourceinterfacerequiringentity() <em>Resourceinterfacerequiringentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceinterfacerequiringentity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterfaceRequiringEntity> resourceinterfacerequiringentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfacesRepositoryRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.RESOURCE_INTERFACES_REPOSITORY_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterfaceRequiringEntity> getResourceinterfacerequiringentity() {
		if (resourceinterfacerequiringentity == null) {
			resourceinterfacerequiringentity = new EObjectContainmentEList<ResourceInterfaceRequiringEntity>(ResourceInterfaceRequiringEntity.class, this, RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY);
		}
		return resourceinterfacerequiringentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY:
				return ((InternalEList<?>)getResourceinterfacerequiringentity()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY:
				return getResourceinterfacerequiringentity();
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
			case RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY:
				getResourceinterfacerequiringentity().clear();
				getResourceinterfacerequiringentity().addAll((Collection<? extends ResourceInterfaceRequiringEntity>)newValue);
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
			case RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY:
				getResourceinterfacerequiringentity().clear();
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
			case RepositoryPackage.RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY:
				return resourceinterfacerequiringentity != null && !resourceinterfacerequiringentity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInterfacesRepositoryRootImpl
