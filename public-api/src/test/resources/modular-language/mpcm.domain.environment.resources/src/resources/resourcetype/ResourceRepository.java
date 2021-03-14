/**
 */
package resources.resourcetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extendable repository of resource types of the PCM. The resource type repository is intentionally left open to support
 * arbitrary resources in the future
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}</li>
 *   <li>{@link resources.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 *
 * @see resources.resourcetype.ResourcetypePackage#getResourceRepository()
 * @model
 * @generated
 */
public interface ResourceRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Policies Resource Repository</b></em>' containment reference list.
	 * The list contents are of type {@link resources.resourcetype.SchedulingPolicy}.
	 * It is bidirectional and its opposite is '{@link resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policies Resource Repository</em>' containment reference list.
	 * @see resources.resourcetype.ResourcetypePackage#getResourceRepository_SchedulingPolicies__ResourceRepository()
	 * @see resources.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy
	 * @model opposite="resourceRepository__SchedulingPolicy" containment="true" ordered="false"
	 * @generated
	 */
	EList<SchedulingPolicy> getSchedulingPolicies__ResourceRepository();

	/**
	 * Returns the value of the '<em><b>Available Resource Types Resource Repository</b></em>' containment reference list.
	 * The list contents are of type {@link resources.resourcetype.ResourceType}.
	 * It is bidirectional and its opposite is '{@link resources.resourcetype.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Resource Types Resource Repository</em>' containment reference list.
	 * @see resources.resourcetype.ResourcetypePackage#getResourceRepository_AvailableResourceTypes_ResourceRepository()
	 * @see resources.resourcetype.ResourceType#getResourceRepository_ResourceType
	 * @model opposite="resourceRepository_ResourceType" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceType> getAvailableResourceTypes_ResourceRepository();

} // ResourceRepository
