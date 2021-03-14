/**
 */
package behaviourseff.util;

import base.Entity;
import base.NamedElement;

import behaviourseff.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import seff.AbstractAction;
import seff.AbstractBranchTransition;
import seff.AbstractInternalControlFlowAction;
import seff.AbstractLoopAction;

import softwarerepository.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see behaviourseff.BehaviourseffPackage
 * @generated
 */
public class BehaviourseffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourseffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviourseffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviourseffPackage.BEHAVIOUR_SEFF: {
				BehaviourSEFF behaviourSEFF = (BehaviourSEFF)theEObject;
				T result = caseBehaviourSEFF(behaviourSEFF);
				if (result == null) result = caseServiceEffectSpecification(behaviourSEFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.PROBABILISTIC_BRANCH_TRANSITION: {
				ProbabilisticBranchTransition probabilisticBranchTransition = (ProbabilisticBranchTransition)theEObject;
				T result = caseProbabilisticBranchTransition(probabilisticBranchTransition);
				if (result == null) result = caseAbstractBranchTransition(probabilisticBranchTransition);
				if (result == null) result = caseEntity(probabilisticBranchTransition);
				if (result == null) result = caseIdentifier(probabilisticBranchTransition);
				if (result == null) result = caseNamedElement(probabilisticBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.GUARDED_BRANCH_TRANSITION: {
				GuardedBranchTransition guardedBranchTransition = (GuardedBranchTransition)theEObject;
				T result = caseGuardedBranchTransition(guardedBranchTransition);
				if (result == null) result = caseAbstractBranchTransition(guardedBranchTransition);
				if (result == null) result = caseEntity(guardedBranchTransition);
				if (result == null) result = caseIdentifier(guardedBranchTransition);
				if (result == null) result = caseNamedElement(guardedBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.COLLECTION_ITERATOR_ACTION: {
				CollectionIteratorAction collectionIteratorAction = (CollectionIteratorAction)theEObject;
				T result = caseCollectionIteratorAction(collectionIteratorAction);
				if (result == null) result = caseAbstractLoopAction(collectionIteratorAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(collectionIteratorAction);
				if (result == null) result = caseAbstractAction(collectionIteratorAction);
				if (result == null) result = caseEntity(collectionIteratorAction);
				if (result == null) result = caseIdentifier(collectionIteratorAction);
				if (result == null) result = caseNamedElement(collectionIteratorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.CALL_ACTION: {
				CallAction callAction = (CallAction)theEObject;
				T result = caseCallAction(callAction);
				if (result == null) result = caseEntity(callAction);
				if (result == null) result = caseIdentifier(callAction);
				if (result == null) result = caseNamedElement(callAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.CALL_RETURN_ACTION: {
				CallReturnAction callReturnAction = (CallReturnAction)theEObject;
				T result = caseCallReturnAction(callReturnAction);
				if (result == null) result = caseCallAction(callReturnAction);
				if (result == null) result = caseEntity(callReturnAction);
				if (result == null) result = caseIdentifier(callReturnAction);
				if (result == null) result = caseNamedElement(callReturnAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.EXTERNAL_CALL_ACTION: {
				ExternalCallAction externalCallAction = (ExternalCallAction)theEObject;
				T result = caseExternalCallAction(externalCallAction);
				if (result == null) result = caseAbstractAction(externalCallAction);
				if (result == null) result = caseCallReturnAction(externalCallAction);
				if (result == null) result = caseCallAction(externalCallAction);
				if (result == null) result = caseEntity(externalCallAction);
				if (result == null) result = caseIdentifier(externalCallAction);
				if (result == null) result = caseNamedElement(externalCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.ACQUIRE_ACTION: {
				AcquireAction acquireAction = (AcquireAction)theEObject;
				T result = caseAcquireAction(acquireAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(acquireAction);
				if (result == null) result = caseAbstractAction(acquireAction);
				if (result == null) result = caseEntity(acquireAction);
				if (result == null) result = caseIdentifier(acquireAction);
				if (result == null) result = caseNamedElement(acquireAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.RELEASE_ACTION: {
				ReleaseAction releaseAction = (ReleaseAction)theEObject;
				T result = caseReleaseAction(releaseAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(releaseAction);
				if (result == null) result = caseAbstractAction(releaseAction);
				if (result == null) result = caseEntity(releaseAction);
				if (result == null) result = caseIdentifier(releaseAction);
				if (result == null) result = caseNamedElement(releaseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviourseffPackage.SET_VARIABLE_ACTION: {
				SetVariableAction setVariableAction = (SetVariableAction)theEObject;
				T result = caseSetVariableAction(setVariableAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(setVariableAction);
				if (result == null) result = caseAbstractAction(setVariableAction);
				if (result == null) result = caseEntity(setVariableAction);
				if (result == null) result = caseIdentifier(setVariableAction);
				if (result == null) result = caseNamedElement(setVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour SEFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour SEFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviourSEFF(BehaviourSEFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticBranchTransition(ProbabilisticBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guarded Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guarded Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardedBranchTransition(GuardedBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Iterator Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Iterator Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionIteratorAction(CollectionIteratorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Return Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Return Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallReturnAction(CallReturnAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCallAction(ExternalCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acquire Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcquireAction(AcquireAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseAction(ReleaseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetVariableAction(SetVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Effect Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEffectSpecification(ServiceEffectSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(de.uka.ipd.sdq.identifier.Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Branch Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Branch Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBranchTransition(AbstractBranchTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAction(AbstractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Internal Control Flow Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Internal Control Flow Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInternalControlFlowAction(AbstractInternalControlFlowAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Loop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Loop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLoopAction(AbstractLoopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviourseffSwitch
