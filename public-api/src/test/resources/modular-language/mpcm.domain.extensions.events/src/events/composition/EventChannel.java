/**
 */
package events.composition;

import base.Entity;

import composition.ComposedStructure;
import composition.Containable;

import events.repository.EventGroup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.composition.EventChannel#getEventGroup__EventChannel <em>Event Group Event Channel</em>}</li>
 *   <li>{@link events.composition.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}</li>
 *   <li>{@link events.composition.EventChannel#getEventChannelSinkConnector__EventChannel <em>Event Channel Sink Connector Event Channel</em>}</li>
 *   <li>{@link events.composition.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}</li>
 * </ul>
 *
 * @see events.composition.CompositionPackage#getEventChannel()
 * @model
 * @generated
 */
public interface EventChannel extends Entity, Containable {
	/**
	 * Returns the value of the '<em><b>Event Group Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Group Event Channel</em>' reference.
	 * @see #setEventGroup__EventChannel(EventGroup)
	 * @see events.composition.CompositionPackage#getEventChannel_EventGroup__EventChannel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventGroup getEventGroup__EventChannel();

	/**
	 * Sets the value of the '{@link events.composition.EventChannel#getEventGroup__EventChannel <em>Event Group Event Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Group Event Channel</em>' reference.
	 * @see #getEventGroup__EventChannel()
	 * @generated
	 */
	void setEventGroup__EventChannel(EventGroup value);

	/**
	 * Returns the value of the '<em><b>Event Channel Source Connector Event Channel</b></em>' reference list.
	 * The list contents are of type {@link events.composition.EventChannelSourceConnector}.
	 * It is bidirectional and its opposite is '{@link events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel Source Connector Event Channel</em>' reference list.
	 * @see events.composition.CompositionPackage#getEventChannel_EventChannelSourceConnector__EventChannel()
	 * @see events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector
	 * @model opposite="eventChannel__EventChannelSourceConnector" ordered="false"
	 * @generated
	 */
	EList<EventChannelSourceConnector> getEventChannelSourceConnector__EventChannel();

	/**
	 * Returns the value of the '<em><b>Event Channel Sink Connector Event Channel</b></em>' reference list.
	 * The list contents are of type {@link events.composition.EventChannelSinkConnector}.
	 * It is bidirectional and its opposite is '{@link events.composition.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector <em>Event Channel Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel Sink Connector Event Channel</em>' reference list.
	 * @see events.composition.CompositionPackage#getEventChannel_EventChannelSinkConnector__EventChannel()
	 * @see events.composition.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector
	 * @model opposite="eventChannel__EventChannelSinkConnector" ordered="false"
	 * @generated
	 */
	EList<EventChannelSinkConnector> getEventChannelSinkConnector__EventChannel();

	/**
	 * Returns the value of the '<em><b>Parent Structure Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure Event Channel</em>' reference.
	 * @see #setParentStructure__EventChannel(ComposedStructure)
	 * @see events.composition.CompositionPackage#getEventChannel_ParentStructure__EventChannel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComposedStructure getParentStructure__EventChannel();

	/**
	 * Sets the value of the '{@link events.composition.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure Event Channel</em>' reference.
	 * @see #getParentStructure__EventChannel()
	 * @generated
	 */
	void setParentStructure__EventChannel(ComposedStructure value);

} // EventChannel
