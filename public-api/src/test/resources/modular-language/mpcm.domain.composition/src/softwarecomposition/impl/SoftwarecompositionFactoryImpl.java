/**
 */
package softwarecomposition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import softwarecomposition.AssemblyConnector;
import softwarecomposition.CompositeComponent;
import softwarecomposition.ProvidedDelegationConnector;
import softwarecomposition.RequiredDelegationConnector;
import softwarecomposition.SoftwarecompositionFactory;
import softwarecomposition.SoftwarecompositionPackage;
import softwarecomposition.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarecompositionFactoryImpl extends EFactoryImpl implements SoftwarecompositionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwarecompositionFactory init() {
		try {
			SoftwarecompositionFactory theSoftwarecompositionFactory = (SoftwarecompositionFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwarecompositionPackage.eNS_URI);
			if (theSoftwarecompositionFactory != null) {
				return theSoftwarecompositionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwarecompositionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarecompositionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwarecompositionPackage.SYSTEM: return createSystem();
			case SoftwarecompositionPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case SoftwarecompositionPackage.SUB_SYSTEM: return createSubSystem();
			case SoftwarecompositionPackage.ASSEMBLY_CONNECTOR: return createAssemblyConnector();
			case SoftwarecompositionPackage.PROVIDED_DELEGATION_CONNECTOR: return createProvidedDelegationConnector();
			case SoftwarecompositionPackage.REQUIRED_DELEGATION_CONNECTOR: return createRequiredDelegationConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public softwarecomposition.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector createAssemblyConnector() {
		AssemblyConnectorImpl assemblyConnector = new AssemblyConnectorImpl();
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedDelegationConnector createProvidedDelegationConnector() {
		ProvidedDelegationConnectorImpl providedDelegationConnector = new ProvidedDelegationConnectorImpl();
		return providedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredDelegationConnector createRequiredDelegationConnector() {
		RequiredDelegationConnectorImpl requiredDelegationConnector = new RequiredDelegationConnectorImpl();
		return requiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarecompositionPackage getSoftwarecompositionPackage() {
		return (SoftwarecompositionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwarecompositionPackage getPackage() {
		return SoftwarecompositionPackage.eINSTANCE;
	}

} //SoftwarecompositionFactoryImpl
