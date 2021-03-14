/**
 */
package resourceinterfaces.resourcetype;

import base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO: This structure still has to be finalized by Henning. There is no influence on other model elements yet. so this can be done later on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.resourcetype.ResourceInterface#getResourceSignatures__ResourceInterface <em>Resource Signatures Resource Interface</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterface()
 * @model
 * @generated
 */
public interface ResourceInterface extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Signatures Resource Interface</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.resourcetype.ResourceSignature}.
	 * It is bidirectional and its opposite is '{@link resourceinterfaces.resourcetype.ResourceSignature#getResourceInterface__ResourceSignature <em>Resource Interface Resource Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Signatures Resource Interface</em>' containment reference list.
	 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterface_ResourceSignatures__ResourceInterface()
	 * @see resourceinterfaces.resourcetype.ResourceSignature#getResourceInterface__ResourceSignature
	 * @model opposite="resourceInterface__ResourceSignature" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceSignature> getResourceSignatures__ResourceInterface();

} // ResourceInterface
