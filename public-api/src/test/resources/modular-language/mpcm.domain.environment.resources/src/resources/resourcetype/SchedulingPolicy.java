/**
 */
package resources.resourcetype;

import base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}</li>
 * </ul>
 *
 * @see resources.resourcetype.ResourcetypePackage#getSchedulingPolicy()
 * @model
 * @generated
 */
public interface SchedulingPolicy extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Repository Scheduling Policy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resources.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
	 * @see #setResourceRepository__SchedulingPolicy(ResourceRepository)
	 * @see resources.resourcetype.ResourcetypePackage#getSchedulingPolicy_ResourceRepository__SchedulingPolicy()
	 * @see resources.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository
	 * @model opposite="schedulingPolicies__ResourceRepository" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceRepository getResourceRepository__SchedulingPolicy();

	/**
	 * Sets the value of the '{@link resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Repository Scheduling Policy</em>' container reference.
	 * @see #getResourceRepository__SchedulingPolicy()
	 * @generated
	 */
	void setResourceRepository__SchedulingPolicy(ResourceRepository value);

} // SchedulingPolicy
