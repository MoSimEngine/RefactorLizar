/**
 */
package abstractcomponenttypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstractcomponenttypes.AbstractcomponenttypesFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractcomponenttypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractcomponenttypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.repository.abstractcomponenttypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.repository.abstractcomponenttypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractcomponenttypesPackage eINSTANCE = abstractcomponenttypes.impl.AbstractcomponenttypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstractcomponenttypes.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractcomponenttypes.impl.ProvidesComponentTypeImpl
	 * @see abstractcomponenttypes.impl.AbstractcomponenttypesPackageImpl#getProvidesComponentType()
	 * @generated
	 */
	int PROVIDES_COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__ID = RepositoryPackage.REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__ENTITY_NAME = RepositoryPackage.REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The number of structural features of the '<em>Provides Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE_FEATURE_COUNT = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractcomponenttypes.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractcomponenttypes.impl.CompleteComponentTypeImpl
	 * @see abstractcomponenttypes.impl.AbstractcomponenttypesPackageImpl#getCompleteComponentType()
	 * @generated
	 */
	int COMPLETE_COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__ID = RepositoryPackage.REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__ENTITY_NAME = RepositoryPackage.REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = RepositoryPackage.REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Parent Provides Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirming Impl Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__CONFIRMING_IMPL_COMPONENT_TYPES = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complete Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE_FEATURE_COUNT = RepositoryPackage.REPOSITORY_COMPONENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link abstractcomponenttypes.ProvidesComponentType <em>Provides Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Component Type</em>'.
	 * @see abstractcomponenttypes.ProvidesComponentType
	 * @generated
	 */
	EClass getProvidesComponentType();

	/**
	 * Returns the meta object for class '{@link abstractcomponenttypes.CompleteComponentType <em>Complete Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Component Type</em>'.
	 * @see abstractcomponenttypes.CompleteComponentType
	 * @generated
	 */
	EClass getCompleteComponentType();

	/**
	 * Returns the meta object for the reference list '{@link abstractcomponenttypes.CompleteComponentType#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Provides Component Types</em>'.
	 * @see abstractcomponenttypes.CompleteComponentType#getParentProvidesComponentTypes()
	 * @see #getCompleteComponentType()
	 * @generated
	 */
	EReference getCompleteComponentType_ParentProvidesComponentTypes();

	/**
	 * Returns the meta object for the reference list '{@link abstractcomponenttypes.CompleteComponentType#getConfirmingImplComponentTypes <em>Confirming Impl Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Confirming Impl Component Types</em>'.
	 * @see abstractcomponenttypes.CompleteComponentType#getConfirmingImplComponentTypes()
	 * @see #getCompleteComponentType()
	 * @generated
	 */
	EReference getCompleteComponentType_ConfirmingImplComponentTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractcomponenttypesFactory getAbstractcomponenttypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstractcomponenttypes.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractcomponenttypes.impl.ProvidesComponentTypeImpl
		 * @see abstractcomponenttypes.impl.AbstractcomponenttypesPackageImpl#getProvidesComponentType()
		 * @generated
		 */
		EClass PROVIDES_COMPONENT_TYPE = eINSTANCE.getProvidesComponentType();

		/**
		 * The meta object literal for the '{@link abstractcomponenttypes.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractcomponenttypes.impl.CompleteComponentTypeImpl
		 * @see abstractcomponenttypes.impl.AbstractcomponenttypesPackageImpl#getCompleteComponentType()
		 * @generated
		 */
		EClass COMPLETE_COMPONENT_TYPE = eINSTANCE.getCompleteComponentType();

		/**
		 * The meta object literal for the '<em><b>Parent Provides Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = eINSTANCE.getCompleteComponentType_ParentProvidesComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Confirming Impl Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_COMPONENT_TYPE__CONFIRMING_IMPL_COMPONENT_TYPES = eINSTANCE.getCompleteComponentType_ConfirmingImplComponentTypes();

	}

} //AbstractcomponenttypesPackage
