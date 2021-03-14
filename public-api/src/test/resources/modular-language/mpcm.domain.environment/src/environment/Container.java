/**
 */
package environment;

import base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML-like&nbsp;container&nbsp;of&nbsp;a&nbsp;number&nbsp;of&nbsp;processing&nbsp;resources (e.g. hardware server)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Container#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}</li>
 *   <li>{@link environment.Container#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}</li>
 *   <li>{@link environment.Container#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Environment Resource Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link environment.Environment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment Resource Container</em>' container reference.
	 * @see #setResourceEnvironment_ResourceContainer(Environment)
	 * @see environment.EnvironmentPackage#getContainer_ResourceEnvironment_ResourceContainer()
	 * @see environment.Environment#getResourceContainer_ResourceEnvironment
	 * @model opposite="resourceContainer_ResourceEnvironment" transient="false" ordered="false"
	 * @generated
	 */
	Environment getResourceEnvironment_ResourceContainer();

	/**
	 * Sets the value of the '{@link environment.Container#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment Resource Container</em>' container reference.
	 * @see #getResourceEnvironment_ResourceContainer()
	 * @generated
	 */
	void setResourceEnvironment_ResourceContainer(Environment value);

	/**
	 * Returns the value of the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Container}.
	 * It is bidirectional and its opposite is '{@link environment.Container#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Resource Containers Resource Container</em>' containment reference list.
	 * @see environment.EnvironmentPackage#getContainer_NestedResourceContainers__ResourceContainer()
	 * @see environment.Container#getParentResourceContainer__ResourceContainer
	 * @model opposite="parentResourceContainer__ResourceContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<Container> getNestedResourceContainers__ResourceContainer();

	/**
	 * Returns the value of the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link environment.Container#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource Container Resource Container</em>' container reference.
	 * @see #setParentResourceContainer__ResourceContainer(Container)
	 * @see environment.EnvironmentPackage#getContainer_ParentResourceContainer__ResourceContainer()
	 * @see environment.Container#getNestedResourceContainers__ResourceContainer
	 * @model opposite="nestedResourceContainers__ResourceContainer" transient="false" ordered="false"
	 * @generated
	 */
	Container getParentResourceContainer__ResourceContainer();

	/**
	 * Sets the value of the '{@link environment.Container#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Container Resource Container</em>' container reference.
	 * @see #getParentResourceContainer__ResourceContainer()
	 * @generated
	 */
	void setParentResourceContainer__ResourceContainer(Container value);

} // Container
