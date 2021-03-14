/**
 */
package softwarerepository;

import base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import repository.RepositoryPackage;

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
 * This  set of abstract meta-classes gives a conceptual view on interfaces, entities and their relationships: Two roles can be identified a software entity can take relative to an interface. Any entity can claim to implement the functionality specified in an interface as well as to request that functionality. 
 * 
 * Base of the inheritance hierarchy are Identifier and NamedElement, both of which Entity and all inheriting classes are derived from. 
 * 
 * The relationship of Entities and Interfaces is described with the three meta classes InterfaceProvidingEntity, InterfaceRequiringEntity, and InterfaceProvidingRequiringEntity. The abstract meta-class InterfaceProvidingEntity is inherited by all entities which can potentially offer interface implementations. Similarly, the meta-class InterfaceRequiringEntity is inherited by all entities which are allowed to request functionality offer by entities providing this functionality. InterfaceProvidingRequiringEntity inherits from both of them and thus combines their properties. 
 * <!-- end-model-doc -->
 * @see softwarerepository.SoftwarerepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwarerepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "softwarerepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.softwarerepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.softwarerepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarerepositoryPackage eINSTANCE = softwarerepository.impl.SoftwarerepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link softwarerepository.impl.SoftwarerepositoryImpl <em>Softwarerepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.SoftwarerepositoryImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getSoftwarerepository()
	 * @generated
	 */
	int SOFTWAREREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__INTERFACES_REPOSITORY = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Types Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__EXCEPTION_TYPES = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exception Occurences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Softwarerepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWAREREPOSITORY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.ExceptionTypeImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Exception Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.ExceptionOccurenceImpl <em>Exception Occurence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.ExceptionOccurenceImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getExceptionOccurence()
	 * @generated
	 */
	int EXCEPTION_OCCURENCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OCCURENCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OCCURENCE__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Exception Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OCCURENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.ImplementationComponentTypeImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getImplementationComponentType()
	 * @generated
	 */
	int IMPLEMENTATION_COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__ID = RepositoryPackage.REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME = RepositoryPackage.REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementation Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.BasicComponentImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getBasicComponent()
	 * @generated
	 */
	int BASIC_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ID = IMPLEMENTATION_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ENTITY_NAME = IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_FEATURE_COUNT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.ServiceEffectSpecificationImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getServiceEffectSpecification()
	 * @generated
	 */
	int SERVICE_EFFECT_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF = 1;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Service Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.PassiveResourceImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getPassiveResource()
	 * @generated
	 */
	int PASSIVE_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Capacity Passive Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic Component Passive Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.OperationInterfaceImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationInterface()
	 * @generated
	 */
	int OPERATION_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__ID = RepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__ENTITY_NAME = RepositoryPackage.INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__PARENT_INTERFACES_INTERFACE = RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__PROTOCOLS_INTERFACE = RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__REQUIRED_CHARACTERISATIONS = RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Signatures Operation Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = RepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE_FEATURE_COUNT = RepositoryPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.OperationSignatureImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationSignature()
	 * @generated
	 */
	int OPERATION_SIGNATURE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__ID = RepositoryPackage.SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__ENTITY_NAME = RepositoryPackage.SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Interface Operation Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = RepositoryPackage.SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters Operation Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = RepositoryPackage.SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = RepositoryPackage.SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE_FEATURE_COUNT = RepositoryPackage.SIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.OperationProvidedRoleImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationProvidedRole()
	 * @generated
	 */
	int OPERATION_PROVIDED_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__ID = RepositoryPackage.PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__ENTITY_NAME = RepositoryPackage.PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE_FEATURE_COUNT = RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link softwarerepository.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see softwarerepository.impl.OperationRequiredRoleImpl
	 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationRequiredRole()
	 * @generated
	 */
	int OPERATION_REQUIRED_ROLE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__ID = RepositoryPackage.REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__ENTITY_NAME = RepositoryPackage.REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Required Interface Operation Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE_FEATURE_COUNT = RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link softwarerepository.Softwarerepository <em>Softwarerepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Softwarerepository</em>'.
	 * @see softwarerepository.Softwarerepository
	 * @generated
	 */
	EClass getSoftwarerepository();

	/**
	 * Returns the meta object for the attribute '{@link softwarerepository.Softwarerepository#getRepositoryDescription <em>Repository Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Description</em>'.
	 * @see softwarerepository.Softwarerepository#getRepositoryDescription()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EAttribute getSoftwarerepository_RepositoryDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.Softwarerepository#getComponents__Repository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components Repository</em>'.
	 * @see softwarerepository.Softwarerepository#getComponents__Repository()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EReference getSoftwarerepository_Components__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.Softwarerepository#getInterfaces__Repository <em>Interfaces Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces Repository</em>'.
	 * @see softwarerepository.Softwarerepository#getInterfaces__Repository()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EReference getSoftwarerepository_Interfaces__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.Softwarerepository#getDataTypes__Repository <em>Data Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types Repository</em>'.
	 * @see softwarerepository.Softwarerepository#getDataTypes__Repository()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EReference getSoftwarerepository_DataTypes__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.Softwarerepository#getExceptionTypes <em>Exception Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Types</em>'.
	 * @see softwarerepository.Softwarerepository#getExceptionTypes()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EReference getSoftwarerepository_ExceptionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.Softwarerepository#getExceptionOccurences <em>Exception Occurences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Occurences</em>'.
	 * @see softwarerepository.Softwarerepository#getExceptionOccurences()
	 * @see #getSoftwarerepository()
	 * @generated
	 */
	EReference getSoftwarerepository_ExceptionOccurences();

	/**
	 * Returns the meta object for class '{@link softwarerepository.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see softwarerepository.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link softwarerepository.ExceptionType#getExceptionName <em>Exception Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Name</em>'.
	 * @see softwarerepository.ExceptionType#getExceptionName()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionName();

	/**
	 * Returns the meta object for the attribute '{@link softwarerepository.ExceptionType#getExceptionMessage <em>Exception Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Message</em>'.
	 * @see softwarerepository.ExceptionType#getExceptionMessage()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionMessage();

	/**
	 * Returns the meta object for class '{@link softwarerepository.ExceptionOccurence <em>Exception Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Occurence</em>'.
	 * @see softwarerepository.ExceptionOccurence
	 * @generated
	 */
	EClass getExceptionOccurence();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.ExceptionOccurence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see softwarerepository.ExceptionOccurence#getType()
	 * @see #getExceptionOccurence()
	 * @generated
	 */
	EReference getExceptionOccurence_Type();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.ExceptionOccurence#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see softwarerepository.ExceptionOccurence#getOwner()
	 * @see #getExceptionOccurence()
	 * @generated
	 */
	EReference getExceptionOccurence_Owner();

	/**
	 * Returns the meta object for class '{@link softwarerepository.ImplementationComponentType <em>Implementation Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Component Type</em>'.
	 * @see softwarerepository.ImplementationComponentType
	 * @generated
	 */
	EClass getImplementationComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Parameter Usage Implementation Component Type</em>'.
	 * @see softwarerepository.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType()
	 * @see #getImplementationComponentType()
	 * @generated
	 */
	EReference getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

	/**
	 * Returns the meta object for class '{@link softwarerepository.BasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component</em>'.
	 * @see softwarerepository.BasicComponent
	 * @generated
	 */
	EClass getBasicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Effect Specifications Basic Component</em>'.
	 * @see softwarerepository.BasicComponent#getServiceEffectSpecifications__BasicComponent()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EReference getBasicComponent_ServiceEffectSpecifications__BasicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passive Resource Basic Component</em>'.
	 * @see softwarerepository.BasicComponent#getPassiveResource_BasicComponent()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EReference getBasicComponent_PassiveResource_BasicComponent();

	/**
	 * Returns the meta object for class '{@link softwarerepository.ServiceEffectSpecification <em>Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Effect Specification</em>'.
	 * @see softwarerepository.ServiceEffectSpecification
	 * @generated
	 */
	EClass getServiceEffectSpecification();

	/**
	 * Returns the meta object for the attribute '{@link softwarerepository.ServiceEffectSpecification#getSeffTypeID <em>Seff Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seff Type ID</em>'.
	 * @see softwarerepository.ServiceEffectSpecification#getSeffTypeID()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EAttribute getServiceEffectSpecification_SeffTypeID();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.ServiceEffectSpecification#getDescribedService__SEFF <em>Described Service SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Described Service SEFF</em>'.
	 * @see softwarerepository.ServiceEffectSpecification#getDescribedService__SEFF()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EReference getServiceEffectSpecification_DescribedService__SEFF();

	/**
	 * Returns the meta object for the container reference '{@link softwarerepository.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Basic Component Service Effect Specification</em>'.
	 * @see softwarerepository.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EReference getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification();

	/**
	 * Returns the meta object for class '{@link softwarerepository.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Resource</em>'.
	 * @see softwarerepository.PassiveResource
	 * @generated
	 */
	EClass getPassiveResource();

	/**
	 * Returns the meta object for the containment reference '{@link softwarerepository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity Passive Resource</em>'.
	 * @see softwarerepository.PassiveResource#getCapacity_PassiveResource()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EReference getPassiveResource_Capacity_PassiveResource();

	/**
	 * Returns the meta object for the container reference '{@link softwarerepository.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Basic Component Passive Resource</em>'.
	 * @see softwarerepository.PassiveResource#getBasicComponent_PassiveResource()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EReference getPassiveResource_BasicComponent_PassiveResource();

	/**
	 * Returns the meta object for class '{@link softwarerepository.OperationInterface <em>Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Interface</em>'.
	 * @see softwarerepository.OperationInterface
	 * @generated
	 */
	EClass getOperationInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures Operation Interface</em>'.
	 * @see softwarerepository.OperationInterface#getSignatures__OperationInterface()
	 * @see #getOperationInterface()
	 * @generated
	 */
	EReference getOperationInterface_Signatures__OperationInterface();

	/**
	 * Returns the meta object for class '{@link softwarerepository.OperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Signature</em>'.
	 * @see softwarerepository.OperationSignature
	 * @generated
	 */
	EClass getOperationSignature();

	/**
	 * Returns the meta object for the container reference '{@link softwarerepository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface Operation Signature</em>'.
	 * @see softwarerepository.OperationSignature#getInterface__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_Interface__OperationSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link softwarerepository.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Operation Signature</em>'.
	 * @see softwarerepository.OperationSignature#getParameters__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_Parameters__OperationSignature();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type Operation Signature</em>'.
	 * @see softwarerepository.OperationSignature#getReturnType__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_ReturnType__OperationSignature();

	/**
	 * Returns the meta object for class '{@link softwarerepository.OperationProvidedRole <em>Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Provided Role</em>'.
	 * @see softwarerepository.OperationProvidedRole
	 * @generated
	 */
	EClass getOperationProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.OperationProvidedRole#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface Operation Provided Role</em>'.
	 * @see softwarerepository.OperationProvidedRole#getProvidedInterface__OperationProvidedRole()
	 * @see #getOperationProvidedRole()
	 * @generated
	 */
	EReference getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

	/**
	 * Returns the meta object for class '{@link softwarerepository.OperationRequiredRole <em>Operation Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Required Role</em>'.
	 * @see softwarerepository.OperationRequiredRole
	 * @generated
	 */
	EClass getOperationRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link softwarerepository.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface Operation Required Role</em>'.
	 * @see softwarerepository.OperationRequiredRole#getRequiredInterface__OperationRequiredRole()
	 * @see #getOperationRequiredRole()
	 * @generated
	 */
	EReference getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwarerepositoryFactory getSoftwarerepositoryFactory();

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
		 * The meta object literal for the '{@link softwarerepository.impl.SoftwarerepositoryImpl <em>Softwarerepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.SoftwarerepositoryImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getSoftwarerepository()
		 * @generated
		 */
		EClass SOFTWAREREPOSITORY = eINSTANCE.getSoftwarerepository();

		/**
		 * The meta object literal for the '<em><b>Repository Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION = eINSTANCE.getSoftwarerepository_RepositoryDescription();

		/**
		 * The meta object literal for the '<em><b>Components Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY = eINSTANCE.getSoftwarerepository_Components__Repository();

		/**
		 * The meta object literal for the '<em><b>Interfaces Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWAREREPOSITORY__INTERFACES_REPOSITORY = eINSTANCE.getSoftwarerepository_Interfaces__Repository();

		/**
		 * The meta object literal for the '<em><b>Data Types Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY = eINSTANCE.getSoftwarerepository_DataTypes__Repository();

		/**
		 * The meta object literal for the '<em><b>Exception Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWAREREPOSITORY__EXCEPTION_TYPES = eINSTANCE.getSoftwarerepository_ExceptionTypes();

		/**
		 * The meta object literal for the '<em><b>Exception Occurences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES = eINSTANCE.getSoftwarerepository_ExceptionOccurences();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.ExceptionTypeImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_NAME = eINSTANCE.getExceptionType_ExceptionName();

		/**
		 * The meta object literal for the '<em><b>Exception Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_MESSAGE = eINSTANCE.getExceptionType_ExceptionMessage();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.ExceptionOccurenceImpl <em>Exception Occurence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.ExceptionOccurenceImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getExceptionOccurence()
		 * @generated
		 */
		EClass EXCEPTION_OCCURENCE = eINSTANCE.getExceptionOccurence();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_OCCURENCE__TYPE = eINSTANCE.getExceptionOccurence_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_OCCURENCE__OWNER = eINSTANCE.getExceptionOccurence_Owner();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.ImplementationComponentTypeImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getImplementationComponentType()
		 * @generated
		 */
		EClass IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.BasicComponentImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getBasicComponent()
		 * @generated
		 */
		EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

		/**
		 * The meta object literal for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = eINSTANCE.getBasicComponent_ServiceEffectSpecifications__BasicComponent();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = eINSTANCE.getBasicComponent_PassiveResource_BasicComponent();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.ServiceEffectSpecificationImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getServiceEffectSpecification()
		 * @generated
		 */
		EClass SERVICE_EFFECT_SPECIFICATION = eINSTANCE.getServiceEffectSpecification();

		/**
		 * The meta object literal for the '<em><b>Seff Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID = eINSTANCE.getServiceEffectSpecification_SeffTypeID();

		/**
		 * The meta object literal for the '<em><b>Described Service SEFF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF = eINSTANCE.getServiceEffectSpecification_DescribedService__SEFF();

		/**
		 * The meta object literal for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = eINSTANCE.getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.PassiveResourceImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getPassiveResource()
		 * @generated
		 */
		EClass PASSIVE_RESOURCE = eINSTANCE.getPassiveResource();

		/**
		 * The meta object literal for the '<em><b>Capacity Passive Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_Capacity_PassiveResource();

		/**
		 * The meta object literal for the '<em><b>Basic Component Passive Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_BasicComponent_PassiveResource();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.OperationInterfaceImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationInterface()
		 * @generated
		 */
		EClass OPERATION_INTERFACE = eINSTANCE.getOperationInterface();

		/**
		 * The meta object literal for the '<em><b>Signatures Operation Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = eINSTANCE.getOperationInterface_Signatures__OperationInterface();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.OperationSignatureImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationSignature()
		 * @generated
		 */
		EClass OPERATION_SIGNATURE = eINSTANCE.getOperationSignature();

		/**
		 * The meta object literal for the '<em><b>Interface Operation Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Interface__OperationSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters Operation Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Parameters__OperationSignature();

		/**
		 * The meta object literal for the '<em><b>Return Type Operation Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_ReturnType__OperationSignature();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.OperationProvidedRoleImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationProvidedRole()
		 * @generated
		 */
		EClass OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

		/**
		 * The meta object literal for the '{@link softwarerepository.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see softwarerepository.impl.OperationRequiredRoleImpl
		 * @see softwarerepository.impl.SoftwarerepositoryPackageImpl#getOperationRequiredRole()
		 * @generated
		 */
		EClass OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Interface Operation Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

	}

} //SoftwarerepositoryPackage
