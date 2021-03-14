/**
 */
package resourceinterfaces.seff;

import behaviourseff.BehaviourseffPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see resourceinterfaces.seff.SeffFactory
 * @model kind="package"
 * @generated
 */
public interface SeffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.extensions.resourceinterfaces.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.resourceinterfaces.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = resourceinterfaces.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link resourceinterfaces.seff.impl.ResourceInterfacesSEFFRootImpl <em>Resource Interfaces SEFF Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.seff.impl.ResourceInterfacesSEFFRootImpl
	 * @see resourceinterfaces.seff.impl.SeffPackageImpl#getResourceInterfacesSEFFRoot()
	 * @generated
	 */
	int RESOURCE_INTERFACES_SEFF_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Resource Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS = 0;

	/**
	 * The number of structural features of the '<em>Resource Interfaces SEFF Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACES_SEFF_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link resourceinterfaces.seff.impl.ResourceCallImpl <em>Resource Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceinterfaces.seff.impl.ResourceCallImpl
	 * @see resourceinterfaces.seff.impl.SeffPackageImpl#getResourceCall()
	 * @generated
	 */
	int RESOURCE_CALL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__ID = BehaviourseffPackage.CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__ENTITY_NAME = BehaviourseffPackage.CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__INPUT_VARIABLE_USAGES_CALL_ACTION = BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Action Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__ACTION_RESOURCE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Required Role Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__SIGNATURE_RESOURCE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Calls Resource Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CALL_FEATURE_COUNT = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link resourceinterfaces.seff.ResourceInterfacesSEFFRoot <em>Resource Interfaces SEFF Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interfaces SEFF Root</em>'.
	 * @see resourceinterfaces.seff.ResourceInterfacesSEFFRoot
	 * @generated
	 */
	EClass getResourceInterfacesSEFFRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceinterfaces.seff.ResourceInterfacesSEFFRoot#getResourceCalls <em>Resource Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Calls</em>'.
	 * @see resourceinterfaces.seff.ResourceInterfacesSEFFRoot#getResourceCalls()
	 * @see #getResourceInterfacesSEFFRoot()
	 * @generated
	 */
	EReference getResourceInterfacesSEFFRoot_ResourceCalls();

	/**
	 * Returns the meta object for class '{@link resourceinterfaces.seff.ResourceCall <em>Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Call</em>'.
	 * @see resourceinterfaces.seff.ResourceCall
	 * @generated
	 */
	EClass getResourceCall();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.seff.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Resource Call</em>'.
	 * @see resourceinterfaces.seff.ResourceCall#getAction__ResourceCall()
	 * @see #getResourceCall()
	 * @generated
	 */
	EReference getResourceCall_Action__ResourceCall();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.seff.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Required Role Resource Call</em>'.
	 * @see resourceinterfaces.seff.ResourceCall#getResourceRequiredRole__ResourceCall()
	 * @see #getResourceCall()
	 * @generated
	 */
	EReference getResourceCall_ResourceRequiredRole__ResourceCall();

	/**
	 * Returns the meta object for the reference '{@link resourceinterfaces.seff.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Resource Call</em>'.
	 * @see resourceinterfaces.seff.ResourceCall#getSignature__ResourceCall()
	 * @see #getResourceCall()
	 * @generated
	 */
	EReference getResourceCall_Signature__ResourceCall();

	/**
	 * Returns the meta object for the containment reference '{@link resourceinterfaces.seff.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Calls Resource Call</em>'.
	 * @see resourceinterfaces.seff.ResourceCall#getNumberOfCalls__ResourceCall()
	 * @see #getResourceCall()
	 * @generated
	 */
	EReference getResourceCall_NumberOfCalls__ResourceCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeffFactory getSeffFactory();

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
		 * The meta object literal for the '{@link resourceinterfaces.seff.impl.ResourceInterfacesSEFFRootImpl <em>Resource Interfaces SEFF Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.seff.impl.ResourceInterfacesSEFFRootImpl
		 * @see resourceinterfaces.seff.impl.SeffPackageImpl#getResourceInterfacesSEFFRoot()
		 * @generated
		 */
		EClass RESOURCE_INTERFACES_SEFF_ROOT = eINSTANCE.getResourceInterfacesSEFFRoot();

		/**
		 * The meta object literal for the '<em><b>Resource Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACES_SEFF_ROOT__RESOURCE_CALLS = eINSTANCE.getResourceInterfacesSEFFRoot_ResourceCalls();

		/**
		 * The meta object literal for the '{@link resourceinterfaces.seff.impl.ResourceCallImpl <em>Resource Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceinterfaces.seff.impl.ResourceCallImpl
		 * @see resourceinterfaces.seff.impl.SeffPackageImpl#getResourceCall()
		 * @generated
		 */
		EClass RESOURCE_CALL = eINSTANCE.getResourceCall();

		/**
		 * The meta object literal for the '<em><b>Action Resource Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CALL__ACTION_RESOURCE_CALL = eINSTANCE.getResourceCall_Action__ResourceCall();

		/**
		 * The meta object literal for the '<em><b>Resource Required Role Resource Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL = eINSTANCE.getResourceCall_ResourceRequiredRole__ResourceCall();

		/**
		 * The meta object literal for the '<em><b>Signature Resource Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CALL__SIGNATURE_RESOURCE_CALL = eINSTANCE.getResourceCall_Signature__ResourceCall();

		/**
		 * The meta object literal for the '<em><b>Number Of Calls Resource Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL = eINSTANCE.getResourceCall_NumberOfCalls__ResourceCall();

	}

} //SeffPackage
