/**
 */
package annotations.impl;

import annotations.AnnotationRoot;
import annotations.AnnotationsFactory;
import annotations.AnnotationsPackage;
import annotations.ServiceOutputParameterAbstraction;
import annotations.ServicePropertyAnnotation;

import annotations.util.AnnotationsValidator;

import base.BasePackage;

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

import repository.RepositoryPackage;

import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePropertyAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOutputParameterAbstractionEClass = null;

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
	 * @see annotations.AnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationsPackageImpl() {
		super(eNS_URI, AnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationsPackage init() {
		if (isInited) return (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AnnotationsPackageImpl theAnnotationsPackage = registeredAnnotationsPackage instanceof AnnotationsPackageImpl ? (AnnotationsPackageImpl)registeredAnnotationsPackage : new AnnotationsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAnnotationsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AnnotationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAnnotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
		return theAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationRoot() {
		return annotationRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations() {
		return (EReference)annotationRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations() {
		return (EReference)annotationRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicePropertyAnnotation() {
		return servicePropertyAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicePropertyAnnotation_Signature_SpecifiedQoSAnnation() {
		return (EReference)servicePropertyAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicePropertyAnnotation_Role_SpecifiedQoSAnnotation() {
		return (EReference)servicePropertyAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation() {
		return (EReference)servicePropertyAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceOutputParameterAbstraction() {
		return serviceOutputParameterAbstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction() {
		return (EReference)serviceOutputParameterAbstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction() {
		return (EReference)serviceOutputParameterAbstractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction() {
		return (EReference)serviceOutputParameterAbstractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction() {
		return (EReference)serviceOutputParameterAbstractionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsFactory getAnnotationsFactory() {
		return (AnnotationsFactory)getEFactoryInstance();
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
		annotationRootEClass = createEClass(ANNOTATION_ROOT);
		createEReference(annotationRootEClass, ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS);
		createEReference(annotationRootEClass, ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS);

		servicePropertyAnnotationEClass = createEClass(SERVICE_PROPERTY_ANNOTATION);
		createEReference(servicePropertyAnnotationEClass, SERVICE_PROPERTY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION);
		createEReference(servicePropertyAnnotationEClass, SERVICE_PROPERTY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION);
		createEReference(servicePropertyAnnotationEClass, SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION);

		serviceOutputParameterAbstractionEClass = createEClass(SERVICE_OUTPUT_PARAMETER_ABSTRACTION);
		createEReference(serviceOutputParameterAbstractionEClass, SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
		createEReference(serviceOutputParameterAbstractionEClass, SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
		createEReference(serviceOutputParameterAbstractionEClass, SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
		createEReference(serviceOutputParameterAbstractionEClass, SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annotationRootEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(annotationRootEClass, AnnotationRoot.class, "AnnotationRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations(), this.getServiceOutputParameterAbstraction(), this.getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction(), "specifiedOutputParameterAbstractions_QoSAnnotations", null, 0, -1, AnnotationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations(), this.getServicePropertyAnnotation(), this.getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation(), "specifiedQoSAnnotations_QoSAnnotations", null, 0, -1, AnnotationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(annotationRootEClass, ecorePackage.getEBoolean(), "MultipleReliabilityAnnotationsPerExternalCallNotAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(servicePropertyAnnotationEClass, ServicePropertyAnnotation.class, "ServicePropertyAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicePropertyAnnotation_Signature_SpecifiedQoSAnnation(), theRepositoryPackage.getSignature(), null, "signature_SpecifiedQoSAnnation", null, 1, 1, ServicePropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServicePropertyAnnotation_Role_SpecifiedQoSAnnotation(), theRepositoryPackage.getRole(), null, "role_SpecifiedQoSAnnotation", null, 1, 1, ServicePropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServicePropertyAnnotation_QosAnnotations_SpecifiedQoSAnnotation(), this.getAnnotationRoot(), this.getAnnotationRoot_SpecifiedQoSAnnotations_QoSAnnotations(), "qosAnnotations_SpecifiedQoSAnnotation", null, 1, 1, ServicePropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceOutputParameterAbstractionEClass, ServiceOutputParameterAbstraction.class, "ServiceOutputParameterAbstraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction(), theRepositoryPackage.getSignature(), null, "signature_SpecifiedOutputParameterAbstraction", null, 1, 1, ServiceOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction(), theRepositoryPackage.getRole(), null, "role_SpecifiedOutputParameterAbstraction", null, 1, 1, ServiceOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction(), theVariablesPackage.getVariableUsage(), null, "expectedExternalOutputs_SpecifiedOutputParameterAbstraction", null, 0, -1, ServiceOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction(), this.getAnnotationRoot(), this.getAnnotationRoot_SpecifiedOutputParameterAbstractions_QoSAnnotations(), "qosAnnotations_SpecifiedOutputParameterAbstraction", null, 1, 1, ServiceOutputParameterAbstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (annotationRootEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "self.specifiedQoSAnnotations_QoSAnnotations->select(oclIsTypeOf(mpcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))->forAll( x, y | ( x<>y ) implies ( ( x.role_SpecifiedQoSAnnotation <> y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation <> y.signature_SpecifiedQoSAnnation ) ) )"
		   });
	}

} //AnnotationsPackageImpl
