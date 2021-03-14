/**
 */
package annotations;

import base.Entity;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QoSAnnotations allow software architects and performance analysts to annotate Quality of Service (QoS) attributes to services (i.e., signatures of an interface). It is important to note that these annotations are specified and not derived. Usually the PCM uses the internal specification of a components behaviour (i.e., its RD-SEFFs) to determine its QoS. However, in a mixed top down and bottom up approach as favoured by the PCM, software architects have to combine components whose internals are not yet known with fully specified components. QoSAnnotations provide a first perforamnce (or reliability) abstraction of the services offered by a component using the SpecifiedQoSAnnotation. They furthermore define the output parameters of the services without describing its internal behviour.
 * 
 * Notes:
 * - Should the association of QoSAnnotations to services not be in the class QoSAnnotation instead of SpecifiedQoSAnnotation and SpecifiedOutputParameterAbstraction separately?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link annotations.AnnotationRoot#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 *   <li>{@link annotations.AnnotationRoot#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}</li>
 * </ul>
 *
 * @see annotations.AnnotationsPackage#getAnnotationRoot()
 * @model
 * @generated
 */
public interface AnnotationRoot extends Entity {
	/**
	 * Returns the value of the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link annotations.ServiceOutputParameterAbstraction}.
	 * It is bidirectional and its opposite is '{@link annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list.
	 * @see annotations.AnnotationsPackage#getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @see annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction
	 * @model opposite="qosAnnotations_SpecifiedOutputParameterAbstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations();

	/**
	 * Returns the value of the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link annotations.ServicePropertyAnnotation}.
	 * It is bidirectional and its opposite is '{@link annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Qo SAnnotations Qo SAnnotations</em>' containment reference list.
	 * @see annotations.AnnotationsPackage#getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations()
	 * @see annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation
	 * @model opposite="qosAnnotations_SpecifiedQoSAnnotation" containment="true" ordered="false"
	 * @generated
	 */
	EList<ServicePropertyAnnotation> getSpecifiedQoSAnnotations_QoSAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specifiedQoSAnnotations_QoSAnnotations-&gt;select(oclIsTypeOf(mpcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))-&gt;forAll( x, y | ( x&lt;&gt;y ) implies ( ( x.role_SpecifiedQoSAnnotation &lt;&gt; y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation &lt;&gt; y.signature_SpecifiedQoSAnnation ) ) )'"
	 * @generated
	 */
	boolean MultipleReliabilityAnnotationsPerExternalCallNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AnnotationRoot
