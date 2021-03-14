/**
 */
package events.composition;

import composition.AssemblyContext;
import composition.Connector;

import events.repository.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Channel Source Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.composition.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}</li>
 *   <li>{@link events.composition.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}</li>
 *   <li>{@link events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}</li>
 * </ul>
 *
 * @see events.composition.CompositionPackage#getEventChannelSourceConnector()
 * @model
 * @generated
 */
public interface EventChannelSourceConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Source Role Event Channel Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Event Channel Source Role</em>' reference.
	 * @see #setSourceRole__EventChannelSourceRole(SourceRole)
	 * @see events.composition.CompositionPackage#getEventChannelSourceConnector_SourceRole__EventChannelSourceRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SourceRole getSourceRole__EventChannelSourceRole();

	/**
	 * Sets the value of the '{@link events.composition.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Event Channel Source Role</em>' reference.
	 * @see #getSourceRole__EventChannelSourceRole()
	 * @generated
	 */
	void setSourceRole__EventChannelSourceRole(SourceRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Event Channel Source Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Event Channel Source Connector</em>' reference.
	 * @see #setAssemblyContext__EventChannelSourceConnector(AssemblyContext)
	 * @see events.composition.CompositionPackage#getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext__EventChannelSourceConnector();

	/**
	 * Sets the value of the '{@link events.composition.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Event Channel Source Connector</em>' reference.
	 * @see #getAssemblyContext__EventChannelSourceConnector()
	 * @generated
	 */
	void setAssemblyContext__EventChannelSourceConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Event Channel Event Channel Source Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link events.composition.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
	 * @see #setEventChannel__EventChannelSourceConnector(EventChannel)
	 * @see events.composition.CompositionPackage#getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector()
	 * @see events.composition.EventChannel#getEventChannelSourceConnector__EventChannel
	 * @model opposite="eventChannelSourceConnector__EventChannel" required="true" ordered="false"
	 * @generated
	 */
	EventChannel getEventChannel__EventChannelSourceConnector();

	/**
	 * Sets the value of the '{@link events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Channel Event Channel Source Connector</em>' reference.
	 * @see #getEventChannel__EventChannelSourceConnector()
	 * @generated
	 */
	void setEventChannel__EventChannelSourceConnector(EventChannel value);

} // EventChannelSourceConnector
