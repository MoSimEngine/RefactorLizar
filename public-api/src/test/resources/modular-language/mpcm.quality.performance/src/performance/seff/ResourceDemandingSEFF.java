/**
 */
package performance.seff;

import behaviourseff.BehaviourSEFF;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource demanding service effect specification (RDSEFF) is a special type of SEFF designed for performance and reliability predictions. Besides dependencies between provided and required services of a component, it additionally includes notions of resource usage, data flow, and parametric dependencies for more accurate predictions. Its control flow is hierarchically structured and can be enhanced with transition probabilities on branches and numbers of iterations on loops.
 * A ResourceDemandingSEFF is a ServiceEffectSpecification and a Resource-DemandingBehaviour at the same time inheriting from both classes. The reason for this construct lies in the fact, that ResourceDemandingBehaviours can be used recursively inside themselves to describe loop bodies or branched behaviours (explained later), and these inner behaviours should not be RDSEFFs themselves
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link performance.seff.ResourceDemandingSEFF#getResourceDemands <em>Resource Demands</em>}</li>
 *   <li>{@link performance.seff.ResourceDemandingSEFF#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see performance.seff.SeffPackage#getResourceDemandingSEFF()
 * @model
 * @generated
 */
public interface ResourceDemandingSEFF extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Resource Demands</b></em>' containment reference list.
	 * The list contents are of type {@link performance.seff.ParametricResourceDemand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demands</em>' containment reference list.
	 * @see performance.seff.SeffPackage#getResourceDemandingSEFF_ResourceDemands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametricResourceDemand> getResourceDemands();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(BehaviourSEFF)
	 * @see performance.seff.SeffPackage#getResourceDemandingSEFF_Owner()
	 * @model required="true"
	 * @generated
	 */
	BehaviourSEFF getOwner();

	/**
	 * Sets the value of the '{@link performance.seff.ResourceDemandingSEFF#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(BehaviourSEFF value);

} // ResourceDemandingSEFF
