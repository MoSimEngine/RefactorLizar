/**
 */
package performance.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import performance.resources.HDDResourcePerformanceSpecification;
import performance.resources.ResourcesPackage;

import resources.HDDProcessingResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDD Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.impl.HDDResourcePerformanceSpecificationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.impl.HDDResourcePerformanceSpecificationImpl#getWriteProcessingRate <em>Write Processing Rate</em>}</li>
 *   <li>{@link performance.resources.impl.HDDResourcePerformanceSpecificationImpl#getReadProcessingRate <em>Read Processing Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDDResourcePerformanceSpecificationImpl extends MinimalEObjectImpl.Container implements HDDResourcePerformanceSpecification {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected HDDProcessingResourceSpecification owner;

	/**
	 * The cached value of the '{@link #getWriteProcessingRate() <em>Write Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable writeProcessingRate;

	/**
	 * The cached value of the '{@link #getReadProcessingRate() <em>Read Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable readProcessingRate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDResourcePerformanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.HDD_RESOURCE_PERFORMANCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDProcessingResourceSpecification getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (HDDProcessingResourceSpecification)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDProcessingResourceSpecification basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(HDDProcessingResourceSpecification newOwner) {
		HDDProcessingResourceSpecification oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getWriteProcessingRate() {
		return writeProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteProcessingRate(PCMRandomVariable newWriteProcessingRate, NotificationChain msgs) {
		PCMRandomVariable oldWriteProcessingRate = writeProcessingRate;
		writeProcessingRate = newWriteProcessingRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE, oldWriteProcessingRate, newWriteProcessingRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteProcessingRate(PCMRandomVariable newWriteProcessingRate) {
		if (newWriteProcessingRate != writeProcessingRate) {
			NotificationChain msgs = null;
			if (writeProcessingRate != null)
				msgs = ((InternalEObject)writeProcessingRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE, null, msgs);
			if (newWriteProcessingRate != null)
				msgs = ((InternalEObject)newWriteProcessingRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE, null, msgs);
			msgs = basicSetWriteProcessingRate(newWriteProcessingRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE, newWriteProcessingRate, newWriteProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getReadProcessingRate() {
		return readProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadProcessingRate(PCMRandomVariable newReadProcessingRate, NotificationChain msgs) {
		PCMRandomVariable oldReadProcessingRate = readProcessingRate;
		readProcessingRate = newReadProcessingRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE, oldReadProcessingRate, newReadProcessingRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadProcessingRate(PCMRandomVariable newReadProcessingRate) {
		if (newReadProcessingRate != readProcessingRate) {
			NotificationChain msgs = null;
			if (readProcessingRate != null)
				msgs = ((InternalEObject)readProcessingRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE, null, msgs);
			if (newReadProcessingRate != null)
				msgs = ((InternalEObject)newReadProcessingRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE, null, msgs);
			msgs = basicSetReadProcessingRate(newReadProcessingRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE, newReadProcessingRate, newReadProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return basicSetWriteProcessingRate(null, msgs);
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE:
				return basicSetReadProcessingRate(null, msgs);
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
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return getWriteProcessingRate();
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE:
				return getReadProcessingRate();
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
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((HDDProcessingResourceSpecification)newValue);
				return;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				setWriteProcessingRate((PCMRandomVariable)newValue);
				return;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE:
				setReadProcessingRate((PCMRandomVariable)newValue);
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
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((HDDProcessingResourceSpecification)null);
				return;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				setWriteProcessingRate((PCMRandomVariable)null);
				return;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE:
				setReadProcessingRate((PCMRandomVariable)null);
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
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				return owner != null;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return writeProcessingRate != null;
			case ResourcesPackage.HDD_RESOURCE_PERFORMANCE_SPECIFICATION__READ_PROCESSING_RATE:
				return readProcessingRate != null;
		}
		return super.eIsSet(featureID);
	}

} //HDDResourcePerformanceSpecificationImpl
