/**
 */
package identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link identifier.Identifier#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @see identifier.IdentifierPackage#getIdentifier()
 * @model abstract="true"
 * @generated
 */
public interface Identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see identifier.IdentifierPackage#getIdentifier_UUID()
	 * @model required="true"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link identifier.Identifier#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

} // Identifier
