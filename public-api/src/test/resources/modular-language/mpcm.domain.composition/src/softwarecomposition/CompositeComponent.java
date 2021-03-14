/**
 */
package softwarecomposition;

import composition.ComposedProvidingRequiringEntity;

import softwarerepository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Composite components are special implementation component types, which are composed from inner components. Component developers compose inner components within composite components with assembly connectors. An assembly connector binds a provided role with a required role. To access the inner components, composite components themselves provide or require interfaces. A delegation connector binds a provided (required) role of the composite component with an inner component provided (required) role. A composite component may contain other composite components, which are also themselves composed out of inner components. This enables building arbitrary hierarchies of nested components. Like a basic component, a composite component may contain a SEFF.  However, this SEFF is not specified manually by the composite component developer, but can be computed by combining the SEFFs of the inner components.
 * <!-- end-model-doc -->
 *
 *
 * @see softwarecomposition.SoftwarecompositionPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends ComposedProvidingRequiringEntity, ImplementationComponentType {
} // CompositeComponent
