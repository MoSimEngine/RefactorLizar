/**
 */
package resources;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getHDDProcessingResourceSpecification()
 * @model
 * @generated
 */
public interface HDDProcessingResourceSpecification extends ProcessingResourceSpecification {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link resources.ResourceContainer#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference.
	 * @see #setResourceContainer(ResourceContainer)
	 * @see resources.ResourcesPackage#getHDDProcessingResourceSpecification_ResourceContainer()
	 * @see resources.ResourceContainer#getHddResourceSpecifications
	 * @model opposite="hddResourceSpecifications"
	 * @generated
	 */
	ResourceContainer getResourceContainer();

	/**
	 * Sets the value of the '{@link resources.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container</em>' reference.
	 * @see #getResourceContainer()
	 * @generated
	 */
	void setResourceContainer(ResourceContainer value);

} // HDDProcessingResourceSpecification
