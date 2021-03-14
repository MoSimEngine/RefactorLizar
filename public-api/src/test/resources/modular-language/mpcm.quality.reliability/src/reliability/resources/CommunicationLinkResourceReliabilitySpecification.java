/**
 */
package reliability.resources;

import org.eclipse.emf.ecore.EObject;

import resources.CommunicationLinkResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Resource Reliability Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getFailureProbability <em>Failure Probability</em>}</li>
 *   <li>{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see reliability.resources.ResourcesPackage#getCommunicationLinkResourceReliabilitySpecification()
 * @model
 * @generated
 */
public interface CommunicationLinkResourceReliabilitySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the probability that a service call over this communication link fails. The failure could be due to message loss or overload, for example.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Probability</em>' attribute.
	 * @see #setFailureProbability(double)
	 * @see reliability.resources.ResourcesPackage#getCommunicationLinkResourceReliabilitySpecification_FailureProbability()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getFailureProbability();

	/**
	 * Sets the value of the '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getFailureProbability <em>Failure Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Probability</em>' attribute.
	 * @see #getFailureProbability()
	 * @generated
	 */
	void setFailureProbability(double value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(CommunicationLinkResourceSpecification)
	 * @see reliability.resources.ResourcesPackage#getCommunicationLinkResourceReliabilitySpecification_Owner()
	 * @model required="true"
	 * @generated
	 */
	CommunicationLinkResourceSpecification getOwner();

	/**
	 * Sets the value of the '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CommunicationLinkResourceSpecification value);

} // CommunicationLinkResourceReliabilitySpecification
