/**
 */
package events.seff.impl;

import allocation.AllocationPackage;

import base.BasePackage;

import behaviourseff.BehaviourseffPackage;

import composition.CompositionPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import environment.EnvironmentPackage;

import events.allocation.impl.AllocationPackageImpl;

import events.composition.impl.CompositionPackageImpl;

import events.repository.impl.RepositoryPackageImpl;

import events.seff.EmitEventAction;
import events.seff.SeffFactory;
import events.seff.SeffPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import repository.RepositoryPackage;

import softwarecomposition.SoftwarecompositionPackage;

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
	private EClass emitEventActionEClass = null;

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
	 * @see events.seff.SeffPackage#eNS_URI
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
		AllocationPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		BehaviourseffPackage.eINSTANCE.eClass();
		CompositionPackage.eINSTANCE.eClass();
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		seff.SeffPackage.eINSTANCE.eClass();
		SoftwarecompositionPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(events.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : events.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(events.composition.CompositionPackage.eNS_URI);
		CompositionPackageImpl theCompositionPackage_1 = (CompositionPackageImpl)(registeredPackage instanceof CompositionPackageImpl ? registeredPackage : events.composition.CompositionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(events.allocation.AllocationPackage.eNS_URI);
		AllocationPackageImpl theAllocationPackage_1 = (AllocationPackageImpl)(registeredPackage instanceof AllocationPackageImpl ? registeredPackage : events.allocation.AllocationPackage.eINSTANCE);

		// Create package meta-data objects
		theSeffPackage.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theCompositionPackage_1.createPackageContents();
		theAllocationPackage_1.createPackageContents();

		// Initialize created meta-data
		theSeffPackage.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theCompositionPackage_1.initializePackageContents();
		theAllocationPackage_1.initializePackageContents();

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
	public EClass getEmitEventAction() {
		return emitEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitEventAction_EventType__EmitEventAction() {
		return (EReference)emitEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitEventAction_SourceRole__EmitEventAction() {
		return (EReference)emitEventActionEClass.getEStructuralFeatures().get(1);
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
		emitEventActionEClass = createEClass(EMIT_EVENT_ACTION);
		createEReference(emitEventActionEClass, EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION);
		createEReference(emitEventActionEClass, EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION);
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
		seff.SeffPackage theSeffPackage_1 = (seff.SeffPackage)EPackage.Registry.INSTANCE.getEPackage(seff.SeffPackage.eNS_URI);
		BehaviourseffPackage theBehaviourseffPackage = (BehaviourseffPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourseffPackage.eNS_URI);
		events.repository.RepositoryPackage theRepositoryPackage_1 = (events.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(events.repository.RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emitEventActionEClass.getESuperTypes().add(theSeffPackage_1.getAbstractAction());
		emitEventActionEClass.getESuperTypes().add(theBehaviourseffPackage.getCallAction());

		// Initialize classes and features; add operations and parameters
		initEClass(emitEventActionEClass, EmitEventAction.class, "EmitEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmitEventAction_EventType__EmitEventAction(), theRepositoryPackage_1.getEventType(), null, "eventType__EmitEventAction", null, 1, 1, EmitEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmitEventAction_SourceRole__EmitEventAction(), theRepositoryPackage_1.getSourceRole(), null, "sourceRole__EmitEventAction", null, 1, 1, EmitEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SeffPackageImpl
