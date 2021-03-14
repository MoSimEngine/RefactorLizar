/**
 */
package reliabilityannotations.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import reliability.failuretypes.FailureType;

import reliability.impl.FailureOccurrenceDescriptionImpl;

import reliabilityannotations.ExternalFailureOccurrenceDescription;
import reliabilityannotations.ReliabilityannotationsPackage;
import reliabilityannotations.ServiceReliabilityAnnotation;

import reliabilityannotations.util.ReliabilityannotationsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}</li>
 *   <li>{@link reliabilityannotations.impl.ExternalFailureOccurrenceDescriptionImpl#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalFailureOccurrenceDescriptionImpl extends FailureOccurrenceDescriptionImpl implements ExternalFailureOccurrenceDescription {
	/**
	 * The cached value of the '{@link #getFailureType__ExternalFailureOccurrenceDescription() <em>Failure Type External Failure Occurrence Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureType__ExternalFailureOccurrenceDescription()
	 * @generated
	 * @ordered
	 */
	protected FailureType failureType__ExternalFailureOccurrenceDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalFailureOccurrenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliabilityannotationsPackage.Literals.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReliabilityAnnotation getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription() {
		if (eContainerFeatureID() != ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION) return null;
		return (ServiceReliabilityAnnotation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(ServiceReliabilityAnnotation newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription, ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(ServiceReliabilityAnnotation newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription) {
		if (newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription != eInternalContainer() || (eContainerFeatureID() != ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION && newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription != null)) {
			if (EcoreUtil.isAncestor(this, newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription != null)
				msgs = ((InternalEObject)newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription).eInverseAdd(this, ReliabilityannotationsPackage.SERVICE_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION, ServiceReliabilityAnnotation.class, msgs);
			msgs = basicSetSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription, newSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType getFailureType__ExternalFailureOccurrenceDescription() {
		if (failureType__ExternalFailureOccurrenceDescription != null && failureType__ExternalFailureOccurrenceDescription.eIsProxy()) {
			InternalEObject oldFailureType__ExternalFailureOccurrenceDescription = (InternalEObject)failureType__ExternalFailureOccurrenceDescription;
			failureType__ExternalFailureOccurrenceDescription = (FailureType)eResolveProxy(oldFailureType__ExternalFailureOccurrenceDescription);
			if (failureType__ExternalFailureOccurrenceDescription != oldFailureType__ExternalFailureOccurrenceDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, oldFailureType__ExternalFailureOccurrenceDescription, failureType__ExternalFailureOccurrenceDescription));
			}
		}
		return failureType__ExternalFailureOccurrenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType basicGetFailureType__ExternalFailureOccurrenceDescription() {
		return failureType__ExternalFailureOccurrenceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureType__ExternalFailureOccurrenceDescription(FailureType newFailureType__ExternalFailureOccurrenceDescription) {
		FailureType oldFailureType__ExternalFailureOccurrenceDescription = failureType__ExternalFailureOccurrenceDescription;
		failureType__ExternalFailureOccurrenceDescription = newFailureType__ExternalFailureOccurrenceDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION, oldFailureType__ExternalFailureOccurrenceDescription, failureType__ExternalFailureOccurrenceDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ReliabilityannotationsValidator.DIAGNOSTIC_SOURCE,
						 ReliabilityannotationsValidator.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription((ServiceReliabilityAnnotation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return basicSetSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return eInternalContainer().eInverseRemove(this, ReliabilityannotationsPackage.SERVICE_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION, ServiceReliabilityAnnotation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				if (resolve) return getFailureType__ExternalFailureOccurrenceDescription();
				return basicGetFailureType__ExternalFailureOccurrenceDescription();
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
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription((ServiceReliabilityAnnotation)newValue);
				return;
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				setFailureType__ExternalFailureOccurrenceDescription((FailureType)newValue);
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
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription((ServiceReliabilityAnnotation)null);
				return;
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				setFailureType__ExternalFailureOccurrenceDescription((FailureType)null);
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
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription() != null;
			case ReliabilityannotationsPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return failureType__ExternalFailureOccurrenceDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalFailureOccurrenceDescriptionImpl
