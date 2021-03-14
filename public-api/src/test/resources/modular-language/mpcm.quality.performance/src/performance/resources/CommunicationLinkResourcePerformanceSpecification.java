/**
 */
package performance.resources;

import org.eclipse.emf.ecore.EObject;

import resources.CommunicationLinkResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}</li>
 *   <li>{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}</li>
 * </ul>
 *
 * @see performance.resources.ResourcesPackage#getCommunicationLinkResourcePerformanceSpecification()
 * @model
 * @generated
 */
public interface CommunicationLinkResourcePerformanceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(CommunicationLinkResourceSpecification)
	 * @see performance.resources.ResourcesPackage#getCommunicationLinkResourcePerformanceSpecification_Owner()
	 * @model required="true"
	 * @generated
	 */
	CommunicationLinkResourceSpecification getOwner();

	/**
	 * Sets the value of the '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CommunicationLinkResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the latency of this linking resource in the simulated time unit. The latency is the time that a message on this linking resource takes to receive the receiver. In synchronous communication (call and return), the latency is added twice to the duration, once for the call and once for the response. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
	 * @see #setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable)
	 * @see performance.resources.ResourcesPackage#getCommunicationLinkResourcePerformanceSpecification_Latency_CommunicationLinkResourceSpecification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getLatency_CommunicationLinkResourceSpecification();

	/**
	 * Sets the value of the '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
	 * @see #getLatency_CommunicationLinkResourceSpecification()
	 * @generated
	 */
	void setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum throughput of this linking resource in byte per simulated time unit. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
	 * @see #setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable)
	 * @see performance.resources.ResourcesPackage#getCommunicationLinkResourcePerformanceSpecification_Throughput_CommunicationLinkResourceSpecification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getThroughput_CommunicationLinkResourceSpecification();

	/**
	 * Sets the value of the '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
	 * @see #getThroughput_CommunicationLinkResourceSpecification()
	 * @generated
	 */
	void setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable value);

} // CommunicationLinkResourcePerformanceSpecification
