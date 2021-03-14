/**
 */
package reliability.seff;

import base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import reliability.ReliabilityPackage;

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
 * @see reliability.seff.SeffFactory
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
	String eNS_URI = "mpcm.quality.reliability.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliability.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = reliability.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliability.seff.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.InternalFailureOccurrenceDescriptionImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link reliability.seff.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.RecoveryActionImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getRecoveryAction()
	 * @generated
	 */
	int RECOVERY_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__ID = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__ENTITY_NAME = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__PREDECESSOR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__SUCCESSOR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_FEATURE_COUNT = seff.SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link reliability.seff.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.FailureHandlingEntityImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getFailureHandlingEntity()
	 * @generated
	 */
	int FAILURE_HANDLING_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Handling Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliability.seff.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.RecoveryActionBehaviourImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getRecoveryActionBehaviour()
	 * @generated
	 */
	int RECOVERY_ACTION_BEHAVIOUR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ID = FAILURE_HANDLING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ENTITY_NAME = FAILURE_HANDLING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Recovery Action Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR_FEATURE_COUNT = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link reliability.seff.impl.FailureHandlingExternalCallActionImpl <em>Failure Handling External Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.FailureHandlingExternalCallActionImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getFailureHandlingExternalCallAction()
	 * @generated
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION__ID = FAILURE_HANDLING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION__ENTITY_NAME = FAILURE_HANDLING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION__OWNER = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Handling External Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_EXTERNAL_CALL_ACTION_FEATURE_COUNT = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link reliability.seff.impl.AcquireActionTimeoutImpl <em>Acquire Action Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.seff.impl.AcquireActionTimeoutImpl
	 * @see reliability.seff.impl.SeffPackageImpl#getAcquireActionTimeout()
	 * @generated
	 */
	int ACQUIRE_ACTION_TIMEOUT = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_TIMEOUT__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Timeout Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Acquire Action Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_TIMEOUT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link reliability.seff.InternalFailureOccurrenceDescription <em>Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Failure Occurrence Description</em>'.
	 * @see reliability.seff.InternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getInternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link reliability.seff.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Action Internal Failure Occurrence Description</em>'.
	 * @see reliability.seff.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link reliability.seff.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software Induced Failure Type Internal Failure Occurrence Description</em>'.
	 * @see reliability.seff.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for class '{@link reliability.seff.RecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery Action</em>'.
	 * @see reliability.seff.RecoveryAction
	 * @generated
	 */
	EClass getRecoveryAction();

	/**
	 * Returns the meta object for the reference '{@link reliability.seff.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Behaviour Recovery Action</em>'.
	 * @see reliability.seff.RecoveryAction#getPrimaryBehaviour__RecoveryAction()
	 * @see #getRecoveryAction()
	 * @generated
	 */
	EReference getRecoveryAction_PrimaryBehaviour__RecoveryAction();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.seff.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recovery Action Behaviours Recovery Action</em>'.
	 * @see reliability.seff.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction()
	 * @see #getRecoveryAction()
	 * @generated
	 */
	EReference getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

	/**
	 * Returns the meta object for class '{@link reliability.seff.RecoveryActionBehaviour <em>Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery Action Behaviour</em>'.
	 * @see reliability.seff.RecoveryActionBehaviour
	 * @generated
	 */
	EClass getRecoveryActionBehaviour();

	/**
	 * Returns the meta object for the reference list '{@link reliability.seff.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Handling Alternatives Recovery Action Behaviour</em>'.
	 * @see reliability.seff.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour()
	 * @see #getRecoveryActionBehaviour()
	 * @generated
	 */
	EReference getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recovery Action Recovery Action Behaviour</em>'.
	 * @see reliability.seff.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour()
	 * @see #getRecoveryActionBehaviour()
	 * @generated
	 */
	EReference getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

	/**
	 * Returns the meta object for class '{@link reliability.seff.FailureHandlingEntity <em>Failure Handling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Handling Entity</em>'.
	 * @see reliability.seff.FailureHandlingEntity
	 * @generated
	 */
	EClass getFailureHandlingEntity();

	/**
	 * Returns the meta object for the reference list '{@link reliability.seff.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Types Failure Handling Entity</em>'.
	 * @see reliability.seff.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity()
	 * @see #getFailureHandlingEntity()
	 * @generated
	 */
	EReference getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

	/**
	 * Returns the meta object for class '{@link reliability.seff.FailureHandlingExternalCallAction <em>Failure Handling External Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Handling External Call Action</em>'.
	 * @see reliability.seff.FailureHandlingExternalCallAction
	 * @generated
	 */
	EClass getFailureHandlingExternalCallAction();

	/**
	 * Returns the meta object for the reference '{@link reliability.seff.FailureHandlingExternalCallAction#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see reliability.seff.FailureHandlingExternalCallAction#getOwner()
	 * @see #getFailureHandlingExternalCallAction()
	 * @generated
	 */
	EReference getFailureHandlingExternalCallAction_Owner();

	/**
	 * Returns the meta object for class '{@link reliability.seff.AcquireActionTimeout <em>Acquire Action Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Action Timeout</em>'.
	 * @see reliability.seff.AcquireActionTimeout
	 * @generated
	 */
	EClass getAcquireActionTimeout();

	/**
	 * Returns the meta object for the reference '{@link reliability.seff.AcquireActionTimeout#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see reliability.seff.AcquireActionTimeout#getOwner()
	 * @see #getAcquireActionTimeout()
	 * @generated
	 */
	EReference getAcquireActionTimeout_Owner();

	/**
	 * Returns the meta object for the attribute '{@link reliability.seff.AcquireActionTimeout#getTimeoutValue <em>Timeout Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Value</em>'.
	 * @see reliability.seff.AcquireActionTimeout#getTimeoutValue()
	 * @see #getAcquireActionTimeout()
	 * @generated
	 */
	EAttribute getAcquireActionTimeout_TimeoutValue();

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
		 * The meta object literal for the '{@link reliability.seff.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.InternalFailureOccurrenceDescriptionImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getInternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '{@link reliability.seff.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.RecoveryActionImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getRecoveryAction()
		 * @generated
		 */
		EClass RECOVERY_ACTION = eINSTANCE.getRecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_PrimaryBehaviour__RecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

		/**
		 * The meta object literal for the '{@link reliability.seff.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.RecoveryActionBehaviourImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getRecoveryActionBehaviour()
		 * @generated
		 */
		EClass RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour();

		/**
		 * The meta object literal for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

		/**
		 * The meta object literal for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

		/**
		 * The meta object literal for the '{@link reliability.seff.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.FailureHandlingEntityImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getFailureHandlingEntity()
		 * @generated
		 */
		EClass FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity();

		/**
		 * The meta object literal for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

		/**
		 * The meta object literal for the '{@link reliability.seff.impl.FailureHandlingExternalCallActionImpl <em>Failure Handling External Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.FailureHandlingExternalCallActionImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getFailureHandlingExternalCallAction()
		 * @generated
		 */
		EClass FAILURE_HANDLING_EXTERNAL_CALL_ACTION = eINSTANCE.getFailureHandlingExternalCallAction();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_HANDLING_EXTERNAL_CALL_ACTION__OWNER = eINSTANCE.getFailureHandlingExternalCallAction_Owner();

		/**
		 * The meta object literal for the '{@link reliability.seff.impl.AcquireActionTimeoutImpl <em>Acquire Action Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.seff.impl.AcquireActionTimeoutImpl
		 * @see reliability.seff.impl.SeffPackageImpl#getAcquireActionTimeout()
		 * @generated
		 */
		EClass ACQUIRE_ACTION_TIMEOUT = eINSTANCE.getAcquireActionTimeout();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE_ACTION_TIMEOUT__OWNER = eINSTANCE.getAcquireActionTimeout_Owner();

		/**
		 * The meta object literal for the '<em><b>Timeout Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_ACTION_TIMEOUT__TIMEOUT_VALUE = eINSTANCE.getAcquireActionTimeout_TimeoutValue();

	}

} //SeffPackage
