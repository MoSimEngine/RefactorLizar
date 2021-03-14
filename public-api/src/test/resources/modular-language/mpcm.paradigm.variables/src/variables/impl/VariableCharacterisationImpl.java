/**
 */
package variables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import variables.PCMRandomVariable;
import variables.VariableCharacterisation;
import variables.VariableCharacterisationType;
import variables.VariableUsage;
import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Characterisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link variables.impl.VariableCharacterisationImpl#getType <em>Type</em>}</li>
 *   <li>{@link variables.impl.VariableCharacterisationImpl#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}</li>
 *   <li>{@link variables.impl.VariableCharacterisationImpl#getVariableUsage_VariableCharacterisation <em>Variable Usage Variable Characterisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableCharacterisationImpl extends MinimalEObjectImpl.Container implements VariableCharacterisation {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableCharacterisationType TYPE_EDEFAULT = VariableCharacterisationType.STRUCTURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VariableCharacterisationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification_VariableCharacterisation() <em>Specification Variable Characterisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_VariableCharacterisation()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable specification_VariableCharacterisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableCharacterisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.VARIABLE_CHARACTERISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableCharacterisationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VariableCharacterisationType newType) {
		VariableCharacterisationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_CHARACTERISATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getSpecification_VariableCharacterisation() {
		return specification_VariableCharacterisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification_VariableCharacterisation(PCMRandomVariable newSpecification_VariableCharacterisation, NotificationChain msgs) {
		PCMRandomVariable oldSpecification_VariableCharacterisation = specification_VariableCharacterisation;
		specification_VariableCharacterisation = newSpecification_VariableCharacterisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION, oldSpecification_VariableCharacterisation, newSpecification_VariableCharacterisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification_VariableCharacterisation(PCMRandomVariable newSpecification_VariableCharacterisation) {
		if (newSpecification_VariableCharacterisation != specification_VariableCharacterisation) {
			NotificationChain msgs = null;
			if (specification_VariableCharacterisation != null)
				msgs = ((InternalEObject)specification_VariableCharacterisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION, null, msgs);
			if (newSpecification_VariableCharacterisation != null)
				msgs = ((InternalEObject)newSpecification_VariableCharacterisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION, null, msgs);
			msgs = basicSetSpecification_VariableCharacterisation(newSpecification_VariableCharacterisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION, newSpecification_VariableCharacterisation, newSpecification_VariableCharacterisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableUsage getVariableUsage_VariableCharacterisation() {
		if (eContainerFeatureID() != VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION) return null;
		return (VariableUsage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableUsage_VariableCharacterisation(VariableUsage newVariableUsage_VariableCharacterisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableUsage_VariableCharacterisation, VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableUsage_VariableCharacterisation(VariableUsage newVariableUsage_VariableCharacterisation) {
		if (newVariableUsage_VariableCharacterisation != eInternalContainer() || (eContainerFeatureID() != VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION && newVariableUsage_VariableCharacterisation != null)) {
			if (EcoreUtil.isAncestor(this, newVariableUsage_VariableCharacterisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableUsage_VariableCharacterisation != null)
				msgs = ((InternalEObject)newVariableUsage_VariableCharacterisation).eInverseAdd(this, VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE, VariableUsage.class, msgs);
			msgs = basicSetVariableUsage_VariableCharacterisation(newVariableUsage_VariableCharacterisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION, newVariableUsage_VariableCharacterisation, newVariableUsage_VariableCharacterisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableUsage_VariableCharacterisation((VariableUsage)otherEnd, msgs);
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION:
				return basicSetSpecification_VariableCharacterisation(null, msgs);
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				return basicSetVariableUsage_VariableCharacterisation(null, msgs);
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				return eInternalContainer().eInverseRemove(this, VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE, VariableUsage.class, msgs);
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__TYPE:
				return getType();
			case VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION:
				return getSpecification_VariableCharacterisation();
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				return getVariableUsage_VariableCharacterisation();
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__TYPE:
				setType((VariableCharacterisationType)newValue);
				return;
			case VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION:
				setSpecification_VariableCharacterisation((PCMRandomVariable)newValue);
				return;
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				setVariableUsage_VariableCharacterisation((VariableUsage)newValue);
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION:
				setSpecification_VariableCharacterisation((PCMRandomVariable)null);
				return;
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				setVariableUsage_VariableCharacterisation((VariableUsage)null);
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
			case VariablesPackage.VARIABLE_CHARACTERISATION__TYPE:
				return type != TYPE_EDEFAULT;
			case VariablesPackage.VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION:
				return specification_VariableCharacterisation != null;
			case VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION:
				return getVariableUsage_VariableCharacterisation() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VariableCharacterisationImpl
