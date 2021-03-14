/**
 */
package softwarerepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import softwarerepository.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarerepositoryFactoryImpl extends EFactoryImpl implements SoftwarerepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwarerepositoryFactory init() {
		try {
			SoftwarerepositoryFactory theSoftwarerepositoryFactory = (SoftwarerepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwarerepositoryPackage.eNS_URI);
			if (theSoftwarerepositoryFactory != null) {
				return theSoftwarerepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwarerepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarerepositoryFactoryImpl() {
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
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY: return createSoftwarerepository();
			case SoftwarerepositoryPackage.EXCEPTION_TYPE: return createExceptionType();
			case SoftwarerepositoryPackage.EXCEPTION_OCCURENCE: return createExceptionOccurence();
			case SoftwarerepositoryPackage.BASIC_COMPONENT: return createBasicComponent();
			case SoftwarerepositoryPackage.PASSIVE_RESOURCE: return createPassiveResource();
			case SoftwarerepositoryPackage.OPERATION_INTERFACE: return createOperationInterface();
			case SoftwarerepositoryPackage.OPERATION_SIGNATURE: return createOperationSignature();
			case SoftwarerepositoryPackage.OPERATION_PROVIDED_ROLE: return createOperationProvidedRole();
			case SoftwarerepositoryPackage.OPERATION_REQUIRED_ROLE: return createOperationRequiredRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Softwarerepository createSoftwarerepository() {
		SoftwarerepositoryImpl softwarerepository = new SoftwarerepositoryImpl();
		return softwarerepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionOccurence createExceptionOccurence() {
		ExceptionOccurenceImpl exceptionOccurence = new ExceptionOccurenceImpl();
		return exceptionOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponent createBasicComponent() {
		BasicComponentImpl basicComponent = new BasicComponentImpl();
		return basicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource createPassiveResource() {
		PassiveResourceImpl passiveResource = new PassiveResourceImpl();
		return passiveResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface createOperationInterface() {
		OperationInterfaceImpl operationInterface = new OperationInterfaceImpl();
		return operationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature createOperationSignature() {
		OperationSignatureImpl operationSignature = new OperationSignatureImpl();
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole createOperationProvidedRole() {
		OperationProvidedRoleImpl operationProvidedRole = new OperationProvidedRoleImpl();
		return operationProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole createOperationRequiredRole() {
		OperationRequiredRoleImpl operationRequiredRole = new OperationRequiredRoleImpl();
		return operationRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarerepositoryPackage getSoftwarerepositoryPackage() {
		return (SoftwarerepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwarerepositoryPackage getPackage() {
		return SoftwarerepositoryPackage.eINSTANCE;
	}

} //SoftwarerepositoryFactoryImpl
