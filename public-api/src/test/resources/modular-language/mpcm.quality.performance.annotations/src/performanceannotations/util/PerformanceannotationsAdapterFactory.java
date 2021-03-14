/**
 */
package performanceannotations.util;

import annotations.ServicePropertyAnnotation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import performanceannotations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see performanceannotations.PerformanceannotationsPackage
 * @generated
 */
public class PerformanceannotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformanceannotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceannotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PerformanceannotationsPackage.eINSTANCE;
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
	protected PerformanceannotationsSwitch<Adapter> modelSwitch =
		new PerformanceannotationsSwitch<Adapter>() {
			@Override
			public Adapter caseServiceExecutionTime(ServiceExecutionTime object) {
				return createServiceExecutionTimeAdapter();
			}
			@Override
			public Adapter caseSystemServiceExecutionTime(SystemServiceExecutionTime object) {
				return createSystemServiceExecutionTimeAdapter();
			}
			@Override
			public Adapter caseComponentServiceExecutionTime(ComponentServiceExecutionTime object) {
				return createComponentServiceExecutionTimeAdapter();
			}
			@Override
			public Adapter caseServicePropertyAnnotation(ServicePropertyAnnotation object) {
				return createServicePropertyAnnotationAdapter();
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
	 * Creates a new adapter for an object of class '{@link performanceannotations.ServiceExecutionTime <em>Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see performanceannotations.ServiceExecutionTime
	 * @generated
	 */
	public Adapter createServiceExecutionTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link performanceannotations.SystemServiceExecutionTime <em>System Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see performanceannotations.SystemServiceExecutionTime
	 * @generated
	 */
	public Adapter createSystemServiceExecutionTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link performanceannotations.ComponentServiceExecutionTime <em>Component Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see performanceannotations.ComponentServiceExecutionTime
	 * @generated
	 */
	public Adapter createComponentServiceExecutionTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link annotations.ServicePropertyAnnotation <em>Service Property Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see annotations.ServicePropertyAnnotation
	 * @generated
	 */
	public Adapter createServicePropertyAnnotationAdapter() {
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

} //PerformanceannotationsAdapterFactory
