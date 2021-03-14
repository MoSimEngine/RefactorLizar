/**
 */
package org.palladiosimulator.simulizar.action.mapping.impl;

import org.eclipse.emf.ecore.EClass;
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
import org.palladiosimulator.simulizar.action.core.CorePackage;
import org.palladiosimulator.simulizar.action.core.impl.CorePackageImpl;
import org.palladiosimulator.simulizar.action.instance.InstancePackage;
import org.palladiosimulator.simulizar.action.instance.impl.InstancePackageImpl;
import org.palladiosimulator.simulizar.action.mapping.ControllerMapping;
import org.palladiosimulator.simulizar.action.mapping.Mapping;
import org.palladiosimulator.simulizar.action.mapping.MappingFactory;
import org.palladiosimulator.simulizar.action.mapping.MappingPackage;
import org.palladiosimulator.simulizar.action.parameter.ParameterPackage;
import org.palladiosimulator.simulizar.action.parameter.impl.ParameterPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MappingPackageImpl extends EPackageImpl implements MappingPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass mappingEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass controllerMappingEClass = null;

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
     * @see org.palladiosimulator.simulizar.action.mapping.MappingPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MappingPackageImpl() {
        super(eNS_URI, MappingFactory.eINSTANCE);
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
     * This method is used to initialize {@link MappingPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MappingPackage init() {
        if (isInited) {
            return (MappingPackage) EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredMappingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final MappingPackageImpl theMappingPackage = registeredMappingPackage instanceof MappingPackageImpl
                ? (MappingPackageImpl) registeredMappingPackage
                : new MappingPackageImpl();

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
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        final CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
                ? registeredPackage
                : CorePackage.eINSTANCE);
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
        theMappingPackage.createPackageContents();
        theCorePackage.createPackageContents();
        theInstancePackage.createPackageContents();
        theParameterPackage.createPackageContents();
        theContextPackage.createPackageContents();

        // Initialize created meta-data
        theMappingPackage.initializePackageContents();
        theCorePackage.initializePackageContents();
        theInstancePackage.initializePackageContents();
        theParameterPackage.initializePackageContents();
        theContextPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMappingPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MappingPackage.eNS_URI, theMappingPackage);
        return theMappingPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMapping() {
        return this.mappingEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMapping_ControllerMappings() {
        return (EReference) this.mappingEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getControllerMapping() {
        return this.controllerMappingEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerMapping_MappedCall() {
        return (EReference) this.controllerMappingEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerMapping_ControllerRole() {
        return (EReference) this.controllerMappingEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getControllerMapping_Mapping() {
        return (EReference) this.controllerMappingEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MappingFactory getMappingFactory() {
        return (MappingFactory) this.getEFactoryInstance();
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
        this.mappingEClass = this.createEClass(MAPPING);
        this.createEReference(this.mappingEClass, MAPPING__CONTROLLER_MAPPINGS);

        this.controllerMappingEClass = this.createEClass(CONTROLLER_MAPPING);
        this.createEReference(this.controllerMappingEClass, CONTROLLER_MAPPING__MAPPED_CALL);
        this.createEReference(this.controllerMappingEClass, CONTROLLER_MAPPING__CONTROLLER_ROLE);
        this.createEReference(this.controllerMappingEClass, CONTROLLER_MAPPING__MAPPING);
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
        final CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
            .getEPackage(RepositoryPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.mappingEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.controllerMappingEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMapping_ControllerMappings(), this.getControllerMapping(),
                this.getControllerMapping_Mapping(), "controllerMappings", null, 1, -1, Mapping.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        this.initEClass(this.controllerMappingEClass, ControllerMapping.class, "ControllerMapping", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getControllerMapping_MappedCall(), theCorePackage.getControllerCall(), null,
                "mappedCall", null, 1, 1, ControllerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getControllerMapping_ControllerRole(), theRepositoryPackage.getOperationProvidedRole(),
                null, "controllerRole", null, 1, 1, ControllerMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getControllerMapping_Mapping(), this.getMapping(),
                this.getMapping_ControllerMappings(), "mapping", null, 0, 1, ControllerMapping.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // MappingPackageImpl
