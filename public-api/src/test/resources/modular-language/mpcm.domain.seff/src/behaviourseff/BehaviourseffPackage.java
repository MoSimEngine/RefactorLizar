/**
 */
package behaviourseff;

import base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import seff.SeffPackage;

import softwarerepository.SoftwarerepositoryPackage;

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
 * <!-- begin-model-doc -->
 * Package containing the abstract behaviour model of components
 * <!-- end-model-doc -->
 * @see behaviourseff.BehaviourseffFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourseffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviourseff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.behaviourseff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.behaviourseff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourseffPackage eINSTANCE = behaviourseff.impl.BehaviourseffPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviourseff.impl.BehaviourSEFFImpl <em>Behaviour SEFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.BehaviourSEFFImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getBehaviourSEFF()
	 * @generated
	 */
	int BEHAVIOUR_SEFF = 0;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_SEFF__SEFF_TYPE_ID = SoftwarerepositoryPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_SEFF__DESCRIBED_SERVICE_SEFF = SoftwarerepositoryPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = SoftwarerepositoryPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_SEFF__BEHAVIOUR = SoftwarerepositoryPackage.SERVICE_EFFECT_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behaviour SEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_SEFF_FEATURE_COUNT = SoftwarerepositoryPackage.SERVICE_EFFECT_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.ProbabilisticBranchTransitionImpl <em>Probabilistic Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.ProbabilisticBranchTransitionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getProbabilisticBranchTransition()
	 * @generated
	 */
	int PROBABILISTIC_BRANCH_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__ID = SeffPackage.ABSTRACT_BRANCH_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__ENTITY_NAME = SeffPackage.ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY = SeffPackage.ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabilistic Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION_FEATURE_COUNT = SeffPackage.ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.GuardedBranchTransitionImpl <em>Guarded Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.GuardedBranchTransitionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getGuardedBranchTransition()
	 * @generated
	 */
	int GUARDED_BRANCH_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__ID = SeffPackage.ABSTRACT_BRANCH_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__ENTITY_NAME = SeffPackage.ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Condition Guarded Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION = SeffPackage.ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION_FEATURE_COUNT = SeffPackage.ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.CollectionIteratorActionImpl <em>Collection Iterator Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.CollectionIteratorActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCollectionIteratorAction()
	 * @generated
	 */
	int COLLECTION_ITERATOR_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__ID = SeffPackage.ABSTRACT_LOOP_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_LOOP_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__BODY_BEHAVIOUR_LOOP = SeffPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP;

	/**
	 * The feature id for the '<em><b>Parameter Collection Iterator Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION = SeffPackage.ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Iterator Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.CallActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.CallReturnActionImpl <em>Call Return Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.CallReturnActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCallReturnAction()
	 * @generated
	 */
	int CALL_RETURN_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__ID = CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__ENTITY_NAME = CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.ExternalCallActionImpl <em>External Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.ExternalCallActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getExternalCallAction()
	 * @generated
	 */
	int EXTERNAL_CALL_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ID = SeffPackage.ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Called Service External Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role External Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RETRY_COUNT = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>External Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.AcquireActionImpl <em>Acquire Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.AcquireActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getAcquireAction()
	 * @generated
	 */
	int ACQUIRE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__ID = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Passiveresource Acquire Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acquire Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.ReleaseActionImpl <em>Release Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.ReleaseActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getReleaseAction()
	 * @generated
	 */
	int RELEASE_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__ID = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Passive Resource Release Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link behaviourseff.impl.SetVariableActionImpl <em>Set Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourseff.impl.SetVariableActionImpl
	 * @see behaviourseff.impl.BehaviourseffPackageImpl#getSetVariableAction()
	 * @generated
	 */
	int SET_VARIABLE_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__ID = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Local Variable Usages Set Variable Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link behaviourseff.BehaviourSEFF <em>Behaviour SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour SEFF</em>'.
	 * @see behaviourseff.BehaviourSEFF
	 * @generated
	 */
	EClass getBehaviourSEFF();

	/**
	 * Returns the meta object for the containment reference '{@link behaviourseff.BehaviourSEFF#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour</em>'.
	 * @see behaviourseff.BehaviourSEFF#getBehaviour()
	 * @see #getBehaviourSEFF()
	 * @generated
	 */
	EReference getBehaviourSEFF_Behaviour();

	/**
	 * Returns the meta object for class '{@link behaviourseff.ProbabilisticBranchTransition <em>Probabilistic Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Branch Transition</em>'.
	 * @see behaviourseff.ProbabilisticBranchTransition
	 * @generated
	 */
	EClass getProbabilisticBranchTransition();

	/**
	 * Returns the meta object for the attribute '{@link behaviourseff.ProbabilisticBranchTransition#getBranchProbability <em>Branch Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Probability</em>'.
	 * @see behaviourseff.ProbabilisticBranchTransition#getBranchProbability()
	 * @see #getProbabilisticBranchTransition()
	 * @generated
	 */
	EAttribute getProbabilisticBranchTransition_BranchProbability();

	/**
	 * Returns the meta object for class '{@link behaviourseff.GuardedBranchTransition <em>Guarded Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Branch Transition</em>'.
	 * @see behaviourseff.GuardedBranchTransition
	 * @generated
	 */
	EClass getGuardedBranchTransition();

	/**
	 * Returns the meta object for the containment reference '{@link behaviourseff.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition <em>Branch Condition Guarded Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Condition Guarded Branch Transition</em>'.
	 * @see behaviourseff.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition()
	 * @see #getGuardedBranchTransition()
	 * @generated
	 */
	EReference getGuardedBranchTransition_BranchCondition_GuardedBranchTransition();

	/**
	 * Returns the meta object for class '{@link behaviourseff.CollectionIteratorAction <em>Collection Iterator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Iterator Action</em>'.
	 * @see behaviourseff.CollectionIteratorAction
	 * @generated
	 */
	EClass getCollectionIteratorAction();

	/**
	 * Returns the meta object for the reference '{@link behaviourseff.CollectionIteratorAction#getParameter_CollectionIteratorAction <em>Parameter Collection Iterator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Collection Iterator Action</em>'.
	 * @see behaviourseff.CollectionIteratorAction#getParameter_CollectionIteratorAction()
	 * @see #getCollectionIteratorAction()
	 * @generated
	 */
	EReference getCollectionIteratorAction_Parameter_CollectionIteratorAction();

	/**
	 * Returns the meta object for class '{@link behaviourseff.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see behaviourseff.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviourseff.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Variable Usages Call Action</em>'.
	 * @see behaviourseff.CallAction#getInputVariableUsages__CallAction()
	 * @see #getCallAction()
	 * @generated
	 */
	EReference getCallAction_InputVariableUsages__CallAction();

	/**
	 * Returns the meta object for class '{@link behaviourseff.CallReturnAction <em>Call Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Return Action</em>'.
	 * @see behaviourseff.CallReturnAction
	 * @generated
	 */
	EClass getCallReturnAction();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviourseff.CallReturnAction#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Variable Usage Call Return Action</em>'.
	 * @see behaviourseff.CallReturnAction#getReturnVariableUsage__CallReturnAction()
	 * @see #getCallReturnAction()
	 * @generated
	 */
	EReference getCallReturnAction_ReturnVariableUsage__CallReturnAction();

	/**
	 * Returns the meta object for class '{@link behaviourseff.ExternalCallAction <em>External Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call Action</em>'.
	 * @see behaviourseff.ExternalCallAction
	 * @generated
	 */
	EClass getExternalCallAction();

	/**
	 * Returns the meta object for the reference '{@link behaviourseff.ExternalCallAction#getCalledService_ExternalService <em>Called Service External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Service External Service</em>'.
	 * @see behaviourseff.ExternalCallAction#getCalledService_ExternalService()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EReference getExternalCallAction_CalledService_ExternalService();

	/**
	 * Returns the meta object for the reference '{@link behaviourseff.ExternalCallAction#getRole_ExternalService <em>Role External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role External Service</em>'.
	 * @see behaviourseff.ExternalCallAction#getRole_ExternalService()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EReference getExternalCallAction_Role_ExternalService();

	/**
	 * Returns the meta object for the attribute '{@link behaviourseff.ExternalCallAction#getRetryCount <em>Retry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Count</em>'.
	 * @see behaviourseff.ExternalCallAction#getRetryCount()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EAttribute getExternalCallAction_RetryCount();

	/**
	 * Returns the meta object for class '{@link behaviourseff.AcquireAction <em>Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Action</em>'.
	 * @see behaviourseff.AcquireAction
	 * @generated
	 */
	EClass getAcquireAction();

	/**
	 * Returns the meta object for the reference '{@link behaviourseff.AcquireAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passiveresource Acquire Action</em>'.
	 * @see behaviourseff.AcquireAction#getPassiveresource_AcquireAction()
	 * @see #getAcquireAction()
	 * @generated
	 */
	EReference getAcquireAction_Passiveresource_AcquireAction();

	/**
	 * Returns the meta object for class '{@link behaviourseff.ReleaseAction <em>Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Action</em>'.
	 * @see behaviourseff.ReleaseAction
	 * @generated
	 */
	EClass getReleaseAction();

	/**
	 * Returns the meta object for the reference '{@link behaviourseff.ReleaseAction#getPassiveResource_ReleaseAction <em>Passive Resource Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Resource Release Action</em>'.
	 * @see behaviourseff.ReleaseAction#getPassiveResource_ReleaseAction()
	 * @see #getReleaseAction()
	 * @generated
	 */
	EReference getReleaseAction_PassiveResource_ReleaseAction();

	/**
	 * Returns the meta object for class '{@link behaviourseff.SetVariableAction <em>Set Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Variable Action</em>'.
	 * @see behaviourseff.SetVariableAction
	 * @generated
	 */
	EClass getSetVariableAction();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviourseff.SetVariableAction#getLocalVariableUsages_SetVariableAction <em>Local Variable Usages Set Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variable Usages Set Variable Action</em>'.
	 * @see behaviourseff.SetVariableAction#getLocalVariableUsages_SetVariableAction()
	 * @see #getSetVariableAction()
	 * @generated
	 */
	EReference getSetVariableAction_LocalVariableUsages_SetVariableAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourseffFactory getBehaviourseffFactory();

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
		 * The meta object literal for the '{@link behaviourseff.impl.BehaviourSEFFImpl <em>Behaviour SEFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.BehaviourSEFFImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getBehaviourSEFF()
		 * @generated
		 */
		EClass BEHAVIOUR_SEFF = eINSTANCE.getBehaviourSEFF();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_SEFF__BEHAVIOUR = eINSTANCE.getBehaviourSEFF_Behaviour();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.ProbabilisticBranchTransitionImpl <em>Probabilistic Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.ProbabilisticBranchTransitionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getProbabilisticBranchTransition()
		 * @generated
		 */
		EClass PROBABILISTIC_BRANCH_TRANSITION = eINSTANCE.getProbabilisticBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY = eINSTANCE.getProbabilisticBranchTransition_BranchProbability();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.GuardedBranchTransitionImpl <em>Guarded Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.GuardedBranchTransitionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getGuardedBranchTransition()
		 * @generated
		 */
		EClass GUARDED_BRANCH_TRANSITION = eINSTANCE.getGuardedBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Condition Guarded Branch Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION = eINSTANCE.getGuardedBranchTransition_BranchCondition_GuardedBranchTransition();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.CollectionIteratorActionImpl <em>Collection Iterator Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.CollectionIteratorActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCollectionIteratorAction()
		 * @generated
		 */
		EClass COLLECTION_ITERATOR_ACTION = eINSTANCE.getCollectionIteratorAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Collection Iterator Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION = eINSTANCE.getCollectionIteratorAction_Parameter_CollectionIteratorAction();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.CallActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = eINSTANCE.getCallAction_InputVariableUsages__CallAction();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.CallReturnActionImpl <em>Call Return Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.CallReturnActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getCallReturnAction()
		 * @generated
		 */
		EClass CALL_RETURN_ACTION = eINSTANCE.getCallReturnAction();

		/**
		 * The meta object literal for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = eINSTANCE.getCallReturnAction_ReturnVariableUsage__CallReturnAction();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.ExternalCallActionImpl <em>External Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.ExternalCallActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getExternalCallAction()
		 * @generated
		 */
		EClass EXTERNAL_CALL_ACTION = eINSTANCE.getExternalCallAction();

		/**
		 * The meta object literal for the '<em><b>Called Service External Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE = eINSTANCE.getExternalCallAction_CalledService_ExternalService();

		/**
		 * The meta object literal for the '<em><b>Role External Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE = eINSTANCE.getExternalCallAction_Role_ExternalService();

		/**
		 * The meta object literal for the '<em><b>Retry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_CALL_ACTION__RETRY_COUNT = eINSTANCE.getExternalCallAction_RetryCount();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.AcquireActionImpl <em>Acquire Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.AcquireActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getAcquireAction()
		 * @generated
		 */
		EClass ACQUIRE_ACTION = eINSTANCE.getAcquireAction();

		/**
		 * The meta object literal for the '<em><b>Passiveresource Acquire Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = eINSTANCE.getAcquireAction_Passiveresource_AcquireAction();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.ReleaseActionImpl <em>Release Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.ReleaseActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getReleaseAction()
		 * @generated
		 */
		EClass RELEASE_ACTION = eINSTANCE.getReleaseAction();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Release Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION = eINSTANCE.getReleaseAction_PassiveResource_ReleaseAction();

		/**
		 * The meta object literal for the '{@link behaviourseff.impl.SetVariableActionImpl <em>Set Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourseff.impl.SetVariableActionImpl
		 * @see behaviourseff.impl.BehaviourseffPackageImpl#getSetVariableAction()
		 * @generated
		 */
		EClass SET_VARIABLE_ACTION = eINSTANCE.getSetVariableAction();

		/**
		 * The meta object literal for the '<em><b>Local Variable Usages Set Variable Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION = eINSTANCE.getSetVariableAction_LocalVariableUsages_SetVariableAction();

	}

} //BehaviourseffPackage
