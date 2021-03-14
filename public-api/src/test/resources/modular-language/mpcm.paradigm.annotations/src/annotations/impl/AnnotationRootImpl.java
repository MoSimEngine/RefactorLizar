/**
 */
package annotations.impl;

import annotations.AnnotationRoot;
import annotations.AnnotationsPackage;
import annotations.ServiceOutputParameterAbstraction;
import annotations.ServicePropertyAnnotation;

import annotations.util.AnnotationsValidator;

import base.impl.EntityImpl;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link annotations.impl.AnnotationRootImpl#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 *   <li>{@link annotations.impl.AnnotationRootImpl#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationRootImpl extends EntityImpl implements AnnotationRoot {
	/**
	 * The cached value of the '{@link #getSpecifiedOutputParameterAbstractions_QoSAnnotations() <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOutputParameterAbstraction> specifiedOutputParameterAbstractions_QoSAnnotations;

	/**
	 * The cached value of the '{@link #getSpecifiedQoSAnnotations_QoSAnnotations() <em>Specified Qo SAnnotations Qo SAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedQoSAnnotations_QoSAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicePropertyAnnotation> specifiedQoSAnnotations_QoSAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ANNOTATION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations() {
		if (specifiedOutputParameterAbstractions_QoSAnnotations == null) {
			specifiedOutputParameterAbstractions_QoSAnnotations = new EObjectContainmentWithInverseEList<ServiceOutputParameterAbstraction>(ServiceOutputParameterAbstraction.class, this, AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS, AnnotationsPackage.SERVICE_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION);
		}
		return specifiedOutputParameterAbstractions_QoSAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServicePropertyAnnotation> getSpecifiedQoSAnnotations_QoSAnnotations() {
		if (specifiedQoSAnnotations_QoSAnnotations == null) {
			specifiedQoSAnnotations_QoSAnnotations = new EObjectContainmentWithInverseEList<ServicePropertyAnnotation>(ServicePropertyAnnotation.class, this, AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS, AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION);
		}
		return specifiedQoSAnnotations_QoSAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean MultipleReliabilityAnnotationsPerExternalCallNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AnnotationsValidator.DIAGNOSTIC_SOURCE,
						 AnnotationsValidator.ANNOTATION_ROOT__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultipleReliabilityAnnotationsPerExternalCallNotAllowed", EObjectValidator.getObjectLabel(this, context) }),
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifiedOutputParameterAbstractions_QoSAnnotations()).basicAdd(otherEnd, msgs);
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifiedQoSAnnotations_QoSAnnotations()).basicAdd(otherEnd, msgs);
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
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				return ((InternalEList<?>)getSpecifiedOutputParameterAbstractions_QoSAnnotations()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				return ((InternalEList<?>)getSpecifiedQoSAnnotations_QoSAnnotations()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.ANNOTATION_ROOT__ID:
				return getId();
			case AnnotationsPackage.ANNOTATION_ROOT__ENTITY_NAME:
				return getEntityName();
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				return getSpecifiedOutputParameterAbstractions_QoSAnnotations();
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				return getSpecifiedQoSAnnotations_QoSAnnotations();
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
			case AnnotationsPackage.ANNOTATION_ROOT__ID:
				setId((String)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				getSpecifiedOutputParameterAbstractions_QoSAnnotations().clear();
				getSpecifiedOutputParameterAbstractions_QoSAnnotations().addAll((Collection<? extends ServiceOutputParameterAbstraction>)newValue);
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				getSpecifiedQoSAnnotations_QoSAnnotations().clear();
				getSpecifiedQoSAnnotations_QoSAnnotations().addAll((Collection<? extends ServicePropertyAnnotation>)newValue);
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
			case AnnotationsPackage.ANNOTATION_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				getSpecifiedOutputParameterAbstractions_QoSAnnotations().clear();
				return;
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				getSpecifiedQoSAnnotations_QoSAnnotations().clear();
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
			case AnnotationsPackage.ANNOTATION_ROOT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case AnnotationsPackage.ANNOTATION_ROOT__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS:
				return specifiedOutputParameterAbstractions_QoSAnnotations != null && !specifiedOutputParameterAbstractions_QoSAnnotations.isEmpty();
			case AnnotationsPackage.ANNOTATION_ROOT__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS:
				return specifiedQoSAnnotations_QoSAnnotations != null && !specifiedQoSAnnotations_QoSAnnotations.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //AnnotationRootImpl
