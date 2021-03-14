/**
 */
package events.composition;

import base.BasePackage;

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
 * @see events.composition.CompositionFactory
 * @model kind="package"
 * @generated
 */
public interface CompositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "composition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.extensions.events.composition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.events.composition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = events.composition.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link events.composition.impl.AssemblyEventConnectorImpl <em>Assembly Event Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.AssemblyEventConnectorImpl
	 * @see events.composition.impl.CompositionPackageImpl#getAssemblyEventConnector()
	 * @generated
	 */
	int ASSEMBLY_EVENT_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__ID = composition.CompositionPackage.CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Sink Role Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Role Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sink Assembly Context Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Assembly Context Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filter Condition Assembly Event Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR__FILTER_CONDITION_ASSEMBLY_EVENT_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assembly Event Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_EVENT_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link events.composition.impl.EventChannelImpl <em>Event Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.EventChannelImpl
	 * @see events.composition.impl.CompositionPackageImpl#getEventChannel()
	 * @generated
	 */
	int EVENT_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__ENTITY_NAME = BasePackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Event Group Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__EVENT_GROUP_EVENT_CHANNEL = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Channel Source Connector Event Channel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__EVENT_CHANNEL_SOURCE_CONNECTOR_EVENT_CHANNEL = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Channel Sink Connector Event Channel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__EVENT_CHANNEL_SINK_CONNECTOR_EVENT_CHANNEL = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Structure Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link events.composition.impl.EventChannelSourceConnectorImpl <em>Event Channel Source Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.EventChannelSourceConnectorImpl
	 * @see events.composition.impl.CompositionPackageImpl#getEventChannelSourceConnector()
	 * @generated
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__ID = composition.CompositionPackage.CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Source Role Event Channel Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__SOURCE_ROLE_EVENT_CHANNEL_SOURCE_ROLE = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assembly Context Event Channel Source Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SOURCE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Channel Event Channel Source Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SOURCE_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Channel Source Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SOURCE_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link events.composition.impl.EventChannelSinkConnectorImpl <em>Event Channel Sink Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.EventChannelSinkConnectorImpl
	 * @see events.composition.impl.CompositionPackageImpl#getEventChannelSinkConnector()
	 * @generated
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__ID = composition.CompositionPackage.CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Sink Role Event Channel Sink Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Condition Event Channel Sink Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context Event Channel Sink Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Channel Event Channel Sink Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SINK_CONNECTOR = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Channel Sink Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_SINK_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link events.composition.impl.SourceDelegationConnectorImpl <em>Source Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.SourceDelegationConnectorImpl
	 * @see events.composition.impl.CompositionPackageImpl#getSourceDelegationConnector()
	 * @generated
	 */
	int SOURCE_DELEGATION_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__ID = composition.CompositionPackage.DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Inner Source Role Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Source Role Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Context Source Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DELEGATION_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link events.composition.impl.SinkDelegationConnectorImpl <em>Sink Delegation Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.composition.impl.SinkDelegationConnectorImpl
	 * @see events.composition.impl.CompositionPackageImpl#getSinkDelegationConnector()
	 * @generated
	 */
	int SINK_DELEGATION_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__ID = composition.CompositionPackage.DELEGATION_CONNECTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__ENTITY_NAME = composition.CompositionPackage.DELEGATION_CONNECTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Structure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR__PARENT_STRUCTURE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Assembly Context Sink Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Sink Role Sink Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outer Sink Role Sink Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sink Delegation Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_DELEGATION_CONNECTOR_FEATURE_COUNT = composition.CompositionPackage.DELEGATION_CONNECTOR_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link events.composition.AssemblyEventConnector <em>Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector
	 * @generated
	 */
	EClass getAssemblyEventConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.AssemblyEventConnector#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink Role Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector#getSinkRole__AssemblyEventConnector()
	 * @see #getAssemblyEventConnector()
	 * @generated
	 */
	EReference getAssemblyEventConnector_SinkRole__AssemblyEventConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.AssemblyEventConnector#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Role Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector#getSourceRole__AssemblyEventConnector()
	 * @see #getAssemblyEventConnector()
	 * @generated
	 */
	EReference getAssemblyEventConnector_SourceRole__AssemblyEventConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink Assembly Context Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector()
	 * @see #getAssemblyEventConnector()
	 * @generated
	 */
	EReference getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Assembly Context Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector()
	 * @see #getAssemblyEventConnector()
	 * @generated
	 */
	EReference getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector();

	/**
	 * Returns the meta object for the containment reference '{@link events.composition.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Condition Assembly Event Connector</em>'.
	 * @see events.composition.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector()
	 * @see #getAssemblyEventConnector()
	 * @generated
	 */
	EReference getAssemblyEventConnector_FilterCondition__AssemblyEventConnector();

	/**
	 * Returns the meta object for class '{@link events.composition.EventChannel <em>Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel</em>'.
	 * @see events.composition.EventChannel
	 * @generated
	 */
	EClass getEventChannel();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannel#getEventGroup__EventChannel <em>Event Group Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Group Event Channel</em>'.
	 * @see events.composition.EventChannel#getEventGroup__EventChannel()
	 * @see #getEventChannel()
	 * @generated
	 */
	EReference getEventChannel_EventGroup__EventChannel();

	/**
	 * Returns the meta object for the reference list '{@link events.composition.EventChannel#getEventChannelSourceConnector__EventChannel <em>Event Channel Source Connector Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Channel Source Connector Event Channel</em>'.
	 * @see events.composition.EventChannel#getEventChannelSourceConnector__EventChannel()
	 * @see #getEventChannel()
	 * @generated
	 */
	EReference getEventChannel_EventChannelSourceConnector__EventChannel();

	/**
	 * Returns the meta object for the reference list '{@link events.composition.EventChannel#getEventChannelSinkConnector__EventChannel <em>Event Channel Sink Connector Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Channel Sink Connector Event Channel</em>'.
	 * @see events.composition.EventChannel#getEventChannelSinkConnector__EventChannel()
	 * @see #getEventChannel()
	 * @generated
	 */
	EReference getEventChannel_EventChannelSinkConnector__EventChannel();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Structure Event Channel</em>'.
	 * @see events.composition.EventChannel#getParentStructure__EventChannel()
	 * @see #getEventChannel()
	 * @generated
	 */
	EReference getEventChannel_ParentStructure__EventChannel();

	/**
	 * Returns the meta object for class '{@link events.composition.EventChannelSourceConnector <em>Event Channel Source Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel Source Connector</em>'.
	 * @see events.composition.EventChannelSourceConnector
	 * @generated
	 */
	EClass getEventChannelSourceConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole <em>Source Role Event Channel Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Role Event Channel Source Role</em>'.
	 * @see events.composition.EventChannelSourceConnector#getSourceRole__EventChannelSourceRole()
	 * @see #getEventChannelSourceConnector()
	 * @generated
	 */
	EReference getEventChannelSourceConnector_SourceRole__EventChannelSourceRole();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector <em>Assembly Context Event Channel Source Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Event Channel Source Connector</em>'.
	 * @see events.composition.EventChannelSourceConnector#getAssemblyContext__EventChannelSourceConnector()
	 * @see #getEventChannelSourceConnector()
	 * @generated
	 */
	EReference getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector <em>Event Channel Event Channel Source Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Channel Event Channel Source Connector</em>'.
	 * @see events.composition.EventChannelSourceConnector#getEventChannel__EventChannelSourceConnector()
	 * @see #getEventChannelSourceConnector()
	 * @generated
	 */
	EReference getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector();

	/**
	 * Returns the meta object for class '{@link events.composition.EventChannelSinkConnector <em>Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel Sink Connector</em>'.
	 * @see events.composition.EventChannelSinkConnector
	 * @generated
	 */
	EClass getEventChannelSinkConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSinkConnector#getSinkRole__EventChannelSinkConnector <em>Sink Role Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink Role Event Channel Sink Connector</em>'.
	 * @see events.composition.EventChannelSinkConnector#getSinkRole__EventChannelSinkConnector()
	 * @see #getEventChannelSinkConnector()
	 * @generated
	 */
	EReference getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector();

	/**
	 * Returns the meta object for the containment reference '{@link events.composition.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector <em>Filter Condition Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Condition Event Channel Sink Connector</em>'.
	 * @see events.composition.EventChannelSinkConnector#getFilterCondition__EventChannelSinkConnector()
	 * @see #getEventChannelSinkConnector()
	 * @generated
	 */
	EReference getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSinkConnector#getAssemblyContext__EventChannelSinkConnector <em>Assembly Context Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Event Channel Sink Connector</em>'.
	 * @see events.composition.EventChannelSinkConnector#getAssemblyContext__EventChannelSinkConnector()
	 * @see #getEventChannelSinkConnector()
	 * @generated
	 */
	EReference getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector <em>Event Channel Event Channel Sink Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Channel Event Channel Sink Connector</em>'.
	 * @see events.composition.EventChannelSinkConnector#getEventChannel__EventChannelSinkConnector()
	 * @see #getEventChannelSinkConnector()
	 * @generated
	 */
	EReference getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector();

	/**
	 * Returns the meta object for class '{@link events.composition.SourceDelegationConnector <em>Source Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Delegation Connector</em>'.
	 * @see events.composition.SourceDelegationConnector
	 * @generated
	 */
	EClass getSourceDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SourceDelegationConnector#getInnerSourceRole__SourceRole <em>Inner Source Role Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Source Role Source Role</em>'.
	 * @see events.composition.SourceDelegationConnector#getInnerSourceRole__SourceRole()
	 * @see #getSourceDelegationConnector()
	 * @generated
	 */
	EReference getSourceDelegationConnector_InnerSourceRole__SourceRole();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SourceDelegationConnector#getOuterSourceRole__SourceRole <em>Outer Source Role Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Source Role Source Role</em>'.
	 * @see events.composition.SourceDelegationConnector#getOuterSourceRole__SourceRole()
	 * @see #getSourceDelegationConnector()
	 * @generated
	 */
	EReference getSourceDelegationConnector_OuterSourceRole__SourceRole();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SourceDelegationConnector#getAssemblyContext__SourceDelegationConnector <em>Assembly Context Source Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Source Delegation Connector</em>'.
	 * @see events.composition.SourceDelegationConnector#getAssemblyContext__SourceDelegationConnector()
	 * @see #getSourceDelegationConnector()
	 * @generated
	 */
	EReference getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector();

	/**
	 * Returns the meta object for class '{@link events.composition.SinkDelegationConnector <em>Sink Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Delegation Connector</em>'.
	 * @see events.composition.SinkDelegationConnector
	 * @generated
	 */
	EClass getSinkDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SinkDelegationConnector#getAssemblyContext__SinkDelegationConnector <em>Assembly Context Sink Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Sink Delegation Connector</em>'.
	 * @see events.composition.SinkDelegationConnector#getAssemblyContext__SinkDelegationConnector()
	 * @see #getSinkDelegationConnector()
	 * @generated
	 */
	EReference getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SinkDelegationConnector#getInnerSinkRole__SinkRole <em>Inner Sink Role Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Sink Role Sink Role</em>'.
	 * @see events.composition.SinkDelegationConnector#getInnerSinkRole__SinkRole()
	 * @see #getSinkDelegationConnector()
	 * @generated
	 */
	EReference getSinkDelegationConnector_InnerSinkRole__SinkRole();

	/**
	 * Returns the meta object for the reference '{@link events.composition.SinkDelegationConnector#getOuterSinkRole__SinkRole <em>Outer Sink Role Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Sink Role Sink Role</em>'.
	 * @see events.composition.SinkDelegationConnector#getOuterSinkRole__SinkRole()
	 * @see #getSinkDelegationConnector()
	 * @generated
	 */
	EReference getSinkDelegationConnector_OuterSinkRole__SinkRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositionFactory getCompositionFactory();

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
		 * The meta object literal for the '{@link events.composition.impl.AssemblyEventConnectorImpl <em>Assembly Event Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.AssemblyEventConnectorImpl
		 * @see events.composition.impl.CompositionPackageImpl#getAssemblyEventConnector()
		 * @generated
		 */
		EClass ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector();

		/**
		 * The meta object literal for the '<em><b>Sink Role Assembly Event Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector_SinkRole__AssemblyEventConnector();

		/**
		 * The meta object literal for the '<em><b>Source Role Assembly Event Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector_SourceRole__AssemblyEventConnector();

		/**
		 * The meta object literal for the '<em><b>Sink Assembly Context Assembly Event Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector();

		/**
		 * The meta object literal for the '<em><b>Source Assembly Context Assembly Event Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector();

		/**
		 * The meta object literal for the '<em><b>Filter Condition Assembly Event Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_EVENT_CONNECTOR__FILTER_CONDITION_ASSEMBLY_EVENT_CONNECTOR = eINSTANCE.getAssemblyEventConnector_FilterCondition__AssemblyEventConnector();

		/**
		 * The meta object literal for the '{@link events.composition.impl.EventChannelImpl <em>Event Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.EventChannelImpl
		 * @see events.composition.impl.CompositionPackageImpl#getEventChannel()
		 * @generated
		 */
		EClass EVENT_CHANNEL = eINSTANCE.getEventChannel();

		/**
		 * The meta object literal for the '<em><b>Event Group Event Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL__EVENT_GROUP_EVENT_CHANNEL = eINSTANCE.getEventChannel_EventGroup__EventChannel();

		/**
		 * The meta object literal for the '<em><b>Event Channel Source Connector Event Channel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL__EVENT_CHANNEL_SOURCE_CONNECTOR_EVENT_CHANNEL = eINSTANCE.getEventChannel_EventChannelSourceConnector__EventChannel();

		/**
		 * The meta object literal for the '<em><b>Event Channel Sink Connector Event Channel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL__EVENT_CHANNEL_SINK_CONNECTOR_EVENT_CHANNEL = eINSTANCE.getEventChannel_EventChannelSinkConnector__EventChannel();

		/**
		 * The meta object literal for the '<em><b>Parent Structure Event Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL = eINSTANCE.getEventChannel_ParentStructure__EventChannel();

		/**
		 * The meta object literal for the '{@link events.composition.impl.EventChannelSourceConnectorImpl <em>Event Channel Source Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.EventChannelSourceConnectorImpl
		 * @see events.composition.impl.CompositionPackageImpl#getEventChannelSourceConnector()
		 * @generated
		 */
		EClass EVENT_CHANNEL_SOURCE_CONNECTOR = eINSTANCE.getEventChannelSourceConnector();

		/**
		 * The meta object literal for the '<em><b>Source Role Event Channel Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SOURCE_CONNECTOR__SOURCE_ROLE_EVENT_CHANNEL_SOURCE_ROLE = eINSTANCE.getEventChannelSourceConnector_SourceRole__EventChannelSourceRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Event Channel Source Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SOURCE_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SOURCE_CONNECTOR = eINSTANCE.getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector();

		/**
		 * The meta object literal for the '<em><b>Event Channel Event Channel Source Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SOURCE_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SOURCE_CONNECTOR = eINSTANCE.getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector();

		/**
		 * The meta object literal for the '{@link events.composition.impl.EventChannelSinkConnectorImpl <em>Event Channel Sink Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.EventChannelSinkConnectorImpl
		 * @see events.composition.impl.CompositionPackageImpl#getEventChannelSinkConnector()
		 * @generated
		 */
		EClass EVENT_CHANNEL_SINK_CONNECTOR = eINSTANCE.getEventChannelSinkConnector();

		/**
		 * The meta object literal for the '<em><b>Sink Role Event Channel Sink Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR = eINSTANCE.getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector();

		/**
		 * The meta object literal for the '<em><b>Filter Condition Event Channel Sink Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR = eINSTANCE.getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Event Channel Sink Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR = eINSTANCE.getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector();

		/**
		 * The meta object literal for the '<em><b>Event Channel Event Channel Sink Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_SINK_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SINK_CONNECTOR = eINSTANCE.getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector();

		/**
		 * The meta object literal for the '{@link events.composition.impl.SourceDelegationConnectorImpl <em>Source Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.SourceDelegationConnectorImpl
		 * @see events.composition.impl.CompositionPackageImpl#getSourceDelegationConnector()
		 * @generated
		 */
		EClass SOURCE_DELEGATION_CONNECTOR = eINSTANCE.getSourceDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Source Role Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE = eINSTANCE.getSourceDelegationConnector_InnerSourceRole__SourceRole();

		/**
		 * The meta object literal for the '<em><b>Outer Source Role Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE = eINSTANCE.getSourceDelegationConnector_OuterSourceRole__SourceRole();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Source Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR = eINSTANCE.getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector();

		/**
		 * The meta object literal for the '{@link events.composition.impl.SinkDelegationConnectorImpl <em>Sink Delegation Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.composition.impl.SinkDelegationConnectorImpl
		 * @see events.composition.impl.CompositionPackageImpl#getSinkDelegationConnector()
		 * @generated
		 */
		EClass SINK_DELEGATION_CONNECTOR = eINSTANCE.getSinkDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Sink Delegation Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR = eINSTANCE.getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector();

		/**
		 * The meta object literal for the '<em><b>Inner Sink Role Sink Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE = eINSTANCE.getSinkDelegationConnector_InnerSinkRole__SinkRole();

		/**
		 * The meta object literal for the '<em><b>Outer Sink Role Sink Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE = eINSTANCE.getSinkDelegationConnector_OuterSinkRole__SinkRole();

	}

} //CompositionPackage
