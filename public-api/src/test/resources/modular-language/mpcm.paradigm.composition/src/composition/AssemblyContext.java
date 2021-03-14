/**
 */
package composition;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import repository.RepositoryComponent;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyContext uniquely identifies an assembly instance of an AssemblyContext.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composition.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}</li>
 *   <li>{@link composition.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}</li>
 *   <li>{@link composition.AssemblyContext#getConfigParameterUsages__AssemblyContext <em>Config Parameter Usages Assembly Context</em>}</li>
 * </ul>
 *
 * @see composition.CompositionPackage#getAssemblyContext()
 * @model
 * @generated
 */
public interface AssemblyContext extends Entity, Containable {
	/**
	 * Returns the value of the '<em><b>Parent Structure Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure Assembly Context</em>' reference.
	 * @see #setParentStructure__AssemblyContext(ComposedStructure)
	 * @see composition.CompositionPackage#getAssemblyContext_ParentStructure__AssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedStructure getParentStructure__AssemblyContext();

	/**
	 * Sets the value of the '{@link composition.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure Assembly Context</em>' reference.
	 * @see #getParentStructure__AssemblyContext()
	 * @generated
	 */
	void setParentStructure__AssemblyContext(ComposedStructure value);

	/**
	 * Returns the value of the '<em><b>Encapsulated Component Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Component Assembly Context</em>' reference.
	 * @see #setEncapsulatedComponent__AssemblyContext(RepositoryComponent)
	 * @see composition.CompositionPackage#getAssemblyContext_EncapsulatedComponent__AssemblyContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RepositoryComponent getEncapsulatedComponent__AssemblyContext();

	/**
	 * Sets the value of the '{@link composition.AssemblyContext#getEncapsulatedComponent__AssemblyContext <em>Encapsulated Component Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Component Assembly Context</em>' reference.
	 * @see #getEncapsulatedComponent__AssemblyContext()
	 * @generated
	 */
	void setEncapsulatedComponent__AssemblyContext(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list.
	 * The list contents are of type {@link variables.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Parameter Usages Assembly Context</em>' containment reference list.
	 * @see composition.CompositionPackage#getAssemblyContext_ConfigParameterUsages__AssemblyContext()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getConfigParameterUsages__AssemblyContext();

} // AssemblyContext
