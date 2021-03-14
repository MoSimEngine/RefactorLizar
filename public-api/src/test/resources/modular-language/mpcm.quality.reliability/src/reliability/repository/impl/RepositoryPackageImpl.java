/**
 */
package reliability.repository.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import environment.EnvironmentPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reliability.ReliabilityPackage;

import reliability.failuretypes.FailuretypesPackage;

import reliability.failuretypes.impl.FailuretypesPackageImpl;

import reliability.impl.ReliabilityPackageImpl;

import reliability.repository.FailureDeclaration;
import reliability.repository.ReliabilityContainer;
import reliability.repository.RepositoryFactory;
import reliability.repository.RepositoryPackage;

import reliability.resources.impl.ResourcesPackageImpl;

import reliability.seff.impl.SeffPackageImpl;

import resources.ResourcesPackage;

import seff.SeffPackage;

import softwarerepository.SoftwarerepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryPackageImpl extends EPackageImpl implements RepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureDeclarationEClass = null;

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
	 * @see reliability.repository.RepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepositoryPackageImpl() {
		super(eNS_URI, RepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepositoryPackage init() {
		if (isInited) return (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRepositoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = registeredRepositoryPackage instanceof RepositoryPackageImpl ? (RepositoryPackageImpl)registeredRepositoryPackage : new RepositoryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		repository.RepositoryPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		ReliabilityPackageImpl theReliabilityPackage = (ReliabilityPackageImpl)(registeredPackage instanceof ReliabilityPackageImpl ? registeredPackage : ReliabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.seff.SeffPackage.eNS_URI);
		SeffPackageImpl theSeffPackage_1 = (SeffPackageImpl)(registeredPackage instanceof SeffPackageImpl ? registeredPackage : reliability.seff.SeffPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		FailuretypesPackageImpl theFailuretypesPackage = (FailuretypesPackageImpl)(registeredPackage instanceof FailuretypesPackageImpl ? registeredPackage : FailuretypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.resources.ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage_1 = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : reliability.resources.ResourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theRepositoryPackage.createPackageContents();
		theReliabilityPackage.createPackageContents();
		theSeffPackage_1.createPackageContents();
		theFailuretypesPackage.createPackageContents();
		theResourcesPackage_1.createPackageContents();

		// Initialize created meta-data
		theRepositoryPackage.initializePackageContents();
		theReliabilityPackage.initializePackageContents();
		theSeffPackage_1.initializePackageContents();
		theFailuretypesPackage.initializePackageContents();
		theResourcesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepositoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, theRepositoryPackage);
		return theRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliabilityContainer() {
		return reliabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityContainer_FailureDeclarations() {
		return (EReference)reliabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityContainer_FailureHandlingExternalCallActions() {
		return (EReference)reliabilityContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityContainer_InternalFailureOccurenceDescriptions() {
		return (EReference)reliabilityContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityContainer_AcquireActionTimeout() {
		return (EReference)reliabilityContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureDeclaration() {
		return failureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureDeclaration_Types() {
		return (EReference)failureDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureDeclaration_Owner() {
		return (EReference)failureDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryFactory getRepositoryFactory() {
		return (RepositoryFactory)getEFactoryInstance();
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
		reliabilityContainerEClass = createEClass(RELIABILITY_CONTAINER);
		createEReference(reliabilityContainerEClass, RELIABILITY_CONTAINER__FAILURE_DECLARATIONS);
		createEReference(reliabilityContainerEClass, RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS);
		createEReference(reliabilityContainerEClass, RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS);
		createEReference(reliabilityContainerEClass, RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT);

		failureDeclarationEClass = createEClass(FAILURE_DECLARATION);
		createEReference(failureDeclarationEClass, FAILURE_DECLARATION__TYPES);
		createEReference(failureDeclarationEClass, FAILURE_DECLARATION__OWNER);
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
		reliability.seff.SeffPackage theSeffPackage_1 = (reliability.seff.SeffPackage)EPackage.Registry.INSTANCE.getEPackage(reliability.seff.SeffPackage.eNS_URI);
		FailuretypesPackage theFailuretypesPackage = (FailuretypesPackage)EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		repository.RepositoryPackage theRepositoryPackage_1 = (repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(repository.RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(reliabilityContainerEClass, ReliabilityContainer.class, "ReliabilityContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReliabilityContainer_FailureDeclarations(), this.getFailureDeclaration(), null, "failureDeclarations", null, 0, -1, ReliabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReliabilityContainer_FailureHandlingExternalCallActions(), theSeffPackage_1.getFailureHandlingExternalCallAction(), null, "failureHandlingExternalCallActions", null, 0, -1, ReliabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReliabilityContainer_InternalFailureOccurenceDescriptions(), theSeffPackage_1.getInternalFailureOccurrenceDescription(), null, "internalFailureOccurenceDescriptions", null, 0, -1, ReliabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReliabilityContainer_AcquireActionTimeout(), theSeffPackage_1.getAcquireActionTimeout(), null, "acquireActionTimeout", null, 0, -1, ReliabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureDeclarationEClass, FailureDeclaration.class, "FailureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureDeclaration_Types(), theFailuretypesPackage.getFailureType(), null, "types", null, 0, -1, FailureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureDeclaration_Owner(), theRepositoryPackage_1.getSignature(), null, "owner", null, 1, 1, FailureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RepositoryPackageImpl
