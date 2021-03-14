/**
 */
package reliability.resources;

import org.eclipse.emf.ecore.EObject;

import resources.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Reliability Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTF <em>MTTF</em>}</li>
 *   <li>{@link reliability.resources.ProcessingResourceReliabilitySpecification#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see reliability.resources.ResourcesPackage#getProcessingResourceReliabilitySpecification()
 * @model
 * @generated
 */
public interface ProcessingResourceReliabilitySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Mean Time To Repair (MTTR) of a physical resource is the expected timespan from breakdown of this physical resource to its repair or replacement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTTR</em>' attribute.
	 * @see #setMTTR(double)
	 * @see reliability.resources.ResourcesPackage#getProcessingResourceReliabilitySpecification_MTTR()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getMTTR();

	/**
	 * Sets the value of the '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTR <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTR</em>' attribute.
	 * @see #getMTTR()
	 * @generated
	 */
	void setMTTR(double value);

	/**
	 * Returns the value of the '<em><b>MTTF</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Mean Time To Failure (MTTF) of a physical resource is the expected timespan from the start of its usage until breakdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTTF</em>' attribute.
	 * @see #setMTTF(double)
	 * @see reliability.resources.ResourcesPackage#getProcessingResourceReliabilitySpecification_MTTF()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getMTTF();

	/**
	 * Sets the value of the '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getMTTF <em>MTTF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTF</em>' attribute.
	 * @see #getMTTF()
	 * @generated
	 */
	void setMTTF(double value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ProcessingResourceSpecification)
	 * @see reliability.resources.ResourcesPackage#getProcessingResourceReliabilitySpecification_Owner()
	 * @model required="true"
	 * @generated
	 */
	ProcessingResourceSpecification getOwner();

	/**
	 * Sets the value of the '{@link reliability.resources.ProcessingResourceReliabilitySpecification#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessingResourceSpecification value);

} // ProcessingResourceReliabilitySpecification
