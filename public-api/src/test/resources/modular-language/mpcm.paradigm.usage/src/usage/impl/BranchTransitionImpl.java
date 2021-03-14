/**
 */
package usage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import usage.Branch;
import usage.BranchTransition;
import usage.ScenarioBehaviour;
import usage.UsagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usage.impl.BranchTransitionImpl#getBranchProbability <em>Branch Probability</em>}</li>
 *   <li>{@link usage.impl.BranchTransitionImpl#getBranch_BranchTransition <em>Branch Branch Transition</em>}</li>
 *   <li>{@link usage.impl.BranchTransitionImpl#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchTransitionImpl extends MinimalEObjectImpl.Container implements BranchTransition {
	/**
	 * The default value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double BRANCH_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBranchProbability() <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProbability()
	 * @generated
	 * @ordered
	 */
	protected double branchProbability = BRANCH_PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBranchedBehaviour_BranchTransition() <em>Branched Behaviour Branch Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchedBehaviour_BranchTransition()
	 * @generated
	 * @ordered
	 */
	protected ScenarioBehaviour branchedBehaviour_BranchTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagePackage.Literals.BRANCH_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBranchProbability() {
		return branchProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchProbability(double newBranchProbability) {
		double oldBranchProbability = branchProbability;
		branchProbability = newBranchProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_TRANSITION__BRANCH_PROBABILITY, oldBranchProbability, branchProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranch_BranchTransition() {
		if (eContainerFeatureID() != UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION) return null;
		return (Branch)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch_BranchTransition(Branch newBranch_BranchTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranch_BranchTransition, UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch_BranchTransition(Branch newBranch_BranchTransition) {
		if (newBranch_BranchTransition != eInternalContainer() || (eContainerFeatureID() != UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION && newBranch_BranchTransition != null)) {
			if (EcoreUtil.isAncestor(this, newBranch_BranchTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranch_BranchTransition != null)
				msgs = ((InternalEObject)newBranch_BranchTransition).eInverseAdd(this, UsagePackage.BRANCH__BRANCH_TRANSITIONS_BRANCH, Branch.class, msgs);
			msgs = basicSetBranch_BranchTransition(newBranch_BranchTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION, newBranch_BranchTransition, newBranch_BranchTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScenarioBehaviour getBranchedBehaviour_BranchTransition() {
		return branchedBehaviour_BranchTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchedBehaviour_BranchTransition(ScenarioBehaviour newBranchedBehaviour_BranchTransition, NotificationChain msgs) {
		ScenarioBehaviour oldBranchedBehaviour_BranchTransition = branchedBehaviour_BranchTransition;
		branchedBehaviour_BranchTransition = newBranchedBehaviour_BranchTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, oldBranchedBehaviour_BranchTransition, newBranchedBehaviour_BranchTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchedBehaviour_BranchTransition(ScenarioBehaviour newBranchedBehaviour_BranchTransition) {
		if (newBranchedBehaviour_BranchTransition != branchedBehaviour_BranchTransition) {
			NotificationChain msgs = null;
			if (branchedBehaviour_BranchTransition != null)
				msgs = ((InternalEObject)branchedBehaviour_BranchTransition).eInverseRemove(this, UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, ScenarioBehaviour.class, msgs);
			if (newBranchedBehaviour_BranchTransition != null)
				msgs = ((InternalEObject)newBranchedBehaviour_BranchTransition).eInverseAdd(this, UsagePackage.SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR, ScenarioBehaviour.class, msgs);
			msgs = basicSetBranchedBehaviour_BranchTransition(newBranchedBehaviour_BranchTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, newBranchedBehaviour_BranchTransition, newBranchedBehaviour_BranchTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranch_BranchTransition((Branch)otherEnd, msgs);
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				if (branchedBehaviour_BranchTransition != null)
					msgs = ((InternalEObject)branchedBehaviour_BranchTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION, null, msgs);
				return basicSetBranchedBehaviour_BranchTransition((ScenarioBehaviour)otherEnd, msgs);
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				return basicSetBranch_BranchTransition(null, msgs);
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				return basicSetBranchedBehaviour_BranchTransition(null, msgs);
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				return eInternalContainer().eInverseRemove(this, UsagePackage.BRANCH__BRANCH_TRANSITIONS_BRANCH, Branch.class, msgs);
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_PROBABILITY:
				return getBranchProbability();
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				return getBranch_BranchTransition();
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				return getBranchedBehaviour_BranchTransition();
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_PROBABILITY:
				setBranchProbability((Double)newValue);
				return;
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				setBranch_BranchTransition((Branch)newValue);
				return;
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				setBranchedBehaviour_BranchTransition((ScenarioBehaviour)newValue);
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_PROBABILITY:
				setBranchProbability(BRANCH_PROBABILITY_EDEFAULT);
				return;
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				setBranch_BranchTransition((Branch)null);
				return;
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				setBranchedBehaviour_BranchTransition((ScenarioBehaviour)null);
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
			case UsagePackage.BRANCH_TRANSITION__BRANCH_PROBABILITY:
				return branchProbability != BRANCH_PROBABILITY_EDEFAULT;
			case UsagePackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION:
				return getBranch_BranchTransition() != null;
			case UsagePackage.BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION:
				return branchedBehaviour_BranchTransition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (branchProbability: ");
		result.append(branchProbability);
		result.append(')');
		return result.toString();
	}

} //BranchTransitionImpl
