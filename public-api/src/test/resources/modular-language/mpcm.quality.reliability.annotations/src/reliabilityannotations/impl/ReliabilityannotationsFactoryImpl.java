/**
 */
package reliabilityannotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reliabilityannotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityannotationsFactoryImpl extends EFactoryImpl implements ReliabilityannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReliabilityannotationsFactory init() {
		try {
			ReliabilityannotationsFactory theReliabilityannotationsFactory = (ReliabilityannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(ReliabilityannotationsPackage.eNS_URI);
			if (theReliabilityannotationsFactory != null) {
				return theReliabilityannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReliabilityannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityannotationsFactoryImpl() {
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
			case ReliabilityannotationsPackage.SERVICE_RELIABILITY_ANNOTATION: return createServiceReliabilityAnnotation();
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: return createExternalFailureOccurrenceDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReliabilityAnnotation createServiceReliabilityAnnotation() {
		ServiceReliabilityAnnotationImpl serviceReliabilityAnnotation = new ServiceReliabilityAnnotationImpl();
		return serviceReliabilityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFailureOccurrenceDescription createExternalFailureOccurrenceDescription() {
		ExternalFailureOccurrenceDescriptionImpl externalFailureOccurrenceDescription = new ExternalFailureOccurrenceDescriptionImpl();
		return externalFailureOccurrenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityannotationsPackage getReliabilityannotationsPackage() {
		return (ReliabilityannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReliabilityannotationsPackage getPackage() {
		return ReliabilityannotationsPackage.eINSTANCE;
	}

} //ReliabilityannotationsFactoryImpl
