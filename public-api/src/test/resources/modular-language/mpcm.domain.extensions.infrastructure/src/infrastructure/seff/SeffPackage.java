/**
 */
package infrastructure.seff;

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
 * @see infrastructure.seff.SeffFactory
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
	String eNS_URI = "mpcm.domain.extensions.infrastructure.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.infrastructure.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = infrastructure.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link infrastructure.seff.impl.InfrastructureSEFFRootImpl <em>Infrastructure SEFF Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.seff.impl.InfrastructureSEFFRootImpl
	 * @see infrastructure.seff.impl.SeffPackageImpl#getInfrastructureSEFFRoot()
	 * @generated
	 */
	int INFRASTRUCTURE_SEFF_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Infrastructurecall</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure SEFF Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SEFF_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link infrastructure.seff.impl.InfrastructureCallImpl <em>Infrastructure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see infrastructure.seff.impl.InfrastructureCallImpl
	 * @see infrastructure.seff.impl.SeffPackageImpl#getInfrastructureCall()
	 * @generated
	 */
	int INFRASTRUCTURE_CALL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__ID = BehaviourseffPackage.CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__ENTITY_NAME = BehaviourseffPackage.CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__INPUT_VARIABLE_USAGES_CALL_ACTION = BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Signature Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Role Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Infrastructure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_CALL_FEATURE_COUNT = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link infrastructure.seff.InfrastructureSEFFRoot <em>Infrastructure SEFF Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure SEFF Root</em>'.
	 * @see infrastructure.seff.InfrastructureSEFFRoot
	 * @generated
	 */
	EClass getInfrastructureSEFFRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link infrastructure.seff.InfrastructureSEFFRoot#getInfrastructurecall <em>Infrastructurecall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructurecall</em>'.
	 * @see infrastructure.seff.InfrastructureSEFFRoot#getInfrastructurecall()
	 * @see #getInfrastructureSEFFRoot()
	 * @generated
	 */
	EReference getInfrastructureSEFFRoot_Infrastructurecall();

	/**
	 * Returns the meta object for class '{@link infrastructure.seff.InfrastructureCall <em>Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Call</em>'.
	 * @see infrastructure.seff.InfrastructureCall
	 * @generated
	 */
	EClass getInfrastructureCall();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.seff.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Infrastructure Call</em>'.
	 * @see infrastructure.seff.InfrastructureCall#getSignature__InfrastructureCall()
	 * @see #getInfrastructureCall()
	 * @generated
	 */
	EReference getInfrastructureCall_Signature__InfrastructureCall();

	/**
	 * Returns the meta object for the containment reference '{@link infrastructure.seff.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number Of Calls Infrastructure Call</em>'.
	 * @see infrastructure.seff.InfrastructureCall#getNumberOfCalls__InfrastructureCall()
	 * @see #getInfrastructureCall()
	 * @generated
	 */
	EReference getInfrastructureCall_NumberOfCalls__InfrastructureCall();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.seff.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Infrastructure Call</em>'.
	 * @see infrastructure.seff.InfrastructureCall#getAction__InfrastructureCall()
	 * @see #getInfrastructureCall()
	 * @generated
	 */
	EReference getInfrastructureCall_Action__InfrastructureCall();

	/**
	 * Returns the meta object for the reference '{@link infrastructure.seff.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role Infrastructure Call</em>'.
	 * @see infrastructure.seff.InfrastructureCall#getRequiredRole__InfrastructureCall()
	 * @see #getInfrastructureCall()
	 * @generated
	 */
	EReference getInfrastructureCall_RequiredRole__InfrastructureCall();

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
		 * The meta object literal for the '{@link infrastructure.seff.impl.InfrastructureSEFFRootImpl <em>Infrastructure SEFF Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.seff.impl.InfrastructureSEFFRootImpl
		 * @see infrastructure.seff.impl.SeffPackageImpl#getInfrastructureSEFFRoot()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SEFF_ROOT = eINSTANCE.getInfrastructureSEFFRoot();

		/**
		 * The meta object literal for the '<em><b>Infrastructurecall</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_SEFF_ROOT__INFRASTRUCTURECALL = eINSTANCE.getInfrastructureSEFFRoot_Infrastructurecall();

		/**
		 * The meta object literal for the '{@link infrastructure.seff.impl.InfrastructureCallImpl <em>Infrastructure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see infrastructure.seff.impl.InfrastructureCallImpl
		 * @see infrastructure.seff.impl.SeffPackageImpl#getInfrastructureCall()
		 * @generated
		 */
		EClass INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall();

		/**
		 * The meta object literal for the '<em><b>Signature Infrastructure Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_Signature__InfrastructureCall();

		/**
		 * The meta object literal for the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_NumberOfCalls__InfrastructureCall();

		/**
		 * The meta object literal for the '<em><b>Action Infrastructure Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_Action__InfrastructureCall();

		/**
		 * The meta object literal for the '<em><b>Required Role Infrastructure Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL = eINSTANCE.getInfrastructureCall_RequiredRole__InfrastructureCall();

	}

} //SeffPackage
