/**
 */
package events.seff;

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
 * @see events.seff.SeffFactory
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
	String eNS_URI = "mpcm.domain.extensions.events.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.events.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = events.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link events.seff.impl.EmitEventActionImpl <em>Emit Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.seff.impl.EmitEventActionImpl
	 * @see events.seff.impl.SeffPackageImpl#getEmitEventAction()
	 * @generated
	 */
	int EMIT_EVENT_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__ID = seff.SeffPackage.ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__ENTITY_NAME = seff.SeffPackage.ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__PREDECESSOR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__SUCCESSOR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = seff.SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = seff.SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION = seff.SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Role Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION = seff.SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emit Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION_FEATURE_COUNT = seff.SeffPackage.ABSTRACT_ACTION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link events.seff.EmitEventAction <em>Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Event Action</em>'.
	 * @see events.seff.EmitEventAction
	 * @generated
	 */
	EClass getEmitEventAction();

	/**
	 * Returns the meta object for the reference '{@link events.seff.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type Emit Event Action</em>'.
	 * @see events.seff.EmitEventAction#getEventType__EmitEventAction()
	 * @see #getEmitEventAction()
	 * @generated
	 */
	EReference getEmitEventAction_EventType__EmitEventAction();

	/**
	 * Returns the meta object for the reference '{@link events.seff.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Role Emit Event Action</em>'.
	 * @see events.seff.EmitEventAction#getSourceRole__EmitEventAction()
	 * @see #getEmitEventAction()
	 * @generated
	 */
	EReference getEmitEventAction_SourceRole__EmitEventAction();

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
		 * The meta object literal for the '{@link events.seff.impl.EmitEventActionImpl <em>Emit Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.seff.impl.EmitEventActionImpl
		 * @see events.seff.impl.SeffPackageImpl#getEmitEventAction()
		 * @generated
		 */
		EClass EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction();

		/**
		 * The meta object literal for the '<em><b>Event Type Emit Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction_EventType__EmitEventAction();

		/**
		 * The meta object literal for the '<em><b>Source Role Emit Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction_SourceRole__EmitEventAction();

	}

} //SeffPackage
