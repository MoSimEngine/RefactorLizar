/**
 */
package performanceannotations.impl;

import annotations.AnnotationsPackage;

import base.BasePackage;

import composition.CompositionPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import performanceannotations.ComponentServiceExecutionTime;
import performanceannotations.PerformanceannotationsFactory;
import performanceannotations.PerformanceannotationsPackage;
import performanceannotations.ServiceExecutionTime;
import performanceannotations.SystemServiceExecutionTime;

import performanceannotations.util.PerformanceannotationsValidator;

import repository.RepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceannotationsPackageImpl extends EPackageImpl implements PerformanceannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceExecutionTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemServiceExecutionTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentServiceExecutionTimeEClass = null;

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
	 * @see performanceannotations.PerformanceannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PerformanceannotationsPackageImpl() {
		super(eNS_URI, PerformanceannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PerformanceannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PerformanceannotationsPackage init() {
		if (isInited) return (PerformanceannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(PerformanceannotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPerformanceannotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PerformanceannotationsPackageImpl thePerformanceannotationsPackage = registeredPerformanceannotationsPackage instanceof PerformanceannotationsPackageImpl ? (PerformanceannotationsPackageImpl)registeredPerformanceannotationsPackage : new PerformanceannotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AnnotationsPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		CompositionPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePerformanceannotationsPackage.createPackageContents();

		// Initialize created meta-data
		thePerformanceannotationsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePerformanceannotationsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PerformanceannotationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePerformanceannotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PerformanceannotationsPackage.eNS_URI, thePerformanceannotationsPackage);
		return thePerformanceannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceExecutionTime() {
		return serviceExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceExecutionTime_Specification_SpecifiedExecutionTime() {
		return (EReference)serviceExecutionTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemServiceExecutionTime() {
		return systemServiceExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentServiceExecutionTime() {
		return componentServiceExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentServiceExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime() {
		return (EReference)componentServiceExecutionTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceannotationsFactory getPerformanceannotationsFactory() {
		return (PerformanceannotationsFactory)getEFactoryInstance();
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
		serviceExecutionTimeEClass = createEClass(SERVICE_EXECUTION_TIME);
		createEReference(serviceExecutionTimeEClass, SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME);

		systemServiceExecutionTimeEClass = createEClass(SYSTEM_SERVICE_EXECUTION_TIME);

		componentServiceExecutionTimeEClass = createEClass(COMPONENT_SERVICE_EXECUTION_TIME);
		createEReference(componentServiceExecutionTimeEClass, COMPONENT_SERVICE_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME);
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
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceExecutionTimeEClass.getESuperTypes().add(theAnnotationsPackage.getServicePropertyAnnotation());
		systemServiceExecutionTimeEClass.getESuperTypes().add(this.getServiceExecutionTime());
		componentServiceExecutionTimeEClass.getESuperTypes().add(this.getServiceExecutionTime());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceExecutionTimeEClass, ServiceExecutionTime.class, "ServiceExecutionTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceExecutionTime_Specification_SpecifiedExecutionTime(), theVariablesPackage.getPCMRandomVariable(), null, "specification_SpecifiedExecutionTime", null, 1, 1, ServiceExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemServiceExecutionTimeEClass, SystemServiceExecutionTime.class, "SystemServiceExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(systemServiceExecutionTimeEClass, ecorePackage.getEBoolean(), "SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentServiceExecutionTimeEClass, ComponentServiceExecutionTime.class, "ComponentServiceExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentServiceExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext_ComponentSpecifiedExecutionTime", null, 1, 1, ComponentServiceExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (systemServiceExecutionTimeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(mpcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(mpcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(mpcm::system::System))\r\n"
		   });
	}

} //PerformanceannotationsPackageImpl
