/**
 */
package events.allocation;

import allocation.Deployable;

import events.composition.EventChannel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.allocation.EventChannelAllocation#getEventChannel <em>Event Channel</em>}</li>
 * </ul>
 *
 * @see events.allocation.AllocationPackage#getEventChannelAllocation()
 * @model
 * @generated
 */
public interface EventChannelAllocation extends Deployable {
	/**
	 * Returns the value of the '<em><b>Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel</em>' reference.
	 * @see #setEventChannel(EventChannel)
	 * @see events.allocation.AllocationPackage#getEventChannelAllocation_EventChannel()
	 * @model required="true"
	 * @generated
	 */
	EventChannel getEventChannel();

	/**
	 * Sets the value of the '{@link events.allocation.EventChannelAllocation#getEventChannel <em>Event Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Channel</em>' reference.
	 * @see #getEventChannel()
	 * @generated
	 */
	void setEventChannel(EventChannel value);

} // EventChannelAllocation
