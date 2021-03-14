/**
 */
package infrastructure.repository;

import org.eclipse.emf.common.util.EList;

import repository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}</li>
 * </ul>
 *
 * @see infrastructure.repository.RepositoryPackage#getInfrastructureInterface()
 * @model
 * @generated
 */
public interface InfrastructureInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.repository.InfrastructureSignature}.
	 * It is bidirectional and its opposite is '{@link infrastructure.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Signatures Infrastructure Interface</em>' containment reference list.
	 * @see infrastructure.repository.RepositoryPackage#getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface()
	 * @see infrastructure.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature
	 * @model opposite="infrastructureInterface__InfrastructureSignature" containment="true" ordered="false"
	 * @generated
	 */
	EList<InfrastructureSignature> getInfrastructureSignatures__InfrastructureInterface();

} // InfrastructureInterface
