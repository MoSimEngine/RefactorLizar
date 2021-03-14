/**
 */
package performanceannotations;

import annotations.AnnotationsPackage;

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
 * Performance aspects of QoS annotations.
 * <!-- end-model-doc -->
 * @see performanceannotations.PerformanceannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface PerformanceannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "performanceannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mpcm.quality.performanceannotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpcm.quality.performanceannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformanceannotationsPackage eINSTANCE = performanceannotations.impl.PerformanceannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link performanceannotations.impl.ServiceExecutionTimeImpl <em>Service Execution Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performanceannotations.impl.ServiceExecutionTimeImpl
	 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getServiceExecutionTime()
	 * @generated
	 */
	int SERVICE_EXECUTION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Execution Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXECUTION_TIME_FEATURE_COUNT = AnnotationsPackage.SERVICE_PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link performanceannotations.impl.SystemServiceExecutionTimeImpl <em>System Service Execution Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performanceannotations.impl.SystemServiceExecutionTimeImpl
	 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getSystemServiceExecutionTime()
	 * @generated
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = SERVICE_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = SERVICE_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = SERVICE_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME;

	/**
	 * The number of structural features of the '<em>System Service Execution Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SERVICE_EXECUTION_TIME_FEATURE_COUNT = SERVICE_EXECUTION_TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link performanceannotations.impl.ComponentServiceExecutionTimeImpl <em>Component Service Execution Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see performanceannotations.impl.ComponentServiceExecutionTimeImpl
	 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getComponentServiceExecutionTime()
	 * @generated
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME = 2;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION = SERVICE_EXECUTION_TIME__SIGNATURE_SPECIFIED_QO_SANNATION;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION = SERVICE_EXECUTION_TIME__ROLE_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = SERVICE_EXECUTION_TIME__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Specification Specified Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME = SERVICE_EXECUTION_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Service Execution Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_EXECUTION_TIME_FEATURE_COUNT = SERVICE_EXECUTION_TIME_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link performanceannotations.ServiceExecutionTime <em>Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Execution Time</em>'.
	 * @see performanceannotations.ServiceExecutionTime
	 * @generated
	 */
	EClass getServiceExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link performanceannotations.ServiceExecutionTime#getSpecification_SpecifiedExecutionTime <em>Specification Specified Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Specified Execution Time</em>'.
	 * @see performanceannotations.ServiceExecutionTime#getSpecification_SpecifiedExecutionTime()
	 * @see #getServiceExecutionTime()
	 * @generated
	 */
	EReference getServiceExecutionTime_Specification_SpecifiedExecutionTime();

	/**
	 * Returns the meta object for class '{@link performanceannotations.SystemServiceExecutionTime <em>System Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Service Execution Time</em>'.
	 * @see performanceannotations.SystemServiceExecutionTime
	 * @generated
	 */
	EClass getSystemServiceExecutionTime();

	/**
	 * Returns the meta object for class '{@link performanceannotations.ComponentServiceExecutionTime <em>Component Service Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Service Execution Time</em>'.
	 * @see performanceannotations.ComponentServiceExecutionTime
	 * @generated
	 */
	EClass getComponentServiceExecutionTime();

	/**
	 * Returns the meta object for the reference '{@link performanceannotations.ComponentServiceExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime <em>Assembly Context Component Specified Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context Component Specified Execution Time</em>'.
	 * @see performanceannotations.ComponentServiceExecutionTime#getAssemblyContext_ComponentSpecifiedExecutionTime()
	 * @see #getComponentServiceExecutionTime()
	 * @generated
	 */
	EReference getComponentServiceExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PerformanceannotationsFactory getPerformanceannotationsFactory();

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
		 * The meta object literal for the '{@link performanceannotations.impl.ServiceExecutionTimeImpl <em>Service Execution Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performanceannotations.impl.ServiceExecutionTimeImpl
		 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getServiceExecutionTime()
		 * @generated
		 */
		EClass SERVICE_EXECUTION_TIME = eINSTANCE.getServiceExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Specification Specified Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME = eINSTANCE.getServiceExecutionTime_Specification_SpecifiedExecutionTime();

		/**
		 * The meta object literal for the '{@link performanceannotations.impl.SystemServiceExecutionTimeImpl <em>System Service Execution Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performanceannotations.impl.SystemServiceExecutionTimeImpl
		 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getSystemServiceExecutionTime()
		 * @generated
		 */
		EClass SYSTEM_SERVICE_EXECUTION_TIME = eINSTANCE.getSystemServiceExecutionTime();

		/**
		 * The meta object literal for the '{@link performanceannotations.impl.ComponentServiceExecutionTimeImpl <em>Component Service Execution Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see performanceannotations.impl.ComponentServiceExecutionTimeImpl
		 * @see performanceannotations.impl.PerformanceannotationsPackageImpl#getComponentServiceExecutionTime()
		 * @generated
		 */
		EClass COMPONENT_SERVICE_EXECUTION_TIME = eINSTANCE.getComponentServiceExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Component Specified Execution Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SERVICE_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME = eINSTANCE.getComponentServiceExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime();

	}

} //PerformanceannotationsPackage
