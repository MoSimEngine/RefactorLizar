/**
 */
package infrastructure.repository.impl;

import infrastructure.repository.InfrastructureComponent;
import infrastructure.repository.InfrastructureRepositoryRoot;
import infrastructure.repository.RepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Repository Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.repository.impl.InfrastructureRepositoryRootImpl#getInfrastructurecomponent <em>Infrastructurecomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureRepositoryRootImpl extends MinimalEObjectImpl.Container implements InfrastructureRepositoryRoot {
	/**
	 * The cached value of the '{@link #getInfrastructurecomponent() <em>Infrastructurecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructurecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureComponent> infrastructurecomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureRepositoryRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.INFRASTRUCTURE_REPOSITORY_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureComponent> getInfrastructurecomponent() {
		if (infrastructurecomponent == null) {
			infrastructurecomponent = new EObjectContainmentEList<InfrastructureComponent>(InfrastructureComponent.class, this, RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT);
		}
		return infrastructurecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT:
				return ((InternalEList<?>)getInfrastructurecomponent()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT:
				return getInfrastructurecomponent();
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
			case RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT:
				getInfrastructurecomponent().clear();
				getInfrastructurecomponent().addAll((Collection<? extends InfrastructureComponent>)newValue);
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
			case RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT:
				getInfrastructurecomponent().clear();
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
			case RepositoryPackage.INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT:
				return infrastructurecomponent != null && !infrastructurecomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureRepositoryRootImpl
