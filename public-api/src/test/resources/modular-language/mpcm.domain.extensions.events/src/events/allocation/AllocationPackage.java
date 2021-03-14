/**
 */
package events.allocation;

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
 * @see events.allocation.AllocationFactory
 * @model kind="package"
 * @generated
 */
public interface AllocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.domain.extensions.events.allocation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.domain.extensions.events.allocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationPackage eINSTANCE = events.allocation.impl.AllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link events.allocation.impl.EventChannelAllocationImpl <em>Event Channel Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see events.allocation.impl.EventChannelAllocationImpl
	 * @see events.allocation.impl.AllocationPackageImpl#getEventChannelAllocation()
	 * @generated
	 */
	int EVENT_CHANNEL_ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Event Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL = allocation.AllocationPackage.DEPLOYABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Channel Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHANNEL_ALLOCATION_FEATURE_COUNT = allocation.AllocationPackage.DEPLOYABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link events.allocation.EventChannelAllocation <em>Event Channel Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Channel Allocation</em>'.
	 * @see events.allocation.EventChannelAllocation
	 * @generated
	 */
	EClass getEventChannelAllocation();

	/**
	 * Returns the meta object for the reference '{@link events.allocation.EventChannelAllocation#getEventChannel <em>Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Channel</em>'.
	 * @see events.allocation.EventChannelAllocation#getEventChannel()
	 * @see #getEventChannelAllocation()
	 * @generated
	 */
	EReference getEventChannelAllocation_EventChannel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationFactory getAllocationFactory();

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
		 * The meta object literal for the '{@link events.allocation.impl.EventChannelAllocationImpl <em>Event Channel Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see events.allocation.impl.EventChannelAllocationImpl
		 * @see events.allocation.impl.AllocationPackageImpl#getEventChannelAllocation()
		 * @generated
		 */
		EClass EVENT_CHANNEL_ALLOCATION = eINSTANCE.getEventChannelAllocation();

		/**
		 * The meta object literal for the '<em><b>Event Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL = eINSTANCE.getEventChannelAllocation_EventChannel();

	}

} //AllocationPackage
