/**
 */
package composition.impl;

import composition.CompositionPackage;
import composition.Containable;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ContainableImpl extends MinimalEObjectImpl.Container implements Containable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.CONTAINABLE;
	}

} //ContainableImpl
