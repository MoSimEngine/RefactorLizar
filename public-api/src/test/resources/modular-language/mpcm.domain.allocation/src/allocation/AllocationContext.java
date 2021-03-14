/**
 */
package allocation;

import base.Entity;

import composition.AssemblyContext;

import environment.Container;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping between AssemblyContext and Resource. Sometimes referred to as "Deployment".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link allocation.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}</li>
 *   <li>{@link allocation.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}</li>
 *   <li>{@link allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}</li>
 *   <li>{@link allocation.AllocationContext#getDeployables <em>Deployables</em>}</li>
 * </ul>
 *
 * @see allocation.AllocationPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Container Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Allocation Context</em>' reference.
	 * @see #setResourceContainer_AllocationContext(Container)
	 * @see allocation.AllocationPackage#getAllocationContext_ResourceContainer_AllocationContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Container getResourceContainer_AllocationContext();

	/**
	 * Sets the value of the '{@link allocation.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Allocation Context</em>' reference.
	 * @see #getResourceContainer_AllocationContext()
	 * @generated
	 */
	void setResourceContainer_AllocationContext(Container value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Allocation Context</em>' reference.
	 * @see #setAssemblyContext_AllocationContext(AssemblyContext)
	 * @see allocation.AllocationPackage#getAllocationContext_AssemblyContext_AllocationContext()
	 * @model ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_AllocationContext();

	/**
	 * Sets the value of the '{@link allocation.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Allocation Context</em>' reference.
	 * @see #getAssemblyContext_AllocationContext()
	 * @generated
	 */
	void setAssemblyContext_AllocationContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Allocation Allocation Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link allocation.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Allocation Context</em>' container reference.
	 * @see #setAllocation_AllocationContext(Allocation)
	 * @see allocation.AllocationPackage#getAllocationContext_Allocation_AllocationContext()
	 * @see allocation.Allocation#getAllocationContexts_Allocation
	 * @model opposite="allocationContexts_Allocation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Allocation getAllocation_AllocationContext();

	/**
	 * Sets the value of the '{@link allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Allocation Context</em>' container reference.
	 * @see #getAllocation_AllocationContext()
	 * @generated
	 */
	void setAllocation_AllocationContext(Allocation value);

	/**
	 * Returns the value of the '<em><b>Deployables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployables</em>' reference.
	 * @see #setDeployables(Deployable)
	 * @see allocation.AllocationPackage#getAllocationContext_Deployables()
	 * @model ordered="false"
	 * @generated
	 */
	Deployable getDeployables();

	/**
	 * Sets the value of the '{@link allocation.AllocationContext#getDeployables <em>Deployables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployables</em>' reference.
	 * @see #getDeployables()
	 * @generated
	 */
	void setDeployables(Deployable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not(self.assemblyContext_AllocationContext.oclIsUndefined()) xor not(self.eventChannel__AllocationContext.oclIsUndefined())'"
	 * @generated
	 */
	boolean OneAssemblyContextOrOneEventChannelShouldBeReferred(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AllocationContext
