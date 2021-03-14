/**
 */
package resources.resourcetype;

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
 * Package containing all resource types supported by the PCM
 * <!-- end-model-doc -->
 * @see resources.resourcetype.ResourcetypeFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcetypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourcetype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.environment.resources.resourcetype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.environment.resources.resourcetype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypePackage eINSTANCE = resources.resourcetype.impl.ResourcetypePackageImpl.init();

	/**
	 * The meta object id for the '{@link resources.resourcetype.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.resourcetype.impl.ResourceRepositoryImpl
	 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getResourceRepository()
	 * @generated
	 */
	int RESOURCE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Scheduling Policies Resource Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Available Resource Types Resource Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Resource Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link resources.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.resourcetype.impl.ResourceTypeImpl
	 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__UNIT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Repository Resource Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link resources.resourcetype.impl.ProcessingResourceTypeImpl <em>Processing Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.resourcetype.impl.ProcessingResourceTypeImpl
	 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getProcessingResourceType()
	 * @generated
	 */
	int PROCESSING_RESOURCE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__ID = RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__ENTITY_NAME = RESOURCE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__UNIT = RESOURCE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Resource Repository Resource Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE = RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Processing Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.resourcetype.impl.SchedulingPolicyImpl <em>Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.resourcetype.impl.SchedulingPolicyImpl
	 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Repository Scheduling Policy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link resources.resourcetype.impl.CommunicationLinkResourceTypeImpl <em>Communication Link Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.resourcetype.impl.CommunicationLinkResourceTypeImpl
	 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getCommunicationLinkResourceType()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE__ID = RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE__ENTITY_NAME = RESOURCE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE__UNIT = RESOURCE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Resource Repository Resource Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE = RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_TYPE_FEATURE_COUNT = RESOURCE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link resources.resourcetype.ResourceRepository <em>Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Repository</em>'.
	 * @see resources.resourcetype.ResourceRepository
	 * @generated
	 */
	EClass getResourceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Policies Resource Repository</em>'.
	 * @see resources.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository()
	 * @see #getResourceRepository()
	 * @generated
	 */
	EReference getResourceRepository_SchedulingPolicies__ResourceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Resource Types Resource Repository</em>'.
	 * @see resources.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository()
	 * @see #getResourceRepository()
	 * @generated
	 */
	EReference getResourceRepository_AvailableResourceTypes_ResourceRepository();

	/**
	 * Returns the meta object for class '{@link resources.resourcetype.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see resources.resourcetype.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the container reference '{@link resources.resourcetype.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Repository Resource Type</em>'.
	 * @see resources.resourcetype.ResourceType#getResourceRepository_ResourceType()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_ResourceRepository_ResourceType();

	/**
	 * Returns the meta object for class '{@link resources.resourcetype.ProcessingResourceType <em>Processing Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Type</em>'.
	 * @see resources.resourcetype.ProcessingResourceType
	 * @generated
	 */
	EClass getProcessingResourceType();

	/**
	 * Returns the meta object for class '{@link resources.resourcetype.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Policy</em>'.
	 * @see resources.resourcetype.SchedulingPolicy
	 * @generated
	 */
	EClass getSchedulingPolicy();

	/**
	 * Returns the meta object for the container reference '{@link resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Repository Scheduling Policy</em>'.
	 * @see resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy()
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	EReference getSchedulingPolicy_ResourceRepository__SchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link resources.resourcetype.CommunicationLinkResourceType <em>Communication Link Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Type</em>'.
	 * @see resources.resourcetype.CommunicationLinkResourceType
	 * @generated
	 */
	EClass getCommunicationLinkResourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcetypeFactory getResourcetypeFactory();

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
		 * The meta object literal for the '{@link resources.resourcetype.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.resourcetype.impl.ResourceRepositoryImpl
		 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getResourceRepository()
		 * @generated
		 */
		EClass RESOURCE_REPOSITORY = eINSTANCE.getResourceRepository();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policies Resource Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REPOSITORY__SCHEDULING_POLICIES_RESOURCE_REPOSITORY = eINSTANCE.getResourceRepository_SchedulingPolicies__ResourceRepository();

		/**
		 * The meta object literal for the '<em><b>Available Resource Types Resource Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REPOSITORY__AVAILABLE_RESOURCE_TYPES_RESOURCE_REPOSITORY = eINSTANCE.getResourceRepository_AvailableResourceTypes_ResourceRepository();

		/**
		 * The meta object literal for the '{@link resources.resourcetype.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.resourcetype.impl.ResourceTypeImpl
		 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Resource Repository Resource Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TYPE__RESOURCE_REPOSITORY_RESOURCE_TYPE = eINSTANCE.getResourceType_ResourceRepository_ResourceType();

		/**
		 * The meta object literal for the '{@link resources.resourcetype.impl.ProcessingResourceTypeImpl <em>Processing Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.resourcetype.impl.ProcessingResourceTypeImpl
		 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getProcessingResourceType()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_TYPE = eINSTANCE.getProcessingResourceType();

		/**
		 * The meta object literal for the '{@link resources.resourcetype.impl.SchedulingPolicyImpl <em>Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.resourcetype.impl.SchedulingPolicyImpl
		 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EClass SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Resource Repository Scheduling Policy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_POLICY__RESOURCE_REPOSITORY_SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy_ResourceRepository__SchedulingPolicy();

		/**
		 * The meta object literal for the '{@link resources.resourcetype.impl.CommunicationLinkResourceTypeImpl <em>Communication Link Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.resourcetype.impl.CommunicationLinkResourceTypeImpl
		 * @see resources.resourcetype.impl.ResourcetypePackageImpl#getCommunicationLinkResourceType()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_TYPE = eINSTANCE.getCommunicationLinkResourceType();

	}

} //ResourcetypePackage
