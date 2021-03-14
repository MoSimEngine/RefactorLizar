/**
 */
package infrastructure.composition;

import composition.AssemblyContext;
import composition.DelegationConnector;

import infrastructure.repository.InfrastructureProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Infrastructure Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getInnerProvidedRole__ProvidedInfrastructureDelegationConnector <em>Inner Provided Role Provided Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getOuterProvidedRole__ProvidedInfrastructureDelegationConnector <em>Outer Provided Role Provided Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getAssemblyContext__ProvidedInfrastructureDelegationConnector <em>Assembly Context Provided Infrastructure Delegation Connector</em>}</li>
 * </ul>
 *
 * @see infrastructure.composition.CompositionPackage#getProvidedInfrastructureDelegationConnector()
 * @model
 * @generated
 */
public interface ProvidedInfrastructureDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Provided Role Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Provided Role Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #setInnerProvidedRole__ProvidedInfrastructureDelegationConnector(InfrastructureProvidedRole)
	 * @see infrastructure.composition.CompositionPackage#getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureProvidedRole getInnerProvidedRole__ProvidedInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getInnerProvidedRole__ProvidedInfrastructureDelegationConnector <em>Inner Provided Role Provided Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Provided Role Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #getInnerProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	void setInnerProvidedRole__ProvidedInfrastructureDelegationConnector(InfrastructureProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Outer Provided Role Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Provided Role Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #setOuterProvidedRole__ProvidedInfrastructureDelegationConnector(InfrastructureProvidedRole)
	 * @see infrastructure.composition.CompositionPackage#getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureProvidedRole getOuterProvidedRole__ProvidedInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getOuterProvidedRole__ProvidedInfrastructureDelegationConnector <em>Outer Provided Role Provided Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Provided Role Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #getOuterProvidedRole__ProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	void setOuterProvidedRole__ProvidedInfrastructureDelegationConnector(InfrastructureProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Provided Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #setAssemblyContext__ProvidedInfrastructureDelegationConnector(AssemblyContext)
	 * @see infrastructure.composition.CompositionPackage#getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext__ProvidedInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.ProvidedInfrastructureDelegationConnector#getAssemblyContext__ProvidedInfrastructureDelegationConnector <em>Assembly Context Provided Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Provided Infrastructure Delegation Connector</em>' reference.
	 * @see #getAssemblyContext__ProvidedInfrastructureDelegationConnector()
	 * @generated
	 */
	void setAssemblyContext__ProvidedInfrastructureDelegationConnector(AssemblyContext value);

} // ProvidedInfrastructureDelegationConnector
