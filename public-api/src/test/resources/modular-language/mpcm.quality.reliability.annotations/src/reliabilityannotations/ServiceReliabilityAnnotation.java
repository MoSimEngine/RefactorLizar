/**
 */
package reliabilityannotations;

import annotations.ServicePropertyAnnotation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SpecifiedFailureProbability of a service resembles its "Probability of Failure on Demand" (POFOD). Whenever the service is called, this values states the probability that it returns successfully. For reliability prediction, the PCMRandomVariable specified in its superclass SpecifiedQoSAnnotation must evaluate to a real number between 0 and 1.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliabilityannotations.ServiceReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}</li>
 * </ul>
 *
 * @see reliabilityannotations.ReliabilityannotationsPackage#getServiceReliabilityAnnotation()
 * @model
 * @generated
 */
public interface ServiceReliabilityAnnotation extends ServicePropertyAnnotation {
	/**
	 * Returns the value of the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link reliabilityannotations.ExternalFailureOccurrenceDescription}.
	 * It is bidirectional and its opposite is '{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>' containment reference list.
	 * @see reliabilityannotations.ReliabilityannotationsPackage#getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
	 * @see reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription
	 * @model opposite="specifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ExternalFailureOccurrenceDescription> getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(mpcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(mpcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(mpcm::system::System))\r\n\r\n\r\n'"
	 * @generated
	 */
	boolean SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.failureProbability.oclAsType(Real)-&gt;sum()&lt;=1.0'"
	 * @generated
	 */
	boolean SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation-&gt;forAll(x:mpcm::reliability::ExternalFailureOccurrenceDescription,y:mpcm::reliability::ExternalFailureOccurrenceDescription  | x&lt;&gt;y implies x.failureType__ExternalFailureOccurrenceDescription &lt;&gt; y.failureType__ExternalFailureOccurrenceDescription )'"
	 * @generated
	 */
	boolean MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceReliabilityAnnotation
