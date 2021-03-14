/**
 */
package reliability.failuretypes;

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
 * @see reliability.failuretypes.FailuretypesFactory
 * @model kind="package"
 * @generated
 */
public interface FailuretypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "failuretypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.reliability.failuretypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliability.failuretypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailuretypesPackage eINSTANCE = reliability.failuretypes.impl.FailuretypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.FailureTypesRootImpl <em>Failure Types Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.FailureTypesRootImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getFailureTypesRoot()
	 * @generated
	 */
	int FAILURE_TYPES_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Failure Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPES_ROOT__FAILURE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Failure Types Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPES_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.FailureTypeImpl <em>Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.FailureTypeImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getFailureType()
	 * @generated
	 */
	int FAILURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.NetworkInducedFailureTypeImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getNetworkInducedFailureType()
	 * @generated
	 */
	int NETWORK_INDUCED_FAILURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.HardwareInducedFailureTypeImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getHardwareInducedFailureType()
	 * @generated
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.SoftwareInducedFailureTypeImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getSoftwareInducedFailureType()
	 * @generated
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliability.failuretypes.impl.ResourceTimeoutFailureTypeImpl <em>Resource Timeout Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.failuretypes.impl.ResourceTimeoutFailureTypeImpl
	 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getResourceTimeoutFailureType()
	 * @generated
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__ID = SOFTWARE_INDUCED_FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__ENTITY_NAME = SOFTWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Passive Resource Resource Timeout Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE = SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Timeout Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE_FEATURE_COUNT = SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.FailureTypesRoot <em>Failure Types Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Types Root</em>'.
	 * @see reliability.failuretypes.FailureTypesRoot
	 * @generated
	 */
	EClass getFailureTypesRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.failuretypes.FailureTypesRoot#getFailureTypes <em>Failure Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Types</em>'.
	 * @see reliability.failuretypes.FailureTypesRoot#getFailureTypes()
	 * @see #getFailureTypesRoot()
	 * @generated
	 */
	EReference getFailureTypesRoot_FailureTypes();

	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Type</em>'.
	 * @see reliability.failuretypes.FailureType
	 * @generated
	 */
	EClass getFailureType();

	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.NetworkInducedFailureType <em>Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Induced Failure Type</em>'.
	 * @see reliability.failuretypes.NetworkInducedFailureType
	 * @generated
	 */
	EClass getNetworkInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link reliability.failuretypes.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Network Induced Failure Type</em>'.
	 * @see reliability.failuretypes.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @see #getNetworkInducedFailureType()
	 * @generated
	 */
	EReference getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.HardwareInducedFailureType <em>Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Induced Failure Type</em>'.
	 * @see reliability.failuretypes.HardwareInducedFailureType
	 * @generated
	 */
	EClass getHardwareInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link reliability.failuretypes.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Resource Type Hardware Induced Failure Type</em>'.
	 * @see reliability.failuretypes.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType()
	 * @see #getHardwareInducedFailureType()
	 * @generated
	 */
	EReference getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.SoftwareInducedFailureType <em>Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Induced Failure Type</em>'.
	 * @see reliability.failuretypes.SoftwareInducedFailureType
	 * @generated
	 */
	EClass getSoftwareInducedFailureType();

	/**
	 * Returns the meta object for the reference list '{@link reliability.failuretypes.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>'.
	 * @see reliability.failuretypes.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType()
	 * @see #getSoftwareInducedFailureType()
	 * @generated
	 */
	EReference getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link reliability.failuretypes.ResourceTimeoutFailureType <em>Resource Timeout Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Timeout Failure Type</em>'.
	 * @see reliability.failuretypes.ResourceTimeoutFailureType
	 * @generated
	 */
	EClass getResourceTimeoutFailureType();

	/**
	 * Returns the meta object for the reference '{@link reliability.failuretypes.ResourceTimeoutFailureType#getPassiveResource__ResourceTimeoutFailureType <em>Passive Resource Resource Timeout Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Resource Resource Timeout Failure Type</em>'.
	 * @see reliability.failuretypes.ResourceTimeoutFailureType#getPassiveResource__ResourceTimeoutFailureType()
	 * @see #getResourceTimeoutFailureType()
	 * @generated
	 */
	EReference getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FailuretypesFactory getFailuretypesFactory();

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
		 * The meta object literal for the '{@link reliability.failuretypes.impl.FailureTypesRootImpl <em>Failure Types Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.FailureTypesRootImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getFailureTypesRoot()
		 * @generated
		 */
		EClass FAILURE_TYPES_ROOT = eINSTANCE.getFailureTypesRoot();

		/**
		 * The meta object literal for the '<em><b>Failure Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPES_ROOT__FAILURE_TYPES = eINSTANCE.getFailureTypesRoot_FailureTypes();

		/**
		 * The meta object literal for the '{@link reliability.failuretypes.impl.FailureTypeImpl <em>Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.FailureTypeImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getFailureType()
		 * @generated
		 */
		EClass FAILURE_TYPE = eINSTANCE.getFailureType();

		/**
		 * The meta object literal for the '{@link reliability.failuretypes.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.NetworkInducedFailureTypeImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getNetworkInducedFailureType()
		 * @generated
		 */
		EClass NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

		/**
		 * The meta object literal for the '{@link reliability.failuretypes.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.HardwareInducedFailureTypeImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getHardwareInducedFailureType()
		 * @generated
		 */
		EClass HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link reliability.failuretypes.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.SoftwareInducedFailureTypeImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getSoftwareInducedFailureType()
		 * @generated
		 */
		EClass SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link reliability.failuretypes.impl.ResourceTimeoutFailureTypeImpl <em>Resource Timeout Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.failuretypes.impl.ResourceTimeoutFailureTypeImpl
		 * @see reliability.failuretypes.impl.FailuretypesPackageImpl#getResourceTimeoutFailureType()
		 * @generated
		 */
		EClass RESOURCE_TIMEOUT_FAILURE_TYPE = eINSTANCE.getResourceTimeoutFailureType();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Resource Timeout Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE = eINSTANCE.getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType();

	}

} //FailuretypesPackage
