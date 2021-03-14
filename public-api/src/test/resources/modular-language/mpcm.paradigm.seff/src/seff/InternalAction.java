/**
 */
package seff;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Internal Action Combines the execution of a number of internal computations by a component service in a single model entity. It models calculations inside a component service, which do not include calls to required services. For a desired high abstraction level, an RDSEFF has only one InternalAction for all instructions between two calls to required services. A high abstraction level is needed to keep the model tractable for mathematical analysis methods. However, in principle it is also possible to use multiple InternalActions in direct succession to model on a lower abstraction level and enable more accurate predictions.
 * InternalActions provide an abstraction from the complete behaviour (i.e., control and data flow) of a component service, as they can hide different possible control and data flows not affecting external service calls and express their resource demands as a single stochastic expression. This abstraction underlies the assumption that the resource demands of a number of instruction can be captured sufficiently accurate enough in one such expression
 * <!-- end-model-doc -->
 *
 *
 * @see seff.SeffPackage#getInternalAction()
 * @model
 * @generated
 */
public interface InternalAction extends AbstractInternalControlFlowAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.internalFailureOccurrenceDescriptions__InternalAction-&gt;forAll(x:mpcm::reliability::InternalFailureOccurrenceDescription,y:mpcm::reliability::InternalFailureOccurrenceDescription  | x&lt;&gt;y implies x.softwareInducedFailureType__InternalFailureOccurrenceDescription &lt;&gt; y.softwareInducedFailureType__InternalFailureOccurrenceDescription )\r\n'"
	 * @generated
	 */
	boolean MultipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.internalFailureOccurrenceDescriptions__InternalAction.failureProbability.oclAsType(Real)-&gt;sum()&lt;=1.0\r\n'"
	 * @generated
	 */
	boolean SumOfInternalActionFailureProbabilitiesMustNotExceed1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InternalAction
