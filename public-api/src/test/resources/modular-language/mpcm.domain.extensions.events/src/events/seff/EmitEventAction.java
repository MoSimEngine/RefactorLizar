/**
 */
package events.seff;

import behaviourseff.CallAction;

import events.repository.EventType;
import events.repository.SourceRole;

import seff.AbstractAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EmitEventAction specifies when a component emits an event during its processing. To enable the specification of the EventType characteristics, the EmitEventAction extends the CallAction. The EmitEventAction defines which type of events are emited, their characteristics and the SourceRole that triggered. Each EmitEventAction is limited to one type of events. To support multiple types of events, multiple EmitEventActions have to be used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.seff.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}</li>
 *   <li>{@link events.seff.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}</li>
 * </ul>
 *
 * @see events.seff.SeffPackage#getEmitEventAction()
 * @model
 * @generated
 */
public interface EmitEventAction extends AbstractAction, CallAction {
	/**
	 * Returns the value of the '<em><b>Event Type Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type Emit Event Action</em>' reference.
	 * @see #setEventType__EmitEventAction(EventType)
	 * @see events.seff.SeffPackage#getEmitEventAction_EventType__EmitEventAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventType getEventType__EmitEventAction();

	/**
	 * Sets the value of the '{@link events.seff.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type Emit Event Action</em>' reference.
	 * @see #getEventType__EmitEventAction()
	 * @generated
	 */
	void setEventType__EmitEventAction(EventType value);

	/**
	 * Returns the value of the '<em><b>Source Role Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Emit Event Action</em>' reference.
	 * @see #setSourceRole__EmitEventAction(SourceRole)
	 * @see events.seff.SeffPackage#getEmitEventAction_SourceRole__EmitEventAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SourceRole getSourceRole__EmitEventAction();

	/**
	 * Sets the value of the '{@link events.seff.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Emit Event Action</em>' reference.
	 * @see #getSourceRole__EmitEventAction()
	 * @generated
	 */
	void setSourceRole__EmitEventAction(SourceRole value);

} // EmitEventAction
