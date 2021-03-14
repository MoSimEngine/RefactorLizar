/**
 */
package allocation.impl;

import allocation.Allocation;
import allocation.AllocationContext;
import allocation.AllocationPackage;
import allocation.Deployable;

import allocation.util.AllocationValidator;

import base.impl.EntityImpl;

import composition.AssemblyContext;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link allocation.impl.AllocationContextImpl#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}</li>
 *   <li>{@link allocation.impl.AllocationContextImpl#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}</li>
 *   <li>{@link allocation.impl.AllocationContextImpl#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}</li>
 *   <li>{@link allocation.impl.AllocationContextImpl#getDeployables <em>Deployables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends EntityImpl implements AllocationContext {
	/**
	 * The cached value of the '{@link #getResourceContainer_AllocationContext() <em>Resource Container Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer_AllocationContext()
	 * @generated
	 * @ordered
	 */
	protected environment.Container resourceContainer_AllocationContext;

	/**
	 * The cached value of the '{@link #getAssemblyContext_AllocationContext() <em>Assembly Context Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext_AllocationContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext_AllocationContext;

	/**
	 * The cached value of the '{@link #getDeployables() <em>Deployables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployables()
	 * @generated
	 * @ordered
	 */
	protected Deployable deployables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container getResourceContainer_AllocationContext() {
		if (resourceContainer_AllocationContext != null && resourceContainer_AllocationContext.eIsProxy()) {
			InternalEObject oldResourceContainer_AllocationContext = (InternalEObject)resourceContainer_AllocationContext;
			resourceContainer_AllocationContext = (environment.Container)eResolveProxy(oldResourceContainer_AllocationContext);
			if (resourceContainer_AllocationContext != oldResourceContainer_AllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT, oldResourceContainer_AllocationContext, resourceContainer_AllocationContext));
			}
		}
		return resourceContainer_AllocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Container basicGetResourceContainer_AllocationContext() {
		return resourceContainer_AllocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceContainer_AllocationContext(environment.Container newResourceContainer_AllocationContext) {
		environment.Container oldResourceContainer_AllocationContext = resourceContainer_AllocationContext;
		resourceContainer_AllocationContext = newResourceContainer_AllocationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT, oldResourceContainer_AllocationContext, resourceContainer_AllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext_AllocationContext() {
		if (assemblyContext_AllocationContext != null && assemblyContext_AllocationContext.eIsProxy()) {
			InternalEObject oldAssemblyContext_AllocationContext = (InternalEObject)assemblyContext_AllocationContext;
			assemblyContext_AllocationContext = (AssemblyContext)eResolveProxy(oldAssemblyContext_AllocationContext);
			if (assemblyContext_AllocationContext != oldAssemblyContext_AllocationContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT, oldAssemblyContext_AllocationContext, assemblyContext_AllocationContext));
			}
		}
		return assemblyContext_AllocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext_AllocationContext() {
		return assemblyContext_AllocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext_AllocationContext(AssemblyContext newAssemblyContext_AllocationContext) {
		AssemblyContext oldAssemblyContext_AllocationContext = assemblyContext_AllocationContext;
		assemblyContext_AllocationContext = newAssemblyContext_AllocationContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT, oldAssemblyContext_AllocationContext, assemblyContext_AllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getAllocation_AllocationContext() {
		if (eContainerFeatureID() != AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT) return null;
		return (Allocation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation_AllocationContext(Allocation newAllocation_AllocationContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAllocation_AllocationContext, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation_AllocationContext(Allocation newAllocation_AllocationContext) {
		if (newAllocation_AllocationContext != eInternalContainer() || (eContainerFeatureID() != AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT && newAllocation_AllocationContext != null)) {
			if (EcoreUtil.isAncestor(this, newAllocation_AllocationContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAllocation_AllocationContext != null)
				msgs = ((InternalEObject)newAllocation_AllocationContext).eInverseAdd(this, AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION, Allocation.class, msgs);
			msgs = basicSetAllocation_AllocationContext(newAllocation_AllocationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT, newAllocation_AllocationContext, newAllocation_AllocationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployable getDeployables() {
		if (deployables != null && deployables.eIsProxy()) {
			InternalEObject oldDeployables = (InternalEObject)deployables;
			deployables = (Deployable)eResolveProxy(oldDeployables);
			if (deployables != oldDeployables) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES, oldDeployables, deployables));
			}
		}
		return deployables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployable basicGetDeployables() {
		return deployables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployables(Deployable newDeployables) {
		Deployable oldDeployables = deployables;
		deployables = newDeployables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES, oldDeployables, deployables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OneAssemblyContextOrOneEventChannelShouldBeReferred(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AllocationValidator.DIAGNOSTIC_SOURCE,
						 AllocationValidator.ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OneAssemblyContextOrOneEventChannelShouldBeReferred", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAllocation_AllocationContext((Allocation)otherEnd, msgs);
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
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				return basicSetAllocation_AllocationContext(null, msgs);
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
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				return eInternalContainer().eInverseRemove(this, AllocationPackage.ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION, Allocation.class, msgs);
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
			case AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
				if (resolve) return getResourceContainer_AllocationContext();
				return basicGetResourceContainer_AllocationContext();
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
				if (resolve) return getAssemblyContext_AllocationContext();
				return basicGetAssemblyContext_AllocationContext();
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				return getAllocation_AllocationContext();
			case AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES:
				if (resolve) return getDeployables();
				return basicGetDeployables();
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
			case AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
				setResourceContainer_AllocationContext((environment.Container)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
				setAssemblyContext_AllocationContext((AssemblyContext)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				setAllocation_AllocationContext((Allocation)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES:
				setDeployables((Deployable)newValue);
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
			case AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
				setResourceContainer_AllocationContext((environment.Container)null);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
				setAssemblyContext_AllocationContext((AssemblyContext)null);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				setAllocation_AllocationContext((Allocation)null);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES:
				setDeployables((Deployable)null);
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
			case AllocationPackage.ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT:
				return resourceContainer_AllocationContext != null;
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT:
				return assemblyContext_AllocationContext != null;
			case AllocationPackage.ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT:
				return getAllocation_AllocationContext() != null;
			case AllocationPackage.ALLOCATION_CONTEXT__DEPLOYABLES:
				return deployables != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
