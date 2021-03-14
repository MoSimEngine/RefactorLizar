/**
 */
package behaviourseff.util;

import base.Entity;
import base.NamedElement;

import behaviourseff.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import seff.AbstractAction;
import seff.AbstractBranchTransition;
import seff.AbstractInternalControlFlowAction;
import seff.AbstractLoopAction;

import softwarerepository.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behaviourseff.BehaviourseffPackage
 * @generated
 */
public class BehaviourseffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourseffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourseffPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourseffSwitch<Adapter> modelSwitch =
		new BehaviourseffSwitch<Adapter>() {
			@Override
			public Adapter caseBehaviourSEFF(BehaviourSEFF object) {
				return createBehaviourSEFFAdapter();
			}
			@Override
			public Adapter caseProbabilisticBranchTransition(ProbabilisticBranchTransition object) {
				return createProbabilisticBranchTransitionAdapter();
			}
			@Override
			public Adapter caseGuardedBranchTransition(GuardedBranchTransition object) {
				return createGuardedBranchTransitionAdapter();
			}
			@Override
			public Adapter caseCollectionIteratorAction(CollectionIteratorAction object) {
				return createCollectionIteratorActionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object) {
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseCallReturnAction(CallReturnAction object) {
				return createCallReturnActionAdapter();
			}
			@Override
			public Adapter caseExternalCallAction(ExternalCallAction object) {
				return createExternalCallActionAdapter();
			}
			@Override
			public Adapter caseAcquireAction(AcquireAction object) {
				return createAcquireActionAdapter();
			}
			@Override
			public Adapter caseReleaseAction(ReleaseAction object) {
				return createReleaseActionAdapter();
			}
			@Override
			public Adapter caseSetVariableAction(SetVariableAction object) {
				return createSetVariableActionAdapter();
			}
			@Override
			public Adapter caseServiceEffectSpecification(ServiceEffectSpecification object) {
				return createServiceEffectSpecificationAdapter();
			}
			@Override
			public Adapter caseIdentifier(de.uka.ipd.sdq.identifier.Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAbstractBranchTransition(AbstractBranchTransition object) {
				return createAbstractBranchTransitionAdapter();
			}
			@Override
			public Adapter caseAbstractAction(AbstractAction object) {
				return createAbstractActionAdapter();
			}
			@Override
			public Adapter caseAbstractInternalControlFlowAction(AbstractInternalControlFlowAction object) {
				return createAbstractInternalControlFlowActionAdapter();
			}
			@Override
			public Adapter caseAbstractLoopAction(AbstractLoopAction object) {
				return createAbstractLoopActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.BehaviourSEFF <em>Behaviour SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.BehaviourSEFF
	 * @generated
	 */
	public Adapter createBehaviourSEFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.ProbabilisticBranchTransition <em>Probabilistic Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.ProbabilisticBranchTransition
	 * @generated
	 */
	public Adapter createProbabilisticBranchTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.GuardedBranchTransition <em>Guarded Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.GuardedBranchTransition
	 * @generated
	 */
	public Adapter createGuardedBranchTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.CollectionIteratorAction <em>Collection Iterator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.CollectionIteratorAction
	 * @generated
	 */
	public Adapter createCollectionIteratorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.CallReturnAction <em>Call Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.CallReturnAction
	 * @generated
	 */
	public Adapter createCallReturnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.ExternalCallAction <em>External Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.ExternalCallAction
	 * @generated
	 */
	public Adapter createExternalCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.AcquireAction <em>Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.AcquireAction
	 * @generated
	 */
	public Adapter createAcquireActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.ReleaseAction <em>Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.ReleaseAction
	 * @generated
	 */
	public Adapter createReleaseActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourseff.SetVariableAction <em>Set Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourseff.SetVariableAction
	 * @generated
	 */
	public Adapter createSetVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link softwarerepository.ServiceEffectSpecification <em>Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see softwarerepository.ServiceEffectSpecification
	 * @generated
	 */
	public Adapter createServiceEffectSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link seff.AbstractBranchTransition <em>Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see seff.AbstractBranchTransition
	 * @generated
	 */
	public Adapter createAbstractBranchTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link seff.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see seff.AbstractAction
	 * @generated
	 */
	public Adapter createAbstractActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link seff.AbstractInternalControlFlowAction <em>Abstract Internal Control Flow Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see seff.AbstractInternalControlFlowAction
	 * @generated
	 */
	public Adapter createAbstractInternalControlFlowActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link seff.AbstractLoopAction <em>Abstract Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see seff.AbstractLoopAction
	 * @generated
	 */
	public Adapter createAbstractLoopActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviourseffAdapterFactory
