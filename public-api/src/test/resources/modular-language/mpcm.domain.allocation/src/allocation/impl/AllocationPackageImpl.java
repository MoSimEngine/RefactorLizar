/**
 */
package allocation.impl;

import allocation.Allocation;
import allocation.AllocationContext;
import allocation.AllocationFactory;
import allocation.AllocationPackage;
import allocation.Deployable;

import allocation.util.AllocationValidator;

import base.BasePackage;

import composition.CompositionPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import environment.EnvironmentPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import repository.RepositoryPackage;

import softwarecomposition.SoftwarecompositionPackage;

import softwarerepository.SoftwarerepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationPackageImpl extends EPackageImpl implements AllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see allocation.AllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationPackageImpl() {
		super(eNS_URI, AllocationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationPackage init() {
		if (isInited) return (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAllocationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AllocationPackageImpl theAllocationPackage = registeredAllocationPackage instanceof AllocationPackageImpl ? (AllocationPackageImpl)registeredAllocationPackage : new AllocationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		CompositionPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		de.uka.ipd.sdq.identifier.IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		SoftwarecompositionPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAllocationPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AllocationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAllocationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationPackage.eNS_URI, theAllocationPackage);
		return theAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_TargetResourceEnvironment_Allocation() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_System_Allocation() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_AllocationContexts_Allocation() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationContext() {
		return allocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_ResourceContainer_AllocationContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_AssemblyContext_AllocationContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_Allocation_AllocationContext() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationContext_Deployables() {
		return (EReference)allocationContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployable() {
		return deployableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationFactory getAllocationFactory() {
		return (AllocationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__TARGET_RESOURCE_ENVIRONMENT_ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__SYSTEM_ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__ALLOCATION_CONTEXTS_ALLOCATION);

		allocationContextEClass = createEClass(ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__RESOURCE_CONTAINER_ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT_ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__ALLOCATION_ALLOCATION_CONTEXT);
		createEReference(allocationContextEClass, ALLOCATION_CONTEXT__DEPLOYABLES);

		deployableEClass = createEClass(DEPLOYABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EnvironmentPackage theEnvironmentPackage = (EnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);
		SoftwarecompositionPackage theSoftwarecompositionPackage = (SoftwarecompositionPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarecompositionPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocationEClass.getESuperTypes().add(theBasePackage.getEntity());
		allocationContextEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_TargetResourceEnvironment_Allocation(), theEnvironmentPackage.getEnvironment(), null, "targetResourceEnvironment_Allocation", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllocation_System_Allocation(), theSoftwarecompositionPackage.getSystem(), null, "system_Allocation", null, 1, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllocation_AllocationContexts_Allocation(), this.getAllocationContext(), this.getAllocationContext_Allocation_AllocationContext(), "allocationContexts_Allocation", null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(allocationEClass, ecorePackage.getEBoolean(), "EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(allocationEClass, ecorePackage.getEBoolean(), "CommunicatingServersHaveToBeConnectedByLinkingResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allocationContextEClass, AllocationContext.class, "AllocationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationContext_ResourceContainer_AllocationContext(), theEnvironmentPackage.getContainer(), null, "resourceContainer_AllocationContext", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllocationContext_AssemblyContext_AllocationContext(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext_AllocationContext", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllocationContext_Allocation_AllocationContext(), this.getAllocation(), this.getAllocation_AllocationContexts_Allocation(), "allocation_AllocationContext", null, 1, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllocationContext_Deployables(), this.getDeployable(), null, "deployables", null, 0, 1, AllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(allocationContextEClass, ecorePackage.getEBoolean(), "OneAssemblyContextOrOneEventChannelShouldBeReferred", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deployableEClass, Deployable.class, "Deployable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
		addAnnotation
		  (allocationEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "-- Get all AssemblyContexts used by this system, that is \r\n-- 1) the AssemblyContexts directly used in the system and \r\nself.system_Allocation.assemblyContexts__ComposedStructure\r\n-- 2) the AssemblyContexts used by SubSystems in the System. Note that if a SubSystem also contains other Subsystems,\r\n-- we need to get those AssemblyContexts too: Thus, we use a closure here\r\n->union(self.system_Allocation.assemblyContexts__ComposedStructure->closure(\r\nencapsulatedComponent__AssemblyContext->select(composites|composites.oclIsTypeOf(mpcm::subsystem::SubSystem)).oclAsType(mpcm::subsystem::SubSystem)\r\n.assemblyContexts__ComposedStructure))\r\n--Now, after we collected all AssemblyContexts somehow used, we check whether they need to be allocated \r\n--and if yes, if they are allocated.\r\n->forAll(assemblyCtx|\r\n--AssemblyContexts that contain SubSystems do not need to be allocated\r\nassemblyCtx.encapsulatedComponent__AssemblyContext.oclIsTypeOf(mpcm::subsystem::SubSystem) or\r\n--All others need to be allocated. \r\nself.allocationContexts_Allocation->select(allocationCtx|\r\nallocationCtx.assemblyContext_AllocationContext = assemblyCtx)->size() = 1)"
		   });
		addAnnotation
		  (allocationEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "self.allocationContexts_Allocation->forAll(a | self.allocationContexts_Allocation->forAll(b | \r\n    --- if a and b are not on the same server\r\n    (a.resourceContainer_AllocationContext <> b.resourceContainer_AllocationContext \r\n    and\r\n    --  and if the assembly contexts of a and b are connected\r\n      self.system_Allocation.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(mpcm::core::composition::AssemblyConnector)).oclAsType(mpcm::core::composition::AssemblyConnector)->exists(conn | \r\n         (conn.providingAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext )\r\n         or \r\n          (conn.providingAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext )\r\n       )\r\n     )\r\n     -- then the servers have to be connected by a linking resource\r\n     implies \r\n     self.targetResourceEnvironment_Allocation.linkingResources__ResourceEnvironment->exists(l | \r\n        -- l connects the two\r\n        l.connectedResourceContainers_LinkingResource->includes(a.resourceContainer_AllocationContext)\r\n        and \r\n        l.connectedResourceContainers_LinkingResource->includes(b.resourceContainer_AllocationContext)\r\n     )\r\n  ))"
		   });
		addAnnotation
		  (allocationContextEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "not(self.assemblyContext_AllocationContext.oclIsUndefined()) xor not(self.eventChannel__AllocationContext.oclIsUndefined())"
		   });
	}

} //AllocationPackageImpl
