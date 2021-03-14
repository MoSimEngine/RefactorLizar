/**
 */
package performance.seff.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import performance.seff.ParametricResourceDemand;
import performance.seff.SeffPackage;

import performance.seff.util.SeffValidator;

import resources.resourcetype.ProcessingResourceType;

import seff.AbstractInternalControlFlowAction;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.seff.impl.ParametricResourceDemandImpl#getSpecification_ParametericResourceDemand <em>Specification Parameteric Resource Demand</em>}</li>
 *   <li>{@link performance.seff.impl.ParametricResourceDemandImpl#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}</li>
 *   <li>{@link performance.seff.impl.ParametricResourceDemandImpl#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}</li>
 *   <li>{@link performance.seff.impl.ParametricResourceDemandImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametricResourceDemandImpl extends MinimalEObjectImpl.Container implements ParametricResourceDemand {
	/**
	 * The cached value of the '{@link #getSpecification_ParametericResourceDemand() <em>Specification Parameteric Resource Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_ParametericResourceDemand()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable specification_ParametericResourceDemand;

	/**
	 * The cached value of the '{@link #getRequiredResource_ParametricResourceDemand() <em>Required Resource Parametric Resource Demand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResource_ParametricResourceDemand()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType requiredResource_ParametricResourceDemand;

	/**
	 * The cached value of the '{@link #getAction_ParametricResourceDemand() <em>Action Parametric Resource Demand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_ParametricResourceDemand()
	 * @generated
	 * @ordered
	 */
	protected AbstractInternalControlFlowAction action_ParametricResourceDemand;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected AbstractInternalControlFlowAction owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametricResourceDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.PARAMETRIC_RESOURCE_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getSpecification_ParametericResourceDemand() {
		return specification_ParametericResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification_ParametericResourceDemand(PCMRandomVariable newSpecification_ParametericResourceDemand, NotificationChain msgs) {
		PCMRandomVariable oldSpecification_ParametericResourceDemand = specification_ParametericResourceDemand;
		specification_ParametericResourceDemand = newSpecification_ParametericResourceDemand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, oldSpecification_ParametericResourceDemand, newSpecification_ParametericResourceDemand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification_ParametericResourceDemand(PCMRandomVariable newSpecification_ParametericResourceDemand) {
		if (newSpecification_ParametericResourceDemand != specification_ParametericResourceDemand) {
			NotificationChain msgs = null;
			if (specification_ParametericResourceDemand != null)
				msgs = ((InternalEObject)specification_ParametericResourceDemand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, null, msgs);
			if (newSpecification_ParametericResourceDemand != null)
				msgs = ((InternalEObject)newSpecification_ParametericResourceDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, null, msgs);
			msgs = basicSetSpecification_ParametericResourceDemand(newSpecification_ParametericResourceDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND, newSpecification_ParametericResourceDemand, newSpecification_ParametericResourceDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType getRequiredResource_ParametricResourceDemand() {
		if (requiredResource_ParametricResourceDemand != null && requiredResource_ParametricResourceDemand.eIsProxy()) {
			InternalEObject oldRequiredResource_ParametricResourceDemand = (InternalEObject)requiredResource_ParametricResourceDemand;
			requiredResource_ParametricResourceDemand = (ProcessingResourceType)eResolveProxy(oldRequiredResource_ParametricResourceDemand);
			if (requiredResource_ParametricResourceDemand != oldRequiredResource_ParametricResourceDemand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
			}
		}
		return requiredResource_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetRequiredResource_ParametricResourceDemand() {
		return requiredResource_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredResource_ParametricResourceDemand(ProcessingResourceType newRequiredResource_ParametricResourceDemand) {
		ProcessingResourceType oldRequiredResource_ParametricResourceDemand = requiredResource_ParametricResourceDemand;
		requiredResource_ParametricResourceDemand = newRequiredResource_ParametricResourceDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredResource_ParametricResourceDemand, requiredResource_ParametricResourceDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction getAction_ParametricResourceDemand() {
		if (action_ParametricResourceDemand != null && action_ParametricResourceDemand.eIsProxy()) {
			InternalEObject oldAction_ParametricResourceDemand = (InternalEObject)action_ParametricResourceDemand;
			action_ParametricResourceDemand = (AbstractInternalControlFlowAction)eResolveProxy(oldAction_ParametricResourceDemand);
			if (action_ParametricResourceDemand != oldAction_ParametricResourceDemand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, oldAction_ParametricResourceDemand, action_ParametricResourceDemand));
			}
		}
		return action_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction basicGetAction_ParametricResourceDemand() {
		return action_ParametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction_ParametricResourceDemand(AbstractInternalControlFlowAction newAction_ParametricResourceDemand) {
		AbstractInternalControlFlowAction oldAction_ParametricResourceDemand = action_ParametricResourceDemand;
		action_ParametricResourceDemand = newAction_ParametricResourceDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND, oldAction_ParametricResourceDemand, action_ParametricResourceDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (AbstractInternalControlFlowAction)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AbstractInternalControlFlowAction newOwner) {
		AbstractInternalControlFlowAction oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.PARAMETRIC_RESOURCE_DEMAND__DEMANDED_PROCESSING_RESOURCE_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DemandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
				return basicSetSpecification_ParametericResourceDemand(null, msgs);
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
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
				return getSpecification_ParametericResourceDemand();
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				if (resolve) return getRequiredResource_ParametricResourceDemand();
				return basicGetRequiredResource_ParametricResourceDemand();
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				if (resolve) return getAction_ParametricResourceDemand();
				return basicGetAction_ParametricResourceDemand();
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
				setSpecification_ParametericResourceDemand((PCMRandomVariable)newValue);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				setRequiredResource_ParametricResourceDemand((ProcessingResourceType)newValue);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				setAction_ParametricResourceDemand((AbstractInternalControlFlowAction)newValue);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER:
				setOwner((AbstractInternalControlFlowAction)newValue);
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
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
				setSpecification_ParametericResourceDemand((PCMRandomVariable)null);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				setRequiredResource_ParametricResourceDemand((ProcessingResourceType)null);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				setAction_ParametricResourceDemand((AbstractInternalControlFlowAction)null);
				return;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER:
				setOwner((AbstractInternalControlFlowAction)null);
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
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND:
				return specification_ParametericResourceDemand != null;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
				return requiredResource_ParametricResourceDemand != null;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND:
				return action_ParametricResourceDemand != null;
			case SeffPackage.PARAMETRIC_RESOURCE_DEMAND__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametricResourceDemandImpl
