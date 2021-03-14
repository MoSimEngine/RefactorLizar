/**
 */
package seff;

import base.BasePackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see seff.SeffFactory
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
	String eNS_URI = "mpcm.paradigm.behaviour.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.paradigm.behaviour.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link seff.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.BehaviourImpl
	 * @see seff.impl.SeffPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__STEPS_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link seff.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.AbstractActionImpl
	 * @see seff.impl.SeffPackageImpl#getAbstractAction()
	 * @generated
	 */
	int ABSTRACT_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link seff.impl.AbstractInternalControlFlowActionImpl <em>Abstract Internal Control Flow Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.AbstractInternalControlFlowActionImpl
	 * @see seff.impl.SeffPackageImpl#getAbstractInternalControlFlowAction()
	 * @generated
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME = ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The number of structural features of the '<em>Abstract Internal Control Flow Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link seff.impl.StartActionImpl <em>Start Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.StartActionImpl
	 * @see seff.impl.SeffPackageImpl#getStartAction()
	 * @generated
	 */
	int START_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The number of structural features of the '<em>Start Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link seff.impl.StopActionImpl <em>Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.StopActionImpl
	 * @see seff.impl.SeffPackageImpl#getStopAction()
	 * @generated
	 */
	int STOP_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The number of structural features of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link seff.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.InternalActionImpl
	 * @see seff.impl.SeffPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link seff.impl.BranchActionImpl <em>Branch Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.BranchActionImpl
	 * @see seff.impl.SeffPackageImpl#getBranchAction()
	 * @generated
	 */
	int BRANCH_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Branches Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__BRANCHES_BRANCH = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link seff.impl.AbstractBranchTransitionImpl <em>Abstract Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.AbstractBranchTransitionImpl
	 * @see seff.impl.SeffPackageImpl#getAbstractBranchTransition()
	 * @generated
	 */
	int ABSTRACT_BRANCH_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link seff.impl.ForkActionImpl <em>Fork Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.ForkActionImpl
	 * @see seff.impl.SeffPackageImpl#getForkAction()
	 * @generated
	 */
	int FORK_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link seff.impl.ForkedBehaviourImpl <em>Forked Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.ForkedBehaviourImpl
	 * @see seff.impl.SeffPackageImpl#getForkedBehaviour()
	 * @generated
	 */
	int FORKED_BEHAVIOUR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ID = BEHAVIOUR__ID;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__STEPS_BEHAVIOUR = BEHAVIOUR__STEPS_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__SYNCHRONISATION_POINT_FORKED_BEHAVIOUR = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork Action Forked Behaivour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR = BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link seff.impl.SynchronisationPointImpl <em>Synchronisation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.SynchronisationPointImpl
	 * @see seff.impl.SeffPackageImpl#getSynchronisationPoint()
	 * @generated
	 */
	int SYNCHRONISATION_POINT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__OUTPUT_PARAMETER_USAGE_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork Action Synchronisation Point</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__SYNCHRONOUS_FORKED_BEHAVIOURS_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronisation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link seff.impl.AbstractLoopActionImpl <em>Abstract Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.AbstractLoopActionImpl
	 * @see seff.impl.SeffPackageImpl#getAbstractLoopAction()
	 * @generated
	 */
	int ABSTRACT_LOOP_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link seff.impl.LoopActionImpl <em>Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seff.impl.LoopActionImpl
	 * @see seff.impl.SeffPackageImpl#getLoopAction()
	 * @generated
	 */
	int LOOP_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ID = ABSTRACT_LOOP_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ENTITY_NAME = ABSTRACT_LOOP_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__BODY_BEHAVIOUR_LOOP = ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP;

	/**
	 * The feature id for the '<em><b>Iteration Count Loop Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_FEATURE_COUNT = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link seff.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see seff.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link seff.Behaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Abstract Loop Action Resource Demanding Behaviour</em>'.
	 * @see seff.Behaviour#getAbstractLoopAction_ResourceDemandingBehaviour()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_AbstractLoopAction_ResourceDemandingBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link seff.Behaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Abstract Branch Transition Resource Demanding Behaviour</em>'.
	 * @see seff.Behaviour#getAbstractBranchTransition_ResourceDemandingBehaviour()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link seff.Behaviour#getSteps_Behaviour <em>Steps Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps Behaviour</em>'.
	 * @see seff.Behaviour#getSteps_Behaviour()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Steps_Behaviour();

	/**
	 * Returns the meta object for class '{@link seff.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action</em>'.
	 * @see seff.AbstractAction
	 * @generated
	 */
	EClass getAbstractAction();

	/**
	 * Returns the meta object for the reference '{@link seff.AbstractAction#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor Abstract Action</em>'.
	 * @see seff.AbstractAction#getPredecessor_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Predecessor_AbstractAction();

	/**
	 * Returns the meta object for the reference '{@link seff.AbstractAction#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor Abstract Action</em>'.
	 * @see seff.AbstractAction#getSuccessor_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Successor_AbstractAction();

	/**
	 * Returns the meta object for the container reference '{@link seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Demanding Behaviour Abstract Action</em>'.
	 * @see seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_ResourceDemandingBehaviour_AbstractAction();

	/**
	 * Returns the meta object for class '{@link seff.AbstractInternalControlFlowAction <em>Abstract Internal Control Flow Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Internal Control Flow Action</em>'.
	 * @see seff.AbstractInternalControlFlowAction
	 * @generated
	 */
	EClass getAbstractInternalControlFlowAction();

	/**
	 * Returns the meta object for class '{@link seff.StartAction <em>Start Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Action</em>'.
	 * @see seff.StartAction
	 * @generated
	 */
	EClass getStartAction();

	/**
	 * Returns the meta object for class '{@link seff.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Action</em>'.
	 * @see seff.StopAction
	 * @generated
	 */
	EClass getStopAction();

	/**
	 * Returns the meta object for class '{@link seff.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see seff.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for class '{@link seff.BranchAction <em>Branch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Action</em>'.
	 * @see seff.BranchAction
	 * @generated
	 */
	EClass getBranchAction();

	/**
	 * Returns the meta object for the containment reference list '{@link seff.BranchAction#getBranches_Branch <em>Branches Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches Branch</em>'.
	 * @see seff.BranchAction#getBranches_Branch()
	 * @see #getBranchAction()
	 * @generated
	 */
	EReference getBranchAction_Branches_Branch();

	/**
	 * Returns the meta object for class '{@link seff.AbstractBranchTransition <em>Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Branch Transition</em>'.
	 * @see seff.AbstractBranchTransition
	 * @generated
	 */
	EClass getAbstractBranchTransition();

	/**
	 * Returns the meta object for the container reference '{@link seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition <em>Branch Action Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch Action Abstract Branch Transition</em>'.
	 * @see seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition()
	 * @see #getAbstractBranchTransition()
	 * @generated
	 */
	EReference getAbstractBranchTransition_BranchAction_AbstractBranchTransition();

	/**
	 * Returns the meta object for the containment reference '{@link seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Behaviour Branch Transition</em>'.
	 * @see seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition()
	 * @see #getAbstractBranchTransition()
	 * @generated
	 */
	EReference getAbstractBranchTransition_BranchBehaviour_BranchTransition();

	/**
	 * Returns the meta object for class '{@link seff.ForkAction <em>Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Action</em>'.
	 * @see seff.ForkAction
	 * @generated
	 */
	EClass getForkAction();

	/**
	 * Returns the meta object for the containment reference list '{@link seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynchronous Forked Behaviours Fork Action</em>'.
	 * @see seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction()
	 * @see #getForkAction()
	 * @generated
	 */
	EReference getForkAction_AsynchronousForkedBehaviours_ForkAction();

	/**
	 * Returns the meta object for the containment reference '{@link seff.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronising Behaviours Fork Action</em>'.
	 * @see seff.ForkAction#getSynchronisingBehaviours_ForkAction()
	 * @see #getForkAction()
	 * @generated
	 */
	EReference getForkAction_SynchronisingBehaviours_ForkAction();

	/**
	 * Returns the meta object for class '{@link seff.ForkedBehaviour <em>Forked Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Behaviour</em>'.
	 * @see seff.ForkedBehaviour
	 * @generated
	 */
	EClass getForkedBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Synchronisation Point Forked Behaviour</em>'.
	 * @see seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour()
	 * @see #getForkedBehaviour()
	 * @generated
	 */
	EReference getForkedBehaviour_SynchronisationPoint_ForkedBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link seff.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fork Action Forked Behaivour</em>'.
	 * @see seff.ForkedBehaviour#getForkAction_ForkedBehaivour()
	 * @see #getForkedBehaviour()
	 * @generated
	 */
	EReference getForkedBehaviour_ForkAction_ForkedBehaivour();

	/**
	 * Returns the meta object for class '{@link seff.SynchronisationPoint <em>Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronisation Point</em>'.
	 * @see seff.SynchronisationPoint
	 * @generated
	 */
	EClass getSynchronisationPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link seff.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint <em>Output Parameter Usage Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Usage Synchronisation Point</em>'.
	 * @see seff.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint();

	/**
	 * Returns the meta object for the container reference '{@link seff.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fork Action Synchronisation Point</em>'.
	 * @see seff.SynchronisationPoint#getForkAction_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_ForkAction_SynchronisationPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronous Forked Behaviours Synchronisation Point</em>'.
	 * @see seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint();

	/**
	 * Returns the meta object for class '{@link seff.AbstractLoopAction <em>Abstract Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Loop Action</em>'.
	 * @see seff.AbstractLoopAction
	 * @generated
	 */
	EClass getAbstractLoopAction();

	/**
	 * Returns the meta object for the containment reference '{@link seff.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Behaviour Loop</em>'.
	 * @see seff.AbstractLoopAction#getBodyBehaviour_Loop()
	 * @see #getAbstractLoopAction()
	 * @generated
	 */
	EReference getAbstractLoopAction_BodyBehaviour_Loop();

	/**
	 * Returns the meta object for class '{@link seff.LoopAction <em>Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Action</em>'.
	 * @see seff.LoopAction
	 * @generated
	 */
	EClass getLoopAction();

	/**
	 * Returns the meta object for the containment reference '{@link seff.LoopAction#getIterationCount_LoopAction <em>Iteration Count Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iteration Count Loop Action</em>'.
	 * @see seff.LoopAction#getIterationCount_LoopAction()
	 * @see #getLoopAction()
	 * @generated
	 */
	EReference getLoopAction_IterationCount_LoopAction();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link seff.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.BehaviourImpl
		 * @see seff.impl.SeffPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = eINSTANCE.getBehaviour_AbstractLoopAction_ResourceDemandingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = eINSTANCE.getBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Steps Behaviour</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__STEPS_BEHAVIOUR = eINSTANCE.getBehaviour_Steps_Behaviour();

		/**
		 * The meta object literal for the '{@link seff.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.AbstractActionImpl
		 * @see seff.impl.SeffPackageImpl#getAbstractAction()
		 * @generated
		 */
		EClass ABSTRACT_ACTION = eINSTANCE.getAbstractAction();

		/**
		 * The meta object literal for the '<em><b>Predecessor Abstract Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_Predecessor_AbstractAction();

		/**
		 * The meta object literal for the '<em><b>Successor Abstract Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_Successor_AbstractAction();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_ResourceDemandingBehaviour_AbstractAction();

		/**
		 * The meta object literal for the '{@link seff.impl.AbstractInternalControlFlowActionImpl <em>Abstract Internal Control Flow Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.AbstractInternalControlFlowActionImpl
		 * @see seff.impl.SeffPackageImpl#getAbstractInternalControlFlowAction()
		 * @generated
		 */
		EClass ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = eINSTANCE.getAbstractInternalControlFlowAction();

		/**
		 * The meta object literal for the '{@link seff.impl.StartActionImpl <em>Start Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.StartActionImpl
		 * @see seff.impl.SeffPackageImpl#getStartAction()
		 * @generated
		 */
		EClass START_ACTION = eINSTANCE.getStartAction();

		/**
		 * The meta object literal for the '{@link seff.impl.StopActionImpl <em>Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.StopActionImpl
		 * @see seff.impl.SeffPackageImpl#getStopAction()
		 * @generated
		 */
		EClass STOP_ACTION = eINSTANCE.getStopAction();

		/**
		 * The meta object literal for the '{@link seff.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.InternalActionImpl
		 * @see seff.impl.SeffPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '{@link seff.impl.BranchActionImpl <em>Branch Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.BranchActionImpl
		 * @see seff.impl.SeffPackageImpl#getBranchAction()
		 * @generated
		 */
		EClass BRANCH_ACTION = eINSTANCE.getBranchAction();

		/**
		 * The meta object literal for the '<em><b>Branches Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_ACTION__BRANCHES_BRANCH = eINSTANCE.getBranchAction_Branches_Branch();

		/**
		 * The meta object literal for the '{@link seff.impl.AbstractBranchTransitionImpl <em>Abstract Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.AbstractBranchTransitionImpl
		 * @see seff.impl.SeffPackageImpl#getAbstractBranchTransition()
		 * @generated
		 */
		EClass ABSTRACT_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition_BranchAction_AbstractBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition_BranchBehaviour_BranchTransition();

		/**
		 * The meta object literal for the '{@link seff.impl.ForkActionImpl <em>Fork Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.ForkActionImpl
		 * @see seff.impl.SeffPackageImpl#getForkAction()
		 * @generated
		 */
		EClass FORK_ACTION = eINSTANCE.getForkAction();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION = eINSTANCE.getForkAction_AsynchronousForkedBehaviours_ForkAction();

		/**
		 * The meta object literal for the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION = eINSTANCE.getForkAction_SynchronisingBehaviours_ForkAction();

		/**
		 * The meta object literal for the '{@link seff.impl.ForkedBehaviourImpl <em>Forked Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.ForkedBehaviourImpl
		 * @see seff.impl.SeffPackageImpl#getForkedBehaviour()
		 * @generated
		 */
		EClass FORKED_BEHAVIOUR = eINSTANCE.getForkedBehaviour();

		/**
		 * The meta object literal for the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_BEHAVIOUR__SYNCHRONISATION_POINT_FORKED_BEHAVIOUR = eINSTANCE.getForkedBehaviour_SynchronisationPoint_ForkedBehaviour();

		/**
		 * The meta object literal for the '<em><b>Fork Action Forked Behaivour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR = eINSTANCE.getForkedBehaviour_ForkAction_ForkedBehaivour();

		/**
		 * The meta object literal for the '{@link seff.impl.SynchronisationPointImpl <em>Synchronisation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.SynchronisationPointImpl
		 * @see seff.impl.SeffPackageImpl#getSynchronisationPoint()
		 * @generated
		 */
		EClass SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__OUTPUT_PARAMETER_USAGE_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Fork Action Synchronisation Point</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_ForkAction_SynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__SYNCHRONOUS_FORKED_BEHAVIOURS_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint();

		/**
		 * The meta object literal for the '{@link seff.impl.AbstractLoopActionImpl <em>Abstract Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.AbstractLoopActionImpl
		 * @see seff.impl.SeffPackageImpl#getAbstractLoopAction()
		 * @generated
		 */
		EClass ABSTRACT_LOOP_ACTION = eINSTANCE.getAbstractLoopAction();

		/**
		 * The meta object literal for the '<em><b>Body Behaviour Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP = eINSTANCE.getAbstractLoopAction_BodyBehaviour_Loop();

		/**
		 * The meta object literal for the '{@link seff.impl.LoopActionImpl <em>Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seff.impl.LoopActionImpl
		 * @see seff.impl.SeffPackageImpl#getLoopAction()
		 * @generated
		 */
		EClass LOOP_ACTION = eINSTANCE.getLoopAction();

		/**
		 * The meta object literal for the '<em><b>Iteration Count Loop Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION = eINSTANCE.getLoopAction_IterationCount_LoopAction();

	}

} //SeffPackage
