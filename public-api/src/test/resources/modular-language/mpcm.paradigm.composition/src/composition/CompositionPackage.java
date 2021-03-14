/**
 */
package composition;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see composition.CompositionFactory
 * @model kind="package"
 * @generated
 */
public interface CompositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "composition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.paradigm.composition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.paradigm.composition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = composition.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link composition.impl.ContainableImpl <em>Containable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.ContainableImpl
	 * @see composition.impl.CompositionPackageImpl#getContainable()
	 * @generated
	 */
	int CONTAINABLE = 0;

	/**
	 * The number of structural features of the '<em>Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link composition.impl.ComposedStructureImpl <em>Composed Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.ComposedStructureImpl
	 * @see composition.impl.CompositionPackageImpl#getComposedStructure()
	 * @generated
	 */
	int COMPOSED_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE__CONTENT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_STRUCTURE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link composition.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.ComposedProvidingRequiringEntityImpl
	 * @see composition.impl.CompositionPackageImpl#getComposedProvidingRequiringEntity()
	 * @generated
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ID = COMPOSED_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = COMPOSED_STRUCTURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__CONTENT = COMPOSED_STRUCTURE__CONTENT;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = COMPOSED_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = COMPOSED_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = COMPOSED_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link composition.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.AssemblyContextImpl
	 * @see composition.impl.CompositionPackageImpl#getAssemblyContext()
	 * @generated
	 */
	int ASSEMBLY_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated Component Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assembly Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_CONTEXT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link composition.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.ConnectorImpl
	 * @see composition.impl.CompositionPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT_STRUCTURE_CONNECTOR = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link composition.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composition.impl.DelegationConnectorImpl
	 * @see composition.impl.CompositionPackageImpl#getDelegationConnector()
	 * @generated
	 */
	int DELEGATION_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ID = CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__ENTITY_NAME = CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The number of structural features of the '<em>Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link composition.Containable <em>Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable</em>'.
	 * @see composition.Containable
	 * @generated
	 */
	EClass getContainable();

	/**
	 * Returns the meta object for class '{@link composition.ComposedStructure <em>Composed Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Structure</em>'.
	 * @see composition.ComposedStructure
	 * @generated
	 */
	EClass getComposedStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link composition.ComposedStructure#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see composition.ComposedStructure#getContent()
	 * @see #getComposedStructure()
	 * @generated
	 */
	EReference getComposedStructure_Content();

	/**
	 * Returns the meta object for class '{@link composition.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Providing Requiring Entity</em>'.
	 * @see composition.ComposedProvidingRequiringEntity
	 * @generated
	 */
	EClass getComposedProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link composition.AssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Context</em>'.
	 * @see composition.AssemblyContext
	 * @generated
	 */
	EClass getAssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link composition.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Structure Assembly Context</em>'.
	 * @see composition.AssemblyContext#getParentStructure__AssemblyContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ParentStructure__AssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link composition.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Encapsulated Component Assembly Context</em>'.
	 * @see composition.AssemblyContext#getEncapsulatedComponent__AssemblyContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_EncapsulatedComponent__AssemblyContext();

	/**
	 * Returns the meta object for the containment reference list '{@link composition.AssemblyContext#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Parameter Usages Assembly Context</em>'.
	 * @see composition.AssemblyContext#getConfigParameterUsages__AssemblyContext()
	 * @see #getAssemblyContext()
	 * @generated
	 */
	EReference getAssemblyContext_ConfigParameterUsages__AssemblyContext();

	/**
	 * Returns the meta object for class '{@link composition.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see composition.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link composition.Connector#getParentStructure__Connector <em>Parent Structure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Structure Connector</em>'.
	 * @see composition.Connector#getParentStructure__Connector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ParentStructure__Connector();

	/**
	 * Returns the meta object for class '{@link composition.DelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Connector</em>'.
	 * @see composition.DelegationConnector
	 * @generated
	 */
	EClass getDelegationConnector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositionFactory getCompositionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link composition.impl.ContainableImpl <em>Containable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.ContainableImpl
		 * @see composition.impl.CompositionPackageImpl#getContainable()
		 * @generated
		 */
		EClass CONTAINABLE = eINSTANCE.getContainable();

		/**
		 * The meta object literal for the '{@link composition.impl.ComposedStructureImpl <em>Composed Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.ComposedStructureImpl
		 * @see composition.impl.CompositionPackageImpl#getComposedStructure()
		 * @generated
		 */
		EClass COMPOSED_STRUCTURE = eINSTANCE.getComposedStructure();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_STRUCTURE__CONTENT = eINSTANCE.getComposedStructure_Content();

		/**
		 * The meta object literal for the '{@link composition.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.ComposedProvidingRequiringEntityImpl
		 * @see composition.impl.CompositionPackageImpl#getComposedProvidingRequiringEntity()
		 * @generated
		 */
		EClass COMPOSED_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getComposedProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link composition.impl.AssemblyContextImpl <em>Assembly Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.AssemblyContextImpl
		 * @see composition.impl.CompositionPackageImpl#getAssemblyContext()
		 * @generated
		 */
		EClass ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Parent Structure Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext_ParentStructure__AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Component Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext_EncapsulatedComponent__AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT = eINSTANCE.getAssemblyContext_ConfigParameterUsages__AssemblyContext();

		/**
		 * The meta object literal for the '{@link composition.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.ConnectorImpl
		 * @see composition.impl.CompositionPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Parent Structure Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT_STRUCTURE_CONNECTOR = eINSTANCE.getConnector_ParentStructure__Connector();

		/**
		 * The meta object literal for the '{@link composition.impl.DelegationConnectorImpl <em>Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composition.impl.DelegationConnectorImpl
		 * @see composition.impl.CompositionPackageImpl#getDelegationConnector()
		 * @generated
		 */
		EClass DELEGATION_CONNECTOR = eINSTANCE.getDelegationConnector();

	}

} //CompositionPackage
