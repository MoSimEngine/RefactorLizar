/**
 */
package reliability.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import environment.EnvironmentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reliability.FailureOccurrenceDescription;
import reliability.ReliabilityFactory;
import reliability.ReliabilityPackage;

import reliability.failuretypes.FailuretypesPackage;

import reliability.failuretypes.impl.FailuretypesPackageImpl;

import reliability.repository.impl.RepositoryPackageImpl;

import reliability.resources.impl.ResourcesPackageImpl;

import reliability.seff.impl.SeffPackageImpl;

import reliability.util.ReliabilityValidator;

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
public class ReliabilityPackageImpl extends EPackageImpl implements ReliabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureOccurrenceDescriptionEClass = null;

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
	 * @see reliability.ReliabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReliabilityPackageImpl() {
		super(eNS_URI, ReliabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReliabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReliabilityPackage init() {
		if (isInited) return (ReliabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReliabilityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReliabilityPackageImpl theReliabilityPackage = registeredReliabilityPackage instanceof ReliabilityPackageImpl ? (ReliabilityPackageImpl)registeredReliabilityPackage : new ReliabilityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.seff.SeffPackage.eNS_URI);
		SeffPackageImpl theSeffPackage_1 = (SeffPackageImpl)(registeredPackage instanceof SeffPackageImpl ? registeredPackage : reliability.seff.SeffPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : reliability.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		FailuretypesPackageImpl theFailuretypesPackage = (FailuretypesPackageImpl)(registeredPackage instanceof FailuretypesPackageImpl ? registeredPackage : FailuretypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.resources.ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage_1 = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : reliability.resources.ResourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theReliabilityPackage.createPackageContents();
		theSeffPackage_1.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theFailuretypesPackage.createPackageContents();
		theResourcesPackage_1.createPackageContents();

		// Initialize created meta-data
		theReliabilityPackage.initializePackageContents();
		theSeffPackage_1.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theFailuretypesPackage.initializePackageContents();
		theResourcesPackage_1.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theReliabilityPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ReliabilityValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theReliabilityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReliabilityPackage.eNS_URI, theReliabilityPackage);
		return theReliabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureOccurrenceDescription() {
		return failureOccurrenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureOccurrenceDescription_FailureProbability() {
		return (EAttribute)failureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityFactory getReliabilityFactory() {
		return (ReliabilityFactory)getEFactoryInstance();
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
		failureOccurrenceDescriptionEClass = createEClass(FAILURE_OCCURRENCE_DESCRIPTION);
		createEAttribute(failureOccurrenceDescriptionEClass, FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY);
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
		reliability.repository.RepositoryPackage theRepositoryPackage_1 = (reliability.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(reliability.repository.RepositoryPackage.eNS_URI);
		FailuretypesPackage theFailuretypesPackage = (FailuretypesPackage)EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		reliability.resources.ResourcesPackage theResourcesPackage_1 = (reliability.resources.ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(reliability.resources.ResourcesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSeffPackage_1);
		getESubpackages().add(theRepositoryPackage_1);
		getESubpackages().add(theFailuretypesPackage);
		getESubpackages().add(theResourcesPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(failureOccurrenceDescriptionEClass, FailureOccurrenceDescription.class, "FailureOccurrenceDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailureOccurrenceDescription_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", null, 1, 1, FailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(failureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "EnsureValidFailureProbabilityRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
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
		  (failureOccurrenceDescriptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "(self.failureProbability.oclAsType(Real) <= 1.0) and (self.failureProbability.oclAsType(Real) >= 0.0)"
		   });
	}

} //ReliabilityPackageImpl
