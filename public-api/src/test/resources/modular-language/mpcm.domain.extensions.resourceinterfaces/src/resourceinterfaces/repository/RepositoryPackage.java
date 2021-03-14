/**
 */
package resourceinterfaces.repository;

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
 * @see resourceinterfaces.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.extensions.resourceinterfaces.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.resourceinterfaces.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = resourceinterfaces.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link resourceinterfaces.repository.impl.ResourceInterfacesRepositoryRootImpl <em>Resource Interfaces Repository Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.repository.impl.ResourceInterfacesRepositoryRootImpl
	 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfacesRepositoryRoot()
	 * @generated
	 */
	int RESOURCE_INTERFACES_REPOSITORY_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Resourceinterfacerequiringentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY = 0;

	/**
	 * The number of structural features of the '<em>Resource Interfaces Repository Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACES_REPOSITORY_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link resourceinterfaces.repository.impl.ResourceRequiredRoleImpl <em>Resource Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.repository.impl.ResourceRequiredRoleImpl
	 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceRequiredRole()
	 * @generated
	 */
	int RESOURCE_REQUIRED_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__ID = repository.RepositoryPackage.ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__ENTITY_NAME = repository.RepositoryPackage.ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE = repository.RepositoryPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE = repository.RepositoryPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE_FEATURE_COUNT = repository.RepositoryPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link resourceinterfaces.repository.impl.ResourceInterfaceRequiringEntityImpl <em>Resource Interface Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.repository.impl.ResourceInterfaceRequiringEntityImpl
	 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfaceRequiringEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Requiring Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__INTERFACE_REQUIRING_ENTITY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link resourceinterfaces.repository.impl.ResourceInterfaceProvidingRequiringEntityImpl <em>Resource Interface Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.repository.impl.ResourceInterfaceProvidingRequiringEntityImpl
	 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfaceProvidingRequiringEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__ID = RESOURCE_INTERFACE_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = RESOURCE_INTERFACE_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Interface Requiring Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__INTERFACE_REQUIRING_ENTITY = RESOURCE_INTERFACE_REQUIRING_ENTITY__INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_TYPE = RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link resourceinterfaces.repository.ResourceInterfacesRepositoryRoot <em>Resource Interfaces Repository Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interfaces Repository Root</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfacesRepositoryRoot
	 * @generated
	 */
	EClass getResourceInterfacesRepositoryRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.repository.ResourceInterfacesRepositoryRoot#getResourceinterfacerequiringentity <em>Resourceinterfacerequiringentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceinterfacerequiringentity</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfacesRepositoryRoot#getResourceinterfacerequiringentity()
	 * @see #getResourceInterfacesRepositoryRoot()
	 * @generated
	 */
	EReference getResourceInterfacesRepositoryRoot_Resourceinterfacerequiringentity();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.repository.ResourceRequiredRole <em>Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Required Role</em>'.
	 * @see resourceinterfaces.repository.ResourceRequiredRole
	 * @generated
	 */
	EClass getResourceRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.repository.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Resource Interface Resource Required Role</em>'.
	 * @see resourceinterfaces.repository.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole()
	 * @see #getResourceRequiredRole()
	 * @generated
	 */
	EReference getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole();

	/**
	 * Returns the meta object for the container reference '{@link resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Interface Requiring Entity Resource Required Role</em>'.
	 * @see resourceinterfaces.repository.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole()
	 * @see #getResourceRequiredRole()
	 * @generated
	 */
	EReference getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity <em>Resource Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Requiring Entity</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfaceRequiringEntity
	 * @generated
	 */
	EClass getResourceInterfaceRequiringEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Required Roles Resource Interface Requiring Entity</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
	 * @see #getResourceInterfaceRequiringEntity()
	 * @generated
	 */
	EReference getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getInterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Requiring Entity</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfaceRequiringEntity#getInterfaceRequiringEntity()
	 * @see #getResourceInterfaceRequiringEntity()
	 * @generated
	 */
	EReference getResourceInterfaceRequiringEntity_InterfaceRequiringEntity();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.repository.ResourceInterfaceProvidingRequiringEntity <em>Resource Interface Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Providing Requiring Entity</em>'.
	 * @see resourceinterfaces.repository.ResourceInterfaceProvidingRequiringEntity
	 * @generated
	 */
	EClass getResourceInterfaceProvidingRequiringEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link resourceinterfaces.repository.impl.ResourceInterfacesRepositoryRootImpl <em>Resource Interfaces Repository Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.repository.impl.ResourceInterfacesRepositoryRootImpl
		 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfacesRepositoryRoot()
		 * @generated
		 */
		EClass RESOURCE_INTERFACES_REPOSITORY_ROOT = eINSTANCE.getResourceInterfacesRepositoryRoot();

		/**
		 * The meta object literal for the '<em><b>Resourceinterfacerequiringentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACES_REPOSITORY_ROOT__RESOURCEINTERFACEREQUIRINGENTITY = eINSTANCE.getResourceInterfacesRepositoryRoot_Resourceinterfacerequiringentity();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.repository.impl.ResourceRequiredRoleImpl <em>Resource Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.repository.impl.ResourceRequiredRoleImpl
		 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceRequiredRole()
		 * @generated
		 */
		EClass RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.repository.impl.ResourceInterfaceRequiringEntityImpl <em>Resource Interface Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.repository.impl.ResourceInterfaceRequiringEntityImpl
		 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfaceRequiringEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Interface Requiring Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_REQUIRING_ENTITY__INTERFACE_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceRequiringEntity_InterfaceRequiringEntity();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.repository.impl.ResourceInterfaceProvidingRequiringEntityImpl <em>Resource Interface Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.repository.impl.ResourceInterfaceProvidingRequiringEntityImpl
		 * @see resourceinterfaces.repository.impl.RepositoryPackageImpl#getResourceInterfaceProvidingRequiringEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceProvidingRequiringEntity();

	}

} //RepositoryPackage
