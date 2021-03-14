/**
 */
package reliability.resources;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see reliability.resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.reliability.resourceenvironment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliability.resourceenvironment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = reliability.resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliability.resources.impl.ReliabilityResourceRootImpl <em>Reliability Resource Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.resources.impl.ReliabilityResourceRootImpl
	 * @see reliability.resources.impl.ResourcesPackageImpl#getReliabilityResourceRoot()
	 * @generated
	 */
	int RELIABILITY_RESOURCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Processing Resource Reliability Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Reliability Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Reliability Resource Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_RESOURCE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl <em>Processing Resource Reliability Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl
	 * @see reliability.resources.impl.ResourcesPackageImpl#getProcessingResourceReliabilitySpecification()
	 * @generated
	 */
	int PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR = 0;

	/**
	 * The feature id for the '<em><b>MTTF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Processing Resource Reliability Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link reliability.resources.impl.CommunicationLinkResourceReliabilitySpecificationImpl <em>Communication Link Resource Reliability Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.resources.impl.CommunicationLinkResourceReliabilitySpecificationImpl
	 * @see reliability.resources.impl.ResourcesPackageImpl#getCommunicationLinkResourceReliabilitySpecification()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__FAILURE_PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Reliability Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link reliability.resources.ReliabilityResourceRoot <em>Reliability Resource Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Resource Root</em>'.
	 * @see reliability.resources.ReliabilityResourceRoot
	 * @generated
	 */
	EClass getReliabilityResourceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.resources.ReliabilityResourceRoot#getProcessingResourceReliabilitySpecification <em>Processing Resource Reliability Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Resource Reliability Specification</em>'.
	 * @see reliability.resources.ReliabilityResourceRoot#getProcessingResourceReliabilitySpecification()
	 * @see #getReliabilityResourceRoot()
	 * @generated
	 */
	EReference getReliabilityResourceRoot_ProcessingResourceReliabilitySpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.resources.ReliabilityResourceRoot#getCommunicationLinkResourceReliabilitySpecifications <em>Communication Link Resource Reliability Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Link Resource Reliability Specifications</em>'.
	 * @see reliability.resources.ReliabilityResourceRoot#getCommunicationLinkResourceReliabilitySpecifications()
	 * @see #getReliabilityResourceRoot()
	 * @generated
	 */
	EReference getReliabilityResourceRoot_CommunicationLinkResourceReliabilitySpecifications();

	/**
	 * Returns the meta object for class '{@link reliability.resources.ProcessingResourceReliabilitySpecification <em>Processing Resource Reliability Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Reliability Specification</em>'.
	 * @see reliability.resources.ProcessingResourceReliabilitySpecification
	 * @generated
	 */
	EClass getProcessingResourceReliabilitySpecification();

	/**
	 * Returns the meta object for the attribute '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTR</em>'.
	 * @see reliability.resources.ProcessingResourceReliabilitySpecification#getMTTR()
	 * @see #getProcessingResourceReliabilitySpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceReliabilitySpecification_MTTR();

	/**
	 * Returns the meta object for the attribute '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTF <em>MTTF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTF</em>'.
	 * @see reliability.resources.ProcessingResourceReliabilitySpecification#getMTTF()
	 * @see #getProcessingResourceReliabilitySpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceReliabilitySpecification_MTTF();

	/**
	 * Returns the meta object for the reference '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see reliability.resources.ProcessingResourceReliabilitySpecification#getOwner()
	 * @see #getProcessingResourceReliabilitySpecification()
	 * @generated
	 */
	EReference getProcessingResourceReliabilitySpecification_Owner();

	/**
	 * Returns the meta object for class '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification <em>Communication Link Resource Reliability Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Reliability Specification</em>'.
	 * @see reliability.resources.CommunicationLinkResourceReliabilitySpecification
	 * @generated
	 */
	EClass getCommunicationLinkResourceReliabilitySpecification();

	/**
	 * Returns the meta object for the attribute '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see reliability.resources.CommunicationLinkResourceReliabilitySpecification#getFailureProbability()
	 * @see #getCommunicationLinkResourceReliabilitySpecification()
	 * @generated
	 */
	EAttribute getCommunicationLinkResourceReliabilitySpecification_FailureProbability();

	/**
	 * Returns the meta object for the reference '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see reliability.resources.CommunicationLinkResourceReliabilitySpecification#getOwner()
	 * @see #getCommunicationLinkResourceReliabilitySpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceReliabilitySpecification_Owner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

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
		 * The meta object literal for the '{@link reliability.resources.impl.ReliabilityResourceRootImpl <em>Reliability Resource Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.resources.impl.ReliabilityResourceRootImpl
		 * @see reliability.resources.impl.ResourcesPackageImpl#getReliabilityResourceRoot()
		 * @generated
		 */
		EClass RELIABILITY_RESOURCE_ROOT = eINSTANCE.getReliabilityResourceRoot();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Reliability Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION = eINSTANCE.getReliabilityResourceRoot_ProcessingResourceReliabilitySpecification();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Reliability Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS = eINSTANCE.getReliabilityResourceRoot_CommunicationLinkResourceReliabilitySpecifications();

		/**
		 * The meta object literal for the '{@link reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl <em>Processing Resource Reliability Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl
		 * @see reliability.resources.impl.ResourcesPackageImpl#getProcessingResourceReliabilitySpecification()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION = eINSTANCE.getProcessingResourceReliabilitySpecification();

		/**
		 * The meta object literal for the '<em><b>MTTR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR = eINSTANCE.getProcessingResourceReliabilitySpecification_MTTR();

		/**
		 * The meta object literal for the '<em><b>MTTF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF = eINSTANCE.getProcessingResourceReliabilitySpecification_MTTF();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER = eINSTANCE.getProcessingResourceReliabilitySpecification_Owner();

		/**
		 * The meta object literal for the '{@link reliability.resources.impl.CommunicationLinkResourceReliabilitySpecificationImpl <em>Communication Link Resource Reliability Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.resources.impl.CommunicationLinkResourceReliabilitySpecificationImpl
		 * @see reliability.resources.impl.ResourcesPackageImpl#getCommunicationLinkResourceReliabilitySpecification()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceReliabilitySpecification();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__FAILURE_PROBABILITY = eINSTANCE.getCommunicationLinkResourceReliabilitySpecification_FailureProbability();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__OWNER = eINSTANCE.getCommunicationLinkResourceReliabilitySpecification_Owner();

	}

} //ResourcesPackage
