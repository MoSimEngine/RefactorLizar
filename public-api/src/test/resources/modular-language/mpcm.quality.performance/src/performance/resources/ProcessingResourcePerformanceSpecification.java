/**
 */
package performance.resources;

import org.eclipse.emf.ecore.EObject;

import resources.ProcessingResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.ProcessingResourcePerformanceSpecification#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.ProcessingResourcePerformanceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}</li>
 * </ul>
 *
 * @see performance.resources.ResourcesPackage#getProcessingResourcePerformanceSpecification()
 * @model
 * @generated
 */
public interface ProcessingResourcePerformanceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ProcessingResourceSpecification)
	 * @see performance.resources.ResourcesPackage#getProcessingResourcePerformanceSpecification_Owner()
	 * @model required="true"
	 * @generated
	 */
	ProcessingResourceSpecification getOwner();

	/**
	 * Sets the value of the '{@link performance.resources.ProcessingResourcePerformanceSpecification#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessingResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Rate Processing Resource Specification</em>' containment reference.
	 * @see #setProcessingRate_ProcessingResourceSpecification(PCMRandomVariable)
	 * @see performance.resources.ResourcesPackage#getProcessingResourcePerformanceSpecification_ProcessingRate_ProcessingResourceSpecification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getProcessingRate_ProcessingResourceSpecification();

	/**
	 * Sets the value of the '{@link performance.resources.ProcessingResourcePerformanceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Rate Processing Resource Specification</em>' containment reference.
	 * @see #getProcessingRate_ProcessingResourceSpecification()
	 * @generated
	 */
	void setProcessingRate_ProcessingResourceSpecification(PCMRandomVariable value);

} // ProcessingResourcePerformanceSpecification
