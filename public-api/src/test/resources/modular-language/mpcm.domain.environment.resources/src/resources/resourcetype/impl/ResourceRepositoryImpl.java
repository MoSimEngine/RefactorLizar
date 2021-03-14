/**
 */
package resources.resourcetype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resources.resourcetype.ResourceRepository;
import resources.resourcetype.ResourceType;
import resources.resourcetype.ResourcetypePackage;
import resources.resourcetype.SchedulingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.resourcetype.impl.ResourceRepositoryImpl#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}</li>
 *   <li>{@link resources.resourcetype.impl.ResourceRepositoryImpl#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRepositoryImpl extends MinimalEObjectImpl.Container implements ResourceRepository {
	/**
	 * The cached value of the '{@link #getSchedulingPolicies__ResourceRepository() <em>Scheduling Policies Resource Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicies__ResourceRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulingPolicy> schedulingPolicies__ResourceRepository;

	/**
	 * The cached value of the '{@link #getAvailableResourceTypes_ResourceRepository() <em>Available Resource Types Resource Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableResourceTypes_ResourceRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> availableResourceTypes_ResourceRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.RESOURCE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingPolicy> getSchedulingPolicies__ResourceRepository() {
		if (schedulingPolicies__ResourceRepository == null) {
			schedulingPolicies__ResourceRepository = new EObjectContainmentWithInverseEList<SchedulingPolicy>(SchedulingPolicy.class, this, ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY, ResourcetypePackage.SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY);
		}
		return schedulingPolicies__ResourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getAvailableResourceTypes_ResourceRepository() {
		if (availableResourceTypes_ResourceRepository == null) {
			availableResourceTypes_ResourceRepository = new EObjectContainmentWithInverseEList<ResourceType>(ResourceType.class, this, ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY, ResourcetypePackage.RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE);
		}
		return availableResourceTypes_ResourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulingPolicies__ResourceRepository()).basicAdd(otherEnd, msgs);
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailableResourceTypes_ResourceRepository()).basicAdd(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				return ((InternalEList<?>)getSchedulingPolicies__ResourceRepository()).basicRemove(otherEnd, msgs);
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return ((InternalEList<?>)getAvailableResourceTypes_ResourceRepository()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				return getSchedulingPolicies__ResourceRepository();
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return getAvailableResourceTypes_ResourceRepository();
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				getSchedulingPolicies__ResourceRepository().clear();
				getSchedulingPolicies__ResourceRepository().addAll((Collection<? extends SchedulingPolicy>)newValue);
				return;
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				getAvailableResourceTypes_ResourceRepository().clear();
				getAvailableResourceTypes_ResourceRepository().addAll((Collection<? extends ResourceType>)newValue);
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				getSchedulingPolicies__ResourceRepository().clear();
				return;
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				getAvailableResourceTypes_ResourceRepository().clear();
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
			case ResourcetypePackage.RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY:
				return schedulingPolicies__ResourceRepository != null && !schedulingPolicies__ResourceRepository.isEmpty();
			case ResourcetypePackage.RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY:
				return availableResourceTypes_ResourceRepository != null && !availableResourceTypes_ResourceRepository.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceRepositoryImpl
