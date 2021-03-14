/**
 */
package environment.impl;

import base.impl.EntityImpl;

import environment.Environment;
import environment.EnvironmentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ContainerImpl#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}</li>
 *   <li>{@link environment.impl.ContainerImpl#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}</li>
 *   <li>{@link environment.impl.ContainerImpl#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends EntityImpl implements environment.Container {
	/**
	 * The cached value of the '{@link #getNestedResourceContainers__ResourceContainer() <em>Nested Resource Containers Resource Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedResourceContainers__ResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<environment.Container> nestedResourceContainers__ResourceContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getResourceEnvironment_ResourceContainer() {
		if (eContainerFeatureID() != EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER) return null;
		return (Environment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvironment_ResourceContainer(Environment newResourceEnvironment_ResourceContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResourceEnvironment_ResourceContainer, EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvironment_ResourceContainer(Environment newResourceEnvironment_ResourceContainer) {
		if (newResourceEnvironment_ResourceContainer != eInternalContainer() || (eContainerFeatureID() != EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER && newResourceEnvironment_ResourceContainer != null)) {
			if (EcoreUtil.isAncestor(this, newResourceEnvironment_ResourceContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResourceEnvironment_ResourceContainer != null)
				msgs = ((InternalEObject)newResourceEnvironment_ResourceContainer).eInverseAdd(this, EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, Environment.class, msgs);
			msgs = basicSetResourceEnvironment_ResourceContainer(newResourceEnvironment_ResourceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER, newResourceEnvironment_ResourceContainer, newResourceEnvironment_ResourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<environment.Container> getNestedResourceContainers__ResourceContainer() {
		if (nestedResourceContainers__ResourceContainer == null) {
			nestedResourceContainers__ResourceContainer = new EObjectContainmentWithInverseEList<environment.Container>(environment.Container.class, this, EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER);
		}
		return nestedResourceContainers__ResourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container getParentResourceContainer__ResourceContainer() {
		if (eContainerFeatureID() != EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER) return null;
		return (environment.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResourceContainer__ResourceContainer(environment.Container newParentResourceContainer__ResourceContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResourceContainer__ResourceContainer, EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResourceContainer__ResourceContainer(environment.Container newParentResourceContainer__ResourceContainer) {
		if (newParentResourceContainer__ResourceContainer != eInternalContainer() || (eContainerFeatureID() != EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER && newParentResourceContainer__ResourceContainer != null)) {
			if (EcoreUtil.isAncestor(this, newParentResourceContainer__ResourceContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResourceContainer__ResourceContainer != null)
				msgs = ((InternalEObject)newParentResourceContainer__ResourceContainer).eInverseAdd(this, EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, environment.Container.class, msgs);
			msgs = basicSetParentResourceContainer__ResourceContainer(newParentResourceContainer__ResourceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER, newParentResourceContainer__ResourceContainer, newParentResourceContainer__ResourceContainer));
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResourceEnvironment_ResourceContainer((Environment)otherEnd, msgs);
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedResourceContainers__ResourceContainer()).basicAdd(otherEnd, msgs);
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResourceContainer__ResourceContainer((environment.Container)otherEnd, msgs);
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return basicSetResourceEnvironment_ResourceContainer(null, msgs);
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				return ((InternalEList<?>)getNestedResourceContainers__ResourceContainer()).basicRemove(otherEnd, msgs);
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				return basicSetParentResourceContainer__ResourceContainer(null, msgs);
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, Environment.class, msgs);
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER, environment.Container.class, msgs);
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return getResourceEnvironment_ResourceContainer();
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				return getNestedResourceContainers__ResourceContainer();
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				return getParentResourceContainer__ResourceContainer();
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				setResourceEnvironment_ResourceContainer((Environment)newValue);
				return;
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				getNestedResourceContainers__ResourceContainer().clear();
				getNestedResourceContainers__ResourceContainer().addAll((Collection<? extends environment.Container>)newValue);
				return;
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				setParentResourceContainer__ResourceContainer((environment.Container)newValue);
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				setResourceEnvironment_ResourceContainer((Environment)null);
				return;
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				getNestedResourceContainers__ResourceContainer().clear();
				return;
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				setParentResourceContainer__ResourceContainer((environment.Container)null);
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
			case EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER:
				return getResourceEnvironment_ResourceContainer() != null;
			case EnvironmentPackage.CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER:
				return nestedResourceContainers__ResourceContainer != null && !nestedResourceContainers__ResourceContainer.isEmpty();
			case EnvironmentPackage.CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER:
				return getParentResourceContainer__ResourceContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
