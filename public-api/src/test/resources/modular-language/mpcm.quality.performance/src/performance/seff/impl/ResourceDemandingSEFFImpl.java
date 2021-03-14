/**
 */
package performance.seff.impl;

import behaviourseff.BehaviourSEFF;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import performance.seff.ParametricResourceDemand;
import performance.seff.ResourceDemandingSEFF;
import performance.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.seff.impl.ResourceDemandingSEFFImpl#getResourceDemands <em>Resource Demands</em>}</li>
 *   <li>{@link performance.seff.impl.ResourceDemandingSEFFImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDemandingSEFFImpl extends IdentifierImpl implements ResourceDemandingSEFF {
	/**
	 * The cached value of the '{@link #getResourceDemands() <em>Resource Demands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemands()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametricResourceDemand> resourceDemands;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected BehaviourSEFF owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandingSEFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.RESOURCE_DEMANDING_SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametricResourceDemand> getResourceDemands() {
		if (resourceDemands == null) {
			resourceDemands = new EObjectContainmentEList<ParametricResourceDemand>(ParametricResourceDemand.class, this, SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS);
		}
		return resourceDemands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourSEFF getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (BehaviourSEFF)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourSEFF basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(BehaviourSEFF newOwner) {
		BehaviourSEFF oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS:
				return ((InternalEList<?>)getResourceDemands()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS:
				return getResourceDemands();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS:
				getResourceDemands().clear();
				getResourceDemands().addAll((Collection<? extends ParametricResourceDemand>)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER:
				setOwner((BehaviourSEFF)newValue);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS:
				getResourceDemands().clear();
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER:
				setOwner((BehaviourSEFF)null);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS:
				return resourceDemands != null && !resourceDemands.isEmpty();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceDemandingSEFFImpl
