/**
 */
package reliability.seff.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reliability.seff.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeffFactoryImpl extends EFactoryImpl implements SeffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeffFactory init() {
		try {
			SeffFactory theSeffFactory = (SeffFactory)EPackage.Registry.INSTANCE.getEFactory(SeffPackage.eNS_URI);
			if (theSeffFactory != null) {
				return theSeffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffFactoryImpl() {
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
			case SeffPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createInternalFailureOccurrenceDescription();
			case SeffPackage.RECOVERY_ACTION: return createRecoveryAction();
			case SeffPackage.RECOVERY_ACTION_BEHAVIOUR: return createRecoveryActionBehaviour();
			case SeffPackage.FAILURE_HANDLING_EXTERNAL_CALL_ACTION: return createFailureHandlingExternalCallAction();
			case SeffPackage.ACQUIRE_ACTION_TIMEOUT: return createAcquireActionTimeout();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFailureOccurrenceDescription createInternalFailureOccurrenceDescription() {
		InternalFailureOccurrenceDescriptionImpl internalFailureOccurrenceDescription = new InternalFailureOccurrenceDescriptionImpl();
		return internalFailureOccurrenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryAction createRecoveryAction() {
		RecoveryActionImpl recoveryAction = new RecoveryActionImpl();
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryActionBehaviour createRecoveryActionBehaviour() {
		RecoveryActionBehaviourImpl recoveryActionBehaviour = new RecoveryActionBehaviourImpl();
		return recoveryActionBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureHandlingExternalCallAction createFailureHandlingExternalCallAction() {
		FailureHandlingExternalCallActionImpl failureHandlingExternalCallAction = new FailureHandlingExternalCallActionImpl();
		return failureHandlingExternalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireActionTimeout createAcquireActionTimeout() {
		AcquireActionTimeoutImpl acquireActionTimeout = new AcquireActionTimeoutImpl();
		return acquireActionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffPackage getSeffPackage() {
		return (SeffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SeffPackage getPackage() {
		return SeffPackage.eINSTANCE;
	}

} //SeffFactoryImpl
