/**
 */
package reliability.resources.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reliability.resources.ProcessingResourceReliabilitySpecification;
import reliability.resources.ResourcesPackage;

import resources.ProcessingResourceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Reliability Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl#getMTTF <em>MTTF</em>}</li>
 *   <li>{@link reliability.resources.impl.ProcessingResourceReliabilitySpecificationImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingResourceReliabilitySpecificationImpl extends MinimalEObjectImpl.Container implements ProcessingResourceReliabilitySpecification {
	/**
	 * The default value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected static final double MTTR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected double mttr = MTTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMTTF() <em>MTTF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTF()
	 * @generated
	 * @ordered
	 */
	protected static final double MTTF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMTTF() <em>MTTF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTF()
	 * @generated
	 * @ordered
	 */
	protected double mttf = MTTF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceReliabilitySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMTTR() {
		return mttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMTTR(double newMTTR) {
		double oldMTTR = mttr;
		mttr = newMTTR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR, oldMTTR, mttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMTTF() {
		return mttf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMTTF(double newMTTF) {
		double oldMTTF = mttf;
		mttf = newMTTF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF, oldMTTF, mttf));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR:
				return getMTTR();
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF:
				return getMTTF();
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR:
				setMTTR((Double)newValue);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF:
				setMTTF((Double)newValue);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER:
				setOwner((ProcessingResourceSpecification)newValue);
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
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR:
				setMTTR(MTTR_EDEFAULT);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF:
				setMTTF(MTTF_EDEFAULT);
				return;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER:
				setOwner((ProcessingResourceSpecification)null);
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
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTR:
				return mttr != MTTR_EDEFAULT;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__MTTF:
				return mttf != MTTF_EDEFAULT;
			case ResourcesPackage.PROCESSING_RESOURCE_RELIABILITY_SPECIFICATION__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MTTR: ");
		result.append(mttr);
		result.append(", MTTF: ");
		result.append(mttf);
		result.append(')');
		return result.toString();
	}

} //ProcessingResourceReliabilitySpecificationImpl
