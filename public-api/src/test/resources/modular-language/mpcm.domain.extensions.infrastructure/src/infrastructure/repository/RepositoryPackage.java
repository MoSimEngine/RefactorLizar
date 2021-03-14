/**
 */
package infrastructure.repository;

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
 * @see infrastructure.repository.RepositoryFactory
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
	String eNS_URI = "mpcm.domain.extensions.infrastructure.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.infrastructure.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = infrastructure.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureRepositoryRootImpl <em>Infrastructure Repository Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureRepositoryRootImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureRepositoryRoot()
	 * @generated
	 */
	int INFRASTRUCTURE_REPOSITORY_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Infrastructurecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Repository Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REPOSITORY_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureComponentImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureInterfaceImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureInterface()
	 * @generated
	 */
	int INFRASTRUCTURE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ID = repository.RepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ENTITY_NAME = repository.RepositoryPackage.INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__PARENT_INTERFACES_INTERFACE = repository.RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__PROTOCOLS_INTERFACE = repository.RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__REQUIRED_CHARACTERISATIONS = repository.RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = repository.RepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE_FEATURE_COUNT = repository.RepositoryPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureSignatureImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureSignature()
	 * @generated
	 */
	int INFRASTRUCTURE_SIGNATURE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__ID = repository.RepositoryPackage.SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__ENTITY_NAME = repository.RepositoryPackage.SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE_FEATURE_COUNT = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureProvidedRoleImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureProvidedRole()
	 * @generated
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__ID = repository.RepositoryPackage.PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__ENTITY_NAME = repository.RepositoryPackage.PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = repository.RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = repository.RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE_FEATURE_COUNT = repository.RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link infrastructure.repository.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.repository.impl.InfrastructureRequiredRoleImpl
	 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureRequiredRole()
	 * @generated
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__ID = repository.RepositoryPackage.REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__ENTITY_NAME = repository.RepositoryPackage.REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = repository.RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = repository.RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE_FEATURE_COUNT = repository.RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureRepositoryRoot <em>Infrastructure Repository Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Repository Root</em>'.
	 * @see infrastructure.repository.InfrastructureRepositoryRoot
	 * @generated
	 */
	EClass getInfrastructureRepositoryRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.repository.InfrastructureRepositoryRoot#getInfrastructurecomponent <em>Infrastructurecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructurecomponent</em>'.
	 * @see infrastructure.repository.InfrastructureRepositoryRoot#getInfrastructurecomponent()
	 * @see #getInfrastructureRepositoryRoot()
	 * @generated
	 */
	EReference getInfrastructureRepositoryRoot_Infrastructurecomponent();

	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureComponent <em>Infrastructure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Component</em>'.
	 * @see infrastructure.repository.InfrastructureComponent
	 * @generated
	 */
	EClass getInfrastructureComponent();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.repository.InfrastructureComponent#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see infrastructure.repository.InfrastructureComponent#getOwner()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_Owner();

	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureInterface <em>Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Interface</em>'.
	 * @see infrastructure.repository.InfrastructureInterface
	 * @generated
	 */
	EClass getInfrastructureInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Signatures Infrastructure Interface</em>'.
	 * @see infrastructure.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface()
	 * @see #getInfrastructureInterface()
	 * @generated
	 */
	EReference getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureSignature <em>Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Signature</em>'.
	 * @see infrastructure.repository.InfrastructureSignature
	 * @generated
	 */
	EClass getInfrastructureSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.repository.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Infrastructure Signature</em>'.
	 * @see infrastructure.repository.InfrastructureSignature#getParameters__InfrastructureSignature()
	 * @see #getInfrastructureSignature()
	 * @generated
	 */
	EReference getInfrastructureSignature_Parameters__InfrastructureSignature();

	/**
	 * Returns the meta object for the container reference '{@link infrastructure.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Infrastructure Interface Infrastructure Signature</em>'.
	 * @see infrastructure.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature()
	 * @see #getInfrastructureSignature()
	 * @generated
	 */
	EReference getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureProvidedRole <em>Infrastructure Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Provided Role</em>'.
	 * @see infrastructure.repository.InfrastructureProvidedRole
	 * @generated
	 */
	EClass getInfrastructureProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface Infrastructure Provided Role</em>'.
	 * @see infrastructure.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole()
	 * @see #getInfrastructureProvidedRole()
	 * @generated
	 */
	EReference getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

	/**
	 * Returns the meta object for class '{@link infrastructure.repository.InfrastructureRequiredRole <em>Infrastructure Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Required Role</em>'.
	 * @see infrastructure.repository.InfrastructureRequiredRole
	 * @generated
	 */
	EClass getInfrastructureRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface Infrastructure Required Role</em>'.
	 * @see infrastructure.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole()
	 * @see #getInfrastructureRequiredRole()
	 * @generated
	 */
	EReference getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

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
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureRepositoryRootImpl <em>Infrastructure Repository Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureRepositoryRootImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureRepositoryRoot()
		 * @generated
		 */
		EClass INFRASTRUCTURE_REPOSITORY_ROOT = eINSTANCE.getInfrastructureRepositoryRoot();

		/**
		 * The meta object literal for the '<em><b>Infrastructurecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_REPOSITORY_ROOT__INFRASTRUCTURECOMPONENT = eINSTANCE.getInfrastructureRepositoryRoot_Infrastructurecomponent();

		/**
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureComponentImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureComponent();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__OWNER = eINSTANCE.getInfrastructureComponent_Owner();

		/**
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureInterfaceImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureInterface()
		 * @generated
		 */
		EClass INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

		/**
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureSignatureImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureSignature()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_Parameters__InfrastructureSignature();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

		/**
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureProvidedRoleImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureProvidedRole()
		 * @generated
		 */
		EClass INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

		/**
		 * The meta object literal for the '{@link infrastructure.repository.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.repository.impl.InfrastructureRequiredRoleImpl
		 * @see infrastructure.repository.impl.RepositoryPackageImpl#getInfrastructureRequiredRole()
		 * @generated
		 */
		EClass INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

	}

} //RepositoryPackage
