/**
 */
package softwareusage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClosedWorkload specifies directly the (constant) user population and a think time. It models
 * that a fixed number of users execute their scenario, then wait (or think) for the specified amount
 * of think time as a RandomVariable, and then reenter the system executing their scenario again.
 * Performance analysts use closed workloads to model scenarios, where the number of users is known
 * (e.g., a fixed number of users in a company).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwareusage.ClosedWorkload#getPopulation <em>Population</em>}</li>
 *   <li>{@link softwareusage.ClosedWorkload#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}</li>
 * </ul>
 *
 * @see softwareusage.SoftwareusagePackage#getClosedWorkload()
 * @model
 * @generated
 */
public interface ClosedWorkload extends Workload {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see softwareusage.SoftwareusagePackage#getClosedWorkload_Population()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link softwareusage.ClosedWorkload#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Think Time Closed Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time Closed Workload</em>' containment reference.
	 * @see #setThinkTime_ClosedWorkload(PCMRandomVariable)
	 * @see softwareusage.SoftwareusagePackage#getClosedWorkload_ThinkTime_ClosedWorkload()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getThinkTime_ClosedWorkload();

	/**
	 * Sets the value of the '{@link softwareusage.ClosedWorkload#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time Closed Workload</em>' containment reference.
	 * @see #getThinkTime_ClosedWorkload()
	 * @generated
	 */
	void setThinkTime_ClosedWorkload(PCMRandomVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.population.oclIsUndefined() and self.population &lt;&gt; \'\''"
	 * @generated
	 */
	boolean PopulationInClosedWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.thinkTime_ClosedWorkload.oclIsUndefined() and self.thinkTime_ClosedWorkload.specification &lt;&gt; \'\''"
	 * @generated
	 */
	boolean ThinkTimeInClosedWorkloadNeedsToBeSpecified(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ClosedWorkload
