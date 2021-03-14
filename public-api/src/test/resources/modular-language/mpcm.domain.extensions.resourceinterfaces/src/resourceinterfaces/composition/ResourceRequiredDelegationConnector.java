/**
 */
package resourceinterfaces.composition;

import composition.ComposedStructure;

import org.eclipse.emf.ecore.EObject;

import resourceinterfaces.repository.ResourceRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO Michael Hauck
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}</li>
 *   <li>{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.composition.CompositionPackage#getResourceRequiredDelegationConnector()
 * @model
 * @generated
 */
public interface ResourceRequiredDelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Inner Resource Required Role Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Resource Required Role Resource Required Delegation Connector</em>' reference.
	 * @see #setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole)
	 * @see resourceinterfaces.composition.CompositionPackage#getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceRequiredRole getInnerResourceRequiredRole_ResourceRequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getInnerResourceRequiredRole_ResourceRequiredDelegationConnector <em>Inner Resource Required Role Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Resource Required Role Resource Required Delegation Connector</em>' reference.
	 * @see #getInnerResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @generated
	 */
	void setInnerResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Outer Resource Required Role Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Resource Required Role Resource Required Delegation Connector</em>' reference.
	 * @see #setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole)
	 * @see resourceinterfaces.composition.CompositionPackage#getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceRequiredRole getOuterResourceRequiredRole_ResourceRequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getOuterResourceRequiredRole_ResourceRequiredDelegationConnector <em>Outer Resource Required Role Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Resource Required Role Resource Required Delegation Connector</em>' reference.
	 * @see #getOuterResourceRequiredRole_ResourceRequiredDelegationConnector()
	 * @generated
	 */
	void setOuterResourceRequiredRole_ResourceRequiredDelegationConnector(ResourceRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Parent Structure Resource Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure Resource Required Delegation Connector</em>' reference.
	 * @see #setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure)
	 * @see resourceinterfaces.composition.CompositionPackage#getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedStructure getParentStructure_ResourceRequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link resourceinterfaces.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure Resource Required Delegation Connector</em>' reference.
	 * @see #getParentStructure_ResourceRequiredDelegationConnector()
	 * @generated
	 */
	void setParentStructure_ResourceRequiredDelegationConnector(ComposedStructure value);

} // ResourceRequiredDelegationConnector
