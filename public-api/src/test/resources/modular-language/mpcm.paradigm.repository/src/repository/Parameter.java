/**
 */
package repository;

import org.eclipse.emf.ecore.EObject;

import repository.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a parameter within a signature. The parameter has a name and it is of a data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}</li>
 *   <li>{@link repository.Parameter#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link repository.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}</li>
 * </ul>
 *
 * @see repository.RepositoryPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the data type of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type Parameter</em>' reference.
	 * @see #setDataType__Parameter(DataType)
	 * @see repository.RepositoryPackage#getParameter_DataType__Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType__Parameter();

	/**
	 * Sets the value of the '{@link repository.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Parameter</em>' reference.
	 * @see #getDataType__Parameter()
	 * @generated
	 */
	void setDataType__Parameter(DataType value);

	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property holds the name of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see repository.RepositoryPackage#getParameter_ParameterName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link repository.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Modifier Parameter</b></em>' attribute.
	 * The literals are from the enumeration {@link repository.ParameterModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the modifier of the parameter like known from C#.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier Parameter</em>' attribute.
	 * @see repository.ParameterModifier
	 * @see #setModifier__Parameter(ParameterModifier)
	 * @see repository.RepositoryPackage#getParameter_Modifier__Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterModifier getModifier__Parameter();

	/**
	 * Sets the value of the '{@link repository.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier Parameter</em>' attribute.
	 * @see repository.ParameterModifier
	 * @see #getModifier__Parameter()
	 * @generated
	 */
	void setModifier__Parameter(ParameterModifier value);

} // Parameter
