/**
 */
package performanceannotations.impl;

import annotations.impl.ServicePropertyAnnotationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import performanceannotations.PerformanceannotationsPackage;
import performanceannotations.ServiceExecutionTime;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link performanceannotations.impl.ServiceExecutionTimeImpl#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceExecutionTimeImpl extends ServicePropertyAnnotationImpl implements ServiceExecutionTime {
	/**
	 * The cached value of the '{@link #getSpecification_SpecifiedExecutionTime() <em>Specification Specified Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_SpecifiedExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable specification_SpecifiedExecutionTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceExecutionTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformanceannotationsPackage.Literals.SERVICE_EXECUTION_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getSpecification_SpecifiedExecutionTime() {
		return specification_SpecifiedExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification_SpecifiedExecutionTime(PCMRandomVariable newSpecification_SpecifiedExecutionTime, NotificationChain msgs) {
		PCMRandomVariable oldSpecification_SpecifiedExecutionTime = specification_SpecifiedExecutionTime;
		specification_SpecifiedExecutionTime = newSpecification_SpecifiedExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, oldSpecification_SpecifiedExecutionTime, newSpecification_SpecifiedExecutionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification_SpecifiedExecutionTime(PCMRandomVariable newSpecification_SpecifiedExecutionTime) {
		if (newSpecification_SpecifiedExecutionTime != specification_SpecifiedExecutionTime) {
			NotificationChain msgs = null;
			if (specification_SpecifiedExecutionTime != null)
				msgs = ((InternalEObject)specification_SpecifiedExecutionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, null, msgs);
			if (newSpecification_SpecifiedExecutionTime != null)
				msgs = ((InternalEObject)newSpecification_SpecifiedExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, null, msgs);
			msgs = basicSetSpecification_SpecifiedExecutionTime(newSpecification_SpecifiedExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME, newSpecification_SpecifiedExecutionTime, newSpecification_SpecifiedExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
				return basicSetSpecification_SpecifiedExecutionTime(null, msgs);
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
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
				return getSpecification_SpecifiedExecutionTime();
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
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
				setSpecification_SpecifiedExecutionTime((PCMRandomVariable)newValue);
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
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
				setSpecification_SpecifiedExecutionTime((PCMRandomVariable)null);
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
			case PerformanceannotationsPackage.SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME:
				return specification_SpecifiedExecutionTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceExecutionTimeImpl
