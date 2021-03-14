/**
 */
package reliabilityannotations;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import reliability.FailureOccurrenceDescription;

import reliability.failuretypes.FailureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special&nbsp;case&nbsp;of&nbsp;a&nbsp;FailureOccurenceDescription&nbsp;specifying&nbsp;the&nbsp;failure&nbsp;potential&nbsp;of&nbsp;system-external&nbsp;calls.&nbsp;Can&nbsp;relate&nbsp;to
 * any FailureType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}</li>
 *   <li>{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}</li>
 * </ul>
 *
 * @see reliabilityannotations.ReliabilityannotationsPackage#getExternalFailureOccurrenceDescription()
 * @model
 * @generated
 */
public interface ExternalFailureOccurrenceDescription extends FailureOccurrenceDescription {
	/**
	 * Returns the value of the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link reliabilityannotations.ServiceReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Reliability Annotation External Failure Occurrence Description</em>' container reference.
	 * @see #setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(ServiceReliabilityAnnotation)
	 * @see reliabilityannotations.ReliabilityannotationsPackage#getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @see reliabilityannotations.ServiceReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation
	 * @model opposite="externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ServiceReliabilityAnnotation getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified Reliability Annotation External Failure Occurrence Description</em>' container reference.
	 * @see #getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(ServiceReliabilityAnnotation value);

	/**
	 * Returns the value of the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Type External Failure Occurrence Description</em>' reference.
	 * @see #setFailureType__ExternalFailureOccurrenceDescription(FailureType)
	 * @see reliabilityannotations.ReliabilityannotationsPackage#getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FailureType getFailureType__ExternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Type External Failure Occurrence Description</em>' reference.
	 * @see #getFailureType__ExternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setFailureType__ExternalFailureOccurrenceDescription(FailureType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResourceTimeoutFailures&nbsp;are&nbsp;software-induced&nbsp;failure&nbsp;types,&nbsp;but&nbsp;are&nbsp;not&nbsp;annotated&nbsp;to&nbsp;system-external
	 * calls&nbsp;(they&nbsp;are&nbsp;only&nbsp;meant<br />
	 * for&nbsp;passive&nbsp;resource&nbsp;timeouts).
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.failureType__ExternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)'"
	 * @generated
	 */
	boolean NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExternalFailureOccurrenceDescription
