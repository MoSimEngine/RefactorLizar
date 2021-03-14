/**
 */
package resourceinterfaces.seff;

import behaviourseff.CallAction;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import resourceinterfaces.repository.ResourceRequiredRole;

import resourceinterfaces.resourcetype.ResourceSignature;

import seff.AbstractInternalControlFlowAction;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceinterfaces.seff.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}</li>
 *   <li>{@link resourceinterfaces.seff.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}</li>
 *   <li>{@link resourceinterfaces.seff.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}</li>
 *   <li>{@link resourceinterfaces.seff.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}</li>
 * </ul>
 *
 * @see resourceinterfaces.seff.SeffPackage#getResourceCall()
 * @model
 * @generated
 */
public interface ResourceCall extends CallAction {
	/**
	 * Returns the value of the '<em><b>Action Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Resource Call</em>' reference.
	 * @see #setAction__ResourceCall(AbstractInternalControlFlowAction)
	 * @see resourceinterfaces.seff.SeffPackage#getResourceCall_Action__ResourceCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractInternalControlFlowAction getAction__ResourceCall();

	/**
	 * Sets the value of the '{@link resourceinterfaces.seff.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Resource Call</em>' reference.
	 * @see #getAction__ResourceCall()
	 * @generated
	 */
	void setAction__ResourceCall(AbstractInternalControlFlowAction value);

	/**
	 * Returns the value of the '<em><b>Resource Required Role Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Required Role Resource Call</em>' reference.
	 * @see #setResourceRequiredRole__ResourceCall(ResourceRequiredRole)
	 * @see resourceinterfaces.seff.SeffPackage#getResourceCall_ResourceRequiredRole__ResourceCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceRequiredRole getResourceRequiredRole__ResourceCall();

	/**
	 * Sets the value of the '{@link resourceinterfaces.seff.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Required Role Resource Call</em>' reference.
	 * @see #getResourceRequiredRole__ResourceCall()
	 * @generated
	 */
	void setResourceRequiredRole__ResourceCall(ResourceRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Signature Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Resource Call</em>' reference.
	 * @see #setSignature__ResourceCall(ResourceSignature)
	 * @see resourceinterfaces.seff.SeffPackage#getResourceCall_Signature__ResourceCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceSignature getSignature__ResourceCall();

	/**
	 * Sets the value of the '{@link resourceinterfaces.seff.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Resource Call</em>' reference.
	 * @see #getSignature__ResourceCall()
	 * @generated
	 */
	void setSignature__ResourceCall(ResourceSignature value);

	/**
	 * Returns the value of the '<em><b>Number Of Calls Resource Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Calls Resource Call</em>' containment reference.
	 * @see #setNumberOfCalls__ResourceCall(PCMRandomVariable)
	 * @see resourceinterfaces.seff.SeffPackage#getResourceCall_NumberOfCalls__ResourceCall()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getNumberOfCalls__ResourceCall();

	/**
	 * Sets the value of the '{@link resourceinterfaces.seff.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Calls Resource Call</em>' containment reference.
	 * @see #getNumberOfCalls__ResourceCall()
	 * @generated
	 */
	void setNumberOfCalls__ResourceCall(PCMRandomVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.resourceRequiredRole__ResourceCall.requiredResourceInterface__ResourceRequiredRole.resourceSignatures__ResourceInterface-&gt;includes(self.signature__ResourceCall)'"
	 * @generated
	 */
	boolean ResourceSignatureBelongsToResourceRequiredRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.oclAsType(ecore::EObject)-&gt;closure(eContainer())-&gt;select( entity | entity.oclIsKindOf(mpcm::core::entity::ResourceInterfaceRequiringEntity)).oclAsType(mpcm::core::entity::ResourceInterfaceRequiringEntity).resourceRequiredRoles__ResourceInterfaceRequiringEntity-&gt;includes(self.resourceRequiredRole__ResourceCall)'"
	 * @generated
	 */
	boolean ResourceRequiredRoleMustBeReferencedByComponent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.action__ResourceCall.resourceCall__Action-&gt;select(call | call.resourceRequiredRole__ResourceCall=self.resourceRequiredRole__ResourceCall and call.signature__ResourceCall=self.signature__ResourceCall)-&gt;size() = 1'"
	 * @generated
	 */
	boolean SignatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ResourceCall
