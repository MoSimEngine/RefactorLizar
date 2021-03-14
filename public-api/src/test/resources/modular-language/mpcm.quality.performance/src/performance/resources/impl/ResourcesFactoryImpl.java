/**
 */
package performance.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import performance.resources.*;

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
			case ResourcesPackage.PERFORMANCE_RESOURCES_ROOT: return createPerformanceResourcesRoot();
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION: return createProcessingResourcePerformanceSpecification();
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION: return createCommunicationLinkResourcePerformanceSpecification();
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION: return createHDDResourcePerformanceSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceResourcesRoot createPerformanceResourcesRoot() {
		PerformanceResourcesRootImpl performanceResourcesRoot = new PerformanceResourcesRootImpl();
		return performanceResourcesRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourcePerformanceSpecification createProcessingResourcePerformanceSpecification() {
		ProcessingResourcePerformanceSpecificationImpl processingResourcePerformanceSpecification = new ProcessingResourcePerformanceSpecificationImpl();
		return processingResourcePerformanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourcePerformanceSpecification createCommunicationLinkResourcePerformanceSpecification() {
		CommunicationLinkResourcePerformanceSpecificationImpl communicationLinkResourcePerformanceSpecification = new CommunicationLinkResourcePerformanceSpecificationImpl();
		return communicationLinkResourcePerformanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDResourcePerformanceSpecification createHDDResourcePerformanceSpecification() {
		HDDResourcePerformanceSpecificationImpl hddResourcePerformanceSpecification = new HDDResourcePerformanceSpecificationImpl();
		return hddResourcePerformanceSpecification;
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
