/**
 */
package events.repository;

import org.eclipse.emf.common.util.EList;

import repository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EventGroup combines a set of EventTypes that are supported by a Sink and/or a Source. This is comparable to an operation interface combining a set of operation signatures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.repository.EventGroup#getEventTypes__EventGroup <em>Event Types Event Group</em>}</li>
 * </ul>
 *
 * @see events.repository.RepositoryPackage#getEventGroup()
 * @model
 * @generated
 */
public interface EventGroup extends Interface {
	/**
	 * Returns the value of the '<em><b>Event Types Event Group</b></em>' containment reference list.
	 * The list contents are of type {@link events.repository.EventType}.
	 * It is bidirectional and its opposite is '{@link events.repository.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types Event Group</em>' containment reference list.
	 * @see events.repository.RepositoryPackage#getEventGroup_EventTypes__EventGroup()
	 * @see events.repository.EventType#getEventGroup__EventType
	 * @model opposite="eventGroup__EventType" containment="true" ordered="false"
	 * @generated
	 */
	EList<EventType> getEventTypes__EventGroup();

} // EventGroup
