/**
 */
package environment.impl;

import base.impl.NamedElementImpl;

import environment.Environment;
import environment.EnvironmentPackage;
import environment.LinkingResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.EnvironmentImpl#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}</li>
 *   <li>{@link environment.impl.EnvironmentImpl#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends NamedElementImpl implements Environment {
	/**
	 * The cached value of the '{@link #getLinkingResources__ResourceEnvironment() <em>Linking Resources Resource Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResources__ResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkingResource> linkingResources__ResourceEnvironment;

	/**
	 * The cached value of the '{@link #getResourceContainer_ResourceEnvironment() <em>Resource Container Resource Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer_ResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<environment.Container> resourceContainer_ResourceEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkingResource> getLinkingResources__ResourceEnvironment() {
		if (linkingResources__ResourceEnvironment == null) {
			linkingResources__ResourceEnvironment = new EObjectContainmentWithInverseEList<LinkingResource>(LinkingResource.class, this, EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT, EnvironmentPackage.LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE);
		}
		return linkingResources__ResourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<environment.Container> getResourceContainer_ResourceEnvironment() {
		if (resourceContainer_ResourceEnvironment == null) {
			resourceContainer_ResourceEnvironment = new EObjectContainmentWithInverseEList<environment.Container>(environment.Container.class, this, EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT, EnvironmentPackage.CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER);
		}
		return resourceContainer_ResourceEnvironment;
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkingResources__ResourceEnvironment()).basicAdd(otherEnd, msgs);
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceContainer_ResourceEnvironment()).basicAdd(otherEnd, msgs);
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				return ((InternalEList<?>)getLinkingResources__ResourceEnvironment()).basicRemove(otherEnd, msgs);
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return ((InternalEList<?>)getResourceContainer_ResourceEnvironment()).basicRemove(otherEnd, msgs);
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				return getLinkingResources__ResourceEnvironment();
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return getResourceContainer_ResourceEnvironment();
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				getLinkingResources__ResourceEnvironment().clear();
				getLinkingResources__ResourceEnvironment().addAll((Collection<? extends LinkingResource>)newValue);
				return;
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				getResourceContainer_ResourceEnvironment().clear();
				getResourceContainer_ResourceEnvironment().addAll((Collection<? extends environment.Container>)newValue);
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				getLinkingResources__ResourceEnvironment().clear();
				return;
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				getResourceContainer_ResourceEnvironment().clear();
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
			case EnvironmentPackage.ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT:
				return linkingResources__ResourceEnvironment != null && !linkingResources__ResourceEnvironment.isEmpty();
			case EnvironmentPackage.ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT:
				return resourceContainer_ResourceEnvironment != null && !resourceContainer_ResourceEnvironment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
