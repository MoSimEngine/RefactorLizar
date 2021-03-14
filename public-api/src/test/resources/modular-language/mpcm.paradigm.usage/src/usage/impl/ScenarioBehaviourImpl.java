/**
 */
package usage.impl;

import base.impl.EntityImpl;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import usage.AbstractUserAction;
import usage.BranchTransition;
import usage.Loop;
import usage.ScenarioBehaviour;
import usage.UsagePackage;

import usage.util.UsageValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usage.impl.ScenarioBehaviourImpl#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}</li>
 *   <li>{@link usage.impl.ScenarioBehaviourImpl#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}</li>
 *   <li>{@link usage.impl.ScenarioBehaviourImpl#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioBehaviourImpl extends EntityImpl implements ScenarioBehaviour {
	/**
	 * The cached value of the '{@link #getActions_ScenarioBehaviour() <em>Actions Scenario Behaviour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions_ScenarioBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUserAction> actions_ScenarioBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagePackage.Literals.SCENARIO_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BranchTransition getBranchTransition_ScenarioBehaviour() {
		if (eContainerFeatureID() != UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR) return null;
		return (BranchTransition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchTransition_ScenarioBehaviour(BranchTransition newBranchTransition_ScenarioBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranchTransition_ScenarioBehaviour, UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchTransition_ScenarioBehaviour(BranchTransition newBranchTransition_ScenarioBehaviour) {
		if (newBranchTransition_ScenarioBehaviour != eInternalContainer() || (eContainerFeatureID() != UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR && newBranchTransition_ScenarioBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newBranchTransition_ScenarioBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranchTransition_ScenarioBehaviour != null)
				msgs = ((InternalEObject)newBranchTransition_ScenarioBehaviour).eInverseAdd(this, UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, BranchTransition.class, msgs);
			msgs = basicSetBranchTransition_ScenarioBehaviour(newBranchTransition_ScenarioBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, newBranchTransition_ScenarioBehaviour, newBranchTransition_ScenarioBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop getLoop_ScenarioBehaviour() {
		if (eContainerFeatureID() != UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR) return null;
		return (Loop)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLoop_ScenarioBehaviour, UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoop_ScenarioBehaviour(Loop newLoop_ScenarioBehaviour) {
		if (newLoop_ScenarioBehaviour != eInternalContainer() || (eContainerFeatureID() != UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR && newLoop_ScenarioBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newLoop_ScenarioBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLoop_ScenarioBehaviour != null)
				msgs = ((InternalEObject)newLoop_ScenarioBehaviour).eInverseAdd(this, UsagePackage.LOOP__BODY_BEHAVIOUR_LOOP, Loop.class, msgs);
			msgs = basicSetLoop_ScenarioBehaviour(newLoop_ScenarioBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR, newLoop_ScenarioBehaviour, newLoop_ScenarioBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractUserAction> getActions_ScenarioBehaviour() {
		if (actions_ScenarioBehaviour == null) {
			actions_ScenarioBehaviour = new EObjectContainmentWithInverseEList<AbstractUserAction>(AbstractUserAction.class, this, UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR, UsagePackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION);
		}
		return actions_ScenarioBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean Exactlyonestart(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UsageValidator.DIAGNOSTIC_SOURCE,
						 UsageValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTART,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Exactlyonestart", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean Exactlyonestop(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UsageValidator.DIAGNOSTIC_SOURCE,
						 UsageValidator.SCENARIO_BEHAVIOUR__EXACTLYONESTOP,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Exactlyonestop", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UsageValidator.DIAGNOSTIC_SOURCE,
						 UsageValidator.SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EachuseractionexceptStartandStopmusthaveapredecessorandsuccessor", EObjectValidator.getObjectLabel(this, context) }),
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranchTransition_ScenarioBehaviour((BranchTransition)otherEnd, msgs);
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLoop_ScenarioBehaviour((Loop)otherEnd, msgs);
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions_ScenarioBehaviour()).basicAdd(otherEnd, msgs);
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				return basicSetBranchTransition_ScenarioBehaviour(null, msgs);
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				return basicSetLoop_ScenarioBehaviour(null, msgs);
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				return ((InternalEList<?>)getActions_ScenarioBehaviour()).basicRemove(otherEnd, msgs);
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, BranchTransition.class, msgs);
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, UsagePackage.LOOP__BODY_BEHAVIOUR_LOOP, Loop.class, msgs);
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				return getBranchTransition_ScenarioBehaviour();
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				return getLoop_ScenarioBehaviour();
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				return getActions_ScenarioBehaviour();
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				setBranchTransition_ScenarioBehaviour((BranchTransition)newValue);
				return;
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				setLoop_ScenarioBehaviour((Loop)newValue);
				return;
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				getActions_ScenarioBehaviour().clear();
				getActions_ScenarioBehaviour().addAll((Collection<? extends AbstractUserAction>)newValue);
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				setBranchTransition_ScenarioBehaviour((BranchTransition)null);
				return;
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				setLoop_ScenarioBehaviour((Loop)null);
				return;
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				getActions_ScenarioBehaviour().clear();
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
			case UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR:
				return getBranchTransition_ScenarioBehaviour() != null;
			case UsagePackage.SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR:
				return getLoop_ScenarioBehaviour() != null;
			case UsagePackage.SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR:
				return actions_ScenarioBehaviour != null && !actions_ScenarioBehaviour.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioBehaviourImpl
