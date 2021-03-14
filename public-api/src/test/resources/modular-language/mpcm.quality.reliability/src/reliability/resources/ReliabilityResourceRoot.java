/**
 */
package reliability.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliability Resource Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.resources.ReliabilityResourceRoot#getProcessingResourceReliabilitySpecification <em>Processing Resource Reliability Specification</em>}</li>
 *   <li>{@link reliability.resources.ReliabilityResourceRoot#getCommunicationLinkResourceReliabilitySpecifications <em>Communication Link Resource Reliability Specifications</em>}</li>
 * </ul>
 *
 * @see reliability.resources.ResourcesPackage#getReliabilityResourceRoot()
 * @model
 * @generated
 */
public interface ReliabilityResourceRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Resource Reliability Specification</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.resources.ProcessingResourceReliabilitySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Reliability Specification</em>' containment reference list.
	 * @see reliability.resources.ResourcesPackage#getReliabilityResourceRoot_ProcessingResourceReliabilitySpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingResourceReliabilitySpecification> getProcessingResourceReliabilitySpecification();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Reliability Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link reliability.resources.CommunicationLinkResourceReliabilitySpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Reliability Specifications</em>' containment reference list.
	 * @see reliability.resources.ResourcesPackage#getReliabilityResourceRoot_CommunicationLinkResourceReliabilitySpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLinkResourceReliabilitySpecification> getCommunicationLinkResourceReliabilitySpecifications();

} // ReliabilityResourceRoot
