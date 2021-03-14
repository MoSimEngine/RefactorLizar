/**
 */
package performance.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import performance.resources.ProcessingResourcePerformanceSpecification;
import performance.resources.ResourcesPackage;

import resources.ProcessingResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.impl.ProcessingResourcePerformanceSpecificationImpl#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingResourcePerformanceSpecificationImpl extends MinimalEObjectImpl.Container implements ProcessingResourcePerformanceSpecification {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceSpecification owner;

	/**
	 * The cached value of the '{@link #getProcessingRate_ProcessingResourceSpecification() <em>Processing Rate Processing Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRate_ProcessingResourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable processingRate_ProcessingResourceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourcePerformanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (ProcessingResourceSpecification)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecification basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(ProcessingResourceSpecification newOwner) {
		ProcessingResourceSpecification oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getProcessingRate_ProcessingResourceSpecification() {
		return processingRate_ProcessingResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingRate_ProcessingResourceSpecification(PCMRandomVariable newProcessingRate_ProcessingResourceSpecification, NotificationChain msgs) {
		PCMRandomVariable oldProcessingRate_ProcessingResourceSpecification = processingRate_ProcessingResourceSpecification;
		processingRate_ProcessingResourceSpecification = newProcessingRate_ProcessingResourceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION, oldProcessingRate_ProcessingResourceSpecification, newProcessingRate_ProcessingResourceSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingRate_ProcessingResourceSpecification(PCMRandomVariable newProcessingRate_ProcessingResourceSpecification) {
		if (newProcessingRate_ProcessingResourceSpecification != processingRate_ProcessingResourceSpecification) {
			NotificationChain msgs = null;
			if (processingRate_ProcessingResourceSpecification != null)
				msgs = ((InternalEObject)processingRate_ProcessingResourceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION, null, msgs);
			if (newProcessingRate_ProcessingResourceSpecification != null)
				msgs = ((InternalEObject)newProcessingRate_ProcessingResourceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION, null, msgs);
			msgs = basicSetProcessingRate_ProcessingResourceSpecification(newProcessingRate_ProcessingResourceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION, newProcessingRate_ProcessingResourceSpecification, newProcessingRate_ProcessingResourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION:
				return basicSetProcessingRate_ProcessingResourceSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION:
				return getProcessingRate_ProcessingResourceSpecification();
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
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((ProcessingResourceSpecification)newValue);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION:
				setProcessingRate_ProcessingResourceSpecification((PCMRandomVariable)newValue);
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
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((ProcessingResourceSpecification)null);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION:
				setProcessingRate_ProcessingResourceSpecification((PCMRandomVariable)null);
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
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				return owner != null;
			case ResourcesPackage.PROCESSING_RESOURCE_PERFORMANCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION:
				return processingRate_ProcessingResourceSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessingResourcePerformanceSpecificationImpl
