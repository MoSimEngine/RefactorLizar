/**
 */
package internalbehaviour.impl;

import behaviourseff.impl.CallActionImpl;

import internalbehaviour.InternalBehaviourSEFF;
import internalbehaviour.InternalCallAction;
import internalbehaviour.InternalbehaviourPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import seff.AbstractAction;
import seff.AbstractInternalControlFlowAction;
import seff.Behaviour;
import seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internalbehaviour.impl.InternalCallActionImpl#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}</li>
 *   <li>{@link internalbehaviour.impl.InternalCallActionImpl#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}</li>
 *   <li>{@link internalbehaviour.impl.InternalCallActionImpl#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}</li>
 *   <li>{@link internalbehaviour.impl.InternalCallActionImpl#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalCallActionImpl extends CallActionImpl implements InternalCallAction {
	/**
	 * The cached value of the '{@link #getPredecessor_AbstractAction() <em>Predecessor Abstract Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor_AbstractAction()
	 * @generated
	 * @ordered
	 */
	protected AbstractAction predecessor_AbstractAction;

	/**
	 * The cached value of the '{@link #getSuccessor_AbstractAction() <em>Successor Abstract Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor_AbstractAction()
	 * @generated
	 * @ordered
	 */
	protected AbstractAction successor_AbstractAction;

	/**
	 * The cached value of the '{@link #getCalledResourceDemandingInternalBehaviour() <em>Called Resource Demanding Internal Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledResourceDemandingInternalBehaviour()
	 * @generated
	 * @ordered
	 */
	protected InternalBehaviourSEFF calledResourceDemandingInternalBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalCallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalbehaviourPackage.Literals.INTERNAL_CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction getPredecessor_AbstractAction() {
		if (predecessor_AbstractAction != null && predecessor_AbstractAction.eIsProxy()) {
			InternalEObject oldPredecessor_AbstractAction = (InternalEObject)predecessor_AbstractAction;
			predecessor_AbstractAction = (AbstractAction)eResolveProxy(oldPredecessor_AbstractAction);
			if (predecessor_AbstractAction != oldPredecessor_AbstractAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION, oldPredecessor_AbstractAction, predecessor_AbstractAction));
			}
		}
		return predecessor_AbstractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetPredecessor_AbstractAction() {
		return predecessor_AbstractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecessor_AbstractAction(AbstractAction newPredecessor_AbstractAction, NotificationChain msgs) {
		AbstractAction oldPredecessor_AbstractAction = predecessor_AbstractAction;
		predecessor_AbstractAction = newPredecessor_AbstractAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION, oldPredecessor_AbstractAction, newPredecessor_AbstractAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor_AbstractAction(AbstractAction newPredecessor_AbstractAction) {
		if (newPredecessor_AbstractAction != predecessor_AbstractAction) {
			NotificationChain msgs = null;
			if (predecessor_AbstractAction != null)
				msgs = ((InternalEObject)predecessor_AbstractAction).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
			if (newPredecessor_AbstractAction != null)
				msgs = ((InternalEObject)newPredecessor_AbstractAction).eInverseAdd(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
			msgs = basicSetPredecessor_AbstractAction(newPredecessor_AbstractAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION, newPredecessor_AbstractAction, newPredecessor_AbstractAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction getSuccessor_AbstractAction() {
		if (successor_AbstractAction != null && successor_AbstractAction.eIsProxy()) {
			InternalEObject oldSuccessor_AbstractAction = (InternalEObject)successor_AbstractAction;
			successor_AbstractAction = (AbstractAction)eResolveProxy(oldSuccessor_AbstractAction);
			if (successor_AbstractAction != oldSuccessor_AbstractAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION, oldSuccessor_AbstractAction, successor_AbstractAction));
			}
		}
		return successor_AbstractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetSuccessor_AbstractAction() {
		return successor_AbstractAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor_AbstractAction(AbstractAction newSuccessor_AbstractAction, NotificationChain msgs) {
		AbstractAction oldSuccessor_AbstractAction = successor_AbstractAction;
		successor_AbstractAction = newSuccessor_AbstractAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION, oldSuccessor_AbstractAction, newSuccessor_AbstractAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor_AbstractAction(AbstractAction newSuccessor_AbstractAction) {
		if (newSuccessor_AbstractAction != successor_AbstractAction) {
			NotificationChain msgs = null;
			if (successor_AbstractAction != null)
				msgs = ((InternalEObject)successor_AbstractAction).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
			if (newSuccessor_AbstractAction != null)
				msgs = ((InternalEObject)newSuccessor_AbstractAction).eInverseAdd(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
			msgs = basicSetSuccessor_AbstractAction(newSuccessor_AbstractAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION, newSuccessor_AbstractAction, newSuccessor_AbstractAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getResourceDemandingBehaviour_AbstractAction() {
		if (eContainerFeatureID() != InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION) return null;
		return (Behaviour)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceDemandingBehaviour_AbstractAction(Behaviour newResourceDemandingBehaviour_AbstractAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResourceDemandingBehaviour_AbstractAction, InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDemandingBehaviour_AbstractAction(Behaviour newResourceDemandingBehaviour_AbstractAction) {
		if (newResourceDemandingBehaviour_AbstractAction != eInternalContainer() || (eContainerFeatureID() != InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION && newResourceDemandingBehaviour_AbstractAction != null)) {
			if (EcoreUtil.isAncestor(this, newResourceDemandingBehaviour_AbstractAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResourceDemandingBehaviour_AbstractAction != null)
				msgs = ((InternalEObject)newResourceDemandingBehaviour_AbstractAction).eInverseAdd(this, SeffPackage.BEHAVIOUR__STEPS_BEHAVIOUR, Behaviour.class, msgs);
			msgs = basicSetResourceDemandingBehaviour_AbstractAction(newResourceDemandingBehaviour_AbstractAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION, newResourceDemandingBehaviour_AbstractAction, newResourceDemandingBehaviour_AbstractAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehaviourSEFF getCalledResourceDemandingInternalBehaviour() {
		if (calledResourceDemandingInternalBehaviour != null && calledResourceDemandingInternalBehaviour.eIsProxy()) {
			InternalEObject oldCalledResourceDemandingInternalBehaviour = (InternalEObject)calledResourceDemandingInternalBehaviour;
			calledResourceDemandingInternalBehaviour = (InternalBehaviourSEFF)eResolveProxy(oldCalledResourceDemandingInternalBehaviour);
			if (calledResourceDemandingInternalBehaviour != oldCalledResourceDemandingInternalBehaviour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR, oldCalledResourceDemandingInternalBehaviour, calledResourceDemandingInternalBehaviour));
			}
		}
		return calledResourceDemandingInternalBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehaviourSEFF basicGetCalledResourceDemandingInternalBehaviour() {
		return calledResourceDemandingInternalBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledResourceDemandingInternalBehaviour(InternalBehaviourSEFF newCalledResourceDemandingInternalBehaviour) {
		InternalBehaviourSEFF oldCalledResourceDemandingInternalBehaviour = calledResourceDemandingInternalBehaviour;
		calledResourceDemandingInternalBehaviour = newCalledResourceDemandingInternalBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR, oldCalledResourceDemandingInternalBehaviour, calledResourceDemandingInternalBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				if (predecessor_AbstractAction != null)
					msgs = ((InternalEObject)predecessor_AbstractAction).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
				return basicSetPredecessor_AbstractAction((AbstractAction)otherEnd, msgs);
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				if (successor_AbstractAction != null)
					msgs = ((InternalEObject)successor_AbstractAction).eInverseRemove(this, SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION, AbstractAction.class, msgs);
				return basicSetSuccessor_AbstractAction((AbstractAction)otherEnd, msgs);
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResourceDemandingBehaviour_AbstractAction((Behaviour)otherEnd, msgs);
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				return basicSetPredecessor_AbstractAction(null, msgs);
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				return basicSetSuccessor_AbstractAction(null, msgs);
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				return basicSetResourceDemandingBehaviour_AbstractAction(null, msgs);
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				return eInternalContainer().eInverseRemove(this, SeffPackage.BEHAVIOUR__STEPS_BEHAVIOUR, Behaviour.class, msgs);
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				if (resolve) return getPredecessor_AbstractAction();
				return basicGetPredecessor_AbstractAction();
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				if (resolve) return getSuccessor_AbstractAction();
				return basicGetSuccessor_AbstractAction();
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				return getResourceDemandingBehaviour_AbstractAction();
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
				if (resolve) return getCalledResourceDemandingInternalBehaviour();
				return basicGetCalledResourceDemandingInternalBehaviour();
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				setPredecessor_AbstractAction((AbstractAction)newValue);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				setSuccessor_AbstractAction((AbstractAction)newValue);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				setResourceDemandingBehaviour_AbstractAction((Behaviour)newValue);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
				setCalledResourceDemandingInternalBehaviour((InternalBehaviourSEFF)newValue);
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				setPredecessor_AbstractAction((AbstractAction)null);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				setSuccessor_AbstractAction((AbstractAction)null);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				setResourceDemandingBehaviour_AbstractAction((Behaviour)null);
				return;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
				setCalledResourceDemandingInternalBehaviour((InternalBehaviourSEFF)null);
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
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION:
				return predecessor_AbstractAction != null;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION:
				return successor_AbstractAction != null;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION:
				return getResourceDemandingBehaviour_AbstractAction() != null;
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
				return calledResourceDemandingInternalBehaviour != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractAction.class) {
			switch (derivedFeatureID) {
				case InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION: return SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;
				case InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION: return SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;
				case InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION: return SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInternalControlFlowAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractAction.class) {
			switch (baseFeatureID) {
				case SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION: return InternalbehaviourPackage.INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION;
				case SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION: return InternalbehaviourPackage.INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION;
				case SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION: return InternalbehaviourPackage.INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInternalControlFlowAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InternalCallActionImpl
