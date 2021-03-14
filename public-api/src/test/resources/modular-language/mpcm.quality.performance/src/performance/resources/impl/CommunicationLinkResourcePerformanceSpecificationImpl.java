/**
 */
package performance.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import performance.resources.CommunicationLinkResourcePerformanceSpecification;
import performance.resources.ResourcesPackage;

import resources.CommunicationLinkResourceSpecification;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link Resource Performance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}</li>
 *   <li>{@link performance.resources.impl.CommunicationLinkResourcePerformanceSpecificationImpl#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkResourcePerformanceSpecificationImpl extends MinimalEObjectImpl.Container implements CommunicationLinkResourcePerformanceSpecification {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkResourceSpecification owner;

	/**
	 * The cached value of the '{@link #getLatency_CommunicationLinkResourceSpecification() <em>Latency Communication Link Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency_CommunicationLinkResourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable latency_CommunicationLinkResourceSpecification;

	/**
	 * The cached value of the '{@link #getThroughput_CommunicationLinkResourceSpecification() <em>Throughput Communication Link Resource Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput_CommunicationLinkResourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable throughput_CommunicationLinkResourceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkResourcePerformanceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceSpecification getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (CommunicationLinkResourceSpecification)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceSpecification basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(CommunicationLinkResourceSpecification newOwner) {
		CommunicationLinkResourceSpecification oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getLatency_CommunicationLinkResourceSpecification() {
		return latency_CommunicationLinkResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency_CommunicationLinkResourceSpecification(PCMRandomVariable newLatency_CommunicationLinkResourceSpecification, NotificationChain msgs) {
		PCMRandomVariable oldLatency_CommunicationLinkResourceSpecification = latency_CommunicationLinkResourceSpecification;
		latency_CommunicationLinkResourceSpecification = newLatency_CommunicationLinkResourceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldLatency_CommunicationLinkResourceSpecification, newLatency_CommunicationLinkResourceSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable newLatency_CommunicationLinkResourceSpecification) {
		if (newLatency_CommunicationLinkResourceSpecification != latency_CommunicationLinkResourceSpecification) {
			NotificationChain msgs = null;
			if (latency_CommunicationLinkResourceSpecification != null)
				msgs = ((InternalEObject)latency_CommunicationLinkResourceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
			if (newLatency_CommunicationLinkResourceSpecification != null)
				msgs = ((InternalEObject)newLatency_CommunicationLinkResourceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
			msgs = basicSetLatency_CommunicationLinkResourceSpecification(newLatency_CommunicationLinkResourceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, newLatency_CommunicationLinkResourceSpecification, newLatency_CommunicationLinkResourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getThroughput_CommunicationLinkResourceSpecification() {
		return throughput_CommunicationLinkResourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable newThroughput_CommunicationLinkResourceSpecification, NotificationChain msgs) {
		PCMRandomVariable oldThroughput_CommunicationLinkResourceSpecification = throughput_CommunicationLinkResourceSpecification;
		throughput_CommunicationLinkResourceSpecification = newThroughput_CommunicationLinkResourceSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, oldThroughput_CommunicationLinkResourceSpecification, newThroughput_CommunicationLinkResourceSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable newThroughput_CommunicationLinkResourceSpecification) {
		if (newThroughput_CommunicationLinkResourceSpecification != throughput_CommunicationLinkResourceSpecification) {
			NotificationChain msgs = null;
			if (throughput_CommunicationLinkResourceSpecification != null)
				msgs = ((InternalEObject)throughput_CommunicationLinkResourceSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
			if (newThroughput_CommunicationLinkResourceSpecification != null)
				msgs = ((InternalEObject)newThroughput_CommunicationLinkResourceSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, null, msgs);
			msgs = basicSetThroughput_CommunicationLinkResourceSpecification(newThroughput_CommunicationLinkResourceSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION, newThroughput_CommunicationLinkResourceSpecification, newThroughput_CommunicationLinkResourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return basicSetLatency_CommunicationLinkResourceSpecification(null, msgs);
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return basicSetThroughput_CommunicationLinkResourceSpecification(null, msgs);
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
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return getLatency_CommunicationLinkResourceSpecification();
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return getThroughput_CommunicationLinkResourceSpecification();
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
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((CommunicationLinkResourceSpecification)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setLatency_CommunicationLinkResourceSpecification((PCMRandomVariable)newValue);
				return;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setThroughput_CommunicationLinkResourceSpecification((PCMRandomVariable)newValue);
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
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				setOwner((CommunicationLinkResourceSpecification)null);
				return;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setLatency_CommunicationLinkResourceSpecification((PCMRandomVariable)null);
				return;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				setThroughput_CommunicationLinkResourceSpecification((PCMRandomVariable)null);
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
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__OWNER:
				return owner != null;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return latency_CommunicationLinkResourceSpecification != null;
			case ResourcesPackage.COMMUNICATION_LINK_RESOURCE_PERFORMANCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION:
				return throughput_CommunicationLinkResourceSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkResourcePerformanceSpecificationImpl
