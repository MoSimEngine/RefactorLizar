/**
 */
package reliability.repository;

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
 * @see reliability.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.reliability.repository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliability.repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = reliability.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliability.repository.impl.ReliabilityContainerImpl <em>Reliability Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.repository.impl.ReliabilityContainerImpl
	 * @see reliability.repository.impl.RepositoryPackageImpl#getReliabilityContainer()
	 * @generated
	 */
	int RELIABILITY_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Failure Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONTAINER__FAILURE_DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Failure Handling External Call Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurence Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Acquire Action Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT = 3;

	/**
	 * The number of structural features of the '<em>Reliability Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link reliability.repository.impl.FailureDeclarationImpl <em>Failure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.repository.impl.FailureDeclarationImpl
	 * @see reliability.repository.impl.RepositoryPackageImpl#getFailureDeclaration()
	 * @generated
	 */
	int FAILURE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_DECLARATION__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_DECLARATION__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Failure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_DECLARATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link reliability.repository.ReliabilityContainer <em>Reliability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Container</em>'.
	 * @see reliability.repository.ReliabilityContainer
	 * @generated
	 */
	EClass getReliabilityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.repository.ReliabilityContainer#getFailureDeclarations <em>Failure Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Declarations</em>'.
	 * @see reliability.repository.ReliabilityContainer#getFailureDeclarations()
	 * @see #getReliabilityContainer()
	 * @generated
	 */
	EReference getReliabilityContainer_FailureDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.repository.ReliabilityContainer#getFailureHandlingExternalCallActions <em>Failure Handling External Call Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Handling External Call Actions</em>'.
	 * @see reliability.repository.ReliabilityContainer#getFailureHandlingExternalCallActions()
	 * @see #getReliabilityContainer()
	 * @generated
	 */
	EReference getReliabilityContainer_FailureHandlingExternalCallActions();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.repository.ReliabilityContainer#getInternalFailureOccurenceDescriptions <em>Internal Failure Occurence Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Failure Occurence Descriptions</em>'.
	 * @see reliability.repository.ReliabilityContainer#getInternalFailureOccurenceDescriptions()
	 * @see #getReliabilityContainer()
	 * @generated
	 */
	EReference getReliabilityContainer_InternalFailureOccurenceDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link reliability.repository.ReliabilityContainer#getAcquireActionTimeout <em>Acquire Action Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acquire Action Timeout</em>'.
	 * @see reliability.repository.ReliabilityContainer#getAcquireActionTimeout()
	 * @see #getReliabilityContainer()
	 * @generated
	 */
	EReference getReliabilityContainer_AcquireActionTimeout();

	/**
	 * Returns the meta object for class '{@link reliability.repository.FailureDeclaration <em>Failure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Declaration</em>'.
	 * @see reliability.repository.FailureDeclaration
	 * @generated
	 */
	EClass getFailureDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link reliability.repository.FailureDeclaration#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see reliability.repository.FailureDeclaration#getTypes()
	 * @see #getFailureDeclaration()
	 * @generated
	 */
	EReference getFailureDeclaration_Types();

	/**
	 * Returns the meta object for the reference '{@link reliability.repository.FailureDeclaration#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see reliability.repository.FailureDeclaration#getOwner()
	 * @see #getFailureDeclaration()
	 * @generated
	 */
	EReference getFailureDeclaration_Owner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link reliability.repository.impl.ReliabilityContainerImpl <em>Reliability Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.repository.impl.ReliabilityContainerImpl
		 * @see reliability.repository.impl.RepositoryPackageImpl#getReliabilityContainer()
		 * @generated
		 */
		EClass RELIABILITY_CONTAINER = eINSTANCE.getReliabilityContainer();

		/**
		 * The meta object literal for the '<em><b>Failure Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_CONTAINER__FAILURE_DECLARATIONS = eINSTANCE.getReliabilityContainer_FailureDeclarations();

		/**
		 * The meta object literal for the '<em><b>Failure Handling External Call Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS = eINSTANCE.getReliabilityContainer_FailureHandlingExternalCallActions();

		/**
		 * The meta object literal for the '<em><b>Internal Failure Occurence Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS = eINSTANCE.getReliabilityContainer_InternalFailureOccurenceDescriptions();

		/**
		 * The meta object literal for the '<em><b>Acquire Action Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT = eINSTANCE.getReliabilityContainer_AcquireActionTimeout();

		/**
		 * The meta object literal for the '{@link reliability.repository.impl.FailureDeclarationImpl <em>Failure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.repository.impl.FailureDeclarationImpl
		 * @see reliability.repository.impl.RepositoryPackageImpl#getFailureDeclaration()
		 * @generated
		 */
		EClass FAILURE_DECLARATION = eINSTANCE.getFailureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_DECLARATION__TYPES = eINSTANCE.getFailureDeclaration_Types();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_DECLARATION__OWNER = eINSTANCE.getFailureDeclaration_Owner();

	}

} //RepositoryPackage
