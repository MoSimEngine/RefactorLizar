/**
 */
package performanceannotations;

import annotations.ServicePropertyAnnotation;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Specifies an execution time
 *     in&nbsp;terms&nbsp;of&nbsp;a&nbsp;PCMRandomVariable&nbsp;which&nbsp;may&nbsp;depend&nbsp;on&nbsp;component&nbsp;or&nbsp;input&nbsp;parameters&nbsp;of&nbsp;the
 *     referenced&nbsp;service.
 * </p>
 * <p>
 *     Notes:
 * </p>
 * <p>
 *     -&nbsp;Is&nbsp;it&nbsp;correct&nbsp;that&nbsp;the&nbsp;PCMRandomvariable&nbsp;can&nbsp;depend&nbsp;on&nbsp;parameters?<br />
 *     -&nbsp;How&nbsp;is&nbsp;the&nbsp;relation&nbsp;of&nbsp;the&nbsp;specified&nbsp;QoS&nbsp;to&nbsp;the&nbsp;input&nbsp;parameters&nbsp;established?<br />
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performanceannotations.ServiceExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}</li>
 * </ul>
 *
 * @see performanceannotations.PerformanceannotationsPackage#getServiceExecutionTime()
 * @model abstract="true"
 * @generated
 */
public interface ServiceExecutionTime extends ServicePropertyAnnotation {
	/**
	 * Returns the value of the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Specified Execution Time</em>' containment reference.
	 * @see #setSpecification_SpecifiedExecutionTime(PCMRandomVariable)
	 * @see performanceannotations.PerformanceannotationsPackage#getServiceExecutionTime_Specification_SpecifiedExecutionTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getSpecification_SpecifiedExecutionTime();

	/**
	 * Sets the value of the '{@link performanceannotations.ServiceExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Specified Execution Time</em>' containment reference.
	 * @see #getSpecification_SpecifiedExecutionTime()
	 * @generated
	 */
	void setSpecification_SpecifiedExecutionTime(PCMRandomVariable value);

} // ServiceExecutionTime
