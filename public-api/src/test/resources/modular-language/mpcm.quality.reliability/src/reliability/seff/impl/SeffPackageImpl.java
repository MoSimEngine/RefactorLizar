/**
 */
package reliability.seff.impl;

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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reliability.ReliabilityPackage;

import reliability.failuretypes.FailuretypesPackage;

import reliability.failuretypes.impl.FailuretypesPackageImpl;

import reliability.impl.ReliabilityPackageImpl;

import reliability.repository.impl.RepositoryPackageImpl;

import reliability.resources.impl.ResourcesPackageImpl;

import reliability.seff.AcquireActionTimeout;
import reliability.seff.FailureHandlingEntity;
import reliability.seff.FailureHandlingExternalCallAction;
import reliability.seff.InternalFailureOccurrenceDescription;
import reliability.seff.RecoveryAction;
import reliability.seff.RecoveryActionBehaviour;
import reliability.seff.SeffFactory;
import reliability.seff.SeffPackage;

import reliability.seff.util.SeffValidator;

import repository.RepositoryPackage;

import resources.ResourcesPackage;

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
	private EClass internalFailureOccurrenceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryActionBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureHandlingEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureHandlingExternalCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acquireActionTimeoutEClass = null;

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
	 * @see reliability.seff.SeffPackage#eNS_URI
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
		EnvironmentPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		seff.SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		ReliabilityPackageImpl theReliabilityPackage = (ReliabilityPackageImpl)(registeredPackage instanceof ReliabilityPackageImpl ? registeredPackage : ReliabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.repository.RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage_1 = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : reliability.repository.RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		FailuretypesPackageImpl theFailuretypesPackage = (FailuretypesPackageImpl)(registeredPackage instanceof FailuretypesPackageImpl ? registeredPackage : FailuretypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(reliability.resources.ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage_1 = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : reliability.resources.ResourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theSeffPackage.createPackageContents();
		theReliabilityPackage.createPackageContents();
		theRepositoryPackage_1.createPackageContents();
		theFailuretypesPackage.createPackageContents();
		theResourcesPackage_1.createPackageContents();

		// Initialize created meta-data
		theSeffPackage.initializePackageContents();
		theReliabilityPackage.initializePackageContents();
		theRepositoryPackage_1.initializePackageContents();
		theFailuretypesPackage.initializePackageContents();
		theResourcesPackage_1.initializePackageContents();

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
	public EClass getInternalFailureOccurrenceDescription() {
		return internalFailureOccurrenceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription() {
		return (EReference)internalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription() {
		return (EReference)internalFailureOccurrenceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecoveryAction() {
		return recoveryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecoveryAction_PrimaryBehaviour__RecoveryAction() {
		return (EReference)recoveryActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecoveryAction_RecoveryActionBehaviours__RecoveryAction() {
		return (EReference)recoveryActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecoveryActionBehaviour() {
		return recoveryActionBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour() {
		return (EReference)recoveryActionBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour() {
		return (EReference)recoveryActionBehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureHandlingEntity() {
		return failureHandlingEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureHandlingEntity_FailureTypes_FailureHandlingEntity() {
		return (EReference)failureHandlingEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureHandlingExternalCallAction() {
		return failureHandlingExternalCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureHandlingExternalCallAction_Owner() {
		return (EReference)failureHandlingExternalCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcquireActionTimeout() {
		return acquireActionTimeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcquireActionTimeout_Owner() {
		return (EReference)acquireActionTimeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcquireActionTimeout_TimeoutValue() {
		return (EAttribute)acquireActionTimeoutEClass.getEStructuralFeatures().get(1);
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
		internalFailureOccurrenceDescriptionEClass = createEClass(INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
		createEReference(internalFailureOccurrenceDescriptionEClass, INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
		createEReference(internalFailureOccurrenceDescriptionEClass, INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);

		recoveryActionEClass = createEClass(RECOVERY_ACTION);
		createEReference(recoveryActionEClass, RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION);
		createEReference(recoveryActionEClass, RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION);

		recoveryActionBehaviourEClass = createEClass(RECOVERY_ACTION_BEHAVIOUR);
		createEReference(recoveryActionBehaviourEClass, RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR);
		createEReference(recoveryActionBehaviourEClass, RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR);

		failureHandlingEntityEClass = createEClass(FAILURE_HANDLING_ENTITY);
		createEReference(failureHandlingEntityEClass, FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY);

		failureHandlingExternalCallActionEClass = createEClass(FAILURE_HANDLING_EXTERNAL_CALL_ACTION);
		createEReference(failureHandlingExternalCallActionEClass, FAILURE_HANDLING_EXTERNAL_CALL_ACTION__OWNER);

		acquireActionTimeoutEClass = createEClass(ACQUIRE_ACTION_TIMEOUT);
		createEReference(acquireActionTimeoutEClass, ACQUIRE_ACTION_TIMEOUT__OWNER);
		createEAttribute(acquireActionTimeoutEClass, ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE);
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
		ReliabilityPackage theReliabilityPackage = (ReliabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		seff.SeffPackage theSeffPackage_1 = (seff.SeffPackage)EPackage.Registry.INSTANCE.getEPackage(seff.SeffPackage.eNS_URI);
		FailuretypesPackage theFailuretypesPackage = (FailuretypesPackage)EPackage.Registry.INSTANCE.getEPackage(FailuretypesPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BehaviourseffPackage theBehaviourseffPackage = (BehaviourseffPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourseffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalFailureOccurrenceDescriptionEClass.getESuperTypes().add(theReliabilityPackage.getFailureOccurrenceDescription());
		recoveryActionEClass.getESuperTypes().add(theSeffPackage_1.getAbstractInternalControlFlowAction());
		recoveryActionBehaviourEClass.getESuperTypes().add(this.getFailureHandlingEntity());
		recoveryActionBehaviourEClass.getESuperTypes().add(theSeffPackage_1.getBehaviour());
		failureHandlingEntityEClass.getESuperTypes().add(theBasePackage.getEntity());
		failureHandlingExternalCallActionEClass.getESuperTypes().add(this.getFailureHandlingEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(internalFailureOccurrenceDescriptionEClass, InternalFailureOccurrenceDescription.class, "InternalFailureOccurrenceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription(), theSeffPackage_1.getInternalAction(), null, "internalAction__InternalFailureOccurrenceDescription", null, 1, 1, InternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription(), theFailuretypesPackage.getSoftwareInducedFailureType(), theFailuretypesPackage.getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType(), "softwareInducedFailureType__InternalFailureOccurrenceDescription", null, 1, 1, InternalFailureOccurrenceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(internalFailureOccurrenceDescriptionEClass, ecorePackage.getEBoolean(), "NoResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recoveryActionEClass, RecoveryAction.class, "RecoveryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecoveryAction_PrimaryBehaviour__RecoveryAction(), this.getRecoveryActionBehaviour(), null, "primaryBehaviour__RecoveryAction", null, 1, 1, RecoveryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecoveryAction_RecoveryActionBehaviours__RecoveryAction(), this.getRecoveryActionBehaviour(), this.getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour(), "recoveryActionBehaviours__RecoveryAction", null, 2, -1, RecoveryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(recoveryActionEClass, ecorePackage.getEBoolean(), "PrimaryBehaviourOfRecoveryActionMustBeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recoveryActionBehaviourEClass, RecoveryActionBehaviour.class, "RecoveryActionBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour(), this.getRecoveryActionBehaviour(), null, "failureHandlingAlternatives__RecoveryActionBehaviour", null, 0, -1, RecoveryActionBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour(), this.getRecoveryAction(), this.getRecoveryAction_RecoveryActionBehaviours__RecoveryAction(), "recoveryAction__RecoveryActionBehaviour", null, 1, 1, RecoveryActionBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(recoveryActionBehaviourEClass, ecorePackage.getEBoolean(), "RecoveryActionBehaviourHasOnlyOnePredecessor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(recoveryActionBehaviourEClass, ecorePackage.getEBoolean(), "RecoveryActionBehaviourIsNotSuccessorOfItself", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(recoveryActionBehaviourEClass, ecorePackage.getEBoolean(), "SuccessorsOfRecoveryActionBehaviourHandleDisjointFailureTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(failureHandlingEntityEClass, FailureHandlingEntity.class, "FailureHandlingEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureHandlingEntity_FailureTypes_FailureHandlingEntity(), theFailuretypesPackage.getFailureType(), null, "failureTypes_FailureHandlingEntity", null, 0, -1, FailureHandlingEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(failureHandlingExternalCallActionEClass, FailureHandlingExternalCallAction.class, "FailureHandlingExternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureHandlingExternalCallAction_Owner(), theBehaviourseffPackage.getExternalCallAction(), null, "owner", null, 1, 1, FailureHandlingExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acquireActionTimeoutEClass, AcquireActionTimeout.class, "AcquireActionTimeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcquireActionTimeout_Owner(), theBehaviourseffPackage.getAcquireAction(), null, "owner", null, 1, 1, AcquireActionTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcquireActionTimeout_TimeoutValue(), ecorePackage.getEDouble(), "timeoutValue", null, 1, 1, AcquireActionTimeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (internalFailureOccurrenceDescriptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "not self.softwareInducedFailureType__InternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)"
		   });
		addAnnotation
		  (recoveryActionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "self.primaryBehaviour__RecoveryAction <> null"
		   });
		addAnnotation
		  (recoveryActionBehaviourEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "not self.recoveryAction__RecoveryActionBehaviour.recoveryActionBehaviours__RecoveryAction->\r\n\texists(x,y:RecoveryActionBehaviour | x<>y\r\n\t\tand x.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)\r\n\t\tand y.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self))"
		   });
		addAnnotation
		  (recoveryActionBehaviourEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "not self.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)"
		   });
		addAnnotation
		  (recoveryActionBehaviourEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "body", "not self.failureHandlingAlternatives__RecoveryActionBehaviour->\r\n\texists(x,y:RecoveryActionBehaviour | x<>y and\r\n\tx.failureTypes_FailureHandlingEntity->\r\n\t\texists(f:mpcm::reliability::FailureType |\r\n\t\ty.failureTypes_FailureHandlingEntity->includes(f)))"
		   });
	}

} //SeffPackageImpl
