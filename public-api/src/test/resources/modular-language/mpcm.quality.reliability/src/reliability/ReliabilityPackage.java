/**
 */
package reliability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * This package contains reliability-relevant classes such as the definition of failure types.
 * <!-- end-model-doc -->
 * @see reliability.ReliabilityFactory
 * @model kind="package"
 * @generated
 */
public interface ReliabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reliability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.reliability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.reliability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliabilityPackage eINSTANCE = reliability.impl.ReliabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see reliability.impl.FailureOccurrenceDescriptionImpl
	 * @see reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
	 * @generated
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = 0;

	/**
	 * The number of structural features of the '<em>Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link reliability.FailureOccurrenceDescription <em>Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Occurrence Description</em>'.
	 * @see reliability.FailureOccurrenceDescription
	 * @generated
	 */
	EClass getFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see reliability.FailureOccurrenceDescription#getFailureProbability()
	 * @see #getFailureOccurrenceDescription()
	 * @generated
	 */
	EAttribute getFailureOccurrenceDescription_FailureProbability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReliabilityFactory getReliabilityFactory();

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
		 * The meta object literal for the '{@link reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see reliability.impl.FailureOccurrenceDescriptionImpl
		 * @see reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
		 * @generated
		 */
		EClass FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = eINSTANCE.getFailureOccurrenceDescription_FailureProbability();

	}

} //ReliabilityPackage
