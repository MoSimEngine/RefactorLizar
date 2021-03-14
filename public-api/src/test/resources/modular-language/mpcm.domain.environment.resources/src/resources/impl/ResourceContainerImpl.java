/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resources.HDDProcessingResourceSpecification;
import resources.ProcessingResourceSpecification;
import resources.ResourceContainer;
import resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.ResourceContainerImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link resources.impl.ResourceContainerImpl#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}</li>
 *   <li>{@link resources.impl.ResourceContainerImpl#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerImpl extends MinimalEObjectImpl.Container implements ResourceContainer {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected environment.Container container;

	/**
	 * The cached value of the '{@link #getActiveResourceSpecifications_ResourceContainer() <em>Active Resource Specifications Resource Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveResourceSpecifications_ResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceSpecification> activeResourceSpecifications_ResourceContainer;

	/**
	 * The cached value of the '{@link #getHddResourceSpecifications() <em>Hdd Resource Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHddResourceSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<HDDProcessingResourceSpecification> hddResourceSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.RESOURCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (environment.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.RESOURCE_CONTAINER__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(environment.Container newContainer) {
		environment.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_CONTAINER__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceSpecification> getActiveResourceSpecifications_ResourceContainer() {
		if (activeResourceSpecifications_ResourceContainer == null) {
			activeResourceSpecifications_ResourceContainer = new EObjectContainmentWithInverseEList<ProcessingResourceSpecification>(ProcessingResourceSpecification.class, this, ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER, ResourcesPackage.PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION);
		}
		return activeResourceSpecifications_ResourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDDProcessingResourceSpecification> getHddResourceSpecifications() {
		if (hddResourceSpecifications == null) {
			hddResourceSpecifications = new EObjectWithInverseResolvingEList<HDDProcessingResourceSpecification>(HDDProcessingResourceSpecification.class, this, ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER);
		}
		return hddResourceSpecifications;
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
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicAdd(otherEnd, msgs);
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHddResourceSpecifications()).basicAdd(otherEnd, msgs);
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
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return ((InternalEList<?>)getActiveResourceSpecifications_ResourceContainer()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				return ((InternalEList<?>)getHddResourceSpecifications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RESOURCE_CONTAINER__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return getActiveResourceSpecifications_ResourceContainer();
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				return getHddResourceSpecifications();
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
			case ResourcesPackage.RESOURCE_CONTAINER__CONTAINER:
				setContainer((environment.Container)newValue);
				return;
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				getActiveResourceSpecifications_ResourceContainer().clear();
				getActiveResourceSpecifications_ResourceContainer().addAll((Collection<? extends ProcessingResourceSpecification>)newValue);
				return;
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				getHddResourceSpecifications().clear();
				getHddResourceSpecifications().addAll((Collection<? extends HDDProcessingResourceSpecification>)newValue);
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
			case ResourcesPackage.RESOURCE_CONTAINER__CONTAINER:
				setContainer((environment.Container)null);
				return;
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				getActiveResourceSpecifications_ResourceContainer().clear();
				return;
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				getHddResourceSpecifications().clear();
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
			case ResourcesPackage.RESOURCE_CONTAINER__CONTAINER:
				return container != null;
			case ResourcesPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER:
				return activeResourceSpecifications_ResourceContainer != null && !activeResourceSpecifications_ResourceContainer.isEmpty();
			case ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS:
				return hddResourceSpecifications != null && !hddResourceSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceContainerImpl
