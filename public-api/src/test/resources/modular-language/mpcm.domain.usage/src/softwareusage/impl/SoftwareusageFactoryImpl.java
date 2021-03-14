/**
 */
package softwareusage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import softwareusage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareusageFactoryImpl extends EFactoryImpl implements SoftwareusageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareusageFactory init() {
		try {
			SoftwareusageFactory theSoftwareusageFactory = (SoftwareusageFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwareusagePackage.eNS_URI);
			if (theSoftwareusageFactory != null) {
				return theSoftwareusageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareusageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareusageFactoryImpl() {
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
			case SoftwareusagePackage.USAGE_MODEL: return createUsageModel();
			case SoftwareusagePackage.USER_DATA: return createUserData();
			case SoftwareusagePackage.USAGE_SCENARIO: return createUsageScenario();
			case SoftwareusagePackage.OPEN_WORKLOAD: return createOpenWorkload();
			case SoftwareusagePackage.CLOSED_WORKLOAD: return createClosedWorkload();
			case SoftwareusagePackage.ENTRY_LEVEL_SYSTEM_CALL: return createEntryLevelSystemCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModel createUsageModel() {
		UsageModelImpl usageModel = new UsageModelImpl();
		return usageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData createUserData() {
		UserDataImpl userData = new UserDataImpl();
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario createUsageScenario() {
		UsageScenarioImpl usageScenario = new UsageScenarioImpl();
		return usageScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenWorkload createOpenWorkload() {
		OpenWorkloadImpl openWorkload = new OpenWorkloadImpl();
		return openWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkload createClosedWorkload() {
		ClosedWorkloadImpl closedWorkload = new ClosedWorkloadImpl();
		return closedWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCall createEntryLevelSystemCall() {
		EntryLevelSystemCallImpl entryLevelSystemCall = new EntryLevelSystemCallImpl();
		return entryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareusagePackage getSoftwareusagePackage() {
		return (SoftwareusagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareusagePackage getPackage() {
		return SoftwareusagePackage.eINSTANCE;
	}

} //SoftwareusageFactoryImpl
