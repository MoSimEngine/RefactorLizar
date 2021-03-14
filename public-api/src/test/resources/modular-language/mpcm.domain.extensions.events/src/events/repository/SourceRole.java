/**
 */
package events.repository;

import repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.repository.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}</li>
 * </ul>
 *
 * @see events.repository.RepositoryPackage#getSourceRole()
 * @model
 * @generated
 */
public interface SourceRole extends RequiredRole {
	/**
	 * Returns the value of the '<em><b>Event Group Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Group Source Role</em>' reference.
	 * @see #setEventGroup__SourceRole(EventGroup)
	 * @see events.repository.RepositoryPackage#getSourceRole_EventGroup__SourceRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventGroup getEventGroup__SourceRole();

	/**
	 * Sets the value of the '{@link events.repository.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Group Source Role</em>' reference.
	 * @see #getEventGroup__SourceRole()
	 * @generated
	 */
	void setEventGroup__SourceRole(EventGroup value);

} // SourceRole
