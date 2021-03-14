/**
 */
package composition;

import base.Entity;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO/FIXME: The distinction between ComposedStructure and ComposedProvidingRequiringStructure does not make sense at the moment, because the ComposedStructure already talks about inner provided / required delegation connectors, which only make sense if there are outer roles for interfaces -> ComposedProvidingRequiringStructure. IDEA: Move the delegation connector attributes to ComposedProvidingRequiringStructure. I'm not sure about the assembly connectors. SEE ALSO: ComposedProvidingRequiringStructure 
 * However, as AssemblyContexts of ComposedStructure always contain InterfaceProvidingRequiringEntities at the moment, the above might not help... -- Anne
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composition.ComposedStructure#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see composition.CompositionPackage#getComposedStructure()
 * @model abstract="true"
 * @generated
 */
public interface ComposedStructure extends Entity {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link composition.Containable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see composition.CompositionPackage#getComposedStructure_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Containable> getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(mpcm::core::composition::ProvidedDelegationConnector)).oclAsType(mpcm::core::composition::ProvidedDelegationConnector)-&gt;forAll( c1, c2 | c1 &lt;&gt; c2 implies c1.outerProvidedRole_ProvidedDelegationConnector &lt;&gt; c2.outerProvidedRole_ProvidedDelegationConnector)\r\n'"
	 * @generated
	 */
	boolean MultipleConnectorsConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(mpcm::core::composition::AssemblyConnector)).oclAsType(AssemblyConnector)-&gt;forAll( c1, c2 | ( (c1 &lt;&gt; c2) and ( c1.requiringAssemblyContext_AssemblyConnector = c2.requiringAssemblyContext_AssemblyConnector ) ) implies c1.requiredRole_AssemblyConnector &lt;&gt; c2.requiredRole_AssemblyConnector )\r\n'"
	 * @generated
	 */
	boolean MultipleConnectorsConstraintForAssemblyConnectors(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComposedStructure
