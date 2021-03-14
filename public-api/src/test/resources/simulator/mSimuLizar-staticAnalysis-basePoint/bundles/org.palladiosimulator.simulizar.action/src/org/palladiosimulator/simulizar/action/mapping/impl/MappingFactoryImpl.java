/**
 */
package org.palladiosimulator.simulizar.action.mapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.simulizar.action.mapping.ControllerMapping;
import org.palladiosimulator.simulizar.action.mapping.Mapping;
import org.palladiosimulator.simulizar.action.mapping.MappingFactory;
import org.palladiosimulator.simulizar.action.mapping.MappingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static MappingFactory init() {
        try {
            final MappingFactory theMappingFactory = (MappingFactory) EPackage.Registry.INSTANCE
                .getEFactory(MappingPackage.eNS_URI);
            if (theMappingFactory != null) {
                return theMappingFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MappingFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MappingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MappingPackage.MAPPING:
            return this.createMapping();
        case MappingPackage.CONTROLLER_MAPPING:
            return this.createControllerMapping();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Mapping createMapping() {
        final MappingImpl mapping = new MappingImpl();
        return mapping;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ControllerMapping createControllerMapping() {
        final ControllerMappingImpl controllerMapping = new ControllerMappingImpl();
        return controllerMapping;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MappingPackage getMappingPackage() {
        return (MappingPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MappingPackage getPackage() {
        return MappingPackage.eINSTANCE;
    }

} // MappingFactoryImpl
