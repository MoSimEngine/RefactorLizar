/**
 */
package resourceinterfaces.seff.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resourceinterfaces.seff.ResourceCall;
import resourceinterfaces.seff.ResourceInterfacesSEFFRoot;
import resourceinterfaces.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Interfaces SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.seff.impl.ResourceInterfacesSEFFRootImpl#getResourceCalls <em>Resource Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInterfacesSEFFRootImpl extends MinimalEObjectImpl.Container implements ResourceInterfacesSEFFRoot {
	/**
	 * The cached value of the '{@link #getResourceCalls() <em>Resource Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCall> resourceCalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfacesSEFFRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.RESOURCE_INTERFACES_SEFF_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceCall> getResourceCalls() {
		if (resourceCalls == null) {
			resourceCalls = new EObjectContainmentEList<ResourceCall>(ResourceCall.class, this, SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS);
		}
		return resourceCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS:
				return ((InternalEList<?>)getResourceCalls()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS:
				return getResourceCalls();
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
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS:
				getResourceCalls().clear();
				getResourceCalls().addAll((Collection<? extends ResourceCall>)newValue);
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
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS:
				getResourceCalls().clear();
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
			case SeffPackage.RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS:
				return resourceCalls != null && !resourceCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInterfacesSEFFRootImpl
