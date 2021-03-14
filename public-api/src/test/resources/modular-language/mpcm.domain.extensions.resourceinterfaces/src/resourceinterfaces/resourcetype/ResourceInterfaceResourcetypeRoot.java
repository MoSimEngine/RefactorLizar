/**
 */
package resourceinterfaces.resourcetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Resourcetype Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterfaceprovidingentity <em>Resourceinterfaceprovidingentity</em>}</li>
 *   <li>{@link resourceinterfaces.resourcetype.ResourceInterfaceResourcetypeRoot#getResourceinterface <em>Resourceinterface</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceResourcetypeRoot()
 * @model
 * @generated
 */
public interface ResourceInterfaceResourcetypeRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Resourceinterfaceprovidingentity</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.resourcetype.ResourceInterfaceProvidingEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceinterfaceprovidingentity</em>' containment reference list.
	 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceResourcetypeRoot_Resourceinterfaceprovidingentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInterfaceProvidingEntity> getResourceinterfaceprovidingentity();

	/**
	 * Returns the value of the '<em><b>Resourceinterface</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.resourcetype.ResourceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceinterface</em>' containment reference list.
	 * @see resourceinterfaces.resourcetype.ResourcetypePackage#getResourceInterfaceResourcetypeRoot_Resourceinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInterface> getResourceinterface();

} // ResourceInterfaceResourcetypeRoot
