/**
 */
package internalbehaviour.impl;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import internalbehaviour.InternalBehaviourSEFF;
import internalbehaviour.InternalCallAction;
import internalbehaviour.InternalbehaviourFactory;
import internalbehaviour.InternalbehaviourPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
public class InternalbehaviourPackageImpl extends EPackageImpl implements InternalbehaviourPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalBehaviourSEFFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCallActionEClass = null;

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
	 * @see internalbehaviour.InternalbehaviourPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalbehaviourPackageImpl() {
		super(eNS_URI, InternalbehaviourFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InternalbehaviourPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InternalbehaviourPackage init() {
		if (isInited) return (InternalbehaviourPackage)EPackage.Registry.INSTANCE.getEPackage(InternalbehaviourPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalbehaviourPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalbehaviourPackageImpl theInternalbehaviourPackage = registeredInternalbehaviourPackage instanceof InternalbehaviourPackageImpl ? (InternalbehaviourPackageImpl)registeredInternalbehaviourPackage : new InternalbehaviourPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInternalbehaviourPackage.createPackageContents();

		// Initialize created meta-data
		theInternalbehaviourPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalbehaviourPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalbehaviourPackage.eNS_URI, theInternalbehaviourPackage);
		return theInternalbehaviourPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalBehaviourSEFF() {
		return internalBehaviourSEFFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalBehaviourSEFF_Signature() {
		return (EReference)internalBehaviourSEFFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalCallAction() {
		return internalCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalCallAction_CalledResourceDemandingInternalBehaviour() {
		return (EReference)internalCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalbehaviourFactory getInternalbehaviourFactory() {
		return (InternalbehaviourFactory)getEFactoryInstance();
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
		internalBehaviourSEFFEClass = createEClass(INTERNAL_BEHAVIOUR_SEFF);
		createEReference(internalBehaviourSEFFEClass, INTERNAL_BEHAVIOUR_SEFF__SIGNATURE);

		internalCallActionEClass = createEClass(INTERNAL_CALL_ACTION);
		createEReference(internalCallActionEClass, INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);
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
		SoftwarerepositoryPackage theSoftwarerepositoryPackage = (SoftwarerepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarerepositoryPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalBehaviourSEFFEClass.getESuperTypes().add(theBehaviourseffPackage.getBehaviourSEFF());
		internalCallActionEClass.getESuperTypes().add(theBehaviourseffPackage.getCallAction());
		internalCallActionEClass.getESuperTypes().add(theSeffPackage.getAbstractInternalControlFlowAction());

		// Initialize classes and features; add operations and parameters
		initEClass(internalBehaviourSEFFEClass, InternalBehaviourSEFF.class, "InternalBehaviourSEFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalBehaviourSEFF_Signature(), theSoftwarerepositoryPackage.getOperationSignature(), null, "signature", null, 1, 1, InternalBehaviourSEFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalCallActionEClass, InternalCallAction.class, "InternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalCallAction_CalledResourceDemandingInternalBehaviour(), this.getInternalBehaviourSEFF(), null, "calledResourceDemandingInternalBehaviour", null, 1, 1, InternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InternalbehaviourPackageImpl
