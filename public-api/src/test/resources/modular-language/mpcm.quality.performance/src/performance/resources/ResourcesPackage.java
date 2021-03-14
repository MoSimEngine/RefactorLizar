/**
 */
package performance.resources;

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
 * @see performance.resources.ResourcesFactory
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
	String eNS_URI = "mpcm.quality.performance.resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.performance.presources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = performance.resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link performance.resources.impl.PerformanceResourcesRootImpl <em>Performance Resources Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.resources.impl.PerformanceResourcesRootImpl
	 * @see performance.resources.impl.ResourcesPackageImpl#getPerformanceResourcesRoot()
	 * @generated
	 */
	int PERFORMANCE_RESOURCES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Processing Resource Performance Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Performance Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Hdd Resource Performance Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Performance Resources Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_RESOURCES_ROOT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl <em>Processing Resource Performance Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl
	 * @see performance.resources.impl.ResourcesPackageImpl#getProcessingResourcePerformanceSpecification()
	 * @generated
	 */
	int PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Processing Resource Performance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl <em>Communication Link Resource Performance Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl
	 * @see performance.resources.impl.ResourcesPackageImpl#getCommunicationLinkResourcePerformanceSpecification()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Performance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link performance.resources.impl.HDDResourcePerformanceSpecificationImpl <em>HDD Resource Performance Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.resources.impl.HDDResourcePerformanceSpecificationImpl
	 * @see performance.resources.impl.ResourcesPackageImpl#getHDDResourcePerformanceSpecification()
	 * @generated
	 */
	int HDD_RESOURCE_PERFORMANCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Write Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE = 1;

	/**
	 * The feature id for the '<em><b>Read Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE = 2;

	/**
	 * The number of structural features of the '<em>HDD Resource Performance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_RESOURCE_PERFORMANCE_SPECIFICATION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link performance.resources.PerformanceResourcesRoot <em>Performance Resources Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Resources Root</em>'.
	 * @see performance.resources.PerformanceResourcesRoot
	 * @generated
	 */
	EClass getPerformanceResourcesRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link performance.resources.PerformanceResourcesRoot#getProcessingResourcePerformanceSpecifications <em>Processing Resource Performance Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Resource Performance Specifications</em>'.
	 * @see performance.resources.PerformanceResourcesRoot#getProcessingResourcePerformanceSpecifications()
	 * @see #getPerformanceResourcesRoot()
	 * @generated
	 */
	EReference getPerformanceResourcesRoot_ProcessingResourcePerformanceSpecifications();

	/**
	 * Returns the meta object for the containment reference list '{@link performance.resources.PerformanceResourcesRoot#getCommunicationLinkResourcePerformanceSpecifications <em>Communication Link Resource Performance Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Link Resource Performance Specifications</em>'.
	 * @see performance.resources.PerformanceResourcesRoot#getCommunicationLinkResourcePerformanceSpecifications()
	 * @see #getPerformanceResourcesRoot()
	 * @generated
	 */
	EReference getPerformanceResourcesRoot_CommunicationLinkResourcePerformanceSpecifications();

	/**
	 * Returns the meta object for the containment reference list '{@link performance.resources.PerformanceResourcesRoot#getHddResourcePerformanceSpecification <em>Hdd Resource Performance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hdd Resource Performance Specification</em>'.
	 * @see performance.resources.PerformanceResourcesRoot#getHddResourcePerformanceSpecification()
	 * @see #getPerformanceResourcesRoot()
	 * @generated
	 */
	EReference getPerformanceResourcesRoot_HddResourcePerformanceSpecification();

	/**
	 * Returns the meta object for class '{@link performance.resources.ProcessingResourcePerformanceSpecification <em>Processing Resource Performance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Performance Specification</em>'.
	 * @see performance.resources.ProcessingResourcePerformanceSpecification
	 * @generated
	 */
	EClass getProcessingResourcePerformanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link performance.resources.ProcessingResourcePerformanceSpecification#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see performance.resources.ProcessingResourcePerformanceSpecification#getOwner()
	 * @see #getProcessingResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getProcessingResourcePerformanceSpecification_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link performance.resources.ProcessingResourcePerformanceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Rate Processing Resource Specification</em>'.
	 * @see performance.resources.ProcessingResourcePerformanceSpecification#getProcessingRate_ProcessingResourceSpecification()
	 * @see #getProcessingResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getProcessingResourcePerformanceSpecification_ProcessingRate_ProcessingResourceSpecification();

	/**
	 * Returns the meta object for class '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification <em>Communication Link Resource Performance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Performance Specification</em>'.
	 * @see performance.resources.CommunicationLinkResourcePerformanceSpecification
	 * @generated
	 */
	EClass getCommunicationLinkResourcePerformanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see performance.resources.CommunicationLinkResourcePerformanceSpecification#getOwner()
	 * @see #getCommunicationLinkResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourcePerformanceSpecification_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Communication Link Resource Specification</em>'.
	 * @see performance.resources.CommunicationLinkResourcePerformanceSpecification#getLatency_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourcePerformanceSpecification_Latency_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link performance.resources.CommunicationLinkResourcePerformanceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput Communication Link Resource Specification</em>'.
	 * @see performance.resources.CommunicationLinkResourcePerformanceSpecification#getThroughput_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourcePerformanceSpecification_Throughput_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for class '{@link performance.resources.HDDResourcePerformanceSpecification <em>HDD Resource Performance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDD Resource Performance Specification</em>'.
	 * @see performance.resources.HDDResourcePerformanceSpecification
	 * @generated
	 */
	EClass getHDDResourcePerformanceSpecification();

	/**
	 * Returns the meta object for the reference '{@link performance.resources.HDDResourcePerformanceSpecification#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see performance.resources.HDDResourcePerformanceSpecification#getOwner()
	 * @see #getHDDResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getHDDResourcePerformanceSpecification_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link performance.resources.HDDResourcePerformanceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Processing Rate</em>'.
	 * @see performance.resources.HDDResourcePerformanceSpecification#getWriteProcessingRate()
	 * @see #getHDDResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getHDDResourcePerformanceSpecification_WriteProcessingRate();

	/**
	 * Returns the meta object for the containment reference '{@link performance.resources.HDDResourcePerformanceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Processing Rate</em>'.
	 * @see performance.resources.HDDResourcePerformanceSpecification#getReadProcessingRate()
	 * @see #getHDDResourcePerformanceSpecification()
	 * @generated
	 */
	EReference getHDDResourcePerformanceSpecification_ReadProcessingRate();

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
		 * The meta object literal for the '{@link performance.resources.impl.PerformanceResourcesRootImpl <em>Performance Resources Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.resources.impl.PerformanceResourcesRootImpl
		 * @see performance.resources.impl.ResourcesPackageImpl#getPerformanceResourcesRoot()
		 * @generated
		 */
		EClass PERFORMANCE_RESOURCES_ROOT = eINSTANCE.getPerformanceResourcesRoot();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Performance Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS = eINSTANCE.getPerformanceResourcesRoot_ProcessingResourcePerformanceSpecifications();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Performance Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS = eINSTANCE.getPerformanceResourcesRoot_CommunicationLinkResourcePerformanceSpecifications();

		/**
		 * The meta object literal for the '<em><b>Hdd Resource Performance Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION = eINSTANCE.getPerformanceResourcesRoot_HddResourcePerformanceSpecification();

		/**
		 * The meta object literal for the '{@link performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl <em>Processing Resource Performance Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl
		 * @see performance.resources.impl.ResourcesPackageImpl#getProcessingResourcePerformanceSpecification()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION = eINSTANCE.getProcessingResourcePerformanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = eINSTANCE.getProcessingResourcePerformanceSpecification_Owner();

		/**
		 * The meta object literal for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourcePerformanceSpecification_ProcessingRate_ProcessingResourceSpecification();

		/**
		 * The meta object literal for the '{@link performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl <em>Communication Link Resource Performance Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl
		 * @see performance.resources.impl.ResourcesPackageImpl#getCommunicationLinkResourcePerformanceSpecification()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourcePerformanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = eINSTANCE.getCommunicationLinkResourcePerformanceSpecification_Owner();

		/**
		 * The meta object literal for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourcePerformanceSpecification_Latency_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourcePerformanceSpecification_Throughput_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '{@link performance.resources.impl.HDDResourcePerformanceSpecificationImpl <em>HDD Resource Performance Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.resources.impl.HDDResourcePerformanceSpecificationImpl
		 * @see performance.resources.impl.ResourcesPackageImpl#getHDDResourcePerformanceSpecification()
		 * @generated
		 */
		EClass HDD_RESOURCE_PERFORMANCE_SPECIFICATION = eINSTANCE.getHDDResourcePerformanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER = eINSTANCE.getHDDResourcePerformanceSpecification_Owner();

		/**
		 * The meta object literal for the '<em><b>Write Processing Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE = eINSTANCE.getHDDResourcePerformanceSpecification_WriteProcessingRate();

		/**
		 * The meta object literal for the '<em><b>Read Processing Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE = eINSTANCE.getHDDResourcePerformanceSpecification_ReadProcessingRate();

	}

} //ResourcesPackage
