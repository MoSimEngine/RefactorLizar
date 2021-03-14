/**
 */
package resourceinterfaces.seff.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import composition.CompositionPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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

import resourceinterfaces.composition.impl.CompositionPackageImpl;

import resourceinterfaces.repository.impl.RepositoryPackageImpl;

import resourceinterfaces.resourcetype.ResourcetypePackage;

import resourceinterfaces.resourcetype.impl.ResourcetypePackageImpl;

import resourceinterfaces.seff.ResourceCall;
import resourceinterfaces.seff.ResourceInterfacesSEFFRoot;
import resourceinterfaces.seff.SeffFactory;
import resourceinterfaces.seff.SeffPackage;

import resourceinterfaces.seff.util.SeffValidator;

import resources.ResourcesPackage;

import softwarerepository.SoftwarerepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeffPackageImpl extends EPackageImpl implements SeffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInterfacesSEFFRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceCallEClass = null;

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
	 * @see resourceinterfaces.seff.SeffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SeffPackageImpl() {
		super(eNS_URI, SeffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SeffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SeffPackage init() {
		if (isInited) return (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSeffPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SeffPackageImpl theSeffPackage = registeredSeffPackage instanceof SeffPackageImpl ? (SeffPackageImpl)registeredSeffPackage : new SeffPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		CompositionPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		seff.SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(resourceinterfaces.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : resourceinterfaces.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(resourceinterfaces.composition.CompositionPackage.eNS_URI);
		CompositionPackageImpl theCompositionPackage_1 = (CompositionPackageImpl)(registeredPackage instanceof CompositionPackageImpl ? registeredPackage : resourceinterfaces.composition.CompositionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(registeredPackage instanceof ResourcetypePackageImpl ? registeredPackage : ResourcetypePackage.eINSTANCE);

		// Create package meta-data objects
		theSeffPackage.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theCompositionPackage_1.createPackageContents();
		theResourcetypePackage.createPackageContents();

		// Initialize created meta-data
		theSeffPackage.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theCompositionPackage_1.initializePackageContents();
		theResourcetypePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSeffPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SeffValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSeffPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeffPackage.eNS_URI, theSeffPackage);
		return theSeffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInterfacesSEFFRoot() {
		return resourceInterfacesSEFFRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInterfacesSEFFRoot_ResourceCalls() {
		return (EReference)resourceInterfacesSEFFRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceCall() {
		return resourceCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceCall_Action__ResourceCall() {
		return (EReference)resourceCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceCall_ResourceRequiredRole__ResourceCall() {
		return (EReference)resourceCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceCall_Signature__ResourceCall() {
		return (EReference)resourceCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceCall_NumberOfCalls__ResourceCall() {
		return (EReference)resourceCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffFactory getSeffFactory() {
		return (SeffFactory)getEFactoryInstance();
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
		resourceInterfacesSEFFRootEClass = createEClass(RESOURCE_INTERFACES_SEFF_ROOT);
		createEReference(resourceInterfacesSEFFRootEClass, RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS);

		resourceCallEClass = createEClass(RESOURCE_CALL);
		createEReference(resourceCallEClass, RESOURCE_CALL__ACTION_RESOURCE_CALL);
		createEReference(resourceCallEClass, RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL);
		createEReference(resourceCallEClass, RESOURCE_CALL__SIGNATURE_RESOURCE_CALL);
		createEReference(resourceCallEClass, RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL);
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
		BehaviourseffPackage theBehaviourseffPackage = (BehaviourseffPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourseffPackage.eNS_URI);
		seff.SeffPackage theSeffPackage_1 = (seff.SeffPackage)EPackage.Registry.INSTANCE.getEPackage(seff.SeffPackage.eNS_URI);
		resourceinterfaces.repository.RepositoryPackage theRepositoryPackage_1 = (resourceinterfaces.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(resourceinterfaces.repository.RepositoryPackage.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceCallEClass.getESuperTypes().add(theBehaviourseffPackage.getCallAction());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceInterfacesSEFFRootEClass, ResourceInterfacesSEFFRoot.class, "ResourceInterfacesSEFFRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceInterfacesSEFFRoot_ResourceCalls(), this.getResourceCall(), null, "resourceCalls", null, 0, -1, ResourceInterfacesSEFFRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceCallEClass, ResourceCall.class, "ResourceCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceCall_Action__ResourceCall(), theSeffPackage_1.getAbstractInternalControlFlowAction(), null, "action__ResourceCall", null, 1, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceCall_ResourceRequiredRole__ResourceCall(), theRepositoryPackage_1.getResourceRequiredRole(), null, "resourceRequiredRole__ResourceCall", null, 1, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceCall_Signature__ResourceCall(), theResourcetypePackage.getResourceSignature(), null, "signature__ResourceCall", null, 1, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceCall_NumberOfCalls__ResourceCall(), theVariablesPackage.getPCMRandomVariable(), null, "numberOfCalls__ResourceCall", null, 1, 1, ResourceCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "ResourceSignatureBelongsToResourceRequiredRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "ResourceRequiredRoleMustBeReferencedByComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceCallEClass, ecorePackage.getEBoolean(), "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";
		addAnnotation
		  (resourceCallEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "self.resourceRequiredRole__ResourceCall.requiredResourceInterface__ResourceRequiredRole.resourceSignatures__ResourceInterface->includes(self.signature__ResourceCall)"
		   });
		addAnnotation
		  (resourceCallEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(mpcm::core::entity::ResourceInterfaceRequiringEntity)).oclAsType(mpcm::core::entity::ResourceInterfaceRequiringEntity).resourceRequiredRoles__ResourceInterfaceRequiringEntity->includes(self.resourceRequiredRole__ResourceCall)"
		   });
		addAnnotation
		  (resourceCallEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "body", "self.action__ResourceCall.resourceCall__Action->select(call | call.resourceRequiredRole__ResourceCall=self.resourceRequiredRole__ResourceCall and call.signature__ResourceCall=self.signature__ResourceCall)->size() = 1"
		   });
	}

} //SeffPackageImpl
