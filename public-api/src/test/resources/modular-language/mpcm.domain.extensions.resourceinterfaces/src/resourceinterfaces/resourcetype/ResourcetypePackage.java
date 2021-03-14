/**
 */
package resourceinterfaces.resourcetype;

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
 * @see resourceinterfaces.resourcetype.ResourcetypeFactory
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
	String eNS_URI = "mpcm.domain.extensions.resourceinterfaces.resourcetype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.resourceinterfaces.resourcetype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypePackage eINSTANCE = resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl.init();

	/**
	 * The meta object id for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl <em>Resource Interface Resourcetype Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl
	 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterfaceResourcetypeRoot()
	 * @generated
	 */
	int RESOURCE_INTERFACE_RESOURCETYPE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Resourceinterfaceprovidingentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY = 0;

	/**
	 * The feature id for the '<em><b>Resourceinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Resource Interface Resourcetype Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_RESOURCETYPE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceImpl <em>Resource Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceImpl
	 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterface()
	 * @generated
	 */
	int RESOURCE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Signatures Resource Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link resourceinterfaces.resourcetype.impl.ResourceSignatureImpl <em>Resource Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.resourcetype.impl.ResourceSignatureImpl
	 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceSignature()
	 * @generated
	 */
	int RESOURCE_SIGNATURE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameter Resource Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Interface Resource Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SIGNATURE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link resourceinterfaces.resourcetype.impl.ResourceProvidedRoleImpl <em>Resource Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.resourcetype.impl.ResourceProvidedRoleImpl
	 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceProvidedRole()
	 * @generated
	 */
	int RESOURCE_PROVIDED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__ID = RepositoryPackage.ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__ENTITY_NAME = RepositoryPackage.ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE_FEATURE_COUNT = RepositoryPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceProvidingEntityImpl <em>Resource Interface Providing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceProvidingEntityImpl
	 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterfaceProvidingEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot <em>Resource Interface Resourcetype Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Resourcetype Root</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot
	 * @generated
	 */
	EClass getResourceInterfaceResourcetypeRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterfaceprovidingentity <em>Resourceinterfaceprovidingentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceinterfaceprovidingentity</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterfaceprovidingentity()
	 * @see #getResourceInterfaceResourcetypeRoot()
	 * @generated
	 */
	EReference getResourceInterfaceResourcetypeRoot_Resourceinterfaceprovidingentity();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterface <em>Resourceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourceinterface</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterface()
	 * @see #getResourceInterfaceResourcetypeRoot()
	 * @generated
	 */
	EReference getResourceInterfaceResourcetypeRoot_Resourceinterface();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.resourcetype.ResourceInterface <em>Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterface
	 * @generated
	 */
	EClass getResourceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.resourcetype.ResourceInterface#getResourceSignatures__ResourceInterface <em>Resource Signatures Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Signatures Resource Interface</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterface#getResourceSignatures__ResourceInterface()
	 * @see #getResourceInterface()
	 * @generated
	 */
	EReference getResourceInterface_ResourceSignatures__ResourceInterface();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.resourcetype.ResourceSignature <em>Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Signature</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceSignature
	 * @generated
	 */
	EClass getResourceSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.resourcetype.ResourceSignature#getParameter__ResourceSignature <em>Parameter Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Resource Signature</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceSignature#getParameter__ResourceSignature()
	 * @see #getResourceSignature()
	 * @generated
	 */
	EReference getResourceSignature_Parameter__ResourceSignature();

	/**
	 * Returns the meta object for the attribute '{@link resourceinterfaces.resourcetype.ResourceSignature#getResourceServiceId <em>Resource Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Service Id</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceSignature#getResourceServiceId()
	 * @see #getResourceSignature()
	 * @generated
	 */
	EAttribute getResourceSignature_ResourceServiceId();

	/**
	 * Returns the meta object for the container reference '{@link resourceinterfaces.resourcetype.ResourceSignature#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Interface Resource Signature</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceSignature#getResourceInterface__ResourceSignature()
	 * @see #getResourceSignature()
	 * @generated
	 */
	EReference getResourceSignature_ResourceInterface__ResourceSignature();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.resourcetype.ResourceProvidedRole <em>Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provided Role</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceProvidedRole
	 * @generated
	 */
	EClass getResourceProvidedRole();

	/**
	 * Returns the meta object for the container reference '{@link resourceinterfaces.resourcetype.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Interface Providing Entity Resource Provided Role</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole()
	 * @see #getResourceProvidedRole()
	 * @generated
	 */
	EReference getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.resourcetype.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Resource Interface Resource Provided Role</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole()
	 * @see #getResourceProvidedRole()
	 * @generated
	 */
	EReference getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity <em>Resource Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Providing Entity</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity
	 * @generated
	 */
	EClass getResourceInterfaceProvidingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Provided Roles Resource Interface Providing Entity</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity()
	 * @see #getResourceInterfaceProvidingEntity()
	 * @generated
	 */
	EReference getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type</em>'.
	 * @see resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity#getResourceType()
	 * @see #getResourceInterfaceProvidingEntity()
	 * @generated
	 */
	EReference getResourceInterfaceProvidingEntity_ResourceType();

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
		 * The meta object literal for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl <em>Resource Interface Resourcetype Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceResourcetypeRootImpl
		 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterfaceResourcetypeRoot()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_RESOURCETYPE_ROOT = eINSTANCE.getResourceInterfaceResourcetypeRoot();

		/**
		 * The meta object literal for the '<em><b>Resourceinterfaceprovidingentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACEPROVIDINGENTITY = eINSTANCE.getResourceInterfaceResourcetypeRoot_Resourceinterfaceprovidingentity();

		/**
		 * The meta object literal for the '<em><b>Resourceinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_RESOURCETYPE_ROOT__RESOURCEINTERFACE = eINSTANCE.getResourceInterfaceResourcetypeRoot_Resourceinterface();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceImpl <em>Resource Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceImpl
		 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterface()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE = eINSTANCE.getResourceInterface();

		/**
		 * The meta object literal for the '<em><b>Resource Signatures Resource Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE__RESOURCE_SIGNATURES_RESOURCE_INTERFACE = eINSTANCE.getResourceInterface_ResourceSignatures__ResourceInterface();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.resourcetype.impl.ResourceSignatureImpl <em>Resource Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.resourcetype.impl.ResourceSignatureImpl
		 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceSignature()
		 * @generated
		 */
		EClass RESOURCE_SIGNATURE = eINSTANCE.getResourceSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter Resource Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SIGNATURE__PARAMETER_RESOURCE_SIGNATURE = eINSTANCE.getResourceSignature_Parameter__ResourceSignature();

		/**
		 * The meta object literal for the '<em><b>Resource Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SIGNATURE__RESOURCE_SERVICE_ID = eINSTANCE.getResourceSignature_ResourceServiceId();

		/**
		 * The meta object literal for the '<em><b>Resource Interface Resource Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SIGNATURE__RESOURCE_INTERFACE_RESOURCE_SIGNATURE = eINSTANCE.getResourceSignature_ResourceInterface__ResourceSignature();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.resourcetype.impl.ResourceProvidedRoleImpl <em>Resource Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.resourcetype.impl.ResourceProvidedRoleImpl
		 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceProvidedRole()
		 * @generated
		 */
		EClass RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.resourcetype.impl.ResourceInterfaceProvidingEntityImpl <em>Resource Interface Providing Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.resourcetype.impl.ResourceInterfaceProvidingEntityImpl
		 * @see resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl#getResourceInterfaceProvidingEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_PROVIDING_ENTITY = eINSTANCE.getResourceInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = eINSTANCE.getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_TYPE = eINSTANCE.getResourceInterfaceProvidingEntity_ResourceType();

	}

} //ResourcetypePackage
