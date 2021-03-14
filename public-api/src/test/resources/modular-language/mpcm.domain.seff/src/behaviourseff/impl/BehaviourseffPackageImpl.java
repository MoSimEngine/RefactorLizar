/**
 */
package behaviourseff.impl;

import base.BasePackage;

import behaviourseff.AcquireAction;
import behaviourseff.BehaviourSEFF;
import behaviourseff.BehaviourseffFactory;
import behaviourseff.BehaviourseffPackage;
import behaviourseff.CallAction;
import behaviourseff.CallReturnAction;
import behaviourseff.CollectionIteratorAction;
import behaviourseff.ExternalCallAction;
import behaviourseff.GuardedBranchTransition;
import behaviourseff.ProbabilisticBranchTransition;
import behaviourseff.ReleaseAction;
import behaviourseff.SetVariableAction;

import behaviourseff.util.BehaviourseffValidator;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

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
public class BehaviourseffPackageImpl extends EPackageImpl implements BehaviourseffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourSEFFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticBranchTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardedBranchTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionIteratorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callReturnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acquireActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setVariableActionEClass = null;

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
	 * @see behaviourseff.BehaviourseffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourseffPackageImpl() {
		super(eNS_URI, BehaviourseffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviourseffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourseffPackage init() {
		if (isInited) return (BehaviourseffPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourseffPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviourseffPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviourseffPackageImpl theBehaviourseffPackage = registeredBehaviourseffPackage instanceof BehaviourseffPackageImpl ? (BehaviourseffPackageImpl)registeredBehaviourseffPackage : new BehaviourseffPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		SeffPackage.eINSTANCE.eClass();
		SoftwarerepositoryPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		VariablesPackage.eINSTANCE.eClass();
		de.uka.ipd.sdq.identifier.IdentifierPackage.eINSTANCE.eClass();
		de.uka.ipd.sdq.units.UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviourseffPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourseffPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBehaviourseffPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BehaviourseffValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBehaviourseffPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourseffPackage.eNS_URI, theBehaviourseffPackage);
		return theBehaviourseffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourSEFF() {
		return behaviourSEFFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourSEFF_Behaviour() {
		return (EReference)behaviourSEFFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticBranchTransition() {
		return probabilisticBranchTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilisticBranchTransition_BranchProbability() {
		return (EAttribute)probabilisticBranchTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardedBranchTransition() {
		return guardedBranchTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardedBranchTransition_BranchCondition_GuardedBranchTransition() {
		return (EReference)guardedBranchTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionIteratorAction() {
		return collectionIteratorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionIteratorAction_Parameter_CollectionIteratorAction() {
		return (EReference)collectionIteratorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_InputVariableUsages__CallAction() {
		return (EReference)callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallReturnAction() {
		return callReturnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallReturnAction_ReturnVariableUsage__CallReturnAction() {
		return (EReference)callReturnActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCallAction() {
		return externalCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCallAction_CalledService_ExternalService() {
		return (EReference)externalCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCallAction_Role_ExternalService() {
		return (EReference)externalCallActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalCallAction_RetryCount() {
		return (EAttribute)externalCallActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcquireAction() {
		return acquireActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcquireAction_Passiveresource_AcquireAction() {
		return (EReference)acquireActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseAction() {
		return releaseActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseAction_PassiveResource_ReleaseAction() {
		return (EReference)releaseActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetVariableAction() {
		return setVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetVariableAction_LocalVariableUsages_SetVariableAction() {
		return (EReference)setVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourseffFactory getBehaviourseffFactory() {
		return (BehaviourseffFactory)getEFactoryInstance();
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
		behaviourSEFFEClass = createEClass(BEHAVIOUR_SEFF);
		createEReference(behaviourSEFFEClass, BEHAVIOUR_SEFF__BEHAVIOUR);

		probabilisticBranchTransitionEClass = createEClass(PROBABILISTIC_BRANCH_TRANSITION);
		createEAttribute(probabilisticBranchTransitionEClass, PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY);

		guardedBranchTransitionEClass = createEClass(GUARDED_BRANCH_TRANSITION);
		createEReference(guardedBranchTransitionEClass, GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION);

		collectionIteratorActionEClass = createEClass(COLLECTION_ITERATOR_ACTION);
		createEReference(collectionIteratorActionEClass, COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION);

		callActionEClass = createEClass(CALL_ACTION);
		createEReference(callActionEClass, CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION);

		callReturnActionEClass = createEClass(CALL_RETURN_ACTION);
		createEReference(callReturnActionEClass, CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION);

		externalCallActionEClass = createEClass(EXTERNAL_CALL_ACTION);
		createEReference(externalCallActionEClass, EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE);
		createEReference(externalCallActionEClass, EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE);
		createEAttribute(externalCallActionEClass, EXTERNAL_CALL_ACTION__RETRY_COUNT);

		acquireActionEClass = createEClass(ACQUIRE_ACTION);
		createEReference(acquireActionEClass, ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION);

		releaseActionEClass = createEClass(RELEASE_ACTION);
		createEReference(releaseActionEClass, RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION);

		setVariableActionEClass = createEClass(SET_VARIABLE_ACTION);
		createEReference(setVariableActionEClass, SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION);
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
		SoftwarerepositoryPackage theSoftwarerepositoryPackage = (SoftwarerepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarerepositoryPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behaviourSEFFEClass.getESuperTypes().add(theSoftwarerepositoryPackage.getServiceEffectSpecification());
		probabilisticBranchTransitionEClass.getESuperTypes().add(theSeffPackage.getAbstractBranchTransition());
		guardedBranchTransitionEClass.getESuperTypes().add(theSeffPackage.getAbstractBranchTransition());
		collectionIteratorActionEClass.getESuperTypes().add(theSeffPackage.getAbstractLoopAction());
		callActionEClass.getESuperTypes().add(theBasePackage.getEntity());
		callReturnActionEClass.getESuperTypes().add(this.getCallAction());
		externalCallActionEClass.getESuperTypes().add(theSeffPackage.getAbstractAction());
		externalCallActionEClass.getESuperTypes().add(this.getCallReturnAction());
		acquireActionEClass.getESuperTypes().add(theSeffPackage.getAbstractInternalControlFlowAction());
		releaseActionEClass.getESuperTypes().add(theSeffPackage.getAbstractInternalControlFlowAction());
		setVariableActionEClass.getESuperTypes().add(theSeffPackage.getAbstractInternalControlFlowAction());

		// Initialize classes and features; add operations and parameters
		initEClass(behaviourSEFFEClass, BehaviourSEFF.class, "BehaviourSEFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourSEFF_Behaviour(), theSeffPackage.getBehaviour(), null, "behaviour", null, 1, 1, BehaviourSEFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticBranchTransitionEClass, ProbabilisticBranchTransition.class, "ProbabilisticBranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticBranchTransition_BranchProbability(), ecorePackage.getEDouble(), "branchProbability", null, 1, 1, ProbabilisticBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guardedBranchTransitionEClass, GuardedBranchTransition.class, "GuardedBranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardedBranchTransition_BranchCondition_GuardedBranchTransition(), theVariablesPackage.getPCMRandomVariable(), null, "branchCondition_GuardedBranchTransition", null, 1, 1, GuardedBranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionIteratorActionEClass, CollectionIteratorAction.class, "CollectionIteratorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionIteratorAction_Parameter_CollectionIteratorAction(), theRepositoryPackage.getParameter(), null, "parameter_CollectionIteratorAction", null, 1, 1, CollectionIteratorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallAction_InputVariableUsages__CallAction(), theVariablesPackage.getVariableUsage(), null, "inputVariableUsages__CallAction", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callReturnActionEClass, CallReturnAction.class, "CallReturnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallReturnAction_ReturnVariableUsage__CallReturnAction(), theVariablesPackage.getVariableUsage(), null, "returnVariableUsage__CallReturnAction", null, 0, -1, CallReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalCallActionEClass, ExternalCallAction.class, "ExternalCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCallAction_CalledService_ExternalService(), theSoftwarerepositoryPackage.getOperationSignature(), null, "calledService_ExternalService", null, 1, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalCallAction_Role_ExternalService(), theSoftwarerepositoryPackage.getOperationRequiredRole(), null, "role_ExternalService", null, 1, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalCallAction_RetryCount(), ecorePackage.getEInt(), "retryCount", null, 1, 1, ExternalCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(externalCallActionEClass, ecorePackage.getEBoolean(), "SignatureBelongsToRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(externalCallActionEClass, ecorePackage.getEBoolean(), "OperationRequiredRoleMustBeReferencedByContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acquireActionEClass, AcquireAction.class, "AcquireAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcquireAction_Passiveresource_AcquireAction(), theSoftwarerepositoryPackage.getPassiveResource(), null, "passiveresource_AcquireAction", null, 1, 1, AcquireAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(acquireActionEClass, ecorePackage.getEBoolean(), "TimeoutValueOfAcquireActionMustNotBeNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(releaseActionEClass, ReleaseAction.class, "ReleaseAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseAction_PassiveResource_ReleaseAction(), theSoftwarerepositoryPackage.getPassiveResource(), null, "passiveResource_ReleaseAction", null, 1, 1, ReleaseAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setVariableActionEClass, SetVariableAction.class, "SetVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetVariableAction_LocalVariableUsages_SetVariableAction(), theVariablesPackage.getVariableUsage(), null, "localVariableUsages_SetVariableAction", null, 0, -1, SetVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (externalCallActionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "self.role_ExternalService.requiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(self.calledService_ExternalService)"
		   });
		addAnnotation
		  (externalCallActionEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "body", "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(mpcm::core::entity::InterfaceRequiringEntity)).oclAsType(mpcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.role_ExternalService)"
		   });
		addAnnotation
		  (acquireActionEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "body", "self.timeoutValue.oclAsType(Real) >= 0.0"
		   });
	}

} //BehaviourseffPackageImpl
