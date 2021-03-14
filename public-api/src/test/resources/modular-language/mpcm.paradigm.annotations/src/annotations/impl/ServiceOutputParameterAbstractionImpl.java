/**
 */
package annotations.impl;

import annotations.AnnotationRoot;
import annotations.AnnotationsPackage;
import annotations.ServiceOutputParameterAbstraction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.Role;
import repository.Signature;

import variables.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Output Parameter Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link annotations.impl.ServiceOutputParameterAbstractionImpl#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.impl.ServiceOutputParameterAbstractionImpl#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.impl.ServiceOutputParameterAbstractionImpl#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction <em>Expected External Outputs Specified Output Parameter Abstraction</em>}</li>
 *   <li>{@link annotations.impl.ServiceOutputParameterAbstractionImpl#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceOutputParameterAbstractionImpl extends MinimalEObjectImpl.Container implements ServiceOutputParameterAbstraction {
	/**
	 * The cached value of the '{@link #getSignature_SpecifiedOutputParameterAbstraction() <em>Signature Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature_SpecifiedOutputParameterAbstraction()
	 * @generated
	 * @ordered
	 */
	protected Signature signature_SpecifiedOutputParameterAbstraction;

	/**
	 * The cached value of the '{@link #getRole_SpecifiedOutputParameterAbstraction() <em>Role Specified Output Parameter Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_SpecifiedOutputParameterAbstraction()
	 * @generated
	 * @ordered
	 */
	protected Role role_SpecifiedOutputParameterAbstraction;

	/**
	 * The cached value of the '{@link #getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction() <em>Expected External Outputs Specified Output Parameter Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> expectedExternalOutputs_SpecifiedOutputParameterAbstraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOutputParameterAbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.SERVICE_OUTPUT_PARAMETER_ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getSignature_SpecifiedOutputParameterAbstraction() {
		if (signature_SpecifiedOutputParameterAbstraction != null && signature_SpecifiedOutputParameterAbstraction.eIsProxy()) {
			InternalEObject oldSignature_SpecifiedOutputParameterAbstraction = (InternalEObject)signature_SpecifiedOutputParameterAbstraction;
			signature_SpecifiedOutputParameterAbstraction = (Signature)eResolveProxy(oldSignature_SpecifiedOutputParameterAbstraction);
			if (signature_SpecifiedOutputParameterAbstraction != oldSignature_SpecifiedOutputParameterAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldSignature_SpecifiedOutputParameterAbstraction, signature_SpecifiedOutputParameterAbstraction));
			}
		}
		return signature_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature_SpecifiedOutputParameterAbstraction() {
		return signature_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature_SpecifiedOutputParameterAbstraction(Signature newSignature_SpecifiedOutputParameterAbstraction) {
		Signature oldSignature_SpecifiedOutputParameterAbstraction = signature_SpecifiedOutputParameterAbstraction;
		signature_SpecifiedOutputParameterAbstraction = newSignature_SpecifiedOutputParameterAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldSignature_SpecifiedOutputParameterAbstraction, signature_SpecifiedOutputParameterAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole_SpecifiedOutputParameterAbstraction() {
		if (role_SpecifiedOutputParameterAbstraction != null && role_SpecifiedOutputParameterAbstraction.eIsProxy()) {
			InternalEObject oldRole_SpecifiedOutputParameterAbstraction = (InternalEObject)role_SpecifiedOutputParameterAbstraction;
			role_SpecifiedOutputParameterAbstraction = (Role)eResolveProxy(oldRole_SpecifiedOutputParameterAbstraction);
			if (role_SpecifiedOutputParameterAbstraction != oldRole_SpecifiedOutputParameterAbstraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldRole_SpecifiedOutputParameterAbstraction, role_SpecifiedOutputParameterAbstraction));
			}
		}
		return role_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole_SpecifiedOutputParameterAbstraction() {
		return role_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_SpecifiedOutputParameterAbstraction(Role newRole_SpecifiedOutputParameterAbstraction) {
		Role oldRole_SpecifiedOutputParameterAbstraction = role_SpecifiedOutputParameterAbstraction;
		role_SpecifiedOutputParameterAbstraction = newRole_SpecifiedOutputParameterAbstraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, oldRole_SpecifiedOutputParameterAbstraction, role_SpecifiedOutputParameterAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableUsage> getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction() {
		if (expectedExternalOutputs_SpecifiedOutputParameterAbstraction == null) {
			expectedExternalOutputs_SpecifiedOutputParameterAbstraction = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
		}
		return expectedExternalOutputs_SpecifiedOutputParameterAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationRoot getQosAnnotations_SpecifiedOutputParameterAbstraction() {
		if (eContainerFeatureID() != AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION) return null;
		return (AnnotationRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQosAnnotations_SpecifiedOutputParameterAbstraction(AnnotationRoot newQosAnnotations_SpecifiedOutputParameterAbstraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQosAnnotations_SpecifiedOutputParameterAbstraction, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQosAnnotations_SpecifiedOutputParameterAbstraction(AnnotationRoot newQosAnnotations_SpecifiedOutputParameterAbstraction) {
		if (newQosAnnotations_SpecifiedOutputParameterAbstraction != eInternalContainer() || (eContainerFeatureID() != AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION && newQosAnnotations_SpecifiedOutputParameterAbstraction != null)) {
			if (EcoreUtil.isAncestor(this, newQosAnnotations_SpecifiedOutputParameterAbstraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQosAnnotations_SpecifiedOutputParameterAbstraction != null)
				msgs = ((InternalEObject)newQosAnnotations_SpecifiedOutputParameterAbstraction).eInverseAdd(this, AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS, AnnotationRoot.class, msgs);
			msgs = basicSetQosAnnotations_SpecifiedOutputParameterAbstraction(newQosAnnotations_SpecifiedOutputParameterAbstraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION, newQosAnnotations_SpecifiedOutputParameterAbstraction, newQosAnnotations_SpecifiedOutputParameterAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQosAnnotations_SpecifiedOutputParameterAbstraction((AnnotationRoot)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return ((InternalEList<?>)getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return basicSetQosAnnotations_SpecifiedOutputParameterAbstraction(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return eInternalContainer().eInverseRemove(this, AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS, AnnotationRoot.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				if (resolve) return getSignature_SpecifiedOutputParameterAbstraction();
				return basicGetSignature_SpecifiedOutputParameterAbstraction();
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				if (resolve) return getRole_SpecifiedOutputParameterAbstraction();
				return basicGetRole_SpecifiedOutputParameterAbstraction();
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return getQosAnnotations_SpecifiedOutputParameterAbstraction();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setSignature_SpecifiedOutputParameterAbstraction((Signature)newValue);
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setRole_SpecifiedOutputParameterAbstraction((Role)newValue);
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction().clear();
				getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setQosAnnotations_SpecifiedOutputParameterAbstraction((AnnotationRoot)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setSignature_SpecifiedOutputParameterAbstraction((Signature)null);
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setRole_SpecifiedOutputParameterAbstraction((Role)null);
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction().clear();
				return;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				setQosAnnotations_SpecifiedOutputParameterAbstraction((AnnotationRoot)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return signature_SpecifiedOutputParameterAbstraction != null;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return role_SpecifiedOutputParameterAbstraction != null;
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return expectedExternalOutputs_SpecifiedOutputParameterAbstraction != null && !expectedExternalOutputs_SpecifiedOutputParameterAbstraction.isEmpty();
			case AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return getQosAnnotations_SpecifiedOutputParameterAbstraction() != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ServiceOutputParameterAbstractionImpl
