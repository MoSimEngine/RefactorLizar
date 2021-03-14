/**
 */
package variables.impl;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import variables.VariableCharacterisation;
import variables.VariableUsage;
import variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link variables.impl.VariableUsageImpl#getVariableCharacterisation_VariableUsage <em>Variable Characterisation Variable Usage</em>}</li>
 *   <li>{@link variables.impl.VariableUsageImpl#getNamedReference__VariableUsage <em>Named Reference Variable Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableUsageImpl extends MinimalEObjectImpl.Container implements VariableUsage {
	/**
	 * The cached value of the '{@link #getVariableCharacterisation_VariableUsage() <em>Variable Characterisation Variable Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCharacterisation_VariableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableCharacterisation> variableCharacterisation_VariableUsage;

	/**
	 * The cached value of the '{@link #getNamedReference__VariableUsage() <em>Named Reference Variable Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedReference__VariableUsage()
	 * @generated
	 * @ordered
	 */
	protected AbstractNamedReference namedReference__VariableUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.VARIABLE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableCharacterisation> getVariableCharacterisation_VariableUsage() {
		if (variableCharacterisation_VariableUsage == null) {
			variableCharacterisation_VariableUsage = new EObjectContainmentWithInverseEList<VariableCharacterisation>(VariableCharacterisation.class, this, VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE, VariablesPackage.VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION);
		}
		return variableCharacterisation_VariableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractNamedReference getNamedReference__VariableUsage() {
		return namedReference__VariableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedReference__VariableUsage(AbstractNamedReference newNamedReference__VariableUsage, NotificationChain msgs) {
		AbstractNamedReference oldNamedReference__VariableUsage = namedReference__VariableUsage;
		namedReference__VariableUsage = newNamedReference__VariableUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE, oldNamedReference__VariableUsage, newNamedReference__VariableUsage);
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
	public void setNamedReference__VariableUsage(AbstractNamedReference newNamedReference__VariableUsage) {
		if (newNamedReference__VariableUsage != namedReference__VariableUsage) {
			NotificationChain msgs = null;
			if (namedReference__VariableUsage != null)
				msgs = ((InternalEObject)namedReference__VariableUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE, null, msgs);
			if (newNamedReference__VariableUsage != null)
				msgs = ((InternalEObject)newNamedReference__VariableUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE, null, msgs);
			msgs = basicSetNamedReference__VariableUsage(newNamedReference__VariableUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE, newNamedReference__VariableUsage, newNamedReference__VariableUsage));
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableCharacterisation_VariableUsage()).basicAdd(otherEnd, msgs);
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				return ((InternalEList<?>)getVariableCharacterisation_VariableUsage()).basicRemove(otherEnd, msgs);
			case VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE:
				return basicSetNamedReference__VariableUsage(null, msgs);
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				return getVariableCharacterisation_VariableUsage();
			case VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE:
				return getNamedReference__VariableUsage();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				getVariableCharacterisation_VariableUsage().clear();
				getVariableCharacterisation_VariableUsage().addAll((Collection<? extends VariableCharacterisation>)newValue);
				return;
			case VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE:
				setNamedReference__VariableUsage((AbstractNamedReference)newValue);
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				getVariableCharacterisation_VariableUsage().clear();
				return;
			case VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE:
				setNamedReference__VariableUsage((AbstractNamedReference)null);
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
			case VariablesPackage.VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE:
				return variableCharacterisation_VariableUsage != null && !variableCharacterisation_VariableUsage.isEmpty();
			case VariablesPackage.VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE:
				return namedReference__VariableUsage != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableUsageImpl
