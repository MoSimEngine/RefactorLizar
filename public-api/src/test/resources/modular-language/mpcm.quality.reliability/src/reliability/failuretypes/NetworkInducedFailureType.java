/**
 */
package reliability.failuretypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import resources.resourcetype.CommunicationLinkResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a network-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to a communication link
 *     fault. One standard type&nbsp;is pre-defined according to the pre-defined CommunicationLinkResourceType: LAN.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}</li>
 * </ul>
 *
 * @see reliability.failuretypes.FailuretypesPackage#getNetworkInducedFailureType()
 * @model
 * @generated
 */
public interface NetworkInducedFailureType extends FailureType {
	/**
	 * Returns the value of the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
	 * @see #setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType)
	 * @see reliability.failuretypes.FailuretypesPackage#getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CommunicationLinkResourceType getCommunicationLinkResourceType__NetworkInducedFailureType();

	/**
	 * Sets the value of the '{@link reliability.failuretypes.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
	 * @see #getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @generated
	 */
	void setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.communicationLinkResourceType__NetworkInducedFailureType &lt;&gt; null'"
	 * @generated
	 */
	boolean NetworkInducedFailureTypeHasCommunicationLinkResourceType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // NetworkInducedFailureType
