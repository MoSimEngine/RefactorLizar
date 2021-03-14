/**
 */
package resources;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

import resources.resourcetype.ProcessingResourceType;
import resources.resourcetype.SchedulingPolicy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Performance specification of processing resources (e.g. processing rate, scheduling policy)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.ProcessingResourceSpecification#isRequiredByContainer <em>Required By Container</em>}</li>
 *   <li>{@link resources.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link resources.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}</li>
 *   <li>{@link resources.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}</li>
 *   <li>{@link resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getProcessingResourceSpecification()
 * @model
 * @generated
 */
public interface ProcessingResourceSpecification extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     This attribute controls the handling of the resource&nbsp;by the&nbsp;reliability prediction.
	 * </p>
	 * <p>
	 *     If set to TRUE, the unavailability of the resource automatically leads to the unavailability of the surrounding
	 *     resource container. Every attempt to execute a SEFF on an unavailable resource container leads to a corresponding
	 *     resource failure.
	 * </p>
	 * <p>
	 *     If set to FALSE, the unavailability of the resource does not make the container unavailable. An attempt to execute a
	 *     SEFF on a container with an unavailable resource leads to a resource failure ONLY IF the SEFF contains an
	 *     InternalAction that accesses&nbsp;the resource.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required By Container</em>' attribute.
	 * @see #setRequiredByContainer(boolean)
	 * @see resources.ResourcesPackage#getProcessingResourceSpecification_RequiredByContainer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isRequiredByContainer();

	/**
	 * Sets the value of the '{@link resources.ProcessingResourceSpecification#isRequiredByContainer <em>Required By Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required By Container</em>' attribute.
	 * @see #isRequiredByContainer()
	 * @generated
	 */
	void setRequiredByContainer(boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' reference.
	 * @see #setSchedulingPolicy(SchedulingPolicy)
	 * @see resources.ResourcesPackage#getProcessingResourceSpecification_SchedulingPolicy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SchedulingPolicy getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link resources.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' reference.
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicy value);

	/**
	 * Returns the value of the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType)
	 * @see resources.ResourcesPackage#getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getActiveResourceType_ActiveResourceSpecification();

	/**
	 * Sets the value of the '{@link resources.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Resource Type Active Resource Specification</em>' reference.
	 * @see #getActiveResourceType_ActiveResourceSpecification()
	 * @generated
	 */
	void setActiveResourceType_ActiveResourceSpecification(ProcessingResourceType value);

	/**
	 * Returns the value of the '<em><b>Number Of Replicas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     Specifies the actual number of processors of the processing resource.
	 * </p>
	 * <p>
	 *     In terms of the queueing theory, the number of processors corresponds to the number of servers&nbsp;of a service
	 *     center. Thus, the attribute allows to specify a&nbsp;multi-server queue, i.e., one queue with multiple servers.<br />
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #setNumberOfReplicas(int)
	 * @see resources.ResourcesPackage#getProcessingResourceSpecification_NumberOfReplicas()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfReplicas();

	/**
	 * Sets the value of the '{@link resources.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #getNumberOfReplicas()
	 * @generated
	 */
	void setNumberOfReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resources.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Processing Resource Specification</em>' container reference.
	 * @see #setResourceContainer_ProcessingResourceSpecification(ResourceContainer)
	 * @see resources.ResourcesPackage#getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification()
	 * @see resources.ResourceContainer#getActiveResourceSpecifications_ResourceContainer
	 * @model opposite="activeResourceSpecifications_ResourceContainer" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceContainer getResourceContainer_ProcessingResourceSpecification();

	/**
	 * Sets the value of the '{@link resources.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Processing Resource Specification</em>' container reference.
	 * @see #getResourceContainer_ProcessingResourceSpecification()
	 * @generated
	 */
	void setResourceContainer_ProcessingResourceSpecification(ResourceContainer value);

} // ProcessingResourceSpecification
