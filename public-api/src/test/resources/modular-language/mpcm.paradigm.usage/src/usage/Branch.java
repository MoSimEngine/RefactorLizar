/**
 */
package usage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Branch splits the user flow with a XOR-semantic: one of the included BranchTransitions
 * is taken depending on the specified branch probabilities. Each BranchTransition contains a
 * nested ScenarioBehaviour, which a user executes once this branch transition is chosen. After
 * execution of the complete nested ScenarioBehaviour, the next action in the user flow after the
 * Branch is its successor action.
 * 
 * A constraint ensures that all branchProbabilities of the included BranchTransitions sum up to 1. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usage.Branch#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}</li>
 * </ul>
 *
 * @see usage.UsagePackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Branch Transitions Branch</b></em>' containment reference list.
	 * The list contents are of type {@link usage.BranchTransition}.
	 * It is bidirectional and its opposite is '{@link usage.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Transitions Branch</em>' containment reference list.
	 * @see usage.UsagePackage#getBranch_BranchTransitions_Branch()
	 * @see usage.BranchTransition#getBranch_BranchTransition
	 * @model opposite="branch_BranchTransition" containment="true" ordered="false"
	 * @generated
	 */
	EList<BranchTransition> getBranchTransitions_Branch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self-&gt;collect(branchTransitions_Branch.branchProbability)-&gt;sum() &gt; 0.999 and self-&gt;collect(branchTransitions_Branch.branchProbability)-&gt;sum() &lt;1.001'"
	 * @generated
	 */
	boolean AllBranchProbabilitiesMustSumUpTo1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Branch
