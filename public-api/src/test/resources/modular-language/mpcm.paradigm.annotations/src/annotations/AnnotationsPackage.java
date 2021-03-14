/**
 */
package annotations;

import base.BasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains elements to specify fixed QoS attributes of system-external services.
 * <!-- end-model-doc -->
 * @see annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.paradigm.annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.paradigm.annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link annotations.impl.AnnotationRootImpl <em>Annotation Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.AnnotationRootImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getAnnotationRoot()
	 * @generated
	 */
	int ANNOTATION_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ROOT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ROOT__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ROOT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link annotations.impl.ServicePropertyAnnotationImpl <em>Service Property Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.ServicePropertyAnnotationImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getServicePropertyAnnotation()
	 * @generated
	 */
	int SERVICE_PROPERTY_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = 0;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Service Property Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROPERTY_ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link annotations.impl.ServiceOutputParameterAbstractionImpl <em>Service Output Parameter Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotations.impl.ServiceOutputParameterAbstractionImpl
	 * @see annotations.impl.AnnotationsPackageImpl#getServiceOutputParameterAbstraction()
	 * @generated
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 0;

	/**
	 * The feature id for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 1;

	/**
	 * The feature id for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 3;

	/**
	 * The number of structural features of the '<em>Service Output Parameter Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OUTPUT_PARAMETER_ABSTRACTION_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link annotations.AnnotationRoot <em>Annotation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Root</em>'.
	 * @see annotations.AnnotationRoot
	 * @generated
	 */
	EClass getAnnotationRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link annotations.AnnotationRoot#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>'.
	 * @see annotations.AnnotationRoot#getSpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @see #getAnnotationRoot()
	 * @generated
	 */
	EReference getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link annotations.AnnotationRoot#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Qo SAnnotations Qo SAnnotations</em>'.
	 * @see annotations.AnnotationRoot#getSpecifiedQoSAnnotations_QoSAnnotations()
	 * @see #getAnnotationRoot()
	 * @generated
	 */
	EReference getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations();

	/**
	 * Returns the meta object for class '{@link annotations.ServicePropertyAnnotation <em>Service Property Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Property Annotation</em>'.
	 * @see annotations.ServicePropertyAnnotation
	 * @generated
	 */
	EClass getServicePropertyAnnotation();

	/**
	 * Returns the meta object for the reference '{@link annotations.ServicePropertyAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Specified Qo SAnnation</em>'.
	 * @see annotations.ServicePropertyAnnotation#getSignature_SpecifiedQoSAnnation()
	 * @see #getServicePropertyAnnotation()
	 * @generated
	 */
	EReference getServicePropertyAnnotation_Signature_SpecifiedQoSAnnation();

	/**
	 * Returns the meta object for the reference '{@link annotations.ServicePropertyAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Specified Qo SAnnotation</em>'.
	 * @see annotations.ServicePropertyAnnotation#getRole_SpecifiedQoSAnnotation()
	 * @see #getServicePropertyAnnotation()
	 * @generated
	 */
	EReference getServicePropertyAnnotation_Role_SpecifiedQoSAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Qos Annotations Specified Qo SAnnotation</em>'.
	 * @see annotations.ServicePropertyAnnotation#getQosAnnotations_SpecifiedQoSAnnotation()
	 * @see #getServicePropertyAnnotation()
	 * @generated
	 */
	EReference getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

	/**
	 * Returns the meta object for class '{@link annotations.ServiceOutputParameterAbstraction <em>Service Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Output Parameter Abstraction</em>'.
	 * @see annotations.ServiceOutputParameterAbstraction
	 * @generated
	 */
	EClass getServiceOutputParameterAbstraction();

	/**
	 * Returns the meta object for the reference '{@link annotations.ServiceOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Specified Output Parameter Abstraction</em>'.
	 * @see annotations.ServiceOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction()
	 * @see #getServiceOutputParameterAbstraction()
	 * @generated
	 */
	EReference getServiceOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the reference '{@link annotations.ServiceOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Specified Output Parameter Abstraction</em>'.
	 * @see annotations.ServiceOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction()
	 * @see #getServiceOutputParameterAbstraction()
	 * @generated
	 */
	EReference getServiceOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the containment reference list '{@link annotations.ServiceOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction <em>Expected External Outputs Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected External Outputs Specified Output Parameter Abstraction</em>'.
	 * @see annotations.ServiceOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()
	 * @see #getServiceOutputParameterAbstraction()
	 * @generated
	 */
	EReference getServiceOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the container reference '{@link annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Qos Annotations Specified Output Parameter Abstraction</em>'.
	 * @see annotations.ServiceOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction()
	 * @see #getServiceOutputParameterAbstraction()
	 * @generated
	 */
	EReference getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link annotations.impl.AnnotationRootImpl <em>Annotation Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.AnnotationRootImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getAnnotationRoot()
		 * @generated
		 */
		EClass ANNOTATION_ROOT = eINSTANCE.getAnnotationRoot();

		/**
		 * The meta object literal for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = eINSTANCE.getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations();

		/**
		 * The meta object literal for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = eINSTANCE.getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations();

		/**
		 * The meta object literal for the '{@link annotations.impl.ServicePropertyAnnotationImpl <em>Service Property Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.ServicePropertyAnnotationImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getServicePropertyAnnotation()
		 * @generated
		 */
		EClass SERVICE_PROPERTY_ANNOTATION = eINSTANCE.getServicePropertyAnnotation();

		/**
		 * The meta object literal for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROPERTY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = eINSTANCE.getServicePropertyAnnotation_Signature_SpecifiedQoSAnnation();

		/**
		 * The meta object literal for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROPERTY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = eINSTANCE.getServicePropertyAnnotation_Role_SpecifiedQoSAnnotation();

		/**
		 * The meta object literal for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = eINSTANCE.getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

		/**
		 * The meta object literal for the '{@link annotations.impl.ServiceOutputParameterAbstractionImpl <em>Service Output Parameter Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotations.impl.ServiceOutputParameterAbstractionImpl
		 * @see annotations.impl.AnnotationsPackageImpl#getServiceOutputParameterAbstraction()
		 * @generated
		 */
		EClass SERVICE_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getServiceOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getServiceOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getServiceOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getServiceOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

	}

} //AnnotationsPackage
