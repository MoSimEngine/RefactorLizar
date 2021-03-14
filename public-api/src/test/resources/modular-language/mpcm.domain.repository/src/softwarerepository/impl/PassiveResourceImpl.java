/**
 */
package softwarerepository.impl;

import base.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import softwarerepository.BasicComponent;
import softwarerepository.PassiveResource;
import softwarerepository.SoftwarerepositoryPackage;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.impl.PassiveResourceImpl#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}</li>
 *   <li>{@link softwarerepository.impl.PassiveResourceImpl#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassiveResourceImpl extends EntityImpl implements PassiveResource {
	/**
	 * The cached value of the '{@link #getCapacity_PassiveResource() <em>Capacity Passive Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity_PassiveResource()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable capacity_PassiveResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarerepositoryPackage.Literals.PASSIVE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getCapacity_PassiveResource() {
		return capacity_PassiveResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity_PassiveResource(PCMRandomVariable newCapacity_PassiveResource, NotificationChain msgs) {
		PCMRandomVariable oldCapacity_PassiveResource = capacity_PassiveResource;
		capacity_PassiveResource = newCapacity_PassiveResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, oldCapacity_PassiveResource, newCapacity_PassiveResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity_PassiveResource(PCMRandomVariable newCapacity_PassiveResource) {
		if (newCapacity_PassiveResource != capacity_PassiveResource) {
			NotificationChain msgs = null;
			if (capacity_PassiveResource != null)
				msgs = ((InternalEObject)capacity_PassiveResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, null, msgs);
			if (newCapacity_PassiveResource != null)
				msgs = ((InternalEObject)newCapacity_PassiveResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, null, msgs);
			msgs = basicSetCapacity_PassiveResource(newCapacity_PassiveResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE, newCapacity_PassiveResource, newCapacity_PassiveResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent getBasicComponent_PassiveResource() {
		if (eContainerFeatureID() != SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE) return null;
		return (BasicComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicComponent_PassiveResource(BasicComponent newBasicComponent_PassiveResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBasicComponent_PassiveResource, SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicComponent_PassiveResource(BasicComponent newBasicComponent_PassiveResource) {
		if (newBasicComponent_PassiveResource != eInternalContainer() || (eContainerFeatureID() != SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE && newBasicComponent_PassiveResource != null)) {
			if (EcoreUtil.isAncestor(this, newBasicComponent_PassiveResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBasicComponent_PassiveResource != null)
				msgs = ((InternalEObject)newBasicComponent_PassiveResource).eInverseAdd(this, SoftwarerepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, BasicComponent.class, msgs);
			msgs = basicSetBasicComponent_PassiveResource(newBasicComponent_PassiveResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE, newBasicComponent_PassiveResource, newBasicComponent_PassiveResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBasicComponent_PassiveResource((BasicComponent)otherEnd, msgs);
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
				return basicSetCapacity_PassiveResource(null, msgs);
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				return basicSetBasicComponent_PassiveResource(null, msgs);
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				return eInternalContainer().eInverseRemove(this, SoftwarerepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, BasicComponent.class, msgs);
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
				return getCapacity_PassiveResource();
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				return getBasicComponent_PassiveResource();
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
				setCapacity_PassiveResource((PCMRandomVariable)newValue);
				return;
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				setBasicComponent_PassiveResource((BasicComponent)newValue);
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
				setCapacity_PassiveResource((PCMRandomVariable)null);
				return;
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				setBasicComponent_PassiveResource((BasicComponent)null);
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
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE:
				return capacity_PassiveResource != null;
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE:
				return getBasicComponent_PassiveResource() != null;
		}
		return super.eIsSet(featureID);
	}

} //PassiveResourceImpl
