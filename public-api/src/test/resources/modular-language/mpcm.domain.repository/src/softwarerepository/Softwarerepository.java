/**
 */
package softwarerepository;

import base.Entity;

import org.eclipse.emf.common.util.EList;

import repository.Interface;
import repository.RepositoryComponent;

import repository.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softwarerepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The repository entity allows storing components, data types, and interfaces to be fetched and reused for construction of component instances as well as new component types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.Softwarerepository#getRepositoryDescription <em>Repository Description</em>}</li>
 *   <li>{@link softwarerepository.Softwarerepository#getComponents__Repository <em>Components Repository</em>}</li>
 *   <li>{@link softwarerepository.Softwarerepository#getInterfaces__Repository <em>Interfaces Repository</em>}</li>
 *   <li>{@link softwarerepository.Softwarerepository#getDataTypes__Repository <em>Data Types Repository</em>}</li>
 *   <li>{@link softwarerepository.Softwarerepository#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link softwarerepository.Softwarerepository#getExceptionOccurences <em>Exception Occurences</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository()
 * @model
 * @generated
 */
public interface Softwarerepository extends Entity {
	/**
	 * Returns the value of the '<em><b>Repository Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents a description of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository Description</em>' attribute.
	 * @see #setRepositoryDescription(String)
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_RepositoryDescription()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getRepositoryDescription();

	/**
	 * Sets the value of the '{@link softwarerepository.Softwarerepository#getRepositoryDescription <em>Repository Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Description</em>' attribute.
	 * @see #getRepositoryDescription()
	 * @generated
	 */
	void setRepositoryDescription(String value);

	/**
	 * Returns the value of the '<em><b>Components Repository</b></em>' containment reference list.
	 * The list contents are of type {@link repository.RepositoryComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the provides component types stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components Repository</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_Components__Repository()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RepositoryComponent> getComponents__Repository();

	/**
	 * Returns the value of the '<em><b>Interfaces Repository</b></em>' containment reference list.
	 * The list contents are of type {@link repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interfaces stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interfaces Repository</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_Interfaces__Repository()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaces__Repository();

	/**
	 * Returns the value of the '<em><b>Data Types Repository</b></em>' containment reference list.
	 * The list contents are of type {@link repository.datatypes.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the data types stored in the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types Repository</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_DataTypes__Repository()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getDataTypes__Repository();

	/**
	 * Returns the value of the '<em><b>Exception Types</b></em>' containment reference list.
	 * The list contents are of type {@link softwarerepository.ExceptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Types</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_ExceptionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionType> getExceptionTypes();

	/**
	 * Returns the value of the '<em><b>Exception Occurences</b></em>' containment reference list.
	 * The list contents are of type {@link softwarerepository.ExceptionOccurence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Occurences</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getSoftwarerepository_ExceptionOccurences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionOccurence> getExceptionOccurences();

} // Softwarerepository
