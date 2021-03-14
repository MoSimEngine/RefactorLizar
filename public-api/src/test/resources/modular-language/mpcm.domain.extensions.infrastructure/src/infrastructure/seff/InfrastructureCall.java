/**
 */
package infrastructure.seff;

import behaviourseff.CallAction;

import infrastructure.repository.InfrastructureRequiredRole;
import infrastructure.repository.InfrastructureSignature;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import seff.AbstractInternalControlFlowAction;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.seff.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link infrastructure.seff.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 *
 * @see infrastructure.seff.SeffPackage#getInfrastructureCall()
 * @model
 * @generated
 */
public interface InfrastructureCall extends CallAction {
	/**
	 * Returns the value of the '<em><b>Signature Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Infrastructure Call</em>' reference.
	 * @see #setSignature__InfrastructureCall(InfrastructureSignature)
	 * @see infrastructure.seff.SeffPackage#getInfrastructureCall_Signature__InfrastructureCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureSignature getSignature__InfrastructureCall();

	/**
	 * Sets the value of the '{@link infrastructure.seff.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Infrastructure Call</em>' reference.
	 * @see #getSignature__InfrastructureCall()
	 * @generated
	 */
	void setSignature__InfrastructureCall(InfrastructureSignature value);

	/**
	 * Returns the value of the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
	 * @see #setNumberOfCalls__InfrastructureCall(PCMRandomVariable)
	 * @see infrastructure.seff.SeffPackage#getInfrastructureCall_NumberOfCalls__InfrastructureCall()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getNumberOfCalls__InfrastructureCall();

	/**
	 * Sets the value of the '{@link infrastructure.seff.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
	 * @see #getNumberOfCalls__InfrastructureCall()
	 * @generated
	 */
	void setNumberOfCalls__InfrastructureCall(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Action Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Infrastructure Call</em>' reference.
	 * @see #setAction__InfrastructureCall(AbstractInternalControlFlowAction)
	 * @see infrastructure.seff.SeffPackage#getInfrastructureCall_Action__InfrastructureCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractInternalControlFlowAction getAction__InfrastructureCall();

	/**
	 * Sets the value of the '{@link infrastructure.seff.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Infrastructure Call</em>' reference.
	 * @see #getAction__InfrastructureCall()
	 * @generated
	 */
	void setAction__InfrastructureCall(AbstractInternalControlFlowAction value);

	/**
	 * Returns the value of the '<em><b>Required Role Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Infrastructure Call</em>' reference.
	 * @see #setRequiredRole__InfrastructureCall(InfrastructureRequiredRole)
	 * @see infrastructure.seff.SeffPackage#getInfrastructureCall_RequiredRole__InfrastructureCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureRequiredRole getRequiredRole__InfrastructureCall();

	/**
	 * Sets the value of the '{@link infrastructure.seff.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Infrastructure Call</em>' reference.
	 * @see #getRequiredRole__InfrastructureCall()
	 * @generated
	 */
	void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole'"
	 * @generated
	 */
	boolean SignatureMustBelongToUsedRequiredRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(ecore::EObject)-&gt;closure(eContainer())-&gt;select( entity | entity.oclIsKindOf(mpcm::core::entity::InterfaceRequiringEntity)).oclAsType(mpcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity-&gt;includes(self.requiredRole__InfrastructureCall)'"
	 * @generated
	 */
	boolean ReferencedRequiredRoleMustBeRequiredByComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.action__InfrastructureCall.infrastructureCall__Action-&gt;select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)-&gt;size() = 1'"
	 * @generated
	 */
	boolean SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InfrastructureCall
