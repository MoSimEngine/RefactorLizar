/**
 */
package repository.datatypes;

import base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a collection data type, e.g.,. a list, array, set, of items of the a particular type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.datatypes.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}</li>
 * </ul>
 *
 * @see repository.datatypes.DatatypesPackage#getCollectionDataType()
 * @model
 * @generated
 */
public interface CollectionDataType extends Entity, DataType {
	/**
	 * Returns the value of the '<em><b>Inner Type Collection Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the type of items contained in the collection data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Type Collection Data Type</em>' reference.
	 * @see #setInnerType_CollectionDataType(DataType)
	 * @see repository.datatypes.DatatypesPackage#getCollectionDataType_InnerType_CollectionDataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getInnerType_CollectionDataType();

	/**
	 * Sets the value of the '{@link repository.datatypes.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Type Collection Data Type</em>' reference.
	 * @see #getInnerType_CollectionDataType()
	 * @generated
	 */
	void setInnerType_CollectionDataType(DataType value);

} // CollectionDataType
