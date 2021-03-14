/**
 */
package resources;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see resources.ResourcesFactory
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
	String eNS_URI = "mpcm.domain.environment.resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.environment.resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link resources.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ResourceEnvironmentImpl
	 * @see resources.impl.ResourcesPackageImpl#getResourceEnvironment()
	 * @generated
	 */
	int RESOURCE_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Resource Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link resources.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ResourceContainerImpl
	 * @see resources.impl.ResourcesPackageImpl#getResourceContainer()
	 * @generated
	 */
	int RESOURCE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link resources.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ProcessingResourceSpecificationImpl
	 * @see resources.impl.ResourcesPackageImpl#getProcessingResourceSpecification()
	 * @generated
	 */
	int PROCESSING_RESOURCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link resources.impl.HDDProcessingResourceSpecificationImpl <em>HDD Processing Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.HDDProcessingResourceSpecificationImpl
	 * @see resources.impl.ResourcesPackageImpl#getHDDProcessingResourceSpecification()
	 * @generated
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__ID = PROCESSING_RESOURCE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY;

	/**
	 * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS;

	/**
	 * The feature id for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HDD Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link resources.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.CommunicationLinkResourceSpecificationImpl
	 * @see resources.impl.ResourcesPackageImpl#getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link resources.ResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Environment</em>'.
	 * @see resources.ResourceEnvironment
	 * @generated
	 */
	EClass getResourceEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.ResourceEnvironment#getResourceContainers <em>Resource Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Containers</em>'.
	 * @see resources.ResourceEnvironment#getResourceContainers()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_ResourceContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.ResourceEnvironment#getCommunicationLinkResourceSpecifications <em>Communication Link Resource Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Link Resource Specifications</em>'.
	 * @see resources.ResourceEnvironment#getCommunicationLinkResourceSpecifications()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_CommunicationLinkResourceSpecifications();

	/**
	 * Returns the meta object for class '{@link resources.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container</em>'.
	 * @see resources.ResourceContainer
	 * @generated
	 */
	EClass getResourceContainer();

	/**
	 * Returns the meta object for the reference '{@link resources.ResourceContainer#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see resources.ResourceContainer#getContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Resource Specifications Resource Container</em>'.
	 * @see resources.ResourceContainer#getActiveResourceSpecifications_ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

	/**
	 * Returns the meta object for the reference list '{@link resources.ResourceContainer#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hdd Resource Specifications</em>'.
	 * @see resources.ResourceContainer#getHddResourceSpecifications()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_HddResourceSpecifications();

	/**
	 * Returns the meta object for class '{@link resources.ProcessingResourceSpecification <em>Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Specification</em>'.
	 * @see resources.ProcessingResourceSpecification
	 * @generated
	 */
	EClass getProcessingResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link resources.ProcessingResourceSpecification#isRequiredByContainer <em>Required By Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Container</em>'.
	 * @see resources.ProcessingResourceSpecification#isRequiredByContainer()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_RequiredByContainer();

	/**
	 * Returns the meta object for the reference '{@link resources.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduling Policy</em>'.
	 * @see resources.ProcessingResourceSpecification#getSchedulingPolicy()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_SchedulingPolicy();

	/**
	 * Returns the meta object for the reference '{@link resources.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Resource Type Active Resource Specification</em>'.
	 * @see resources.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link resources.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Replicas</em>'.
	 * @see resources.ProcessingResourceSpecification#getNumberOfReplicas()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_NumberOfReplicas();

	/**
	 * Returns the meta object for the container reference '{@link resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Container Processing Resource Specification</em>'.
	 * @see resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

	/**
	 * Returns the meta object for class '{@link resources.HDDProcessingResourceSpecification <em>HDD Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDD Processing Resource Specification</em>'.
	 * @see resources.HDDProcessingResourceSpecification
	 * @generated
	 */
	EClass getHDDProcessingResourceSpecification();

	/**
	 * Returns the meta object for the reference '{@link resources.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Container</em>'.
	 * @see resources.HDDProcessingResourceSpecification#getResourceContainer()
	 * @see #getHDDProcessingResourceSpecification()
	 * @generated
	 */
	EReference getHDDProcessingResourceSpecification_ResourceContainer();

	/**
	 * Returns the meta object for class '{@link resources.CommunicationLinkResourceSpecification <em>Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Specification</em>'.
	 * @see resources.CommunicationLinkResourceSpecification
	 * @generated
	 */
	EClass getCommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the reference '{@link resources.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linking Resource Communication Link Resource Specification</em>'.
	 * @see resources.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the reference '{@link resources.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Communication Link Resource Specification</em>'.
	 * @see resources.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

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
		 * The meta object literal for the '{@link resources.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ResourceEnvironmentImpl
		 * @see resources.impl.ResourcesPackageImpl#getResourceEnvironment()
		 * @generated
		 */
		EClass RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Resource Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__RESOURCE_CONTAINERS = eINSTANCE.getResourceEnvironment_ResourceContainers();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS = eINSTANCE.getResourceEnvironment_CommunicationLinkResourceSpecifications();

		/**
		 * The meta object literal for the '{@link resources.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ResourceContainerImpl
		 * @see resources.impl.ResourcesPackageImpl#getResourceContainer()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER = eINSTANCE.getResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__CONTAINER = eINSTANCE.getResourceContainer_Container();

		/**
		 * The meta object literal for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Hdd Resource Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS = eINSTANCE.getResourceContainer_HddResourceSpecifications();

		/**
		 * The meta object literal for the '{@link resources.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ProcessingResourceSpecificationImpl
		 * @see resources.impl.ResourcesPackageImpl#getProcessingResourceSpecification()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Required By Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = eINSTANCE.getProcessingResourceSpecification_RequiredByContainer();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = eINSTANCE.getProcessingResourceSpecification_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Number Of Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = eINSTANCE.getProcessingResourceSpecification_NumberOfReplicas();

		/**
		 * The meta object literal for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

		/**
		 * The meta object literal for the '{@link resources.impl.HDDProcessingResourceSpecificationImpl <em>HDD Processing Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.HDDProcessingResourceSpecificationImpl
		 * @see resources.impl.ResourcesPackageImpl#getHDDProcessingResourceSpecification()
		 * @generated
		 */
		EClass HDD_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getHDDProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER = eINSTANCE.getHDDProcessingResourceSpecification_ResourceContainer();

		/**
		 * The meta object literal for the '{@link resources.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.CommunicationLinkResourceSpecificationImpl
		 * @see resources.impl.ResourcesPackageImpl#getCommunicationLinkResourceSpecification()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

	}

} //ResourcesPackage
