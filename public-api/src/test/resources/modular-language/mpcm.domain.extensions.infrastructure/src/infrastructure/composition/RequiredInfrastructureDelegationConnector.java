/**
 */
package infrastructure.composition;

import composition.AssemblyContext;
import composition.DelegationConnector;

import infrastructure.repository.InfrastructureRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Infrastructure Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getInnerRequiredRole__RequiredInfrastructureDelegationConnector <em>Inner Required Role Required Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getOuterRequiredRole__RequiredInfrastructureDelegationConnector <em>Outer Required Role Required Infrastructure Delegation Connector</em>}</li>
 *   <li>{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getAssemblyContext__RequiredInfrastructureDelegationConnector <em>Assembly Context Required Infrastructure Delegation Connector</em>}</li>
 * </ul>
 *
 * @see infrastructure.composition.CompositionPackage#getRequiredInfrastructureDelegationConnector()
 * @model
 * @generated
 */
public interface RequiredInfrastructureDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Required Role Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Required Role Required Infrastructure Delegation Connector</em>' reference.
	 * @see #setInnerRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole)
	 * @see infrastructure.composition.CompositionPackage#getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureRequiredRole getInnerRequiredRole__RequiredInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getInnerRequiredRole__RequiredInfrastructureDelegationConnector <em>Inner Required Role Required Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Required Role Required Infrastructure Delegation Connector</em>' reference.
	 * @see #getInnerRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	void setInnerRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Outer Required Role Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Required Role Required Infrastructure Delegation Connector</em>' reference.
	 * @see #setOuterRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole)
	 * @see infrastructure.composition.CompositionPackage#getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureRequiredRole getOuterRequiredRole__RequiredInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getOuterRequiredRole__RequiredInfrastructureDelegationConnector <em>Outer Required Role Required Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Required Role Required Infrastructure Delegation Connector</em>' reference.
	 * @see #getOuterRequiredRole__RequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	void setOuterRequiredRole__RequiredInfrastructureDelegationConnector(InfrastructureRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Required Infrastructure Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Required Infrastructure Delegation Connector</em>' reference.
	 * @see #setAssemblyContext__RequiredInfrastructureDelegationConnector(AssemblyContext)
	 * @see infrastructure.composition.CompositionPackage#getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext__RequiredInfrastructureDelegationConnector();

	/**
	 * Sets the value of the '{@link infrastructure.composition.RequiredInfrastructureDelegationConnector#getAssemblyContext__RequiredInfrastructureDelegationConnector <em>Assembly Context Required Infrastructure Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Required Infrastructure Delegation Connector</em>' reference.
	 * @see #getAssemblyContext__RequiredInfrastructureDelegationConnector()
	 * @generated
	 */
	void setAssemblyContext__RequiredInfrastructureDelegationConnector(AssemblyContext value);

} // RequiredInfrastructureDelegationConnector
