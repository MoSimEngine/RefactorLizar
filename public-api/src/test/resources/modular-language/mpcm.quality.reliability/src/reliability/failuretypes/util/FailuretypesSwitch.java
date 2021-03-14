/**
 */
package reliability.failuretypes.util;

import base.Entity;
import base.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import reliability.failuretypes.*;

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
 * @see reliability.failuretypes.FailuretypesPackage
 * @generated
 */
public class FailuretypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailuretypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailuretypesSwitch() {
		if (modelPackage == null) {
			modelPackage = FailuretypesPackage.eINSTANCE;
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
			case FailuretypesPackage.FAILURE_TYPES_ROOT: {
				FailureTypesRoot failureTypesRoot = (FailureTypesRoot)theEObject;
				T result = caseFailureTypesRoot(failureTypesRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailuretypesPackage.FAILURE_TYPE: {
				FailureType failureType = (FailureType)theEObject;
				T result = caseFailureType(failureType);
				if (result == null) result = caseEntity(failureType);
				if (result == null) result = caseIdentifier(failureType);
				if (result == null) result = caseNamedElement(failureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE: {
				NetworkInducedFailureType networkInducedFailureType = (NetworkInducedFailureType)theEObject;
				T result = caseNetworkInducedFailureType(networkInducedFailureType);
				if (result == null) result = caseFailureType(networkInducedFailureType);
				if (result == null) result = caseEntity(networkInducedFailureType);
				if (result == null) result = caseIdentifier(networkInducedFailureType);
				if (result == null) result = caseNamedElement(networkInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailuretypesPackage.HARDWARE_INDUCED_FAILURE_TYPE: {
				HardwareInducedFailureType hardwareInducedFailureType = (HardwareInducedFailureType)theEObject;
				T result = caseHardwareInducedFailureType(hardwareInducedFailureType);
				if (result == null) result = caseFailureType(hardwareInducedFailureType);
				if (result == null) result = caseEntity(hardwareInducedFailureType);
				if (result == null) result = caseIdentifier(hardwareInducedFailureType);
				if (result == null) result = caseNamedElement(hardwareInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailuretypesPackage.SOFTWARE_INDUCED_FAILURE_TYPE: {
				SoftwareInducedFailureType softwareInducedFailureType = (SoftwareInducedFailureType)theEObject;
				T result = caseSoftwareInducedFailureType(softwareInducedFailureType);
				if (result == null) result = caseFailureType(softwareInducedFailureType);
				if (result == null) result = caseEntity(softwareInducedFailureType);
				if (result == null) result = caseIdentifier(softwareInducedFailureType);
				if (result == null) result = caseNamedElement(softwareInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailuretypesPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: {
				ResourceTimeoutFailureType resourceTimeoutFailureType = (ResourceTimeoutFailureType)theEObject;
				T result = caseResourceTimeoutFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseSoftwareInducedFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseEntity(resourceTimeoutFailureType);
				if (result == null) result = caseIdentifier(resourceTimeoutFailureType);
				if (result == null) result = caseNamedElement(resourceTimeoutFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Types Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Types Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureTypesRoot(FailureTypesRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureType(FailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInducedFailureType(NetworkInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareInducedFailureType(HardwareInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInducedFailureType(SoftwareInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTimeoutFailureType(ResourceTimeoutFailureType object) {
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

} //FailuretypesSwitch
