/**
 */
package performance.resources;

import org.eclipse.emf.ecore.EObject;

import resources.HDDProcessingResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.HDDResourcePerformanceSpecification#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.HDDResourcePerformanceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}</li>
 *   <li>{@link performance.resources.HDDResourcePerformanceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}</li>
 * </ul>
 *
 * @see performance.resources.ResourcesPackage#getHDDResourcePerformanceSpecification()
 * @model
 * @generated
 */
public interface HDDResourcePerformanceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(HDDProcessingResourceSpecification)
	 * @see performance.resources.ResourcesPackage#getHDDResourcePerformanceSpecification_Owner()
	 * @model required="true"
	 * @generated
	 */
	HDDProcessingResourceSpecification getOwner();

	/**
	 * Sets the value of the '{@link performance.resources.HDDResourcePerformanceSpecification#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(HDDProcessingResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Write Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Processing Rate</em>' containment reference.
	 * @see #setWriteProcessingRate(PCMRandomVariable)
	 * @see performance.resources.ResourcesPackage#getHDDResourcePerformanceSpecification_WriteProcessingRate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getWriteProcessingRate();

	/**
	 * Sets the value of the '{@link performance.resources.HDDResourcePerformanceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Processing Rate</em>' containment reference.
	 * @see #getWriteProcessingRate()
	 * @generated
	 */
	void setWriteProcessingRate(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Read Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Processing Rate</em>' containment reference.
	 * @see #setReadProcessingRate(PCMRandomVariable)
	 * @see performance.resources.ResourcesPackage#getHDDResourcePerformanceSpecification_ReadProcessingRate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getReadProcessingRate();

	/**
	 * Sets the value of the '{@link performance.resources.HDDResourcePerformanceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Processing Rate</em>' containment reference.
	 * @see #getReadProcessingRate()
	 * @generated
	 */
	void setReadProcessingRate(PCMRandomVariable value);

} // HDDResourcePerformanceSpecification
