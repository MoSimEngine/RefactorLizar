/**
 */
package repository.impl;

import base.impl.EntityImpl;

import org.eclipse.emf.ecore.EClass;

import repository.RepositoryPackage;
import repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SignatureImpl extends EntityImpl implements Signature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.SIGNATURE;
	}

} //SignatureImpl
