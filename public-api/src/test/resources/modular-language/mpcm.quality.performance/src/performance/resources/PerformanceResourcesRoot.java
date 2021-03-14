/**
 */
package performance.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Resources Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.PerformanceResourcesRoot#getProcessingResourcePerformanceSpecifications <em>Processing Resource Performance Specifications</em>}</li>
 *   <li>{@link performance.resources.PerformanceResourcesRoot#getCommunicationLinkResourcePerformanceSpecifications <em>Communication Link Resource Performance Specifications</em>}</li>
 *   <li>{@link performance.resources.PerformanceResourcesRoot#getHddResourcePerformanceSpecification <em>Hdd Resource Performance Specification</em>}</li>
 * </ul>
 *
 * @see performance.resources.ResourcesPackage#getPerformanceResourcesRoot()
 * @model
 * @generated
 */
public interface PerformanceResourcesRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Resource Performance Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link performance.resources.ProcessingResourcePerformanceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Performance Specifications</em>' containment reference list.
	 * @see performance.resources.ResourcesPackage#getPerformanceResourcesRoot_ProcessingResourcePerformanceSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingResourcePerformanceSpecification> getProcessingResourcePerformanceSpecifications();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Performance Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link performance.resources.CommunicationLinkResourcePerformanceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Performance Specifications</em>' containment reference list.
	 * @see performance.resources.ResourcesPackage#getPerformanceResourcesRoot_CommunicationLinkResourcePerformanceSpecifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLinkResourcePerformanceSpecification> getCommunicationLinkResourcePerformanceSpecifications();

	/**
	 * Returns the value of the '<em><b>Hdd Resource Performance Specification</b></em>' containment reference list.
	 * The list contents are of type {@link performance.resources.HDDResourcePerformanceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdd Resource Performance Specification</em>' containment reference list.
	 * @see performance.resources.ResourcesPackage#getPerformanceResourcesRoot_HddResourcePerformanceSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<HDDResourcePerformanceSpecification> getHddResourcePerformanceSpecification();

} // PerformanceResourcesRoot
