/**
 */
package performance.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import performance.resources.CommunicationLinkResourcePerformanceSpecification;
import performance.resources.HDDResourcePerformanceSpecification;
import performance.resources.PerformanceResourcesRoot;
import performance.resources.ProcessingResourcePerformanceSpecification;
import performance.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Resources Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.impl.PerformanceResourcesRootImpl#getProcessingResourcePerformanceSpecifications <em>Processing Resource Performance Specifications</em>}</li>
 *   <li>{@link performance.resources.impl.PerformanceResourcesRootImpl#getCommunicationLinkResourcePerformanceSpecifications <em>Communication Link Resource Performance Specifications</em>}</li>
 *   <li>{@link performance.resources.impl.PerformanceResourcesRootImpl#getHddResourcePerformanceSpecification <em>Hdd Resource Performance Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceResourcesRootImpl extends MinimalEObjectImpl.Container implements PerformanceResourcesRoot {
	/**
	 * The cached value of the '{@link #getProcessingResourcePerformanceSpecifications() <em>Processing Resource Performance Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourcePerformanceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourcePerformanceSpecification> processingResourcePerformanceSpecifications;

	/**
	 * The cached value of the '{@link #getCommunicationLinkResourcePerformanceSpecifications() <em>Communication Link Resource Performance Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourcePerformanceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLinkResourcePerformanceSpecification> communicationLinkResourcePerformanceSpecifications;

	/**
	 * The cached value of the '{@link #getHddResourcePerformanceSpecification() <em>Hdd Resource Performance Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHddResourcePerformanceSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<HDDResourcePerformanceSpecification> hddResourcePerformanceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceResourcesRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.PERFORMANCE_RESOURCES_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourcePerformanceSpecification> getProcessingResourcePerformanceSpecifications() {
		if (processingResourcePerformanceSpecifications == null) {
			processingResourcePerformanceSpecifications = new EObjectContainmentEList<ProcessingResourcePerformanceSpecification>(ProcessingResourcePerformanceSpecification.class, this, ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS);
		}
		return processingResourcePerformanceSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLinkResourcePerformanceSpecification> getCommunicationLinkResourcePerformanceSpecifications() {
		if (communicationLinkResourcePerformanceSpecifications == null) {
			communicationLinkResourcePerformanceSpecifications = new EObjectContainmentEList<CommunicationLinkResourcePerformanceSpecification>(CommunicationLinkResourcePerformanceSpecification.class, this, ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS);
		}
		return communicationLinkResourcePerformanceSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDDResourcePerformanceSpecification> getHddResourcePerformanceSpecification() {
		if (hddResourcePerformanceSpecification == null) {
			hddResourcePerformanceSpecification = new EObjectContainmentEList<HDDResourcePerformanceSpecification>(HDDResourcePerformanceSpecification.class, this, ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION);
		}
		return hddResourcePerformanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return ((InternalEList<?>)getProcessingResourcePerformanceSpecifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return ((InternalEList<?>)getCommunicationLinkResourcePerformanceSpecifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION:
				return ((InternalEList<?>)getHddResourcePerformanceSpecification()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return getProcessingResourcePerformanceSpecifications();
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return getCommunicationLinkResourcePerformanceSpecifications();
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION:
				return getHddResourcePerformanceSpecification();
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
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				getProcessingResourcePerformanceSpecifications().clear();
				getProcessingResourcePerformanceSpecifications().addAll((Collection<? extends ProcessingResourcePerformanceSpecification>)newValue);
				return;
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				getCommunicationLinkResourcePerformanceSpecifications().clear();
				getCommunicationLinkResourcePerformanceSpecifications().addAll((Collection<? extends CommunicationLinkResourcePerformanceSpecification>)newValue);
				return;
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION:
				getHddResourcePerformanceSpecification().clear();
				getHddResourcePerformanceSpecification().addAll((Collection<? extends HDDResourcePerformanceSpecification>)newValue);
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
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				getProcessingResourcePerformanceSpecifications().clear();
				return;
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				getCommunicationLinkResourcePerformanceSpecifications().clear();
				return;
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION:
				getHddResourcePerformanceSpecification().clear();
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
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return processingResourcePerformanceSpecifications != null && !processingResourcePerformanceSpecifications.isEmpty();
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS:
				return communicationLinkResourcePerformanceSpecifications != null && !communicationLinkResourcePerformanceSpecifications.isEmpty();
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION:
				return hddResourcePerformanceSpecification != null && !hddResourcePerformanceSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerformanceResourcesRootImpl
