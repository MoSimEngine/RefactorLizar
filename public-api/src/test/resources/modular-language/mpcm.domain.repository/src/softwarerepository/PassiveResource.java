/**
 */
package softwarerepository;

import base.Entity;

import variables.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a passive resource, e.g., a semaphore.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}</li>
 *   <li>{@link softwarerepository.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getPassiveResource()
 * @model
 * @generated
 */
public interface PassiveResource extends Entity {
	/**
	 * Returns the value of the '<em><b>Capacity Passive Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property holds the capacity of this passive resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity Passive Resource</em>' containment reference.
	 * @see #setCapacity_PassiveResource(PCMRandomVariable)
	 * @see softwarerepository.SoftwarerepositoryPackage#getPassiveResource_Capacity_PassiveResource()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getCapacity_PassiveResource();

	/**
	 * Sets the value of the '{@link softwarerepository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Passive Resource</em>' containment reference.
	 * @see #getCapacity_PassiveResource()
	 * @generated
	 */
	void setCapacity_PassiveResource(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Basic Component Passive Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link softwarerepository.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component Passive Resource</em>' container reference.
	 * @see #setBasicComponent_PassiveResource(BasicComponent)
	 * @see softwarerepository.SoftwarerepositoryPackage#getPassiveResource_BasicComponent_PassiveResource()
	 * @see softwarerepository.BasicComponent#getPassiveResource_BasicComponent
	 * @model opposite="passiveResource_BasicComponent" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BasicComponent getBasicComponent_PassiveResource();

	/**
	 * Sets the value of the '{@link softwarerepository.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Component Passive Resource</em>' container reference.
	 * @see #getBasicComponent_PassiveResource()
	 * @generated
	 */
	void setBasicComponent_PassiveResource(BasicComponent value);

} // PassiveResource
