/**
 */
package repository.datatypes;

import base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a complex data type containing other data types. This construct is common in higher programming languages as record, struct, or class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.datatypes.CompositeDataType#getParentType_CompositeDataType <em>Parent Type Composite Data Type</em>}</li>
 *   <li>{@link repository.datatypes.CompositeDataType#getInnerDeclaration_CompositeDataType <em>Inner Declaration Composite Data Type</em>}</li>
 * </ul>
 *
 * @see repository.datatypes.DatatypesPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends Entity, DataType {
	/**
	 * Returns the value of the '<em><b>Parent Type Composite Data Type</b></em>' reference list.
	 * The list contents are of type {@link repository.datatypes.CompositeDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the parent type in the inheritance hierarchy. Null if there is no parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Type Composite Data Type</em>' reference list.
	 * @see repository.datatypes.DatatypesPackage#getCompositeDataType_ParentType_CompositeDataType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompositeDataType> getParentType_CompositeDataType();

	/**
	 * Returns the value of the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link repository.datatypes.InnerDeclaration}.
	 * It is bidirectional and its opposite is '{@link repository.datatypes.InnerDeclaration#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the internals, i.e., named items, each of a data type, forming this composite data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Declaration Composite Data Type</em>' containment reference list.
	 * @see repository.datatypes.DatatypesPackage#getCompositeDataType_InnerDeclaration_CompositeDataType()
	 * @see repository.datatypes.InnerDeclaration#getCompositeDataType_InnerDeclaration
	 * @model opposite="compositeDataType_InnerDeclaration" containment="true" ordered="false"
	 * @generated
	 */
	EList<InnerDeclaration> getInnerDeclaration_CompositeDataType();

} // CompositeDataType
