/**
 */
package events.composition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see events.composition.CompositionPackage
 * @generated
 */
public interface CompositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionFactory eINSTANCE = events.composition.impl.CompositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assembly Event Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Event Connector</em>'.
	 * @generated
	 */
	AssemblyEventConnector createAssemblyEventConnector();

	/**
	 * Returns a new object of class '<em>Event Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Channel</em>'.
	 * @generated
	 */
	EventChannel createEventChannel();

	/**
	 * Returns a new object of class '<em>Event Channel Source Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Channel Source Connector</em>'.
	 * @generated
	 */
	EventChannelSourceConnector createEventChannelSourceConnector();

	/**
	 * Returns a new object of class '<em>Event Channel Sink Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Channel Sink Connector</em>'.
	 * @generated
	 */
	EventChannelSinkConnector createEventChannelSinkConnector();

	/**
	 * Returns a new object of class '<em>Source Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Delegation Connector</em>'.
	 * @generated
	 */
	SourceDelegationConnector createSourceDelegationConnector();

	/**
	 * Returns a new object of class '<em>Sink Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Delegation Connector</em>'.
	 * @generated
	 */
	SinkDelegationConnector createSinkDelegationConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompositionPackage getCompositionPackage();

} //CompositionFactory
