/**
 */
package reliability.resources.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import environment.EnvironmentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reliability.ReliabilityPackage;

import reliability.failuretypes.FailuretypesPackage;

import reliability.failuretypes.impl.FailuretypesPackageImpl;

import reliability.impl.ReliabilityPackageImpl;

import reliability.repository.impl.RepositoryPackageImpl;

import reliability.resources.CommunicationLinkResourceReliabilitySpecification;
import reliability.resources.ProcessingResourceReliabilitySpecification;
import reliability.resources.ReliabilityResourceRoot;
import reliability.resources.ResourcesFactory;
import reliability.resources.ResourcesPackage;

import reliability.seff.impl.SeffPackageImpl;

import repository.RepositoryPackage;

import seff.SeffPackage;

import softwarerepository.SoftwarerepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesPackageImpl extends EPackageImpl implements ResourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityResourceRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceReliabilitySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkResourceReliabilitySpecificationEClass = null;

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
	 * @see reliability.resources.ResourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcesPackageImpl() {
		super(eNS_URI, ResourcesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcesPackage init() {
		if (isInited) return (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourcesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourcesPackageImpl theResourcesPackage = registeredResourcesPackage instanceof ResourcesPackageImpl ? (ResourcesPackageImpl)registeredResourcesPackage : new ResourcesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		resources.ResourcesPackage.eINSTANCE.eClass();
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : reliability.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		FailuretypesPackageImpl theFailuretypesPackage = (FailuretypesPackageImpl)(registeredPackage instanceof FailuretypesPackageImpl ? registeredPackage : FailuretypesPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcesPackage.createPackageContents();
		theReliabilityPackage.createPackageContents();
		theSeffPackage_1.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theFailuretypesPackage.createPackageContents();

		// Initialize created meta-data
		theResourcesPackage.initializePackageContents();
		theReliabilityPackage.initializePackageContents();
		theSeffPackage_1.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theFailuretypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcesPackage.eNS_URI, theResourcesPackage);
		return theResourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliabilityResourceRoot() {
		return reliabilityResourceRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityResourceRoot_ProcessingResourceReliabilitySpecification() {
		return (EReference)reliabilityResourceRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReliabilityResourceRoot_CommunicationLinkResourceReliabilitySpecifications() {
		return (EReference)reliabilityResourceRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourceReliabilitySpecification() {
		return processingResourceReliabilitySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceReliabilitySpecification_MTTR() {
		return (EAttribute)processingResourceReliabilitySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceReliabilitySpecification_MTTF() {
		return (EAttribute)processingResourceReliabilitySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceReliabilitySpecification_Owner() {
		return (EReference)processingResourceReliabilitySpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLinkResourceReliabilitySpecification() {
		return communicationLinkResourceReliabilitySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationLinkResourceReliabilitySpecification_FailureProbability() {
		return (EAttribute)communicationLinkResourceReliabilitySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkResourceReliabilitySpecification_Owner() {
		return (EReference)communicationLinkResourceReliabilitySpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactory getResourcesFactory() {
		return (ResourcesFactory)getEFactoryInstance();
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
		reliabilityResourceRootEClass = createEClass(RELIABILITY_RESOURCE_ROOT);
		createEReference(reliabilityResourceRootEClass, RELIABILITY_RESOURCE_ROOT__PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION);
		createEReference(reliabilityResourceRootEClass, RELIABILITY_RESOURCE_ROOT__COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATIONS);

		processingResourceReliabilitySpecificationEClass = createEClass(PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION);
		createEAttribute(processingResourceReliabilitySpecificationEClass, PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR);
		createEAttribute(processingResourceReliabilitySpecificationEClass, PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF);
		createEReference(processingResourceReliabilitySpecificationEClass, PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER);

		communicationLinkResourceReliabilitySpecificationEClass = createEClass(COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION);
		createEAttribute(communicationLinkResourceReliabilitySpecificationEClass, COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__FAILURE_PROBABILITY);
		createEReference(communicationLinkResourceReliabilitySpecificationEClass, COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION__OWNER);
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
		resources.ResourcesPackage theResourcesPackage_1 = (resources.ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(resources.ResourcesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(reliabilityResourceRootEClass, ReliabilityResourceRoot.class, "ReliabilityResourceRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReliabilityResourceRoot_ProcessingResourceReliabilitySpecification(), this.getProcessingResourceReliabilitySpecification(), null, "processingResourceReliabilitySpecification", null, 0, -1, ReliabilityResourceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReliabilityResourceRoot_CommunicationLinkResourceReliabilitySpecifications(), this.getCommunicationLinkResourceReliabilitySpecification(), null, "communicationLinkResourceReliabilitySpecifications", null, 0, -1, ReliabilityResourceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceReliabilitySpecificationEClass, ProcessingResourceReliabilitySpecification.class, "ProcessingResourceReliabilitySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingResourceReliabilitySpecification_MTTR(), ecorePackage.getEDouble(), "MTTR", "0.0", 1, 1, ProcessingResourceReliabilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessingResourceReliabilitySpecification_MTTF(), ecorePackage.getEDouble(), "MTTF", "0.0", 1, 1, ProcessingResourceReliabilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessingResourceReliabilitySpecification_Owner(), theResourcesPackage_1.getProcessingResourceSpecification(), null, "owner", null, 1, 1, ProcessingResourceReliabilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationLinkResourceReliabilitySpecificationEClass, CommunicationLinkResourceReliabilitySpecification.class, "CommunicationLinkResourceReliabilitySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationLinkResourceReliabilitySpecification_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", "0.0", 1, 1, CommunicationLinkResourceReliabilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationLinkResourceReliabilitySpecification_Owner(), theResourcesPackage_1.getCommunicationLinkResourceSpecification(), null, "owner", null, 1, 1, CommunicationLinkResourceReliabilitySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ResourcesPackageImpl
