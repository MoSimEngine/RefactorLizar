/**
 */
package events.allocation.impl;

import allocation.impl.DeployableImpl;

import events.allocation.AllocationPackage;
import events.allocation.EventChannelAllocation;

import events.composition.EventChannel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Channel Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link events.allocation.impl.EventChannelAllocationImpl#getEventChannel <em>Event Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChannelAllocationImpl extends DeployableImpl implements EventChannelAllocation {
	/**
	 * The cached value of the '{@link #getEventChannel() <em>Event Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChannel()
	 * @generated
	 * @ordered
	 */
	protected EventChannel eventChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChannelAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.EVENT_CHANNEL_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannel getEventChannel() {
		if (eventChannel != null && eventChannel.eIsProxy()) {
			InternalEObject oldEventChannel = (InternalEObject)eventChannel;
			eventChannel = (EventChannel)eResolveProxy(oldEventChannel);
			if (eventChannel != oldEventChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL, oldEventChannel, eventChannel));
			}
		}
		return eventChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannel basicGetEventChannel() {
		return eventChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventChannel(EventChannel newEventChannel) {
		EventChannel oldEventChannel = eventChannel;
		eventChannel = newEventChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL, oldEventChannel, eventChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL:
				if (resolve) return getEventChannel();
				return basicGetEventChannel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL:
				setEventChannel((EventChannel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL:
				setEventChannel((EventChannel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocationPackage.EVENT_CHANNEL_ALLOCATION__EVENT_CHANNEL:
				return eventChannel != null;
		}
		return super.eIsSet(featureID);
	}

} //EventChannelAllocationImpl
