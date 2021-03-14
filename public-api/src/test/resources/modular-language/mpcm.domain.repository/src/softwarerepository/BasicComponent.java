/**
 */
package softwarerepository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a black-box component implementation. Basic components are atomic building blocks of a software architecture. They cannot be further subdivided into smaller components and are built from scratch, i.e, not by assembling other components. Component developers specify basic components by associating interfaces to them in a providing or requiring role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link softwarerepository.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 *
 * @see softwarerepository.SoftwarerepositoryPackage#getBasicComponent()
 * @model
 * @generated
 */
public interface BasicComponent extends ImplementationComponentType {
	/**
	 * Returns the value of the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
	 * The list contents are of type {@link softwarerepository.ServiceEffectSpecification}.
	 * It is bidirectional and its opposite is '{@link softwarerepository.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the service effect specification for services provided by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Effect Specifications Basic Component</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getBasicComponent_ServiceEffectSpecifications__BasicComponent()
	 * @see softwarerepository.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification
	 * @model opposite="basicComponent_ServiceEffectSpecification" containment="true" ordered="false"
	 * @generated
	 */
	EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent();

	/**
	 * Returns the value of the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
	 * The list contents are of type {@link softwarerepository.PassiveResource}.
	 * It is bidirectional and its opposite is '{@link softwarerepository.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the passive resources, e.g., semaphores, that are owned by this basic component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Resource Basic Component</em>' containment reference list.
	 * @see softwarerepository.SoftwarerepositoryPackage#getBasicComponent_PassiveResource_BasicComponent()
	 * @see softwarerepository.PassiveResource#getBasicComponent_PassiveResource
	 * @model opposite="basicComponent_PassiveResource" containment="true" ordered="false"
	 * @generated
	 */
	EList<PassiveResource> getPassiveResource_BasicComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.serviceEffectSpecifications__BasicComponent-&gt;forAll(p1, p2 |\r\n  p1 &lt;&gt; p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID &lt;&gt; p2.seffTypeID))'"
	 * @generated
	 */
	boolean NoSeffTypeUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BasicComponent
