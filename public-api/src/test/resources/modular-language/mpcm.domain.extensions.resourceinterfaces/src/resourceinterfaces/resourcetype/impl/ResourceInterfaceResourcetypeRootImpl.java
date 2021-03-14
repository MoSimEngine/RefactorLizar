/**
 */
package resourceinterfaces.resourcetype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resourceinterfaces.resourcetype.ResourceInterface;
import resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity;
import resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot;
import resourceinterfaces.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Interface Resourcetype Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl#getResourceinterfaceprovidingentity <em>Resourceinterfaceprovidingentity</em>}</li>
 *   <li>{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl#getResourceinterface <em>Resourceinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInterfaceResourcetypeRootImpl extends MinimalEObjectImpl.Container implements ResourceInterfaceResourcetypeRoot {
	/**
	 * The cached value of the '{@link #getResourceinterfaceprovidingentity() <em>Resourceinterfaceprovidingentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceinterfaceprovidingentity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterfaceProvidingEntity> resourceinterfaceprovidingentity;

	/**
	 * The cached value of the '{@link #getResourceinterface() <em>Resourceinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterface> resourceinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInterfaceResourcetypeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.RESOURCE_INTERFACE_RESOURCETYPE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterfaceProvidingEntity> getResourceinterfaceprovidingentity() {
		if (resourceinterfaceprovidingentity == null) {
			resourceinterfaceprovidingentity = new EObjectContainmentEList<ResourceInterfaceProvidingEntity>(ResourceInterfaceProvidingEntity.class, this, ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY);
		}
		return resourceinterfaceprovidingentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterface> getResourceinterface() {
		if (resourceinterface == null) {
			resourceinterface = new EObjectContainmentEList<ResourceInterface>(ResourceInterface.class, this, ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE);
		}
		return resourceinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY:
				return ((InternalEList<?>)getResourceinterfaceprovidingentity()).basicRemove(otherEnd, msgs);
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE:
				return ((InternalEList<?>)getResourceinterface()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY:
				return getResourceinterfaceprovidingentity();
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE:
				return getResourceinterface();
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
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY:
				getResourceinterfaceprovidingentity().clear();
				getResourceinterfaceprovidingentity().addAll((Collection<? extends ResourceInterfaceProvidingEntity>)newValue);
				return;
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE:
				getResourceinterface().clear();
				getResourceinterface().addAll((Collection<? extends ResourceInterface>)newValue);
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
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY:
				getResourceinterfaceprovidingentity().clear();
				return;
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE:
				getResourceinterface().clear();
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
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY:
				return resourceinterfaceprovidingentity != null && !resourceinterfaceprovidingentity.isEmpty();
			case ResourcetypePackage.RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE:
				return resourceinterface != null && !resourceinterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceInterfaceResourcetypeRootImpl
