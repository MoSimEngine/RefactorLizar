/**
 */
package reliability.seff.util;

import base.Entity;
import base.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import reliability.FailureOccurrenceDescription;

import reliability.seff.*;

import seff.AbstractAction;
import seff.AbstractInternalControlFlowAction;
import seff.Behaviour;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see reliability.seff.SeffPackage
 * @generated
 */
public class SeffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SeffPackage.eINSTANCE;
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
	protected SeffSwitch<Adapter> modelSwitch =
		new SeffSwitch<Adapter>() {
			@Override
			public Adapter caseInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription object) {
				return createInternalFailureOccurrenceDescriptionAdapter();
			}
			@Override
			public Adapter caseRecoveryAction(RecoveryAction object) {
				return createRecoveryActionAdapter();
			}
			@Override
			public Adapter caseRecoveryActionBehaviour(RecoveryActionBehaviour object) {
				return createRecoveryActionBehaviourAdapter();
			}
			@Override
			public Adapter caseFailureHandlingEntity(FailureHandlingEntity object) {
				return createFailureHandlingEntityAdapter();
			}
			@Override
			public Adapter caseFailureHandlingExternalCallAction(FailureHandlingExternalCallAction object) {
				return createFailureHandlingExternalCallActionAdapter();
			}
			@Override
			public Adapter caseAcquireActionTimeout(AcquireActionTimeout object) {
				return createAcquireActionTimeoutAdapter();
			}
			@Override
			public Adapter caseFailureOccurrenceDescription(FailureOccurrenceDescription object) {
				return createFailureOccurrenceDescriptionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
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
			public Adapter caseAbstractAction(AbstractAction object) {
				return createAbstractActionAdapter();
			}
			@Override
			public Adapter caseAbstractInternalControlFlowAction(AbstractInternalControlFlowAction object) {
				return createAbstractInternalControlFlowActionAdapter();
			}
			@Override
			public Adapter caseBehaviour(Behaviour object) {
				return createBehaviourAdapter();
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
	 * Creates a new adapter for an object of class '{@link reliability.seff.InternalFailureOccurrenceDescription <em>Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.InternalFailureOccurrenceDescription
	 * @generated
	 */
	public Adapter createInternalFailureOccurrenceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.seff.RecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.RecoveryAction
	 * @generated
	 */
	public Adapter createRecoveryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.seff.RecoveryActionBehaviour <em>Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.RecoveryActionBehaviour
	 * @generated
	 */
	public Adapter createRecoveryActionBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.seff.FailureHandlingEntity <em>Failure Handling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.FailureHandlingEntity
	 * @generated
	 */
	public Adapter createFailureHandlingEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.seff.FailureHandlingExternalCallAction <em>Failure Handling External Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.FailureHandlingExternalCallAction
	 * @generated
	 */
	public Adapter createFailureHandlingExternalCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.seff.AcquireActionTimeout <em>Acquire Action Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.seff.AcquireActionTimeout
	 * @generated
	 */
	public Adapter createAcquireActionTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.FailureOccurrenceDescription <em>Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.FailureOccurrenceDescription
	 * @generated
	 */
	public Adapter createFailureOccurrenceDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link seff.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see seff.Behaviour
	 * @generated
	 */
	public Adapter createBehaviourAdapter() {
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

} //SeffAdapterFactory
