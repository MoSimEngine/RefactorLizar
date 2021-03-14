/**
 */
package reliability.failuretypes.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import reliability.failuretypes.FailuretypesPackage;
import reliability.failuretypes.NetworkInducedFailureType;

import reliability.failuretypes.util.FailuretypesValidator;

import resources.resourcetype.CommunicationLinkResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.failuretypes.impl.NetworkInducedFailureTypeImpl#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInducedFailureTypeImpl extends FailureTypeImpl implements NetworkInducedFailureType {
	/**
	 * The cached value of the '{@link #getCommunicationLinkResourceType__NetworkInducedFailureType() <em>Communication Link Resource Type Network Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkResourceType communicationLinkResourceType__NetworkInducedFailureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInducedFailureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailuretypesPackage.Literals.NETWORK_INDUCED_FAILURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceType getCommunicationLinkResourceType__NetworkInducedFailureType() {
		if (communicationLinkResourceType__NetworkInducedFailureType != null && communicationLinkResourceType__NetworkInducedFailureType.eIsProxy()) {
			InternalEObject oldCommunicationLinkResourceType__NetworkInducedFailureType = (InternalEObject)communicationLinkResourceType__NetworkInducedFailureType;
			communicationLinkResourceType__NetworkInducedFailureType = (CommunicationLinkResourceType)eResolveProxy(oldCommunicationLinkResourceType__NetworkInducedFailureType);
			if (communicationLinkResourceType__NetworkInducedFailureType != oldCommunicationLinkResourceType__NetworkInducedFailureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, oldCommunicationLinkResourceType__NetworkInducedFailureType, communicationLinkResourceType__NetworkInducedFailureType));
			}
		}
		return communicationLinkResourceType__NetworkInducedFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceType basicGetCommunicationLinkResourceType__NetworkInducedFailureType() {
		return communicationLinkResourceType__NetworkInducedFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType newCommunicationLinkResourceType__NetworkInducedFailureType) {
		CommunicationLinkResourceType oldCommunicationLinkResourceType__NetworkInducedFailureType = communicationLinkResourceType__NetworkInducedFailureType;
		communicationLinkResourceType__NetworkInducedFailureType = newCommunicationLinkResourceType__NetworkInducedFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE, oldCommunicationLinkResourceType__NetworkInducedFailureType, communicationLinkResourceType__NetworkInducedFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NetworkInducedFailureTypeHasCommunicationLinkResourceType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FailuretypesValidator.DIAGNOSTIC_SOURCE,
						 FailuretypesValidator.NETWORK_INDUCED_FAILURE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_HAS_COMMUNICATION_LINK_RESOURCE_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NetworkInducedFailureTypeHasCommunicationLinkResourceType", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
				if (resolve) return getCommunicationLinkResourceType__NetworkInducedFailureType();
				return basicGetCommunicationLinkResourceType__NetworkInducedFailureType();
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
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
				setCommunicationLinkResourceType__NetworkInducedFailureType((CommunicationLinkResourceType)newValue);
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
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
				setCommunicationLinkResourceType__NetworkInducedFailureType((CommunicationLinkResourceType)null);
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
			case FailuretypesPackage.NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE:
				return communicationLinkResourceType__NetworkInducedFailureType != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkInducedFailureTypeImpl
