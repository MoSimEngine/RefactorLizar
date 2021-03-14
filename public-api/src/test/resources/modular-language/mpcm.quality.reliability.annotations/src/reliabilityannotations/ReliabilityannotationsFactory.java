/**
 */
package reliabilityannotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reliabilityannotations.ReliabilityannotationsPackage
 * @generated
 */
public interface ReliabilityannotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliabilityannotationsFactory eINSTANCE = reliabilityannotations.impl.ReliabilityannotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Reliability Annotation</em>'.
	 * @generated
	 */
	ServiceReliabilityAnnotation createServiceReliabilityAnnotation();

	/**
	 * Returns a new object of class '<em>External Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Failure Occurrence Description</em>'.
	 * @generated
	 */
	ExternalFailureOccurrenceDescription createExternalFailureOccurrenceDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReliabilityannotationsPackage getReliabilityannotationsPackage();

} //ReliabilityannotationsFactory
