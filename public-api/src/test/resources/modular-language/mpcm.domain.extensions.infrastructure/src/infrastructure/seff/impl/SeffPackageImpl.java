/**
 */
package infrastructure.seff.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import composition.CompositionPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import infrastructure.composition.impl.CompositionPackageImpl;

import infrastructure.repository.impl.RepositoryPackageImpl;

import infrastructure.seff.InfrastructureCall;
import infrastructure.seff.InfrastructureSEFFRoot;
import infrastructure.seff.SeffFactory;
import infrastructure.seff.SeffPackage;

import infrastructure.seff.util.SeffValidator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import repository.RepositoryPackage;

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
	private EClass infrastructureSEFFRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureCallEClass = null;

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
	 * @see infrastructure.seff.SeffPackage#eNS_URI
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
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		seff.SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(infrastructure.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : infrastructure.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(infrastructure.composition.CompositionPackage.eNS_URI);
		CompositionPackageImpl theCompositionPackage_1 = (CompositionPackageImpl)(registeredPackage instanceof CompositionPackageImpl ? registeredPackage : infrastructure.composition.CompositionPackage.eINSTANCE);

		// Create package meta-data objects
		theSeffPackage.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theCompositionPackage_1.createPackageContents();

		// Initialize created meta-data
		theSeffPackage.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theCompositionPackage_1.initializePackageContents();

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
	public EClass getInfrastructureSEFFRoot() {
		return infrastructureSEFFRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureSEFFRoot_Infrastructurecall() {
		return (EReference)infrastructureSEFFRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureCall() {
		return infrastructureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureCall_Signature__InfrastructureCall() {
		return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureCall_NumberOfCalls__InfrastructureCall() {
		return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureCall_Action__InfrastructureCall() {
		return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureCall_RequiredRole__InfrastructureCall() {
		return (EReference)infrastructureCallEClass.getEStructuralFeatures().get(3);
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
		infrastructureSEFFRootEClass = createEClass(INFRASTRUCTURE_SEFF_ROOT);
		createEReference(infrastructureSEFFRootEClass, INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL);

		infrastructureCallEClass = createEClass(INFRASTRUCTURE_CALL);
		createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL);
		createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL);
		createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL);
		createEReference(infrastructureCallEClass, INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL);
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
		infrastructure.repository.RepositoryPackage theRepositoryPackage_1 = (infrastructure.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(infrastructure.repository.RepositoryPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		seff.SeffPackage theSeffPackage_1 = (seff.SeffPackage)EPackage.Registry.INSTANCE.getEPackage(seff.SeffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		infrastructureCallEClass.getESuperTypes().add(theBehaviourseffPackage.getCallAction());

		// Initialize classes and features; add operations and parameters
		initEClass(infrastructureSEFFRootEClass, InfrastructureSEFFRoot.class, "InfrastructureSEFFRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureSEFFRoot_Infrastructurecall(), this.getInfrastructureCall(), null, "infrastructurecall", null, 0, -1, InfrastructureSEFFRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureCallEClass, InfrastructureCall.class, "InfrastructureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureCall_Signature__InfrastructureCall(), theRepositoryPackage_1.getInfrastructureSignature(), null, "signature__InfrastructureCall", null, 1, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructureCall_NumberOfCalls__InfrastructureCall(), theVariablesPackage.getPCMRandomVariable(), null, "numberOfCalls__InfrastructureCall", null, 1, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructureCall_Action__InfrastructureCall(), theSeffPackage_1.getAbstractInternalControlFlowAction(), null, "action__InfrastructureCall", null, 1, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructureCall_RequiredRole__InfrastructureCall(), theRepositoryPackage_1.getInfrastructureRequiredRole(), null, "requiredRole__InfrastructureCall", null, 1, 1, InfrastructureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "SignatureMustBelongToUsedRequiredRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "ReferencedRequiredRoleMustBeRequiredByComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(infrastructureCallEClass, ecorePackage.getEBoolean(), "SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (infrastructureCallEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole"
		   });
		addAnnotation
		  (infrastructureCallEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(mpcm::core::entity::InterfaceRequiringEntity)).oclAsType(mpcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__InfrastructureCall)"
		   });
		addAnnotation
		  (infrastructureCallEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "body", "self.action__InfrastructureCall.infrastructureCall__Action->select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)->size() = 1"
		   });
	}

} //SeffPackageImpl
