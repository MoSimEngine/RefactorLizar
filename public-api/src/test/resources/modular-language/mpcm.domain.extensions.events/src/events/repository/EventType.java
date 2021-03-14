/**
 */
package events.repository;

import repository.Parameter;
import repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EventType represents a single class of events that can be emited by a source or consumed by a sink. The characteristics of the event are defined by the variable included in the EventType.
 * Due to the extension of the signature class, the EventType is also accessible for ServiceEffectSpecifications (SEFF). By this, a SEFF is able to represent an event handler for this type of events.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.repository.EventType#getParameter__EventType <em>Parameter Event Type</em>}</li>
 *   <li>{@link events.repository.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}</li>
 * </ul>
 *
 * @see events.repository.RepositoryPackage#getEventType()
 * @model
 * @generated
 */
public interface EventType extends Signature {
	/**
	 * Returns the value of the '<em><b>Parameter Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Event Type</em>' containment reference.
	 * @see #setParameter__EventType(Parameter)
	 * @see events.repository.RepositoryPackage#getEventType_Parameter__EventType()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter__EventType();

	/**
	 * Sets the value of the '{@link events.repository.EventType#getParameter__EventType <em>Parameter Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Event Type</em>' containment reference.
	 * @see #getParameter__EventType()
	 * @generated
	 */
	void setParameter__EventType(Parameter value);

	/**
	 * Returns the value of the '<em><b>Event Group Event Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link events.repository.EventGroup#getEventTypes__EventGroup <em>Event Types Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Group Event Type</em>' container reference.
	 * @see #setEventGroup__EventType(EventGroup)
	 * @see events.repository.RepositoryPackage#getEventType_EventGroup__EventType()
	 * @see events.repository.EventGroup#getEventTypes__EventGroup
	 * @model opposite="eventTypes__EventGroup" required="true" transient="false" ordered="false"
	 * @generated
	 */
	EventGroup getEventGroup__EventType();

	/**
	 * Sets the value of the '{@link events.repository.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Group Event Type</em>' container reference.
	 * @see #getEventGroup__EventType()
	 * @generated
	 */
	void setEventGroup__EventType(EventGroup value);

} // EventType
