/**
 */
package allocation;

import base.Entity;

import environment.Environment;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The allocation repository holding all available allocation contexts of a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link allocation.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}</li>
 *   <li>{@link allocation.Allocation#getSystem_Allocation <em>System Allocation</em>}</li>
 *   <li>{@link allocation.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}</li>
 * </ul>
 *
 * @see allocation.AllocationPackage#getAllocation()
 * @model
 * @generated
 */
public interface Allocation extends Entity {
	/**
	 * Returns the value of the '<em><b>Target Resource Environment Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Resource Environment Allocation</em>' reference.
	 * @see #setTargetResourceEnvironment_Allocation(Environment)
	 * @see allocation.AllocationPackage#getAllocation_TargetResourceEnvironment_Allocation()
	 * @model ordered="false"
	 * @generated
	 */
	Environment getTargetResourceEnvironment_Allocation();

	/**
	 * Sets the value of the '{@link allocation.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Resource Environment Allocation</em>' reference.
	 * @see #getTargetResourceEnvironment_Allocation()
	 * @generated
	 */
	void setTargetResourceEnvironment_Allocation(Environment value);

	/**
	 * Returns the value of the '<em><b>System Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Allocation</em>' reference.
	 * @see #setSystem_Allocation(softwarecomposition.System)
	 * @see allocation.AllocationPackage#getAllocation_System_Allocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	softwarecomposition.System getSystem_Allocation();

	/**
	 * Sets the value of the '{@link allocation.Allocation#getSystem_Allocation <em>System Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Allocation</em>' reference.
	 * @see #getSystem_Allocation()
	 * @generated
	 */
	void setSystem_Allocation(softwarecomposition.System value);

	/**
	 * Returns the value of the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link allocation.AllocationContext}.
	 * It is bidirectional and its opposite is '{@link allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts Allocation</em>' containment reference list.
	 * @see allocation.AllocationPackage#getAllocation_AllocationContexts_Allocation()
	 * @see allocation.AllocationContext#getAllocation_AllocationContext
	 * @model opposite="allocation_AllocationContext" containment="true" ordered="false"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts_Allocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each Assembly of BasicComponents and CompositeComponents used in the referenced System must be allocated. 
	 * 
	 * Things are complicated by the introduction of SubSystems. Here, the Assembly of the SubSystem itself does not have to be allocated. If it is not allocated, all BasicComponents and CompositeComponents contained in this SubSystem (also transitively over several nested and not-allocated SubSystems) need to be allocated. 
	 * 
	 * The constraint is realised wth a closure over the AssemblyContext contained in a ComposedStructure. 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- Get all AssemblyContexts used by this system, that is \r\n-- 1) the AssemblyContexts directly used in the system and \r\nself.system_Allocation.assemblyContexts__ComposedStructure\r\n-- 2) the AssemblyContexts used by SubSystems in the System. Note that if a SubSystem also contains other Subsystems,\r\n-- we need to get those AssemblyContexts too: Thus, we use a closure here\r\n-&gt;union(self.system_Allocation.assemblyContexts__ComposedStructure-&gt;closure(\r\nencapsulatedComponent__AssemblyContext-&gt;select(composites|composites.oclIsTypeOf(mpcm::subsystem::SubSystem)).oclAsType(mpcm::subsystem::SubSystem)\r\n.assemblyContexts__ComposedStructure))\r\n--Now, after we collected all AssemblyContexts somehow used, we check whether they need to be allocated \r\n--and if yes, if they are allocated.\r\n-&gt;forAll(assemblyCtx|\r\n--AssemblyContexts that contain SubSystems do not need to be allocated\r\nassemblyCtx.encapsulatedComponent__AssemblyContext.oclIsTypeOf(mpcm::subsystem::SubSystem) or\r\n--All others need to be allocated. \r\nself.allocationContexts_Allocation-&gt;select(allocationCtx|\r\nallocationCtx.assemblyContext_AllocationContext = assemblyCtx)-&gt;size() = 1)'"
	 * @generated
	 */
	boolean EachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.allocationContexts_Allocation-&gt;forAll(a | self.allocationContexts_Allocation-&gt;forAll(b | \r\n    --- if a and b are not on the same server\r\n    (a.resourceContainer_AllocationContext &lt;&gt; b.resourceContainer_AllocationContext \r\n    and\r\n    --  and if the assembly contexts of a and b are connected\r\n      self.system_Allocation.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(mpcm::core::composition::AssemblyConnector)).oclAsType(mpcm::core::composition::AssemblyConnector)-&gt;exists(conn | \r\n         (conn.providingAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext )\r\n         or \r\n          (conn.providingAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext )\r\n       )\r\n     )\r\n     -- then the servers have to be connected by a linking resource\r\n     implies \r\n     self.targetResourceEnvironment_Allocation.linkingResources__ResourceEnvironment-&gt;exists(l | \r\n        -- l connects the two\r\n        l.connectedResourceContainers_LinkingResource-&gt;includes(a.resourceContainer_AllocationContext)\r\n        and \r\n        l.connectedResourceContainers_LinkingResource-&gt;includes(b.resourceContainer_AllocationContext)\r\n     )\r\n  ))'"
	 * @generated
	 */
	boolean CommunicatingServersHaveToBeConnectedByLinkingResource(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Allocation
