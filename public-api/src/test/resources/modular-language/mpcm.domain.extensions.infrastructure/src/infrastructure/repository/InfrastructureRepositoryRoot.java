/**
 */
package infrastructure.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Repository Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.repository.InfrastructureRepositoryRoot#getInfrastructurecomponent <em>Infrastructurecomponent</em>}</li>
 * </ul>
 *
 * @see infrastructure.repository.RepositoryPackage#getInfrastructureRepositoryRoot()
 * @model
 * @generated
 */
public interface InfrastructureRepositoryRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Infrastructurecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.repository.InfrastructureComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructurecomponent</em>' containment reference list.
	 * @see infrastructure.repository.RepositoryPackage#getInfrastructureRepositoryRoot_Infrastructurecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureComponent> getInfrastructurecomponent();

} // InfrastructureRepositoryRoot
