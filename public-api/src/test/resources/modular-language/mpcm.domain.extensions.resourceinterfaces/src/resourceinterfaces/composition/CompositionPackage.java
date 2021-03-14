/**
 */
package resourceinterfaces.composition;

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
 * @see resourceinterfaces.composition.CompositionFactory
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
	String eNS_URI = "mpcm.domain.extensions.resourceinterfaces.composition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.resourceinterfaces.composition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = resourceinterfaces.composition.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link resourceinterfaces.composition.impl.RequiredResourceDelegationConnectorImpl <em>Required Resource Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.composition.impl.RequiredResourceDelegationConnectorImpl
	 * @see resourceinterfaces.composition.impl.CompositionPackageImpl#getRequiredResourceDelegationConnector()
	 * @generated
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ID = composition.CompositionPackage.DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Assembly Context Required Resource Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Required Role Required Resource Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outer Required Role Required Resource Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Resource Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_RESOURCE_DELEGATION_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl <em>Resource Required Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl
	 * @see resourceinterfaces.composition.impl.CompositionPackageImpl#getResourceRequiredDelegationConnector()
	 * @generated
	 */
	int RESOURCE_REQUIRED_DELEGATION_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Inner Resource Required Role Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Outer Resource Required Role Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Parent Structure Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>Resource Required Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_DELEGATION_CONNECTOR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link resourceinterfaces.composition.RequiredResourceDelegationConnector <em>Required Resource Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Resource Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.RequiredResourceDelegationConnector
	 * @generated
	 */
	EClass getRequiredResourceDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector <em>Assembly Context Required Resource Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Required Resource Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.RequiredResourceDelegationConnector#getAssemblyContext__RequiredResourceDelegationConnector()
	 * @see #getRequiredResourceDelegationConnector()
	 * @generated
	 */
	EReference getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector <em>Inner Required Role Required Resource Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Required Role Required Resource Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.RequiredResourceDelegationConnector#getInnerRequiredRole__RequiredResourceDelegationConnector()
	 * @see #getRequiredResourceDelegationConnector()
	 * @generated
	 */
	EReference getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector <em>Outer Required Role Required Resource Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Required Role Required Resource Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.RequiredResourceDelegationConnector#getOuterRequiredRole__RequiredResourceDelegationConnector()
	 * @see #getRequiredResourceDelegationConnector()
	 * @generated
	 */
	EReference getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector <em>Resource Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Required Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.ResourceRequiredDelegationConnector
	 * @generated
	 */
	EClass getResourceRequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Resource Required Role Resource Required Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @see #getResourceRequiredDelegationConnector()
	 * @generated
	 */
	EReference getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Resource Required Role Resource Required Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @see #getResourceRequiredDelegationConnector()
	 * @generated
	 */
	EReference getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Structure Resource Required Delegation Connector</em>'.
	 * @see resourceinterfaces.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector()
	 * @see #getResourceRequiredDelegationConnector()
	 * @generated
	 */
	EReference getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link resourceinterfaces.composition.impl.RequiredResourceDelegationConnectorImpl <em>Required Resource Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.composition.impl.RequiredResourceDelegationConnectorImpl
		 * @see resourceinterfaces.composition.impl.CompositionPackageImpl#getRequiredResourceDelegationConnector()
		 * @generated
		 */
		EClass REQUIRED_RESOURCE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredResourceDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Required Resource Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Required Role Required Resource Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Outer Required Role Required Resource Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl <em>Resource Required Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.composition.impl.ResourceRequiredDelegationConnectorImpl
		 * @see resourceinterfaces.composition.impl.CompositionPackageImpl#getResourceRequiredDelegationConnector()
		 * @generated
		 */
		EClass RESOURCE_REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getResourceRequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Resource Required Role Resource Required Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Outer Resource Required Role Resource Required Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Parent Structure Resource Required Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR = eINSTANCE.getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector();

	}

} //CompositionPackage
