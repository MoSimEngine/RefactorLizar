/**
 */
package softwareusage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OpenWorkload specifies usage intensity with an inter-arrival time (i.e., the time between two
 * user arrivals at the system) as a RandomVariable with an arbitrary probability distribution. It
 * models that an infinite stream of users arrives at a system. The users execute their scenario, and then
 * leave the system. The user population (i.e., the number of users concurrently present in a system) is
 * not fixed in an OpenWorkload.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwareusage.OpenWorkload#getInterArrivalTime_OpenWorkload <em>Inter Arrival Time Open Workload</em>}</li>
 * </ul>
 *
 * @see softwareusage.SoftwareusagePackage#getOpenWorkload()
 * @model
 * @generated
 */
public interface OpenWorkload extends Workload {
	/**
	 * Returns the value of the '<em><b>Inter Arrival Time Open Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Arrival Time Open Workload</em>' containment reference.
	 * @see #setInterArrivalTime_OpenWorkload(PCMRandomVariable)
	 * @see softwareusage.SoftwareusagePackage#getOpenWorkload_InterArrivalTime_OpenWorkload()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getInterArrivalTime_OpenWorkload();

	/**
	 * Sets the value of the '{@link softwareusage.OpenWorkload#getInterArrivalTime_OpenWorkload <em>Inter Arrival Time Open Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Arrival Time Open Workload</em>' containment reference.
	 * @see #getInterArrivalTime_OpenWorkload()
	 * @generated
	 */
	void setInterArrivalTime_OpenWorkload(PCMRandomVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.interArrivalTime_OpenWorkload.oclIsUndefined() and self.interArrivalTime_OpenWorkload.specification &lt;&gt; \'\''"
	 * @generated
	 */
	boolean InterArrivalTimeInOpenWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OpenWorkload
