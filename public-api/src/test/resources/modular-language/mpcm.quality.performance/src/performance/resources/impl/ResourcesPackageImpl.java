/**
 */
package performance.resources.impl;

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

import performance.resources.CommunicationLinkResourcePerformanceSpecification;
import performance.resources.HDDResourcePerformanceSpecification;
import performance.resources.PerformanceResourcesRoot;
import performance.resources.ProcessingResourcePerformanceSpecification;
import performance.resources.ResourcesFactory;
import performance.resources.ResourcesPackage;

import performance.seff.impl.SeffPackageImpl;

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
	private EClass performanceResourcesRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourcePerformanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkResourcePerformanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hddResourcePerformanceSpecificationEClass = null;

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
	 * @see performance.resources.ResourcesPackage#eNS_URI
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(performance.seff.SeffPackage.eNS_URI);
		SeffPackageImpl theSeffPackage_1 = (SeffPackageImpl)(registeredPackage instanceof SeffPackageImpl ? registeredPackage : performance.seff.SeffPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcesPackage.createPackageContents();
		theSeffPackage_1.createPackageContents();

		// Initialize created meta-data
		theResourcesPackage.initializePackageContents();
		theSeffPackage_1.initializePackageContents();

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
	public EClass getPerformanceResourcesRoot() {
		return performanceResourcesRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceResourcesRoot_ProcessingResourcePerformanceSpecifications() {
		return (EReference)performanceResourcesRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceResourcesRoot_CommunicationLinkResourcePerformanceSpecifications() {
		return (EReference)performanceResourcesRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceResourcesRoot_HddResourcePerformanceSpecification() {
		return (EReference)performanceResourcesRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourcePerformanceSpecification() {
		return processingResourcePerformanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourcePerformanceSpecification_Owner() {
		return (EReference)processingResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourcePerformanceSpecification_ProcessingRate_ProcessingResourceSpecification() {
		return (EReference)processingResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLinkResourcePerformanceSpecification() {
		return communicationLinkResourcePerformanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkResourcePerformanceSpecification_Owner() {
		return (EReference)communicationLinkResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkResourcePerformanceSpecification_Latency_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkResourcePerformanceSpecification_Throughput_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDDResourcePerformanceSpecification() {
		return hddResourcePerformanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDDResourcePerformanceSpecification_Owner() {
		return (EReference)hddResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDDResourcePerformanceSpecification_WriteProcessingRate() {
		return (EReference)hddResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDDResourcePerformanceSpecification_ReadProcessingRate() {
		return (EReference)hddResourcePerformanceSpecificationEClass.getEStructuralFeatures().get(2);
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
		performanceResourcesRootEClass = createEClass(PERFORMANCE_RESOURCES_ROOT);
		createEReference(performanceResourcesRootEClass, PERFORMANCE_RESOURCES_ROOT__PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATIONS);
		createEReference(performanceResourcesRootEClass, PERFORMANCE_RESOURCES_ROOT__COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATIONS);
		createEReference(performanceResourcesRootEClass, PERFORMANCE_RESOURCES_ROOT__HDD_RESOURCE_PERFORMANCE_SPECIFICATION);

		processingResourcePerformanceSpecificationEClass = createEClass(PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION);
		createEReference(processingResourcePerformanceSpecificationEClass, PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER);
		createEReference(processingResourcePerformanceSpecificationEClass, PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION);

		communicationLinkResourcePerformanceSpecificationEClass = createEClass(COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION);
		createEReference(communicationLinkResourcePerformanceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER);
		createEReference(communicationLinkResourcePerformanceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
		createEReference(communicationLinkResourcePerformanceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);

		hddResourcePerformanceSpecificationEClass = createEClass(HDD_RESOURCE_PERFORMANCE_SPECIFICATION);
		createEReference(hddResourcePerformanceSpecificationEClass, HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER);
		createEReference(hddResourcePerformanceSpecificationEClass, HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE);
		createEReference(hddResourcePerformanceSpecificationEClass, HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE);
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
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(performanceResourcesRootEClass, PerformanceResourcesRoot.class, "PerformanceResourcesRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformanceResourcesRoot_ProcessingResourcePerformanceSpecifications(), this.getProcessingResourcePerformanceSpecification(), null, "processingResourcePerformanceSpecifications", null, 0, -1, PerformanceResourcesRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceResourcesRoot_CommunicationLinkResourcePerformanceSpecifications(), this.getCommunicationLinkResourcePerformanceSpecification(), null, "communicationLinkResourcePerformanceSpecifications", null, 0, -1, PerformanceResourcesRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceResourcesRoot_HddResourcePerformanceSpecification(), this.getHDDResourcePerformanceSpecification(), null, "hddResourcePerformanceSpecification", null, 0, -1, PerformanceResourcesRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourcePerformanceSpecificationEClass, ProcessingResourcePerformanceSpecification.class, "ProcessingResourcePerformanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourcePerformanceSpecification_Owner(), theResourcesPackage_1.getProcessingResourceSpecification(), null, "owner", null, 1, 1, ProcessingResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingResourcePerformanceSpecification_ProcessingRate_ProcessingResourceSpecification(), theVariablesPackage.getPCMRandomVariable(), null, "processingRate_ProcessingResourceSpecification", null, 1, 1, ProcessingResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communicationLinkResourcePerformanceSpecificationEClass, CommunicationLinkResourcePerformanceSpecification.class, "CommunicationLinkResourcePerformanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationLinkResourcePerformanceSpecification_Owner(), theResourcesPackage_1.getCommunicationLinkResourceSpecification(), null, "owner", null, 1, 1, CommunicationLinkResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkResourcePerformanceSpecification_Latency_CommunicationLinkResourceSpecification(), theVariablesPackage.getPCMRandomVariable(), null, "latency_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationLinkResourcePerformanceSpecification_Throughput_CommunicationLinkResourceSpecification(), theVariablesPackage.getPCMRandomVariable(), null, "throughput_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hddResourcePerformanceSpecificationEClass, HDDResourcePerformanceSpecification.class, "HDDResourcePerformanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDDResourcePerformanceSpecification_Owner(), theResourcesPackage_1.getHDDProcessingResourceSpecification(), null, "owner", null, 1, 1, HDDResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDDResourcePerformanceSpecification_WriteProcessingRate(), theVariablesPackage.getPCMRandomVariable(), null, "writeProcessingRate", null, 1, 1, HDDResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHDDResourcePerformanceSpecification_ReadProcessingRate(), theVariablesPackage.getPCMRandomVariable(), null, "readProcessingRate", null, 1, 1, HDDResourcePerformanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourcesPackageImpl
