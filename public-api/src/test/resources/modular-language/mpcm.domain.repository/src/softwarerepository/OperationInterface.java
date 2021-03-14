/**
 */
package softwarerepository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import repository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OperationInterface is a specific type of interface related to operation calls. For this, it also refereferences a set of operation interfaces. Operations can represent methods, functions or any comparable concept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getOperationInterface()
 * @model
 * @generated
 */
public interface OperationInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Signatures Operation Interface</b></em>' containment reference list.
	 * The list contents are of type {@link softwarerepository.OperationSignature}.
	 * It is bidirectional and its opposite is '{@link softwarerepository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the set of signatures of which the interface consists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatures Operation Interface</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getOperationInterface_Signatures__OperationInterface()
	 * @see softwarerepository.OperationSignature#getInterface__OperationSignature
	 * @model opposite="interface__OperationSignature" containment="true" ordered="false"
	 * @generated
	 */
	EList<OperationSignature> getSignatures__OperationInterface();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- full signature has to be unique \r\n-- (use of ocl-tupels) #\r\nlet sigs : Bag(\r\n\t-- parameters: Sequence of DataType, NOT name #\r\n\t-- exceptions have not to be considered #\r\n\tTuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) \r\n) = \r\nself.signatures__OperationInterface-&gt;collect(sig : OperationSignature |\r\n\tTuple{\r\n\t\treturnType : DataType = sig.returnType__OperationSignature,\r\n\t\tserviceName : String = sig.entityName,\r\n\t\tparameters : Sequence(DataType) = sig.parameters__OperationSignature.dataType__Parameter\r\n\t}\r\n)\r\nin\r\nsigs-&gt;isUnique(s|s)'"
	 * @generated
	 */
	boolean SignaturesHaveToBeUniqueForAnInterface(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OperationInterface
