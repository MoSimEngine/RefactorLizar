/**
 */
package annotations;

import org.eclipse.emf.ecore.EObject;

import repository.Role;
import repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Property Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     SpecifiedQoSAnnotations&nbsp;(as&nbsp;an&nbsp;abstract&nbsp;class)&nbsp;associate&nbsp;specified&nbsp;(see&nbsp;QoSAnnotation)&nbsp;QoS&nbsp;properties&nbsp;to&nbsp;services&nbsp;of&nbsp;components.&nbsp;A&nbsp;service&nbsp;is&nbsp;thereby&nbsp;determined&nbsp;by&nbsp;a&nbsp;Signature&nbsp;and&nbsp;a&nbsp;Role&nbsp;(i.e.,&nbsp;an&nbsp;interface&nbsp;bound&nbsp;to&nbsp;a&nbsp;component).
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link annotations.ServicePropertyAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}</li>
 *   <li>{@link annotations.ServicePropertyAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}</li>
 *   <li>{@link annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}</li>
 * </ul>
 *
 * @see annotations.AnnotationsPackage#getServicePropertyAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface ServicePropertyAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Specified Qo SAnnation</em>' reference.
	 * @see #setSignature_SpecifiedQoSAnnation(Signature)
	 * @see annotations.AnnotationsPackage#getServicePropertyAnnotation_Signature_SpecifiedQoSAnnation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getSignature_SpecifiedQoSAnnation();

	/**
	 * Sets the value of the '{@link annotations.ServicePropertyAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Specified Qo SAnnation</em>' reference.
	 * @see #getSignature_SpecifiedQoSAnnation()
	 * @generated
	 */
	void setSignature_SpecifiedQoSAnnation(Signature value);

	/**
	 * Returns the value of the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Specified Qo SAnnotation</em>' reference.
	 * @see #setRole_SpecifiedQoSAnnotation(Role)
	 * @see annotations.AnnotationsPackage#getServicePropertyAnnotation_Role_SpecifiedQoSAnnotation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Role getRole_SpecifiedQoSAnnotation();

	/**
	 * Sets the value of the '{@link annotations.ServicePropertyAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Specified Qo SAnnotation</em>' reference.
	 * @see #getRole_SpecifiedQoSAnnotation()
	 * @generated
	 */
	void setRole_SpecifiedQoSAnnotation(Role value);

	/**
	 * Returns the value of the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link annotations.AnnotationRoot#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos Annotations Specified Qo SAnnotation</em>' container reference.
	 * @see #setQosAnnotations_SpecifiedQoSAnnotation(AnnotationRoot)
	 * @see annotations.AnnotationsPackage#getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation()
	 * @see annotations.AnnotationRoot#getSpecifiedQoSAnnotations_QoSAnnotations
	 * @model opposite="specifiedQoSAnnotations_QoSAnnotations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationRoot getQosAnnotations_SpecifiedQoSAnnotation();

	/**
	 * Sets the value of the '{@link annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qos Annotations Specified Qo SAnnotation</em>' container reference.
	 * @see #getQosAnnotations_SpecifiedQoSAnnotation()
	 * @generated
	 */
	void setQosAnnotations_SpecifiedQoSAnnotation(AnnotationRoot value);

} // ServicePropertyAnnotation
