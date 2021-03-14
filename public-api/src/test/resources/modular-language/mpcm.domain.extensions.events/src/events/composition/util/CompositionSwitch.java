/**
 */
package events.composition.util;

import base.Entity;
import base.NamedElement;

import composition.Connector;
import composition.Containable;
import composition.DelegationConnector;

import de.uka.ipd.sdq.identifier.Identifier;

import events.composition.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see events.composition.CompositionPackage
 * @generated
 */
public class CompositionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompositionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionSwitch() {
		if (modelPackage == null) {
			modelPackage = CompositionPackage.eINSTANCE;
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
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR: {
				AssemblyEventConnector assemblyEventConnector = (AssemblyEventConnector)theEObject;
				T result = caseAssemblyEventConnector(assemblyEventConnector);
				if (result == null) result = caseConnector(assemblyEventConnector);
				if (result == null) result = caseEntity(assemblyEventConnector);
				if (result == null) result = caseContainable(assemblyEventConnector);
				if (result == null) result = caseIdentifier(assemblyEventConnector);
				if (result == null) result = caseNamedElement(assemblyEventConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.EVENT_CHANNEL: {
				EventChannel eventChannel = (EventChannel)theEObject;
				T result = caseEventChannel(eventChannel);
				if (result == null) result = caseEntity(eventChannel);
				if (result == null) result = caseContainable(eventChannel);
				if (result == null) result = caseIdentifier(eventChannel);
				if (result == null) result = caseNamedElement(eventChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.EVENT_CHANNEL_SOURCE_CONNECTOR: {
				EventChannelSourceConnector eventChannelSourceConnector = (EventChannelSourceConnector)theEObject;
				T result = caseEventChannelSourceConnector(eventChannelSourceConnector);
				if (result == null) result = caseConnector(eventChannelSourceConnector);
				if (result == null) result = caseEntity(eventChannelSourceConnector);
				if (result == null) result = caseContainable(eventChannelSourceConnector);
				if (result == null) result = caseIdentifier(eventChannelSourceConnector);
				if (result == null) result = caseNamedElement(eventChannelSourceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR: {
				EventChannelSinkConnector eventChannelSinkConnector = (EventChannelSinkConnector)theEObject;
				T result = caseEventChannelSinkConnector(eventChannelSinkConnector);
				if (result == null) result = caseConnector(eventChannelSinkConnector);
				if (result == null) result = caseEntity(eventChannelSinkConnector);
				if (result == null) result = caseContainable(eventChannelSinkConnector);
				if (result == null) result = caseIdentifier(eventChannelSinkConnector);
				if (result == null) result = caseNamedElement(eventChannelSinkConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR: {
				SourceDelegationConnector sourceDelegationConnector = (SourceDelegationConnector)theEObject;
				T result = caseSourceDelegationConnector(sourceDelegationConnector);
				if (result == null) result = caseDelegationConnector(sourceDelegationConnector);
				if (result == null) result = caseConnector(sourceDelegationConnector);
				if (result == null) result = caseEntity(sourceDelegationConnector);
				if (result == null) result = caseContainable(sourceDelegationConnector);
				if (result == null) result = caseIdentifier(sourceDelegationConnector);
				if (result == null) result = caseNamedElement(sourceDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CompositionPackage.SINK_DELEGATION_CONNECTOR: {
				SinkDelegationConnector sinkDelegationConnector = (SinkDelegationConnector)theEObject;
				T result = caseSinkDelegationConnector(sinkDelegationConnector);
				if (result == null) result = caseDelegationConnector(sinkDelegationConnector);
				if (result == null) result = caseConnector(sinkDelegationConnector);
				if (result == null) result = caseEntity(sinkDelegationConnector);
				if (result == null) result = caseContainable(sinkDelegationConnector);
				if (result == null) result = caseIdentifier(sinkDelegationConnector);
				if (result == null) result = caseNamedElement(sinkDelegationConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Event Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Event Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyEventConnector(AssemblyEventConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChannel(EventChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Channel Source Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Channel Source Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChannelSourceConnector(EventChannelSourceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Channel Sink Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Channel Sink Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChannelSinkConnector(EventChannelSinkConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDelegationConnector(SourceDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkDelegationConnector(SinkDelegationConnector object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Containable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainable(Containable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegationConnector(DelegationConnector object) {
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

} //CompositionSwitch
