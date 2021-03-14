/**
 */
package abstractcomponenttypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import repository.RepositoryComponent;

import softwarerepository.ImplementationComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Complete (Component) types abstract from the realisation of components. They only contain provided and required roles omitting the components’ internal structure, i.e., the service effect specifications or assemblies. Thus, complete types represent a black box view on components. Leaving the implementation open allows for a higher flexibility of software architects and defines substitutability in the PCM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractcomponenttypes.CompleteComponentType#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}</li>
 *   <li>{@link abstractcomponenttypes.CompleteComponentType#getConfirmingImplComponentTypes <em>Confirming Impl Component Types</em>}</li>
 * </ul>
 *
 * @see abstractcomponenttypes.AbstractcomponenttypesPackage#getCompleteComponentType()
 * @model
 * @generated
 */
public interface CompleteComponentType extends RepositoryComponent {
	/**
	 * Returns the value of the '<em><b>Parent Provides Component Types</b></em>' reference list.
	 * The list contents are of type {@link abstractcomponenttypes.ProvidesComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Provides Component Types</em>' reference list.
	 * @see abstractcomponenttypes.AbstractcomponenttypesPackage#getCompleteComponentType_ParentProvidesComponentTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProvidesComponentType> getParentProvidesComponentTypes();

	/**
	 * Returns the value of the '<em><b>Confirming Impl Component Types</b></em>' reference list.
	 * The list contents are of type {@link softwarerepository.ImplementationComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirming Impl Component Types</em>' reference list.
	 * @see abstractcomponenttypes.AbstractcomponenttypesPackage#getCompleteComponentType_ConfirmingImplComponentTypes()
	 * @model
	 * @generated
	 */
	EList<ImplementationComponentType> getConfirmingImplComponentTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(\r\n\tself.oclIsTypeOf(CompleteComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(ImplementationComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(CompositeComponent)\r\n\tor\r\n\tself.oclIsTypeOf(BasicComponent)\r\n)\r\nimplies\r\n(\r\n\tself.providedRoles_InterfaceProvidingEntity-&gt;size() &gt;= 1\r\n\tor\r\n\tself.requiredRoles_InterfaceRequiringEntity-&gt;size() &gt;= 1\r\n)'"
	 * @generated
	 */
	boolean AtLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='-- CompleteTypes provided Interfaces have to be a superset\r\n-- of ProvidesComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \"lpar2005.pdf\" (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles-&gt;iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2-&gt;union(r.providedInterface.parentInterface-&gt;asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles-&gt;iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4-&gt;union(r.providedInterface.parentInterface-&gt;asBag()) -- asBag required to allow Set operations #\r\n--\t)-&gt;union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles-&gt;iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6-&gt;union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n--\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id-&gt;includesAll(\r\n--\t\tself.parentProvidesComponentTypes-&gt;iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles-&gt;iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2-&gt;union(r.providedInterface.identifier.id-&gt;asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue'"
	 * @generated
	 */
	boolean providedInterfacesHaveToConformToProvidedType2(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CompleteComponentType
