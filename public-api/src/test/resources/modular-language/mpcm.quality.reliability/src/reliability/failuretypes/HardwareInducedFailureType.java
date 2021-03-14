/**
 */
package reliability.failuretypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import resources.resourcetype.ProcessingResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a hardware-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to an unavailable
 *     resource. Standard types&nbsp;are pre-defined according to the pre-defined ProcessingResourceTypes: CPU, HDD, DELAY.
 *     Further types may be defined by the modeller for a certain PCM instance, together with a custom ProcessingResourceType.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}</li>
 * </ul>
 *
 * @see reliability.failuretypes.FailuretypesPackage#getHardwareInducedFailureType()
 * @model
 * @generated
 */
public interface HardwareInducedFailureType extends FailureType {
	/**
	 * Returns the value of the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Type Hardware Induced Failure Type</em>' reference.
	 * @see #setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType)
	 * @see reliability.failuretypes.FailuretypesPackage#getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getProcessingResourceType__HardwareInducedFailureType();

	/**
	 * Sets the value of the '{@link reliability.failuretypes.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Type Hardware Induced Failure Type</em>' reference.
	 * @see #getProcessingResourceType__HardwareInducedFailureType()
	 * @generated
	 */
	void setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='( self.processingResourceType__HardwareInducedFailureType &lt;&gt; null ) and ( not ( self.processingResourceType__HardwareInducedFailureType.oclIsTypeOf( mpcm::resourcetype::CommunicationLinkResourceType ) ) )'"
	 * @generated
	 */
	boolean HardwareInducedFailureTypeHasProcessingResourceType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // HardwareInducedFailureType
