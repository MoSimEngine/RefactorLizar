/**
 */
package performance.seff;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Package capturing performance aspects of an RDSEFF
 * <!-- end-model-doc -->
 * @see performance.seff.SeffFactory
 * @model kind="package"
 * @generated
 */
public interface SeffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.performance.seff";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.performance.seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = performance.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link performance.seff.impl.PerformanceSEFFRootImpl <em>Performance SEFF Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.seff.impl.PerformanceSEFFRootImpl
	 * @see performance.seff.impl.SeffPackageImpl#getPerformanceSEFFRoot()
	 * @generated
	 */
	int PERFORMANCE_SEFF_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Resource Demanding SEF Fs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS = 0;

	/**
	 * The number of structural features of the '<em>Performance SEFF Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SEFF_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link performance.seff.impl.ResourceDemandingSEFFImpl <em>Resource Demanding SEFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.seff.impl.ResourceDemandingSEFFImpl
	 * @see performance.seff.impl.SeffPackageImpl#getResourceDemandingSEFF()
	 * @generated
	 */
	int RESOURCE_DEMANDING_SEFF = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Resource Demands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__OWNER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Demanding SEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link performance.seff.impl.ParametricResourceDemandImpl <em>Parametric Resource Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performance.seff.impl.ParametricResourceDemandImpl
	 * @see performance.seff.impl.SeffPackageImpl#getParametricResourceDemand()
	 * @generated
	 */
	int PARAMETRIC_RESOURCE_DEMAND = 2;

	/**
	 * The feature id for the '<em><b>Specification Parameteric Resource Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND = 0;

	/**
	 * The feature id for the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = 1;

	/**
	 * The feature id for the '<em><b>Action Parametric Resource Demand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_RESOURCE_DEMAND__OWNER = 3;

	/**
	 * The number of structural features of the '<em>Parametric Resource Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_RESOURCE_DEMAND_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link performance.seff.PerformanceSEFFRoot <em>Performance SEFF Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance SEFF Root</em>'.
	 * @see performance.seff.PerformanceSEFFRoot
	 * @generated
	 */
	EClass getPerformanceSEFFRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link performance.seff.PerformanceSEFFRoot#getResourceDemandingSEFFs <em>Resource Demanding SEF Fs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Demanding SEF Fs</em>'.
	 * @see performance.seff.PerformanceSEFFRoot#getResourceDemandingSEFFs()
	 * @see #getPerformanceSEFFRoot()
	 * @generated
	 */
	EReference getPerformanceSEFFRoot_ResourceDemandingSEFFs();

	/**
	 * Returns the meta object for class '{@link performance.seff.ResourceDemandingSEFF <em>Resource Demanding SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Demanding SEFF</em>'.
	 * @see performance.seff.ResourceDemandingSEFF
	 * @generated
	 */
	EClass getResourceDemandingSEFF();

	/**
	 * Returns the meta object for the containment reference list '{@link performance.seff.ResourceDemandingSEFF#getResourceDemands <em>Resource Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Demands</em>'.
	 * @see performance.seff.ResourceDemandingSEFF#getResourceDemands()
	 * @see #getResourceDemandingSEFF()
	 * @generated
	 */
	EReference getResourceDemandingSEFF_ResourceDemands();

	/**
	 * Returns the meta object for the reference '{@link performance.seff.ResourceDemandingSEFF#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see performance.seff.ResourceDemandingSEFF#getOwner()
	 * @see #getResourceDemandingSEFF()
	 * @generated
	 */
	EReference getResourceDemandingSEFF_Owner();

	/**
	 * Returns the meta object for class '{@link performance.seff.ParametricResourceDemand <em>Parametric Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Resource Demand</em>'.
	 * @see performance.seff.ParametricResourceDemand
	 * @generated
	 */
	EClass getParametricResourceDemand();

	/**
	 * Returns the meta object for the containment reference '{@link performance.seff.ParametricResourceDemand#getSpecification_ParametericResourceDemand <em>Specification Parameteric Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Parameteric Resource Demand</em>'.
	 * @see performance.seff.ParametricResourceDemand#getSpecification_ParametericResourceDemand()
	 * @see #getParametricResourceDemand()
	 * @generated
	 */
	EReference getParametricResourceDemand_Specification_ParametericResourceDemand();

	/**
	 * Returns the meta object for the reference '{@link performance.seff.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand <em>Required Resource Parametric Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Resource Parametric Resource Demand</em>'.
	 * @see performance.seff.ParametricResourceDemand#getRequiredResource_ParametricResourceDemand()
	 * @see #getParametricResourceDemand()
	 * @generated
	 */
	EReference getParametricResourceDemand_RequiredResource_ParametricResourceDemand();

	/**
	 * Returns the meta object for the reference '{@link performance.seff.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Parametric Resource Demand</em>'.
	 * @see performance.seff.ParametricResourceDemand#getAction_ParametricResourceDemand()
	 * @see #getParametricResourceDemand()
	 * @generated
	 */
	EReference getParametricResourceDemand_Action_ParametricResourceDemand();

	/**
	 * Returns the meta object for the reference '{@link performance.seff.ParametricResourceDemand#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see performance.seff.ParametricResourceDemand#getOwner()
	 * @see #getParametricResourceDemand()
	 * @generated
	 */
	EReference getParametricResourceDemand_Owner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeffFactory getSeffFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link performance.seff.impl.PerformanceSEFFRootImpl <em>Performance SEFF Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.seff.impl.PerformanceSEFFRootImpl
		 * @see performance.seff.impl.SeffPackageImpl#getPerformanceSEFFRoot()
		 * @generated
		 */
		EClass PERFORMANCE_SEFF_ROOT = eINSTANCE.getPerformanceSEFFRoot();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding SEF Fs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_SEFF_ROOT__RESOURCE_DEMANDING_SEF_FS = eINSTANCE.getPerformanceSEFFRoot_ResourceDemandingSEFFs();

		/**
		 * The meta object literal for the '{@link performance.seff.impl.ResourceDemandingSEFFImpl <em>Resource Demanding SEFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.seff.impl.ResourceDemandingSEFFImpl
		 * @see performance.seff.impl.SeffPackageImpl#getResourceDemandingSEFF()
		 * @generated
		 */
		EClass RESOURCE_DEMANDING_SEFF = eINSTANCE.getResourceDemandingSEFF();

		/**
		 * The meta object literal for the '<em><b>Resource Demands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDS = eINSTANCE.getResourceDemandingSEFF_ResourceDemands();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_SEFF__OWNER = eINSTANCE.getResourceDemandingSEFF_Owner();

		/**
		 * The meta object literal for the '{@link performance.seff.impl.ParametricResourceDemandImpl <em>Parametric Resource Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performance.seff.impl.ParametricResourceDemandImpl
		 * @see performance.seff.impl.SeffPackageImpl#getParametricResourceDemand()
		 * @generated
		 */
		EClass PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Specification Parameteric Resource Demand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_RESOURCE_DEMAND__SPECIFICATION_PARAMETERIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_Specification_ParametericResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Required Resource Parametric Resource Demand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_RESOURCE_DEMAND__REQUIRED_RESOURCE_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_RequiredResource_ParametricResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Action Parametric Resource Demand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_RESOURCE_DEMAND__ACTION_PARAMETRIC_RESOURCE_DEMAND = eINSTANCE.getParametricResourceDemand_Action_ParametricResourceDemand();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_RESOURCE_DEMAND__OWNER = eINSTANCE.getParametricResourceDemand_Owner();

	}

} //SeffPackage
