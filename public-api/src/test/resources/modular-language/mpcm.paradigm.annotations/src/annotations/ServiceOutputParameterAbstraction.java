/**
 */
package annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import repository.Role;
import repository.Signature;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Output Parameter Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To specify the output parameters of a service (without associated RD-SEFF), software architects can associate a SpecifiedOutputParameterAbstraction to services (signature + role). SpecifiedOutputParameterAbstractions assign a single VariableUsage to that service that determines the output parameters in depency of its input parameters. Software architects can use stochastic expressions (package StoEx) to define the dependencies.
 * 
 * Note:
 * - Is it actually possible to define the output in dependency on the input parameters?
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link annotations.ServiceOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.ServiceOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.ServiceOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction <em>Expected External Outputs Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}</li>
 * </ul>
 *
 * @see annotations.AnnotationsPackage#getServiceOutputParameterAbstraction()
 * @model abstract="true"
 * @generated
 */
public interface ServiceOutputParameterAbstraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Specified Output Parameter Abstraction</em>' reference.
	 * @see #setSignature_SpecifiedOutputParameterAbstraction(Signature)
	 * @see annotations.AnnotationsPackage#getServiceOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getSignature_SpecifiedOutputParameterAbstraction();

	/**
	 * Sets the value of the '{@link annotations.ServiceOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Specified Output Parameter Abstraction</em>' reference.
	 * @see #getSignature_SpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	void setSignature_SpecifiedOutputParameterAbstraction(Signature value);

	/**
	 * Returns the value of the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Specified Output Parameter Abstraction</em>' reference.
	 * @see #setRole_SpecifiedOutputParameterAbstraction(Role)
	 * @see annotations.AnnotationsPackage#getServiceOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Role getRole_SpecifiedOutputParameterAbstraction();

	/**
	 * Sets the value of the '{@link annotations.ServiceOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Specified Output Parameter Abstraction</em>' reference.
	 * @see #getRole_SpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	void setRole_SpecifiedOutputParameterAbstraction(Role value);

	/**
	 * Returns the value of the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected External Outputs Specified Output Parameter Abstraction</em>' containment reference list.
	 * @see annotations.AnnotationsPackage#getServiceOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the value of the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link annotations.AnnotationRoot#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos Annotations Specified Output Parameter Abstraction</em>' container reference.
	 * @see #setQosAnnotations_SpecifiedOutputParameterAbstraction(AnnotationRoot)
	 * @see annotations.AnnotationsPackage#getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction()
	 * @see annotations.AnnotationRoot#getSpecifiedOutputParameterAbstractions_QoSAnnotations
	 * @model opposite="specifiedOutputParameterAbstractions_QoSAnnotations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AnnotationRoot getQosAnnotations_SpecifiedOutputParameterAbstraction();

	/**
	 * Sets the value of the '{@link annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qos Annotations Specified Output Parameter Abstraction</em>' container reference.
	 * @see #getQosAnnotations_SpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	void setQosAnnotations_SpecifiedOutputParameterAbstraction(AnnotationRoot value);

} // ServiceOutputParameterAbstraction
