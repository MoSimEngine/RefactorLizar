/**
 */
package usage;

import base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see usage.UsageFactory
 * @model kind="package"
 * @generated
 */
public interface UsagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.paradigm.behaviour.usage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.paradigm.behaviour.usage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsagePackage eINSTANCE = usage.impl.UsagePackageImpl.init();

	/**
	 * The meta object id for the '{@link usage.impl.ScenarioBehaviourImpl <em>Scenario Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.ScenarioBehaviourImpl
	 * @see usage.impl.UsagePackageImpl#getScenarioBehaviour()
	 * @generated
	 */
	int SCENARIO_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Transition Scenario Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Scenario Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions Scenario Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_BEHAVIOUR_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link usage.impl.AbstractUserActionImpl <em>Abstract User Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.AbstractUserActionImpl
	 * @see usage.impl.UsagePackageImpl#getAbstractUserAction()
	 * @generated
	 */
	int ABSTRACT_USER_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION__SUCCESSOR = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION__PREDECESSOR = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract User Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_ACTION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link usage.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.StartImpl
	 * @see usage.impl.UsagePackageImpl#getStart()
	 * @generated
	 */
	int START = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ID = ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ENTITY_NAME = ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SUCCESSOR = ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PREDECESSOR = ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link usage.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.StopImpl
	 * @see usage.impl.UsagePackageImpl#getStop()
	 * @generated
	 */
	int STOP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ID = ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ENTITY_NAME = ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__SUCCESSOR = ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PREDECESSOR = ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link usage.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.BranchImpl
	 * @see usage.impl.UsagePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ID = ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ENTITY_NAME = ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SUCCESSOR = ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PREDECESSOR = ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Branch Transitions Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_TRANSITIONS_BRANCH = ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link usage.impl.BranchTransitionImpl <em>Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.BranchTransitionImpl
	 * @see usage.impl.UsagePackageImpl#getBranchTransition()
	 * @generated
	 */
	int BRANCH_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TRANSITION__BRANCH_PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Branch Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Branched Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION = 2;

	/**
	 * The number of structural features of the '<em>Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link usage.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.LoopImpl
	 * @see usage.impl.UsagePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ID = ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ENTITY_NAME = ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__SUCCESSOR = ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__PREDECESSOR = ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Loop Iteration Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_ITERATION_LOOP = ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY_BEHAVIOUR_LOOP = ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ABSTRACT_USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link usage.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usage.impl.DelayImpl
	 * @see usage.impl.UsagePackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__ID = ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__ENTITY_NAME = ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__SUCCESSOR = ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PREDECESSOR = ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Time Specification Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__TIME_SPECIFICATION_DELAY = ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link usage.ScenarioBehaviour <em>Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Behaviour</em>'.
	 * @see usage.ScenarioBehaviour
	 * @generated
	 */
	EClass getScenarioBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link usage.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch Transition Scenario Behaviour</em>'.
	 * @see usage.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour()
	 * @see #getScenarioBehaviour()
	 * @generated
	 */
	EReference getScenarioBehaviour_BranchTransition_ScenarioBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link usage.ScenarioBehaviour#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Scenario Behaviour</em>'.
	 * @see usage.ScenarioBehaviour#getLoop_ScenarioBehaviour()
	 * @see #getScenarioBehaviour()
	 * @generated
	 */
	EReference getScenarioBehaviour_Loop_ScenarioBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link usage.ScenarioBehaviour#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions Scenario Behaviour</em>'.
	 * @see usage.ScenarioBehaviour#getActions_ScenarioBehaviour()
	 * @see #getScenarioBehaviour()
	 * @generated
	 */
	EReference getScenarioBehaviour_Actions_ScenarioBehaviour();

	/**
	 * Returns the meta object for class '{@link usage.AbstractUserAction <em>Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract User Action</em>'.
	 * @see usage.AbstractUserAction
	 * @generated
	 */
	EClass getAbstractUserAction();

	/**
	 * Returns the meta object for the reference '{@link usage.AbstractUserAction#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see usage.AbstractUserAction#getSuccessor()
	 * @see #getAbstractUserAction()
	 * @generated
	 */
	EReference getAbstractUserAction_Successor();

	/**
	 * Returns the meta object for the reference '{@link usage.AbstractUserAction#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see usage.AbstractUserAction#getPredecessor()
	 * @see #getAbstractUserAction()
	 * @generated
	 */
	EReference getAbstractUserAction_Predecessor();

	/**
	 * Returns the meta object for the container reference '{@link usage.AbstractUserAction#getScenarioBehaviour_AbstractUserAction <em>Scenario Behaviour Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario Behaviour Abstract User Action</em>'.
	 * @see usage.AbstractUserAction#getScenarioBehaviour_AbstractUserAction()
	 * @see #getAbstractUserAction()
	 * @generated
	 */
	EReference getAbstractUserAction_ScenarioBehaviour_AbstractUserAction();

	/**
	 * Returns the meta object for class '{@link usage.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see usage.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link usage.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see usage.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link usage.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see usage.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link usage.Branch#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch Transitions Branch</em>'.
	 * @see usage.Branch#getBranchTransitions_Branch()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_BranchTransitions_Branch();

	/**
	 * Returns the meta object for class '{@link usage.BranchTransition <em>Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Transition</em>'.
	 * @see usage.BranchTransition
	 * @generated
	 */
	EClass getBranchTransition();

	/**
	 * Returns the meta object for the attribute '{@link usage.BranchTransition#getBranchProbability <em>Branch Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Probability</em>'.
	 * @see usage.BranchTransition#getBranchProbability()
	 * @see #getBranchTransition()
	 * @generated
	 */
	EAttribute getBranchTransition_BranchProbability();

	/**
	 * Returns the meta object for the container reference '{@link usage.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch Branch Transition</em>'.
	 * @see usage.BranchTransition#getBranch_BranchTransition()
	 * @see #getBranchTransition()
	 * @generated
	 */
	EReference getBranchTransition_Branch_BranchTransition();

	/**
	 * Returns the meta object for the containment reference '{@link usage.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branched Behaviour Branch Transition</em>'.
	 * @see usage.BranchTransition#getBranchedBehaviour_BranchTransition()
	 * @see #getBranchTransition()
	 * @generated
	 */
	EReference getBranchTransition_BranchedBehaviour_BranchTransition();

	/**
	 * Returns the meta object for class '{@link usage.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see usage.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link usage.Loop#getLoopIteration_Loop <em>Loop Iteration Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Iteration Loop</em>'.
	 * @see usage.Loop#getLoopIteration_Loop()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopIteration_Loop();

	/**
	 * Returns the meta object for the containment reference '{@link usage.Loop#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Behaviour Loop</em>'.
	 * @see usage.Loop#getBodyBehaviour_Loop()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_BodyBehaviour_Loop();

	/**
	 * Returns the meta object for class '{@link usage.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see usage.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the containment reference '{@link usage.Delay#getTimeSpecification_Delay <em>Time Specification Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Specification Delay</em>'.
	 * @see usage.Delay#getTimeSpecification_Delay()
	 * @see #getDelay()
	 * @generated
	 */
	EReference getDelay_TimeSpecification_Delay();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsageFactory getUsageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link usage.impl.ScenarioBehaviourImpl <em>Scenario Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.ScenarioBehaviourImpl
		 * @see usage.impl.UsagePackageImpl#getScenarioBehaviour()
		 * @generated
		 */
		EClass SCENARIO_BEHAVIOUR = eINSTANCE.getScenarioBehaviour();

		/**
		 * The meta object literal for the '<em><b>Branch Transition Scenario Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR = eINSTANCE.getScenarioBehaviour_BranchTransition_ScenarioBehaviour();

		/**
		 * The meta object literal for the '<em><b>Loop Scenario Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR = eINSTANCE.getScenarioBehaviour_Loop_ScenarioBehaviour();

		/**
		 * The meta object literal for the '<em><b>Actions Scenario Behaviour</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR = eINSTANCE.getScenarioBehaviour_Actions_ScenarioBehaviour();

		/**
		 * The meta object literal for the '{@link usage.impl.AbstractUserActionImpl <em>Abstract User Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.AbstractUserActionImpl
		 * @see usage.impl.UsagePackageImpl#getAbstractUserAction()
		 * @generated
		 */
		EClass ABSTRACT_USER_ACTION = eINSTANCE.getAbstractUserAction();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_USER_ACTION__SUCCESSOR = eINSTANCE.getAbstractUserAction_Successor();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_USER_ACTION__PREDECESSOR = eINSTANCE.getAbstractUserAction_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = eINSTANCE.getAbstractUserAction_ScenarioBehaviour_AbstractUserAction();

		/**
		 * The meta object literal for the '{@link usage.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.StartImpl
		 * @see usage.impl.UsagePackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link usage.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.StopImpl
		 * @see usage.impl.UsagePackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link usage.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.BranchImpl
		 * @see usage.impl.UsagePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Branch Transitions Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__BRANCH_TRANSITIONS_BRANCH = eINSTANCE.getBranch_BranchTransitions_Branch();

		/**
		 * The meta object literal for the '{@link usage.impl.BranchTransitionImpl <em>Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.BranchTransitionImpl
		 * @see usage.impl.UsagePackageImpl#getBranchTransition()
		 * @generated
		 */
		EClass BRANCH_TRANSITION = eINSTANCE.getBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_TRANSITION__BRANCH_PROBABILITY = eINSTANCE.getBranchTransition_BranchProbability();

		/**
		 * The meta object literal for the '<em><b>Branch Branch Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION = eINSTANCE.getBranchTransition_Branch_BranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branched Behaviour Branch Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION = eINSTANCE.getBranchTransition_BranchedBehaviour_BranchTransition();

		/**
		 * The meta object literal for the '{@link usage.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.LoopImpl
		 * @see usage.impl.UsagePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Iteration Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_ITERATION_LOOP = eINSTANCE.getLoop_LoopIteration_Loop();

		/**
		 * The meta object literal for the '<em><b>Body Behaviour Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY_BEHAVIOUR_LOOP = eINSTANCE.getLoop_BodyBehaviour_Loop();

		/**
		 * The meta object literal for the '{@link usage.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usage.impl.DelayImpl
		 * @see usage.impl.UsagePackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Time Specification Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY__TIME_SPECIFICATION_DELAY = eINSTANCE.getDelay_TimeSpecification_Delay();

	}

} //UsagePackage
