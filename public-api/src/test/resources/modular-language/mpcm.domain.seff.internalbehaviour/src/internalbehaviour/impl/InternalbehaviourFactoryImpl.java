/**
 */
package internalbehaviour.impl;

import internalbehaviour.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalbehaviourFactoryImpl extends EFactoryImpl implements InternalbehaviourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalbehaviourFactory init() {
		try {
			InternalbehaviourFactory theInternalbehaviourFactory = (InternalbehaviourFactory)EPackage.Registry.INSTANCE.getEFactory(InternalbehaviourPackage.eNS_URI);
			if (theInternalbehaviourFactory != null) {
				return theInternalbehaviourFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalbehaviourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalbehaviourFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InternalbehaviourPackage.INTERNAL_BEHAVIOUR_SEFF: return createInternalBehaviourSEFF();
			case InternalbehaviourPackage.INTERNAL_CALL_ACTION: return createInternalCallAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBehaviourSEFF createInternalBehaviourSEFF() {
		InternalBehaviourSEFFImpl internalBehaviourSEFF = new InternalBehaviourSEFFImpl();
		return internalBehaviourSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCallAction createInternalCallAction() {
		InternalCallActionImpl internalCallAction = new InternalCallActionImpl();
		return internalCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalbehaviourPackage getInternalbehaviourPackage() {
		return (InternalbehaviourPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalbehaviourPackage getPackage() {
		return InternalbehaviourPackage.eINSTANCE;
	}

} //InternalbehaviourFactoryImpl
