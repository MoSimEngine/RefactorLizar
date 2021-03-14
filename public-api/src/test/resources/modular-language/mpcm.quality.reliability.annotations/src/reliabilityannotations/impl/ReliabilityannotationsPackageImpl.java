/**
 */
package reliabilityannotations.impl;

import annotations.AnnotationsPackage;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

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

import reliability.ReliabilityPackage;

import reliability.failuretypes.FailuretypesPackage;

import reliabilityannotations.ExternalFailureOccurrenceDescription;
import reliabilityannotations.ReliabilityannotationsFactory;
import reliabilityannotations.ReliabilityannotationsPackage;
import reliabilityannotations.ServiceReliabilityAnnotation;

import reliabilityannotations.util.ReliabilityannotationsValidator;

import repository.RepositoryPackage;

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
public class ReliabilityannotationsPackageImpl extends EPackageImpl implements ReliabilityannotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceReliabilityAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFailureOccurrenceDescriptionEClass = null;

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
	 * @see reliabilityannotations.ReliabilityannotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReliabilityannotationsPackageImpl() {
		super(eNS_URI, ReliabilityannotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReliabilityannotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReliabilityannotationsPackage init() {
		if (isInited) return (ReliabilityannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(ReliabilityannotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReliabilityannotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReliabilityannotationsPackageImpl theReliabilityannotationsPackage = registeredReliabilityannotationsPackage instanceof ReliabilityannotationsPackageImpl ? (ReliabilityannotationsPackageImpl)registeredReliabilityannotationsPackage : new ReliabilityannotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AnnotationsPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		ReliabilityPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReliabilityannotationsPackage.createPackageContents();

		// Initialize created meta-data
		theReliabilityannotationsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theReliabilityannotationsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ReliabilityannotationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theReliabilityannotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReliabilityannotationsPackage.eNS_URI, theReliabilityannotationsPackage);
		return theReliabilityannotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceReliabilityAnnotation() {
		return serviceReliabilityAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation() {
		return (EReference)serviceReliabilityAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalFailureOccurrenceDescription() {
		return externalFailureOccurrenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription() {
		return (EReference)externalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription() {
		return (EReference)externalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityannotationsFactory getReliabilityannotationsFactory() {
		return (ReliabilityannotationsFactory)getEFactoryInstance();
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
		serviceReliabilityAnnotationEClass = createEClass(SERVICE_RELIABILITY_ANNOTATION);
		createEReference(serviceReliabilityAnnotationEClass, SERVICE_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION);

		externalFailureOccurrenceDescriptionEClass = createEClass(EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
		createEReference(externalFailureOccurrenceDescriptionEClass, EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
		createEReference(externalFailureOccurrenceDescriptionEClass, EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
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
		ReliabilityPackage theReliabilityPackage = (ReliabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		FailuretypesPackage theFailuretypesPackage = (FailuretypesPackage)EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceReliabilityAnnotationEClass.getESuperTypes().add(theAnnotationsPackage.getServicePropertyAnnotation());
		externalFailureOccurrenceDescriptionEClass.getESuperTypes().add(theReliabilityPackage.getFailureOccurrenceDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceReliabilityAnnotationEClass, ServiceReliabilityAnnotation.class, "ServiceReliabilityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation(), this.getExternalFailureOccurrenceDescription(), this.getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(), "externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation", null, 1, -1, ServiceReliabilityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(serviceReliabilityAnnotationEClass, ecorePackage.getEBoolean(), "SpecifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(serviceReliabilityAnnotationEClass, ecorePackage.getEBoolean(), "SumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(serviceReliabilityAnnotationEClass, ecorePackage.getEBoolean(), "MultipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalFailureOccurrenceDescriptionEClass, ExternalFailureOccurrenceDescription.class, "ExternalFailureOccurrenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(), this.getServiceReliabilityAnnotation(), this.getServiceReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation(), "specifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription", null, 1, 1, ExternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription(), theFailuretypesPackage.getFailureType(), null, "failureType__ExternalFailureOccurrenceDescription", null, 1, 1, ExternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(externalFailureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		  (serviceReliabilityAnnotationEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(mpcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(mpcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(mpcm::system::System))\r\n\r\n\r\n"
		   });
		addAnnotation
		  (serviceReliabilityAnnotationEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.failureProbability.oclAsType(Real)->sum()<=1.0"
		   });
		addAnnotation
		  (serviceReliabilityAnnotationEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "body", "self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation->forAll(x:mpcm::reliability::ExternalFailureOccurrenceDescription,y:mpcm::reliability::ExternalFailureOccurrenceDescription  | x<>y implies x.failureType__ExternalFailureOccurrenceDescription <> y.failureType__ExternalFailureOccurrenceDescription )"
		   });
		addAnnotation
		  (externalFailureOccurrenceDescriptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "not self.failureType__ExternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)"
		   });
	}

} //ReliabilityannotationsPackageImpl
