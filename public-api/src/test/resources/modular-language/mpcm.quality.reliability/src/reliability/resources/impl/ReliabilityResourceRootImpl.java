/**
 */
package reliability.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reliability.resources.CommunicationLinkResourceReliabilitySpecification;
import reliability.resources.ProcessingResourceReliabilitySpecification;
import reliability.resources.ReliabilityResourceRoot;
import reliability.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliability Resource Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.resources.impl.ReliabilityResourceRootImpl#getProcessingResourceReliabilitySpecification <em>Processing Resource Reliability Specification</em>}</li>
 *   <li>{@link reliability.resources.impl.ReliabilityResourceRootImpl#getCommunicationLinkResourceReliabilitySpecifications <em>Communication Link Resource Reliability Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityResourceRootImpl extends MinimalEObjectImpl.Container implements ReliabilityResourceRoot {
	/**
	 * The cached value of the '{@link #getProcessingResourceReliabilitySpecification() <em>Processing Resource Reliability Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceReliabilitySpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceReliabilitySpecification> processingResourceReliabilitySpecification;

	/**
	 * The cached value of the '{@link #getCommunicationLinkResourceReliabilitySpecifications() <em>Communication Link Resource Reliability Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourceReliabilitySpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLinkResourceReliabilitySpecification> communicationLinkResourceReliabilitySpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityResourceRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.RELIABILITY_RESOURCE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceReliabilitySpecification> getProcessingResourceReliabilitySpecification() {
		if (processingResourceReliabilitySpecification == null) {
			processingResourceReliabilitySpecification = new EObjectContainmentEList<ProcessingResourceReliabilitySpecification>(ProcessingResourceReliabilitySpecification.class, this, ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION);
		}
		return processingResourceReliabilitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLinkResourceReliabilitySpecification> getCommunicationLinkResourceReliabilitySpecifications() {
		if (communicationLinkResourceReliabilitySpecifications == null) {
			communicationLinkResourceReliabilitySpecifications = new EObjectContainmentEList<CommunicationLinkResourceReliabilitySpecification>(CommunicationLinkResourceReliabilitySpecification.class, this, ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS);
		}
		return communicationLinkResourceReliabilitySpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION:
				return ((InternalEList<?>)getProcessingResourceReliabilitySpecification()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS:
				return ((InternalEList<?>)getCommunicationLinkResourceReliabilitySpecifications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION:
				return getProcessingResourceReliabilitySpecification();
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS:
				return getCommunicationLinkResourceReliabilitySpecifications();
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
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION:
				getProcessingResourceReliabilitySpecification().clear();
				getProcessingResourceReliabilitySpecification().addAll((Collection<? extends ProcessingResourceReliabilitySpecification>)newValue);
				return;
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS:
				getCommunicationLinkResourceReliabilitySpecifications().clear();
				getCommunicationLinkResourceReliabilitySpecifications().addAll((Collection<? extends CommunicationLinkResourceReliabilitySpecification>)newValue);
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
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION:
				getProcessingResourceReliabilitySpecification().clear();
				return;
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS:
				getCommunicationLinkResourceReliabilitySpecifications().clear();
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
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION:
				return processingResourceReliabilitySpecification != null && !processingResourceReliabilitySpecification.isEmpty();
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS:
				return communicationLinkResourceReliabilitySpecifications != null && !communicationLinkResourceReliabilitySpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReliabilityResourceRootImpl
