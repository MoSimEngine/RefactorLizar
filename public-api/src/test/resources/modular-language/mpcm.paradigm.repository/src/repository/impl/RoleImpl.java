/**
 */
package repository.impl;

import base.impl.EntityImpl;

import org.eclipse.emf.ecore.EClass;

import repository.RepositoryPackage;
import repository.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RoleImpl extends EntityImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.ROLE;
	}

} //RoleImpl
