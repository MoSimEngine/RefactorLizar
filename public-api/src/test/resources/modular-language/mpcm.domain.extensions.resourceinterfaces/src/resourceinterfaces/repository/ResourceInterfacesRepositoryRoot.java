/**
 */
package resourceinterfaces.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interfaces Repository Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.repository.ResourceInterfacesRepositoryRoot#getResourceinterfacerequiringentity <em>Resourceinterfacerequiringentity</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.repository.RepositoryPackage#getResourceInterfacesRepositoryRoot()
 * @model
 * @generated
 */
public interface ResourceInterfacesRepositoryRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Resourceinterfacerequiringentity</b></em>' containment reference list.
	 * The list contents are of type {@link resourceinterfaces.repository.ResourceInterfaceRequiringEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourceinterfacerequiringentity</em>' containment reference list.
	 * @see resourceinterfaces.repository.RepositoryPackage#getResourceInterfacesRepositoryRoot_Resourceinterfacerequiringentity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInterfaceRequiringEntity> getResourceinterfacerequiringentity();

} // ResourceInterfacesRepositoryRoot
