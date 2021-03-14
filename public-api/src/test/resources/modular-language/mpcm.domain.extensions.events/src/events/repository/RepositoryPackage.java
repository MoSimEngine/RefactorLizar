/**
 */
package events.repository;

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
 * @see events.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.extensions.events.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.events.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = events.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link events.repository.impl.EventGroupImpl <em>Event Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.repository.impl.EventGroupImpl
	 * @see events.repository.impl.RepositoryPackageImpl#getEventGroup()
	 * @generated
	 */
	int EVENT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__ID = repository.RepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__ENTITY_NAME = repository.RepositoryPackage.INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__PARENT_INTERFACES_INTERFACE = repository.RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__PROTOCOLS_INTERFACE = repository.RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__REQUIRED_CHARACTERISATIONS = repository.RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Event Types Event Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = repository.RepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP_FEATURE_COUNT = repository.RepositoryPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link events.repository.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.repository.impl.EventTypeImpl
	 * @see events.repository.impl.RepositoryPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ID = repository.RepositoryPackage.SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ENTITY_NAME = repository.RepositoryPackage.SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameter Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PARAMETER_EVENT_TYPE = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Group Event Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = repository.RepositoryPackage.SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link events.repository.impl.SourceRoleImpl <em>Source Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.repository.impl.SourceRoleImpl
	 * @see events.repository.impl.RepositoryPackageImpl#getSourceRole()
	 * @generated
	 */
	int SOURCE_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__ID = repository.RepositoryPackage.REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__ENTITY_NAME = repository.RepositoryPackage.REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = repository.RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Event Group Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = repository.RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE_FEATURE_COUNT = repository.RepositoryPackage.REQUIRED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link events.repository.impl.SinkRoleImpl <em>Sink Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.repository.impl.SinkRoleImpl
	 * @see events.repository.impl.RepositoryPackageImpl#getSinkRole()
	 * @generated
	 */
	int SINK_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__ID = repository.RepositoryPackage.PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__ENTITY_NAME = repository.RepositoryPackage.PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = repository.RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Event Group Sink Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__EVENT_GROUP_SINK_ROLE = repository.RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sink Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE_FEATURE_COUNT = repository.RepositoryPackage.PROVIDED_ROLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link events.repository.EventGroup <em>Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Group</em>'.
	 * @see events.repository.EventGroup
	 * @generated
	 */
	EClass getEventGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link events.repository.EventGroup#getEventTypes__EventGroup <em>Event Types Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Types Event Group</em>'.
	 * @see events.repository.EventGroup#getEventTypes__EventGroup()
	 * @see #getEventGroup()
	 * @generated
	 */
	EReference getEventGroup_EventTypes__EventGroup();

	/**
	 * Returns the meta object for class '{@link events.repository.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see events.repository.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the containment reference '{@link events.repository.EventType#getParameter__EventType <em>Parameter Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Event Type</em>'.
	 * @see events.repository.EventType#getParameter__EventType()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Parameter__EventType();

	/**
	 * Returns the meta object for the container reference '{@link events.repository.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Group Event Type</em>'.
	 * @see events.repository.EventType#getEventGroup__EventType()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_EventGroup__EventType();

	/**
	 * Returns the meta object for class '{@link events.repository.SourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Role</em>'.
	 * @see events.repository.SourceRole
	 * @generated
	 */
	EClass getSourceRole();

	/**
	 * Returns the meta object for the reference '{@link events.repository.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Group Source Role</em>'.
	 * @see events.repository.SourceRole#getEventGroup__SourceRole()
	 * @see #getSourceRole()
	 * @generated
	 */
	EReference getSourceRole_EventGroup__SourceRole();

	/**
	 * Returns the meta object for class '{@link events.repository.SinkRole <em>Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Role</em>'.
	 * @see events.repository.SinkRole
	 * @generated
	 */
	EClass getSinkRole();

	/**
	 * Returns the meta object for the reference '{@link events.repository.SinkRole#getEventGroup__SinkRole <em>Event Group Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Group Sink Role</em>'.
	 * @see events.repository.SinkRole#getEventGroup__SinkRole()
	 * @see #getSinkRole()
	 * @generated
	 */
	EReference getSinkRole_EventGroup__SinkRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link events.repository.impl.EventGroupImpl <em>Event Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.repository.impl.EventGroupImpl
		 * @see events.repository.impl.RepositoryPackageImpl#getEventGroup()
		 * @generated
		 */
		EClass EVENT_GROUP = eINSTANCE.getEventGroup();

		/**
		 * The meta object literal for the '<em><b>Event Types Event Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = eINSTANCE.getEventGroup_EventTypes__EventGroup();

		/**
		 * The meta object literal for the '{@link events.repository.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.repository.impl.EventTypeImpl
		 * @see events.repository.impl.RepositoryPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Parameter Event Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__PARAMETER_EVENT_TYPE = eINSTANCE.getEventType_Parameter__EventType();

		/**
		 * The meta object literal for the '<em><b>Event Group Event Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = eINSTANCE.getEventType_EventGroup__EventType();

		/**
		 * The meta object literal for the '{@link events.repository.impl.SourceRoleImpl <em>Source Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.repository.impl.SourceRoleImpl
		 * @see events.repository.impl.RepositoryPackageImpl#getSourceRole()
		 * @generated
		 */
		EClass SOURCE_ROLE = eINSTANCE.getSourceRole();

		/**
		 * The meta object literal for the '<em><b>Event Group Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = eINSTANCE.getSourceRole_EventGroup__SourceRole();

		/**
		 * The meta object literal for the '{@link events.repository.impl.SinkRoleImpl <em>Sink Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.repository.impl.SinkRoleImpl
		 * @see events.repository.impl.RepositoryPackageImpl#getSinkRole()
		 * @generated
		 */
		EClass SINK_ROLE = eINSTANCE.getSinkRole();

		/**
		 * The meta object literal for the '<em><b>Event Group Sink Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_ROLE__EVENT_GROUP_SINK_ROLE = eINSTANCE.getSinkRole_EventGroup__SinkRole();

	}

} //RepositoryPackage
