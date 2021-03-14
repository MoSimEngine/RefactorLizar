/**
 */
package reliability.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import reliability.seff.AcquireActionTimeout;
import reliability.seff.FailureHandlingExternalCallAction;
import reliability.seff.InternalFailureOccurrenceDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This container can server as container for the repository as well as the seff content, as the repository contains the seffs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.repository.ReliabilityContainer#getFailureDeclarations <em>Failure Declarations</em>}</li>
 *   <li>{@link reliability.repository.ReliabilityContainer#getFailureHandlingExternalCallActions <em>Failure Handling External Call Actions</em>}</li>
 *   <li>{@link reliability.repository.ReliabilityContainer#getInternalFailureOccurenceDescriptions <em>Internal Failure Occurence Descriptions</em>}</li>
 *   <li>{@link reliability.repository.ReliabilityContainer#getAcquireActionTimeout <em>Acquire Action Timeout</em>}</li>
 * </ul>
 *
 * @see reliability.repository.RepositoryPackage#getReliabilityContainer()
 * @model
 * @generated
 */
public interface ReliabilityContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Failure Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.repository.FailureDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Declarations</em>' containment reference list.
	 * @see reliability.repository.RepositoryPackage#getReliabilityContainer_FailureDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureDeclaration> getFailureDeclarations();

	/**
	 * Returns the value of the '<em><b>Failure Handling External Call Actions</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.seff.FailureHandlingExternalCallAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Handling External Call Actions</em>' containment reference list.
	 * @see reliability.repository.RepositoryPackage#getReliabilityContainer_FailureHandlingExternalCallActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureHandlingExternalCallAction> getFailureHandlingExternalCallActions();

	/**
	 * Returns the value of the '<em><b>Internal Failure Occurence Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.seff.InternalFailureOccurrenceDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Failure Occurence Descriptions</em>' containment reference list.
	 * @see reliability.repository.RepositoryPackage#getReliabilityContainer_InternalFailureOccurenceDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalFailureOccurrenceDescription> getInternalFailureOccurenceDescriptions();

	/**
	 * Returns the value of the '<em><b>Acquire Action Timeout</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.seff.AcquireActionTimeout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Action Timeout</em>' containment reference list.
	 * @see reliability.repository.RepositoryPackage#getReliabilityContainer_AcquireActionTimeout()
	 * @model containment="true"
	 * @generated
	 */
	EList<AcquireActionTimeout> getAcquireActionTimeout();

} // ReliabilityContainer
