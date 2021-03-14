/**
 */
package composition.impl;

import base.impl.EntityImpl;

import composition.AssemblyContext;
import composition.ComposedStructure;
import composition.CompositionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.RepositoryComponent;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link composition.impl.AssemblyContextImpl#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 *   <li>{@link composition.impl.AssemblyContextImpl#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}</li>
 *   <li>{@link composition.impl.AssemblyContextImpl#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends EntityImpl implements AssemblyContext {
	/**
	 * The cached value of the '{@link #getParentStructure__AssemblyContext() <em>Parent Structure Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStructure__AssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected ComposedStructure parentStructure__AssemblyContext;

	/**
	 * The cached value of the '{@link #getEncapsulatedComponent__AssemblyContext() <em>Encapsulated Component Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedComponent__AssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent encapsulatedComponent__AssemblyContext;

	/**
	 * The cached value of the '{@link #getConfigParameterUsages__AssemblyContext() <em>Config Parameter Usages Assembly Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigParameterUsages__AssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> configParameterUsages__AssemblyContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.ASSEMBLY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposedStructure getParentStructure__AssemblyContext() {
		if (parentStructure__AssemblyContext != null && parentStructure__AssemblyContext.eIsProxy()) {
			InternalEObject oldParentStructure__AssemblyContext = (InternalEObject)parentStructure__AssemblyContext;
			parentStructure__AssemblyContext = (ComposedStructure)eResolveProxy(oldParentStructure__AssemblyContext);
			if (parentStructure__AssemblyContext != oldParentStructure__AssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, oldParentStructure__AssemblyContext, parentStructure__AssemblyContext));
			}
		}
		return parentStructure__AssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedStructure basicGetParentStructure__AssemblyContext() {
		return parentStructure__AssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentStructure__AssemblyContext(ComposedStructure newParentStructure__AssemblyContext) {
		ComposedStructure oldParentStructure__AssemblyContext = parentStructure__AssemblyContext;
		parentStructure__AssemblyContext = newParentStructure__AssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT, oldParentStructure__AssemblyContext, parentStructure__AssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryComponent getEncapsulatedComponent__AssemblyContext() {
		if (encapsulatedComponent__AssemblyContext != null && encapsulatedComponent__AssemblyContext.eIsProxy()) {
			InternalEObject oldEncapsulatedComponent__AssemblyContext = (InternalEObject)encapsulatedComponent__AssemblyContext;
			encapsulatedComponent__AssemblyContext = (RepositoryComponent)eResolveProxy(oldEncapsulatedComponent__AssemblyContext);
			if (encapsulatedComponent__AssemblyContext != oldEncapsulatedComponent__AssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT, oldEncapsulatedComponent__AssemblyContext, encapsulatedComponent__AssemblyContext));
			}
		}
		return encapsulatedComponent__AssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetEncapsulatedComponent__AssemblyContext() {
		return encapsulatedComponent__AssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulatedComponent__AssemblyContext(RepositoryComponent newEncapsulatedComponent__AssemblyContext) {
		RepositoryComponent oldEncapsulatedComponent__AssemblyContext = encapsulatedComponent__AssemblyContext;
		encapsulatedComponent__AssemblyContext = newEncapsulatedComponent__AssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT, oldEncapsulatedComponent__AssemblyContext, encapsulatedComponent__AssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableUsage> getConfigParameterUsages__AssemblyContext() {
		if (configParameterUsages__AssemblyContext == null) {
			configParameterUsages__AssemblyContext = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT);
		}
		return configParameterUsages__AssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
				return ((InternalEList<?>)getConfigParameterUsages__AssemblyContext()).basicRemove(otherEnd, msgs);
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
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				if (resolve) return getParentStructure__AssemblyContext();
				return basicGetParentStructure__AssemblyContext();
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
				if (resolve) return getEncapsulatedComponent__AssemblyContext();
				return basicGetEncapsulatedComponent__AssemblyContext();
			case CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
				return getConfigParameterUsages__AssemblyContext();
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
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				setParentStructure__AssemblyContext((ComposedStructure)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
				setEncapsulatedComponent__AssemblyContext((RepositoryComponent)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
				getConfigParameterUsages__AssemblyContext().clear();
				getConfigParameterUsages__AssemblyContext().addAll((Collection<? extends VariableUsage>)newValue);
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
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				setParentStructure__AssemblyContext((ComposedStructure)null);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
				setEncapsulatedComponent__AssemblyContext((RepositoryComponent)null);
				return;
			case CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
				getConfigParameterUsages__AssemblyContext().clear();
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
			case CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT:
				return parentStructure__AssemblyContext != null;
			case CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT:
				return encapsulatedComponent__AssemblyContext != null;
			case CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT:
				return configParameterUsages__AssemblyContext != null && !configParameterUsages__AssemblyContext.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyContextImpl
