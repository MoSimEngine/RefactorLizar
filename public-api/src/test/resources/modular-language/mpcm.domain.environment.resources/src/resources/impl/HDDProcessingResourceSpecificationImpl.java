/**
 */
package resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import resources.HDDProcessingResourceSpecification;
import resources.ResourceContainer;
import resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDD Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.HDDProcessingResourceSpecificationImpl#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDDProcessingResourceSpecificationImpl extends ProcessingResourceSpecificationImpl implements HDDProcessingResourceSpecification {
	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer resourceContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDProcessingResourceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.HDD_PROCESSING_RESOURCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getResourceContainer() {
		if (resourceContainer != null && resourceContainer.eIsProxy()) {
			InternalEObject oldResourceContainer = (InternalEObject)resourceContainer;
			resourceContainer = (ResourceContainer)eResolveProxy(oldResourceContainer);
			if (resourceContainer != oldResourceContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, oldResourceContainer, resourceContainer));
			}
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetResourceContainer() {
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceContainer(ResourceContainer newResourceContainer, NotificationChain msgs) {
		ResourceContainer oldResourceContainer = resourceContainer;
		resourceContainer = newResourceContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, oldResourceContainer, newResourceContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceContainer(ResourceContainer newResourceContainer) {
		if (newResourceContainer != resourceContainer) {
			NotificationChain msgs = null;
			if (resourceContainer != null)
				msgs = ((InternalEObject)resourceContainer).eInverseRemove(this, ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
			if (newResourceContainer != null)
				msgs = ((InternalEObject)newResourceContainer).eInverseAdd(this, ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
			msgs = basicSetResourceContainer(newResourceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, newResourceContainer, newResourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				if (resourceContainer != null)
					msgs = ((InternalEObject)resourceContainer).eInverseRemove(this, ResourcesPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
				return basicSetResourceContainer((ResourceContainer)otherEnd, msgs);
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
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				return basicSetResourceContainer(null, msgs);
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
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				if (resolve) return getResourceContainer();
				return basicGetResourceContainer();
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
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				setResourceContainer((ResourceContainer)newValue);
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
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				setResourceContainer((ResourceContainer)null);
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
			case ResourcesPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				return resourceContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //HDDProcessingResourceSpecificationImpl
