/**
 */
package resourceinterfaces.seff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interfaces SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.seff.ResourceInterfacesSEFFRoot#getResourceCalls <em>Resource Calls</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.seff.SeffPackage#getResourceInterfacesSEFFRoot()
 * @model
 * @generated
 */
public interface ResourceInterfacesSEFFRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Calls</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.seff.ResourceCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Calls</em>' containment reference list.
	 * @see resourceinterfaces.seff.SeffPackage#getResourceInterfacesSEFFRoot_ResourceCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceCall> getResourceCalls();

} // ResourceInterfacesSEFFRoot
