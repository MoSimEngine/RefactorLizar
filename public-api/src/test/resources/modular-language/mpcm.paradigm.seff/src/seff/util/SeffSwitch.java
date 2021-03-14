/**
 */
package seff.util;

import base.Entity;
import base.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import seff.*;

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
 * @see seff.SeffPackage
 * @generated
 */
public class SeffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SeffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffSwitch() {
		if (modelPackage == null) {
			modelPackage = SeffPackage.eINSTANCE;
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
			case SeffPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = caseIdentifier(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_ACTION: {
				AbstractAction abstractAction = (AbstractAction)theEObject;
				T result = caseAbstractAction(abstractAction);
				if (result == null) result = caseEntity(abstractAction);
				if (result == null) result = caseIdentifier(abstractAction);
				if (result == null) result = caseNamedElement(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION: {
				AbstractInternalControlFlowAction abstractInternalControlFlowAction = (AbstractInternalControlFlowAction)theEObject;
				T result = caseAbstractInternalControlFlowAction(abstractInternalControlFlowAction);
				if (result == null) result = caseAbstractAction(abstractInternalControlFlowAction);
				if (result == null) result = caseEntity(abstractInternalControlFlowAction);
				if (result == null) result = caseIdentifier(abstractInternalControlFlowAction);
				if (result == null) result = caseNamedElement(abstractInternalControlFlowAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.START_ACTION: {
				StartAction startAction = (StartAction)theEObject;
				T result = caseStartAction(startAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(startAction);
				if (result == null) result = caseAbstractAction(startAction);
				if (result == null) result = caseEntity(startAction);
				if (result == null) result = caseIdentifier(startAction);
				if (result == null) result = caseNamedElement(startAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(stopAction);
				if (result == null) result = caseAbstractAction(stopAction);
				if (result == null) result = caseEntity(stopAction);
				if (result == null) result = caseIdentifier(stopAction);
				if (result == null) result = caseNamedElement(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.INTERNAL_ACTION: {
				InternalAction internalAction = (InternalAction)theEObject;
				T result = caseInternalAction(internalAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(internalAction);
				if (result == null) result = caseAbstractAction(internalAction);
				if (result == null) result = caseEntity(internalAction);
				if (result == null) result = caseIdentifier(internalAction);
				if (result == null) result = caseNamedElement(internalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.BRANCH_ACTION: {
				BranchAction branchAction = (BranchAction)theEObject;
				T result = caseBranchAction(branchAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(branchAction);
				if (result == null) result = caseAbstractAction(branchAction);
				if (result == null) result = caseEntity(branchAction);
				if (result == null) result = caseIdentifier(branchAction);
				if (result == null) result = caseNamedElement(branchAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_BRANCH_TRANSITION: {
				AbstractBranchTransition abstractBranchTransition = (AbstractBranchTransition)theEObject;
				T result = caseAbstractBranchTransition(abstractBranchTransition);
				if (result == null) result = caseEntity(abstractBranchTransition);
				if (result == null) result = caseIdentifier(abstractBranchTransition);
				if (result == null) result = caseNamedElement(abstractBranchTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.FORK_ACTION: {
				ForkAction forkAction = (ForkAction)theEObject;
				T result = caseForkAction(forkAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(forkAction);
				if (result == null) result = caseAbstractAction(forkAction);
				if (result == null) result = caseEntity(forkAction);
				if (result == null) result = caseIdentifier(forkAction);
				if (result == null) result = caseNamedElement(forkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.FORKED_BEHAVIOUR: {
				ForkedBehaviour forkedBehaviour = (ForkedBehaviour)theEObject;
				T result = caseForkedBehaviour(forkedBehaviour);
				if (result == null) result = caseBehaviour(forkedBehaviour);
				if (result == null) result = caseIdentifier(forkedBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.SYNCHRONISATION_POINT: {
				SynchronisationPoint synchronisationPoint = (SynchronisationPoint)theEObject;
				T result = caseSynchronisationPoint(synchronisationPoint);
				if (result == null) result = caseIdentifier(synchronisationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.ABSTRACT_LOOP_ACTION: {
				AbstractLoopAction abstractLoopAction = (AbstractLoopAction)theEObject;
				T result = caseAbstractLoopAction(abstractLoopAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(abstractLoopAction);
				if (result == null) result = caseAbstractAction(abstractLoopAction);
				if (result == null) result = caseEntity(abstractLoopAction);
				if (result == null) result = caseIdentifier(abstractLoopAction);
				if (result == null) result = caseNamedElement(abstractLoopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SeffPackage.LOOP_ACTION: {
				LoopAction loopAction = (LoopAction)theEObject;
				T result = caseLoopAction(loopAction);
				if (result == null) result = caseAbstractLoopAction(loopAction);
				if (result == null) result = caseAbstractInternalControlFlowAction(loopAction);
				if (result == null) result = caseAbstractAction(loopAction);
				if (result == null) result = caseEntity(loopAction);
				if (result == null) result = caseIdentifier(loopAction);
				if (result == null) result = caseNamedElement(loopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartAction(StartAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopAction(StopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalAction(InternalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchAction(BranchAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Fork Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkAction(ForkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forked Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forked Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkedBehaviour(ForkedBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronisation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronisation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronisationPoint(SynchronisationPoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Loop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopAction(LoopAction object) {
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
	public T caseIdentifier(Identifier object) {
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

} //SeffSwitch
