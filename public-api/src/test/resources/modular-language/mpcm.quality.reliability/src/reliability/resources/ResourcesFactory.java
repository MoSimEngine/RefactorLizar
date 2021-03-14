/**
 */
package reliability.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reliability.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = reliability.resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reliability Resource Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliability Resource Root</em>'.
	 * @generated
	 */
	ReliabilityResourceRoot createReliabilityResourceRoot();

	/**
	 * Returns a new object of class '<em>Processing Resource Reliability Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Reliability Specification</em>'.
	 * @generated
	 */
	ProcessingResourceReliabilitySpecification createProcessingResourceReliabilitySpecification();

	/**
	 * Returns a new object of class '<em>Communication Link Resource Reliability Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link Resource Reliability Specification</em>'.
	 * @generated
	 */
	CommunicationLinkResourceReliabilitySpecification createCommunicationLinkResourceReliabilitySpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
