/**
 */
package infrastructure.composition;

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
 * @see infrastructure.composition.CompositionFactory
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
	String eNS_URI = "mpcm.domain.extensions.infrastructure.composition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.infrastructure.composition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = infrastructure.composition.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link infrastructure.composition.impl.AssemblyInfrastructureConnectorImpl <em>Assembly Infrastructure Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.composition.impl.AssemblyInfrastructureConnectorImpl
	 * @see infrastructure.composition.impl.CompositionPackageImpl#getAssemblyInfrastructureConnector()
	 * @generated
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__ID = composition.CompositionPackage.CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Provided Role Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Providing Assembly Context Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requiring Assembly Context Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assembly Infrastructure Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_INFRASTRUCTURE_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link infrastructure.composition.impl.ProvidedInfrastructureDelegationConnectorImpl <em>Provided Infrastructure Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.composition.impl.ProvidedInfrastructureDelegationConnectorImpl
	 * @see infrastructure.composition.impl.CompositionPackageImpl#getProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ID = composition.CompositionPackage.DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Inner Provided Role Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Provided Role Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provided Infrastructure Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link infrastructure.composition.impl.RequiredInfrastructureDelegationConnectorImpl <em>Required Infrastructure Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.composition.impl.RequiredInfrastructureDelegationConnectorImpl
	 * @see infrastructure.composition.impl.CompositionPackageImpl#getRequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ID = composition.CompositionPackage.DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Inner Required Role Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Required Role Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Infrastructure Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link infrastructure.composition.AssemblyInfrastructureConnector <em>Assembly Infrastructure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Infrastructure Connector</em>'.
	 * @see infrastructure.composition.AssemblyInfrastructureConnector
	 * @generated
	 */
	EClass getAssemblyInfrastructureConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role Assembly Infrastructure Connector</em>'.
	 * @see infrastructure.composition.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector()
	 * @see #getAssemblyInfrastructureConnector()
	 * @generated
	 */
	EReference getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role Assembly Infrastructure Connector</em>'.
	 * @see infrastructure.composition.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector()
	 * @see #getAssemblyInfrastructureConnector()
	 * @generated
	 */
	EReference getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Providing Assembly Context Assembly Infrastructure Connector</em>'.
	 * @see infrastructure.composition.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector()
	 * @see #getAssemblyInfrastructureConnector()
	 * @generated
	 */
	EReference getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>'.
	 * @see infrastructure.composition.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector()
	 * @see #getAssemblyInfrastructureConnector()
	 * @generated
	 */
	EReference getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector();

	/**
	 * Returns the meta object for class '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector <em>Provided Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.ProvidedInfrastructureDelegationConnector
	 * @generated
	 */
	EClass getProvidedInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getInnerProvidedRole__ProvidedInfrastructureDelegationConnector <em>Inner Provided Role Provided Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Provided Role Provided Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.ProvidedInfrastructureDelegationConnector#getInnerProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @see #getProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getOuterProvidedRole__ProvidedInfrastructureDelegationConnector <em>Outer Provided Role Provided Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Provided Role Provided Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.ProvidedInfrastructureDelegationConnector#getOuterProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @see #getProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getAssemblyContext__ProvidedInfrastructureDelegationConnector <em>Assembly Context Provided Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Provided Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.ProvidedInfrastructureDelegationConnector#getAssemblyContext__ProvidedInfrastructureDelegationConnector()
	 * @see #getProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for class '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector <em>Required Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.RequiredInfrastructureDelegationConnector
	 * @generated
	 */
	EClass getRequiredInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getInnerRequiredRole__RequiredInfrastructureDelegationConnector <em>Inner Required Role Required Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Required Role Required Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.RequiredInfrastructureDelegationConnector#getInnerRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @see #getRequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getOuterRequiredRole__RequiredInfrastructureDelegationConnector <em>Outer Required Role Required Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Required Role Required Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.RequiredInfrastructureDelegationConnector#getOuterRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @see #getRequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getAssemblyContext__RequiredInfrastructureDelegationConnector <em>Assembly Context Required Infrastructure Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Required Infrastructure Delegation Connector</em>'.
	 * @see infrastructure.composition.RequiredInfrastructureDelegationConnector#getAssemblyContext__RequiredInfrastructureDelegationConnector()
	 * @see #getRequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	EReference getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector();

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
		 * The meta object literal for the '{@link infrastructure.composition.impl.AssemblyInfrastructureConnectorImpl <em>Assembly Infrastructure Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.composition.impl.AssemblyInfrastructureConnectorImpl
		 * @see infrastructure.composition.impl.CompositionPackageImpl#getAssemblyInfrastructureConnector()
		 * @generated
		 */
		EClass ASSEMBLY_INFRASTRUCTURE_CONNECTOR = eINSTANCE.getAssemblyInfrastructureConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Role Assembly Infrastructure Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = eINSTANCE.getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector();

		/**
		 * The meta object literal for the '<em><b>Required Role Assembly Infrastructure Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = eINSTANCE.getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector();

		/**
		 * The meta object literal for the '<em><b>Providing Assembly Context Assembly Infrastructure Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = eINSTANCE.getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector();

		/**
		 * The meta object literal for the '<em><b>Requiring Assembly Context Assembly Infrastructure Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR = eINSTANCE.getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector();

		/**
		 * The meta object literal for the '{@link infrastructure.composition.impl.ProvidedInfrastructureDelegationConnectorImpl <em>Provided Infrastructure Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.composition.impl.ProvidedInfrastructureDelegationConnectorImpl
		 * @see infrastructure.composition.impl.CompositionPackageImpl#getProvidedInfrastructureDelegationConnector()
		 * @generated
		 */
		EClass PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getProvidedInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Provided Role Provided Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Outer Provided Role Provided Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Provided Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '{@link infrastructure.composition.impl.RequiredInfrastructureDelegationConnectorImpl <em>Required Infrastructure Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.composition.impl.RequiredInfrastructureDelegationConnectorImpl
		 * @see infrastructure.composition.impl.CompositionPackageImpl#getRequiredInfrastructureDelegationConnector()
		 * @generated
		 */
		EClass REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Required Role Required Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Outer Required Role Required Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Required Infrastructure Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR = eINSTANCE.getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector();

	}

} //CompositionPackage
