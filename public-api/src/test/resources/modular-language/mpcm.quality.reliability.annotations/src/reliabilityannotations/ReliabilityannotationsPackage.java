/**
 */
package reliabilityannotations;

import annotations.AnnotationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import reliability.ReliabilityPackage;

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
 * Reliability&nbsp;aspects&nbsp;of&nbsp;QoS&nbsp;annotations.
 * <!-- end-model-doc -->
 * @see reliabilityannotations.ReliabilityannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface ReliabilityannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reliabilityannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.reliabilityannotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliabilityannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliabilityannotationsPackage eINSTANCE = reliabilityannotations.impl.ReliabilityannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliabilityannotations.impl.ServiceReliabilityAnnotationImpl <em>Service Reliability Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliabilityannotations.impl.ServiceReliabilityAnnotationImpl
	 * @see reliabilityannotations.impl.ReliabilityannotationsPackageImpl#getServiceReliabilityAnnotation()
	 * @generated
	 */
	int SERVICE_RELIABILITY_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RELIABILITY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RELIABILITY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RELIABILITY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Reliability Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RELIABILITY_ANNOTATION_FEATURE_COUNT = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl
	 * @see reliabilityannotations.impl.ReliabilityannotationsPackageImpl#getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link reliabilityannotations.ServiceReliabilityAnnotation <em>Service Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Reliability Annotation</em>'.
	 * @see reliabilityannotations.ServiceReliabilityAnnotation
	 * @generated
	 */
	EClass getServiceReliabilityAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link reliabilityannotations.ServiceReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>'.
	 * @see reliabilityannotations.ServiceReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
	 * @see #getServiceReliabilityAnnotation()
	 * @generated
	 */
	EReference getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

	/**
	 * Returns the meta object for class '{@link reliabilityannotations.ExternalFailureOccurrenceDescription <em>External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Failure Occurrence Description</em>'.
	 * @see reliabilityannotations.ExternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the container reference '{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specified Reliability Annotation External Failure Occurrence Description</em>'.
	 * @see reliabilityannotations.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link reliabilityannotations.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Type External Failure Occurrence Description</em>'.
	 * @see reliabilityannotations.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReliabilityannotationsFactory getReliabilityannotationsFactory();

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
		 * The meta object literal for the '{@link reliabilityannotations.impl.ServiceReliabilityAnnotationImpl <em>Service Reliability Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliabilityannotations.impl.ServiceReliabilityAnnotationImpl
		 * @see reliabilityannotations.impl.ReliabilityannotationsPackageImpl#getServiceReliabilityAnnotation()
		 * @generated
		 */
		EClass SERVICE_RELIABILITY_ANNOTATION = eINSTANCE.getServiceReliabilityAnnotation();

		/**
		 * The meta object literal for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = eINSTANCE.getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

		/**
		 * The meta object literal for the '{@link reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl
		 * @see reliabilityannotations.impl.ReliabilityannotationsPackageImpl#getExternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription();

	}

} //ReliabilityannotationsPackage
