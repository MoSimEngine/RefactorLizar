/**
 */
package performance.seff.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import performance.seff.PerformanceSEFFRoot;
import performance.seff.ResourceDemandingSEFF;
import performance.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.seff.impl.PerformanceSEFFRootImpl#getResourceDemandingSEFFs <em>Resource Demanding SEF Fs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceSEFFRootImpl extends MinimalEObjectImpl.Container implements PerformanceSEFFRoot {
	/**
	 * The cached value of the '{@link #getResourceDemandingSEFFs() <em>Resource Demanding SEF Fs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemandingSEFFs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDemandingSEFF> resourceDemandingSEFFs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceSEFFRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.PERFORMANCE_SEFF_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDemandingSEFF> getResourceDemandingSEFFs() {
		if (resourceDemandingSEFFs == null) {
			resourceDemandingSEFFs = new EObjectContainmentEList<ResourceDemandingSEFF>(ResourceDemandingSEFF.class, this, SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS);
		}
		return resourceDemandingSEFFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS:
				return ((InternalEList<?>)getResourceDemandingSEFFs()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS:
				return getResourceDemandingSEFFs();
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
			case SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS:
				getResourceDemandingSEFFs().clear();
				getResourceDemandingSEFFs().addAll((Collection<? extends ResourceDemandingSEFF>)newValue);
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
			case SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS:
				getResourceDemandingSEFFs().clear();
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
			case SeffPackage.PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS:
				return resourceDemandingSEFFs != null && !resourceDemandingSEFFs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerformanceSEFFRootImpl
