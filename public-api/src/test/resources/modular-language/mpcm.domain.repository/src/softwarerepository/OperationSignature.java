/**
 */
package softwarerepository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import repository.Parameter;
import repository.Signature;

import repository.datatypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface specific to operations and a operation specific association to parameters and return values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}</li>
 *   <li>{@link softwarerepository.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}</li>
 *   <li>{@link softwarerepository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getOperationSignature()
 * @model
 * @generated
 */
public interface OperationSignature extends Signature {
	/**
	 * Returns the value of the '<em><b>Interface Operation Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link softwarerepository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interface that contains the method with this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Operation Signature</em>' container reference.
	 * @see #setInterface__OperationSignature(OperationInterface)
	 * @see softwarerepository.SoftwarerepositoryPackage#getOperationSignature_Interface__OperationSignature()
	 * @see softwarerepository.OperationInterface#getSignatures__OperationInterface
	 * @model opposite="signatures__OperationInterface" transient="false" ordered="false"
	 * @generated
	 */
	OperationInterface getInterface__OperationSignature();

	/**
	 * Sets the value of the '{@link softwarerepository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Operation Signature</em>' container reference.
	 * @see #getInterface__OperationSignature()
	 * @generated
	 */
	void setInterface__OperationSignature(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>Parameters Operation Signature</b></em>' containment reference list.
	 * The list contents are of type {@link repository.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of parameters of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters Operation Signature</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getOperationSignature_Parameters__OperationSignature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters__OperationSignature();

	/**
	 * Returns the value of the '<em><b>Return Type Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the return type of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type Operation Signature</em>' reference.
	 * @see #setReturnType__OperationSignature(DataType)
	 * @see softwarerepository.SoftwarerepositoryPackage#getOperationSignature_ReturnType__OperationSignature()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getReturnType__OperationSignature();

	/**
	 * Sets the value of the '{@link softwarerepository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Operation Signature</em>' reference.
	 * @see #getReturnType__OperationSignature()
	 * @generated
	 */
	void setReturnType__OperationSignature(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.parameters__OperationSignature-&gt;isUnique(p : Parameter |\r\n\tp.parameterName\r\n)'"
	 * @generated
	 */
	boolean ParameterNamesHaveToBeUniqueForASignature(DiagnosticChain diagnostics, Map<Object, Object> context);

} // OperationSignature
