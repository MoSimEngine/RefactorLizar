/**
 */
package reliability.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reliability.resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements ResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcesFactory init() {
		try {
			ResourcesFactory theResourcesFactory = (ResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcesPackage.eNS_URI);
			if (theResourcesFactory != null) {
				return theResourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactoryImpl() {
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
			case ResourcesPackage.RELIABILITY_RESOURCE_ROOT: return createReliabilityResourceRoot();
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION: return createProcessingResourceReliabilitySpecification();
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_RELIABILITY_SPECIFICATION: return createCommunicationLinkResourceReliabilitySpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityResourceRoot createReliabilityResourceRoot() {
		ReliabilityResourceRootImpl reliabilityResourceRoot = new ReliabilityResourceRootImpl();
		return reliabilityResourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceReliabilitySpecification createProcessingResourceReliabilitySpecification() {
		ProcessingResourceReliabilitySpecificationImpl processingResourceReliabilitySpecification = new ProcessingResourceReliabilitySpecificationImpl();
		return processingResourceReliabilitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceReliabilitySpecification createCommunicationLinkResourceReliabilitySpecification() {
		CommunicationLinkResourceReliabilitySpecificationImpl communicationLinkResourceReliabilitySpecification = new CommunicationLinkResourceReliabilitySpecificationImpl();
		return communicationLinkResourceReliabilitySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesPackage getResourcesPackage() {
		return (ResourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesPackage getPackage() {
		return ResourcesPackage.eINSTANCE;
	}

} //ResourcesFactoryImpl
