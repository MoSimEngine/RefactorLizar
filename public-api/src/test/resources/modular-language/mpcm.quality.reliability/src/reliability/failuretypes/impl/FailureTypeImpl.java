/**
 */
package reliability.failuretypes.impl;

import base.impl.EntityImpl;

import org.eclipse.emf.ecore.EClass;

import reliability.failuretypes.FailureType;
import reliability.failuretypes.FailuretypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FailureTypeImpl extends EntityImpl implements FailureType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailuretypesPackage.Literals.FAILURE_TYPE;
	}

} //FailureTypeImpl
