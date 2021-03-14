/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resources.CommunicationLinkResourceSpecification;
import resources.ResourceContainer;
import resources.ResourceEnvironment;
import resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.ResourceEnvironmentImpl#getResourceContainers <em>Resource Containers</em>}</li>
 *   <li>{@link resources.impl.ResourceEnvironmentImpl#getCommunicationLinkResourceSpecifications <em>Communication Link Resource Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceEnvironmentImpl extends MinimalEObjectImpl.Container implements ResourceEnvironment {
	/**
	 * The cached value of the '{@link #getResourceContainers() <em>Resource Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> resourceContainers;

	/**
	 * The cached value of the '{@link #getCommunicationLinkResourceSpecifications() <em>Communication Link Resource Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLinkResourceSpecification> communicationLinkResourceSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.RESOURCE_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getResourceContainers() {
		if (resourceContainers == null) {
			resourceContainers = new EObjectContainmentEList<ResourceContainer>(ResourceContainer.class, this, ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS);
		}
		return resourceContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLinkResourceSpecification> getCommunicationLinkResourceSpecifications() {
		if (communicationLinkResourceSpecifications == null) {
			communicationLinkResourceSpecifications = new EObjectContainmentEList<CommunicationLinkResourceSpecification>(CommunicationLinkResourceSpecification.class, this, ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS);
		}
		return communicationLinkResourceSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS:
				return ((InternalEList<?>)getResourceContainers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS:
				return ((InternalEList<?>)getCommunicationLinkResourceSpecifications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS:
				return getResourceContainers();
			case ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS:
				return getCommunicationLinkResourceSpecifications();
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
			case ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS:
				getResourceContainers().clear();
				getResourceContainers().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS:
				getCommunicationLinkResourceSpecifications().clear();
				getCommunicationLinkResourceSpecifications().addAll((Collection<? extends CommunicationLinkResourceSpecification>)newValue);
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
			case ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS:
				getResourceContainers().clear();
				return;
			case ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS:
				getCommunicationLinkResourceSpecifications().clear();
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
			case ResourcesPackage.RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS:
				return resourceContainers != null && !resourceContainers.isEmpty();
			case ResourcesPackage.RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS:
				return communicationLinkResourceSpecifications != null && !communicationLinkResourceSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceEnvironmentImpl
