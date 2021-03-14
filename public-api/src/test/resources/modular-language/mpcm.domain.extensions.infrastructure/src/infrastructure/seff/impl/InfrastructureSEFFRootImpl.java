/**
 */
package infrastructure.seff.impl;

import infrastructure.seff.InfrastructureCall;
import infrastructure.seff.InfrastructureSEFFRoot;
import infrastructure.seff.SeffPackage;

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
 * An implementation of the model object '<em><b>Infrastructure SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.seff.impl.InfrastructureSEFFRootImpl#getInfrastructurecall <em>Infrastructurecall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureSEFFRootImpl extends MinimalEObjectImpl.Container implements InfrastructureSEFFRoot {
	/**
	 * The cached value of the '{@link #getInfrastructurecall() <em>Infrastructurecall</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructurecall()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureCall> infrastructurecall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureSEFFRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.INFRASTRUCTURE_SEFF_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureCall> getInfrastructurecall() {
		if (infrastructurecall == null) {
			infrastructurecall = new EObjectContainmentEList<InfrastructureCall>(InfrastructureCall.class, this, SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL);
		}
		return infrastructurecall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL:
				return ((InternalEList<?>)getInfrastructurecall()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL:
				return getInfrastructurecall();
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
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL:
				getInfrastructurecall().clear();
				getInfrastructurecall().addAll((Collection<? extends InfrastructureCall>)newValue);
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
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL:
				getInfrastructurecall().clear();
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
			case SeffPackage.INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL:
				return infrastructurecall != null && !infrastructurecall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureSEFFRootImpl
