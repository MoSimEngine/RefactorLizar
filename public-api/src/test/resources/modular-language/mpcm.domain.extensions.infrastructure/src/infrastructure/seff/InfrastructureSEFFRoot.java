/**
 */
package infrastructure.seff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure SEFF Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.seff.InfrastructureSEFFRoot#getInfrastructurecall <em>Infrastructurecall</em>}</li>
 * </ul>
 *
 * @see infrastructure.seff.SeffPackage#getInfrastructureSEFFRoot()
 * @model
 * @generated
 */
public interface InfrastructureSEFFRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Infrastructurecall</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.seff.InfrastructureCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructurecall</em>' containment reference list.
	 * @see infrastructure.seff.SeffPackage#getInfrastructureSEFFRoot_Infrastructurecall()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureCall> getInfrastructurecall();

} // InfrastructureSEFFRoot
