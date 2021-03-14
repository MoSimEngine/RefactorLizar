/**
 */
package reliability.resources.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import reliability.resources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see reliability.resources.ResourcesPackage
 * @generated
 */
public class ResourcesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesSwitch<Adapter> modelSwitch =
		new ResourcesSwitch<Adapter>() {
			@Override
			public Adapter caseReliabilityResourceRoot(ReliabilityResourceRoot object) {
				return createReliabilityResourceRootAdapter();
			}
			@Override
			public Adapter caseProcessingResourceReliabilitySpecification(ProcessingResourceReliabilitySpecification object) {
				return createProcessingResourceReliabilitySpecificationAdapter();
			}
			@Override
			public Adapter caseCommunicationLinkResourceReliabilitySpecification(CommunicationLinkResourceReliabilitySpecification object) {
				return createCommunicationLinkResourceReliabilitySpecificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link reliability.resources.ReliabilityResourceRoot <em>Reliability Resource Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.resources.ReliabilityResourceRoot
	 * @generated
	 */
	public Adapter createReliabilityResourceRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.resources.ProcessingResourceReliabilitySpecification <em>Processing Resource Reliability Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.resources.ProcessingResourceReliabilitySpecification
	 * @generated
	 */
	public Adapter createProcessingResourceReliabilitySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link reliability.resources.CommunicationLinkResourceReliabilitySpecification <em>Communication Link Resource Reliability Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see reliability.resources.CommunicationLinkResourceReliabilitySpecification
	 * @generated
	 */
	public Adapter createCommunicationLinkResourceReliabilitySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResourcesAdapterFactory
