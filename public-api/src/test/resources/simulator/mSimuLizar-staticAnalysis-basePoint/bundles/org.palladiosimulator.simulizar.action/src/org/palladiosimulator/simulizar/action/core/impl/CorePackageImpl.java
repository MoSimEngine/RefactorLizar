/**
 */
package org.palladiosimulator.simulizar.action.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.modelversioning.emfprofile.EMFProfilePackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.simulizar.action.context.ContextPackage;
import org.palladiosimulator.simulizar.action.context.impl.ContextPackageImpl;
import org.palladiosimulator.simulizar.action.core.AbstractAdaptationBehavior;
import org.palladiosimulator.simulizar.action.core.AdaptationBehavior;
import org.palladiosimulator.simulizar.action.core.AdaptationBehaviorRepository;
import org.palladiosimulator.simulizar.action.core.AdaptationStep;
import org.palladiosimulator.simulizar.action.core.ControllerCall;
import org.palladiosimulator.simulizar.action.core.CoreFactory;
import org.palladiosimulator.simulizar.action.core.CorePackage;
import org.palladiosimulator.simulizar.action.core.EnactAdaptationStep;
import org.palladiosimulator.simulizar.action.core.GuardedStep;
import org.palladiosimulator.simulizar.action.core.GuardedTransition;
import org.palladiosimulator.simulizar.action.core.NestedAdaptationBehavior;
import org.palladiosimulator.simulizar.action.core.ResourceDemandingStep;
import org.palladiosimulator.simulizar.action.core.RoleType;
import org.palladiosimulator.simulizar.action.core.StateTransformingStep;
import org.palladiosimulator.simulizar.action.instance.InstancePackage;
import org.palladiosimulator.simulizar.action.instance.impl.InstancePackageImpl;
import org.palladiosimulator.simulizar.action.mapping.MappingPackage;
import org.palladiosimulator.simulizar.action.mapping.impl.MappingPackageImpl;
import org.palladiosimulator.simulizar.action.parameter.ParameterPackage;
import org.palladiosimulator.simulizar.action.parameter.impl.ParameterPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.scheduler.resources.active.IResourceTableManager;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass adaptationBehaviorRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass abstractAdaptationBehaviorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass adaptationBehaviorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass nestedAdaptationBehaviorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass adaptationStepEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stateTransformingStepEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass enactAdaptationStepEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceDemandingStepEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass guardedStepEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass guardedTransitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass roleTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass controllerCallEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType iResourceTableManagerEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.simulizar.action.core.CorePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CorePackageImpl() {
        super(eNS_URI, CoreFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CorePackage init() {
        if (isInited) {
            return (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl
                ? (CorePackageImpl) registeredCorePackage
                : new CorePackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        EMFProfilePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);
        final MappingPackageImpl theMappingPackage = (MappingPackageImpl) (registeredPackage instanceof MappingPackageImpl
                ? registeredPackage
                : MappingPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);
        final InstancePackageImpl theInstancePackage = (InstancePackageImpl) (registeredPackage instanceof InstancePackageImpl
                ? registeredPackage
                : InstancePackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);
        final ParameterPackageImpl theParameterPackage = (ParameterPackageImpl) (registeredPackage instanceof ParameterPackageImpl
                ? registeredPackage
                : ParameterPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
        final ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
                ? registeredPackage
                : ContextPackage.eINSTANCE);

        // Create package meta-data objects
        theCorePackage.createPackageContents();
        theMappingPackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theParameterPackage.createPackageContents();
        theContextPackage.createPackageContents();

        // Initialize created meta-data
        theCorePackage.initializePackageContents();
        theMappingPackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theParameterPackage.initializePackageContents();
        theContextPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCorePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
        return theCorePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAdaptationBehaviorRepository() {
        return this.adaptationBehaviorRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationBehaviorRepository_Actions() {
        return (EReference) this.adaptationBehaviorRepositoryEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationBehaviorRepository_IncludedRepositories() {
        return (EReference) this.adaptationBehaviorRepositoryEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAbstractAdaptationBehavior() {
        return this.abstractAdaptationBehaviorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAbstractAdaptationBehavior_AdaptationSteps() {
        return (EReference) this.abstractAdaptationBehaviorEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAdaptationBehavior() {
        return this.adaptationBehaviorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationBehavior_InvolvedRoles() {
        return (EReference) this.adaptationBehaviorEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationBehavior_TransientStateProfile() {
        return (EReference) this.adaptationBehaviorEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationBehavior_Repository() {
        return (EReference) this.adaptationBehaviorEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNestedAdaptationBehavior() {
        return this.nestedAdaptationBehaviorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getNestedAdaptationBehavior_GuardedTransition() {
        return (EReference) this.nestedAdaptationBehaviorEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAdaptationStep() {
        return this.adaptationStepEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAdaptationStep_AdaptationBehavior() {
        return (EReference) this.adaptationStepEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStateTransformingStep() {
        return this.stateTransformingStepEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEnactAdaptationStep() {
        return this.enactAdaptationStepEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getEnactAdaptationStep_AdaptationStepURI() {
        return (EAttribute) this.enactAdaptationStepEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceDemandingStep() {
        return this.resourceDemandingStepEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResourceDemandingStep_ControllerCompletionURI() {
        return (EAttribute) this.resourceDemandingStepEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDemandingStep_ControllerCalls() {
        return (EReference) this.resourceDemandingStepEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGuardedStep() {
        return this.guardedStepEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getGuardedStep_GuardedTransitions() {
        return (EReference) this.guardedStepEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGuardedTransition() {
        return this.guardedTransitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getGuardedTransition_ConditionURI() {
        return (EAttribute) this.guardedTransitionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getGuardedTransition_GuardedStep() {
        return (EReference) this.guardedTransitionEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getGuardedTransition_NestedAdaptationBehavior() {
        return (EReference) this.guardedTransitionEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRoleType() {
        return this.roleTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRoleType_Type() {
        return (EReference) this.roleTypeEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRoleType_Action() {
        return (EReference) this.roleTypeEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getControllerCall() {
        return this.controllerCallEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerCall_Component() {
        return (EReference) this.controllerCallEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerCall_CalledSignature() {
        return (EReference) this.controllerCallEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerCall_ResourceDemandingStep() {
        return (EReference) this.controllerCallEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getIResourceTableManager() {
        return this.iResourceTableManagerEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CoreFactory getCoreFactory() {
        return (CoreFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.adaptationBehaviorRepositoryEClass = this.createEClass(ADAPTATION_BEHAVIOR_REPOSITORY);
        this.createEReference(this.adaptationBehaviorRepositoryEClass, ADAPTATION_BEHAVIOR_REPOSITORY__ACTIONS);
        this.createEReference(this.adaptationBehaviorRepositoryEClass,
                ADAPTATION_BEHAVIOR_REPOSITORY__INCLUDED_REPOSITORIES);

        this.abstractAdaptationBehaviorEClass = this.createEClass(ABSTRACT_ADAPTATION_BEHAVIOR);
        this.createEReference(this.abstractAdaptationBehaviorEClass, ABSTRACT_ADAPTATION_BEHAVIOR__ADAPTATION_STEPS);

        this.adaptationBehaviorEClass = this.createEClass(ADAPTATION_BEHAVIOR);
        this.createEReference(this.adaptationBehaviorEClass, ADAPTATION_BEHAVIOR__INVOLVED_ROLES);
        this.createEReference(this.adaptationBehaviorEClass, ADAPTATION_BEHAVIOR__TRANSIENT_STATE_PROFILE);
        this.createEReference(this.adaptationBehaviorEClass, ADAPTATION_BEHAVIOR__REPOSITORY);

        this.nestedAdaptationBehaviorEClass = this.createEClass(NESTED_ADAPTATION_BEHAVIOR);
        this.createEReference(this.nestedAdaptationBehaviorEClass, NESTED_ADAPTATION_BEHAVIOR__GUARDED_TRANSITION);

        this.adaptationStepEClass = this.createEClass(ADAPTATION_STEP);
        this.createEReference(this.adaptationStepEClass, ADAPTATION_STEP__ADAPTATION_BEHAVIOR);

        this.stateTransformingStepEClass = this.createEClass(STATE_TRANSFORMING_STEP);

        this.enactAdaptationStepEClass = this.createEClass(ENACT_ADAPTATION_STEP);
        this.createEAttribute(this.enactAdaptationStepEClass, ENACT_ADAPTATION_STEP__ADAPTATION_STEP_URI);

        this.resourceDemandingStepEClass = this.createEClass(RESOURCE_DEMANDING_STEP);
        this.createEAttribute(this.resourceDemandingStepEClass, RESOURCE_DEMANDING_STEP__CONTROLLER_COMPLETION_URI);
        this.createEReference(this.resourceDemandingStepEClass, RESOURCE_DEMANDING_STEP__CONTROLLER_CALLS);

        this.guardedStepEClass = this.createEClass(GUARDED_STEP);
        this.createEReference(this.guardedStepEClass, GUARDED_STEP__GUARDED_TRANSITIONS);

        this.guardedTransitionEClass = this.createEClass(GUARDED_TRANSITION);
        this.createEAttribute(this.guardedTransitionEClass, GUARDED_TRANSITION__CONDITION_URI);
        this.createEReference(this.guardedTransitionEClass, GUARDED_TRANSITION__GUARDED_STEP);
        this.createEReference(this.guardedTransitionEClass, GUARDED_TRANSITION__NESTED_ADAPTATION_BEHAVIOR);

        this.roleTypeEClass = this.createEClass(ROLE_TYPE);
        this.createEReference(this.roleTypeEClass, ROLE_TYPE__TYPE);
        this.createEReference(this.roleTypeEClass, ROLE_TYPE__ACTION);

        this.controllerCallEClass = this.createEClass(CONTROLLER_CALL);
        this.createEReference(this.controllerCallEClass, CONTROLLER_CALL__COMPONENT);
        this.createEReference(this.controllerCallEClass, CONTROLLER_CALL__CALLED_SIGNATURE);
        this.createEReference(this.controllerCallEClass, CONTROLLER_CALL__RESOURCE_DEMANDING_STEP);

        // Create data types
        this.iResourceTableManagerEDataType = this.createEDataType(IRESOURCE_TABLE_MANAGER);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
            .getEPackage(EntityPackage.eNS_URI);
        final EMFProfilePackage theEMFProfilePackage = (EMFProfilePackage) EPackage.Registry.INSTANCE
            .getEPackage(EMFProfilePackage.eNS_URI);
        final InstancePackage theInstancePackage = (InstancePackage) EPackage.Registry.INSTANCE
            .getEPackage(InstancePackage.eNS_URI);
        final ParameterPackage theParameterPackage = (ParameterPackage) EPackage.Registry.INSTANCE
            .getEPackage(ParameterPackage.eNS_URI);
        final ContextPackage theContextPackage = (ContextPackage) EPackage.Registry.INSTANCE
            .getEPackage(ContextPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
            .getEPackage(RepositoryPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.adaptationBehaviorRepositoryEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.abstractAdaptationBehaviorEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.adaptationBehaviorEClass.getESuperTypes()
            .add(this.getAbstractAdaptationBehavior());
        this.nestedAdaptationBehaviorEClass.getESuperTypes()
            .add(this.getAbstractAdaptationBehavior());
        this.adaptationStepEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.stateTransformingStepEClass.getESuperTypes()
            .add(this.getAdaptationStep());
        this.enactAdaptationStepEClass.getESuperTypes()
            .add(this.getAdaptationStep());
        this.resourceDemandingStepEClass.getESuperTypes()
            .add(this.getAdaptationStep());
        this.guardedStepEClass.getESuperTypes()
            .add(this.getAdaptationStep());
        this.guardedTransitionEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.roleTypeEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.controllerCallEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.adaptationBehaviorRepositoryEClass, AdaptationBehaviorRepository.class,
                "AdaptationBehaviorRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAdaptationBehaviorRepository_Actions(), this.getAdaptationBehavior(),
                this.getAdaptationBehavior_Repository(), "actions", null, 0, -1, AdaptationBehaviorRepository.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAdaptationBehaviorRepository_IncludedRepositories(),
                this.getAdaptationBehaviorRepository(), null, "includedRepositories", null, 0, -1,
                AdaptationBehaviorRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.abstractAdaptationBehaviorEClass, AbstractAdaptationBehavior.class,
                "AbstractAdaptationBehavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAbstractAdaptationBehavior_AdaptationSteps(), this.getAdaptationStep(),
                this.getAdaptationStep_AdaptationBehavior(), "adaptationSteps", null, 1, -1,
                AbstractAdaptationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.adaptationBehaviorEClass, AdaptationBehavior.class, "AdaptationBehavior", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAdaptationBehavior_InvolvedRoles(), this.getRoleType(), this.getRoleType_Action(),
                "involvedRoles", null, 1, -1, AdaptationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAdaptationBehavior_TransientStateProfile(), theEMFProfilePackage.getProfile(), null,
                "transientStateProfile", null, 0, 1, AdaptationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAdaptationBehavior_Repository(), this.getAdaptationBehaviorRepository(),
                this.getAdaptationBehaviorRepository_Actions(), "repository", null, 0, 1, AdaptationBehavior.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = this.addEOperation(this.adaptationBehaviorEClass, this.ecorePackage.getEBoolean(), "execute", 1,
                1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theParameterPackage.getControllerCallInputVariableUsageCollection(),
                "controllerCallsVariableUsages", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, this.ecorePackage.getEBoolean(), "execute", 1, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theParameterPackage.getControllerCallInputVariableUsageCollection(),
                "controllerCallsVariableUsages", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theContextPackage.getExecutionContext(), "executionContext", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, this.ecorePackage.getEBoolean(), "execute", 1, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, this.ecorePackage.getEBoolean(), "execute", 1, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theContextPackage.getExecutionContext(), "executionContext", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, theContextPackage.getExecutionContext(), "executeAsync",
                1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theParameterPackage.getControllerCallInputVariableUsageCollection(),
                "controllerCallsVariableUsages", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, theContextPackage.getExecutionContext(), "executeAsync",
                0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theParameterPackage.getControllerCallInputVariableUsageCollection(),
                "controllerCallsVariableUsages", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theContextPackage.getExecutionContext(), "asyncExecutionContext", 0, 1, IS_UNIQUE,
                IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, theContextPackage.getExecutionContext(), "executeAsync",
                1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 1, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.adaptationBehaviorEClass, theContextPackage.getExecutionContext(), "executeAsync",
                0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theInstancePackage.getRoleSet(), "affectedRoleSet", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theContextPackage.getExecutionContext(), "asyncExecutionContext", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        this.addEParameter(op, this.getIResourceTableManager(), "resourceTableManager", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.nestedAdaptationBehaviorEClass, NestedAdaptationBehavior.class, "NestedAdaptationBehavior",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getNestedAdaptationBehavior_GuardedTransition(), this.getGuardedTransition(),
                this.getGuardedTransition_NestedAdaptationBehavior(), "guardedTransition", null, 0, 1,
                NestedAdaptationBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.adaptationStepEClass, AdaptationStep.class, "AdaptationStep", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAdaptationStep_AdaptationBehavior(), this.getAbstractAdaptationBehavior(),
                this.getAbstractAdaptationBehavior_AdaptationSteps(), "adaptationBehavior", null, 0, 1,
                AdaptationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.stateTransformingStepEClass, StateTransformingStep.class, "StateTransformingStep",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.enactAdaptationStepEClass, EnactAdaptationStep.class, "EnactAdaptationStep", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEnactAdaptationStep_AdaptationStepURI(), this.ecorePackage.getEString(),
                "adaptationStepURI", null, 1, 1, EnactAdaptationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resourceDemandingStepEClass, ResourceDemandingStep.class, "ResourceDemandingStep",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResourceDemandingStep_ControllerCompletionURI(), this.ecorePackage.getEString(),
                "controllerCompletionURI", null, 0, 1, ResourceDemandingStep.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getResourceDemandingStep_ControllerCalls(), this.getControllerCall(),
                this.getControllerCall_ResourceDemandingStep(), "controllerCalls", null, 1, -1,
                ResourceDemandingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.guardedStepEClass, GuardedStep.class, "GuardedStep", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getGuardedStep_GuardedTransitions(), this.getGuardedTransition(),
                this.getGuardedTransition_GuardedStep(), "guardedTransitions", null, 0, -1, GuardedStep.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.guardedTransitionEClass, GuardedTransition.class, "GuardedTransition", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getGuardedTransition_ConditionURI(), this.ecorePackage.getEString(), "conditionURI",
                null, 0, 1, GuardedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getGuardedTransition_GuardedStep(), this.getGuardedStep(),
                this.getGuardedStep_GuardedTransitions(), "guardedStep", null, 0, 1, GuardedTransition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getGuardedTransition_NestedAdaptationBehavior(), this.getNestedAdaptationBehavior(),
                this.getNestedAdaptationBehavior_GuardedTransition(), "nestedAdaptationBehavior", null, 0, 1,
                GuardedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRoleType_Type(), theEcorePackage.getEClass(), null, "type", null, 0, 1,
                RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getRoleType_Action(), this.getAdaptationBehavior(),
                this.getAdaptationBehavior_InvolvedRoles(), "action", null, 0, 1, RoleType.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        this.initEClass(this.controllerCallEClass, ControllerCall.class, "ControllerCall", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getControllerCall_Component(), theRepositoryPackage.getBasicComponent(), null,
                "component", null, 1, 1, ControllerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getControllerCall_CalledSignature(), theRepositoryPackage.getOperationSignature(),
                null, "calledSignature", null, 1, 1, ControllerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getControllerCall_ResourceDemandingStep(), this.getResourceDemandingStep(),
                this.getResourceDemandingStep_ControllerCalls(), "resourceDemandingStep", null, 0, 1,
                ControllerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        this.initEDataType(this.iResourceTableManagerEDataType, IResourceTableManager.class, "IResourceTableManager",
                !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // CorePackageImpl
