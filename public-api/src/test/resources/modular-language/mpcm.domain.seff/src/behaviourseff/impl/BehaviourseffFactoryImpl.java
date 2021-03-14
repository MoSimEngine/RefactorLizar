/**
 */
package behaviourseff.impl;

import behaviourseff.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourseffFactoryImpl extends EFactoryImpl implements BehaviourseffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourseffFactory init() {
		try {
			BehaviourseffFactory theBehaviourseffFactory = (BehaviourseffFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourseffPackage.eNS_URI);
			if (theBehaviourseffFactory != null) {
				return theBehaviourseffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourseffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviourseffPackage.BEHAVIOUR_SEFF: return createBehaviourSEFF();
			case BehaviourseffPackage.PROBABILISTIC_BRANCH_TRANSITION: return createProbabilisticBranchTransition();
			case BehaviourseffPackage.GUARDED_BRANCH_TRANSITION: return createGuardedBranchTransition();
			case BehaviourseffPackage.COLLECTION_ITERATOR_ACTION: return createCollectionIteratorAction();
			case BehaviourseffPackage.CALL_RETURN_ACTION: return createCallReturnAction();
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION: return createExternalCallAction();
			case BehaviourseffPackage.ACQUIRE_ACTION: return createAcquireAction();
			case BehaviourseffPackage.RELEASE_ACTION: return createReleaseAction();
			case BehaviourseffPackage.SET_VARIABLE_ACTION: return createSetVariableAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourSEFF createBehaviourSEFF() {
		BehaviourSEFFImpl behaviourSEFF = new BehaviourSEFFImpl();
		return behaviourSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticBranchTransition createProbabilisticBranchTransition() {
		ProbabilisticBranchTransitionImpl probabilisticBranchTransition = new ProbabilisticBranchTransitionImpl();
		return probabilisticBranchTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedBranchTransition createGuardedBranchTransition() {
		GuardedBranchTransitionImpl guardedBranchTransition = new GuardedBranchTransitionImpl();
		return guardedBranchTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionIteratorAction createCollectionIteratorAction() {
		CollectionIteratorActionImpl collectionIteratorAction = new CollectionIteratorActionImpl();
		return collectionIteratorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallReturnAction createCallReturnAction() {
		CallReturnActionImpl callReturnAction = new CallReturnActionImpl();
		return callReturnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCallAction createExternalCallAction() {
		ExternalCallActionImpl externalCallAction = new ExternalCallActionImpl();
		return externalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireAction createAcquireAction() {
		AcquireActionImpl acquireAction = new AcquireActionImpl();
		return acquireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseAction createReleaseAction() {
		ReleaseActionImpl releaseAction = new ReleaseActionImpl();
		return releaseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetVariableAction createSetVariableAction() {
		SetVariableActionImpl setVariableAction = new SetVariableActionImpl();
		return setVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffPackage getBehaviourseffPackage() {
		return (BehaviourseffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourseffPackage getPackage() {
		return BehaviourseffPackage.eINSTANCE;
	}

} //BehaviourseffFactoryImpl
