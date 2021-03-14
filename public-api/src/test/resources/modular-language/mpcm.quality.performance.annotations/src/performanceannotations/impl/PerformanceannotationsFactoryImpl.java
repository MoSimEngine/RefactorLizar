/**
 */
package performanceannotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import performanceannotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceannotationsFactoryImpl extends EFactoryImpl implements PerformanceannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PerformanceannotationsFactory init() {
		try {
			PerformanceannotationsFactory thePerformanceannotationsFactory = (PerformanceannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(PerformanceannotationsPackage.eNS_URI);
			if (thePerformanceannotationsFactory != null) {
				return thePerformanceannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PerformanceannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceannotationsFactoryImpl() {
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
			case PerformanceannotationsPackage.SYSTEM_SERVICE_EXECUTION_TIME: return createSystemServiceExecutionTime();
			case PerformanceannotationsPackage.COMPONENT_SERVICE_EXECUTION_TIME: return createComponentServiceExecutionTime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemServiceExecutionTime createSystemServiceExecutionTime() {
		SystemServiceExecutionTimeImpl systemServiceExecutionTime = new SystemServiceExecutionTimeImpl();
		return systemServiceExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentServiceExecutionTime createComponentServiceExecutionTime() {
		ComponentServiceExecutionTimeImpl componentServiceExecutionTime = new ComponentServiceExecutionTimeImpl();
		return componentServiceExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceannotationsPackage getPerformanceannotationsPackage() {
		return (PerformanceannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PerformanceannotationsPackage getPackage() {
		return PerformanceannotationsPackage.eINSTANCE;
	}

} //PerformanceannotationsFactoryImpl
