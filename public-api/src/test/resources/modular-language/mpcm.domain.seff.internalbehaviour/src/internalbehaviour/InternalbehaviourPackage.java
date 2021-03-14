/**
 */
package internalbehaviour;

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
 * @see internalbehaviour.InternalbehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface InternalbehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "internalbehaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.behaviourseff.internalbehaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.behaviourseff.internalbehaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalbehaviourPackage eINSTANCE = internalbehaviour.impl.InternalbehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link internalbehaviour.impl.InternalBehaviourSEFFImpl <em>Internal Behaviour SEFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internalbehaviour.impl.InternalBehaviourSEFFImpl
	 * @see internalbehaviour.impl.InternalbehaviourPackageImpl#getInternalBehaviourSEFF()
	 * @generated
	 */
	int INTERNAL_BEHAVIOUR_SEFF = 0;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF__SEFF_TYPE_ID = BehaviourseffPackage.BEHAVIOUR_SEFF__SEFF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF__DESCRIBED_SERVICE_SEFF = BehaviourseffPackage.BEHAVIOUR_SEFF__DESCRIBED_SERVICE_SEFF;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = BehaviourseffPackage.BEHAVIOUR_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF__BEHAVIOUR = BehaviourseffPackage.BEHAVIOUR_SEFF__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF__SIGNATURE = BehaviourseffPackage.BEHAVIOUR_SEFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Behaviour SEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BEHAVIOUR_SEFF_FEATURE_COUNT = BehaviourseffPackage.BEHAVIOUR_SEFF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link internalbehaviour.impl.InternalCallActionImpl <em>Internal Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internalbehaviour.impl.InternalCallActionImpl
	 * @see internalbehaviour.impl.InternalbehaviourPackageImpl#getInternalCallAction()
	 * @generated
	 */
	int INTERNAL_CALL_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__ID = BehaviourseffPackage.CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__ENTITY_NAME = BehaviourseffPackage.CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = BehaviourseffPackage.CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Internal Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION_FEATURE_COUNT = BehaviourseffPackage.CALL_ACTION_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link internalbehaviour.InternalBehaviourSEFF <em>Internal Behaviour SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Behaviour SEFF</em>'.
	 * @see internalbehaviour.InternalBehaviourSEFF
	 * @generated
	 */
	EClass getInternalBehaviourSEFF();

	/**
	 * Returns the meta object for the containment reference '{@link internalbehaviour.InternalBehaviourSEFF#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see internalbehaviour.InternalBehaviourSEFF#getSignature()
	 * @see #getInternalBehaviourSEFF()
	 * @generated
	 */
	EReference getInternalBehaviourSEFF_Signature();

	/**
	 * Returns the meta object for class '{@link internalbehaviour.InternalCallAction <em>Internal Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Call Action</em>'.
	 * @see internalbehaviour.InternalCallAction
	 * @generated
	 */
	EClass getInternalCallAction();

	/**
	 * Returns the meta object for the reference '{@link internalbehaviour.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Resource Demanding Internal Behaviour</em>'.
	 * @see internalbehaviour.InternalCallAction#getCalledResourceDemandingInternalBehaviour()
	 * @see #getInternalCallAction()
	 * @generated
	 */
	EReference getInternalCallAction_CalledResourceDemandingInternalBehaviour();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InternalbehaviourFactory getInternalbehaviourFactory();

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
		 * The meta object literal for the '{@link internalbehaviour.impl.InternalBehaviourSEFFImpl <em>Internal Behaviour SEFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internalbehaviour.impl.InternalBehaviourSEFFImpl
		 * @see internalbehaviour.impl.InternalbehaviourPackageImpl#getInternalBehaviourSEFF()
		 * @generated
		 */
		EClass INTERNAL_BEHAVIOUR_SEFF = eINSTANCE.getInternalBehaviourSEFF();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_BEHAVIOUR_SEFF__SIGNATURE = eINSTANCE.getInternalBehaviourSEFF_Signature();

		/**
		 * The meta object literal for the '{@link internalbehaviour.impl.InternalCallActionImpl <em>Internal Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internalbehaviour.impl.InternalCallActionImpl
		 * @see internalbehaviour.impl.InternalbehaviourPackageImpl#getInternalCallAction()
		 * @generated
		 */
		EClass INTERNAL_CALL_ACTION = eINSTANCE.getInternalCallAction();

		/**
		 * The meta object literal for the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = eINSTANCE.getInternalCallAction_CalledResourceDemandingInternalBehaviour();

	}

} //InternalbehaviourPackage
