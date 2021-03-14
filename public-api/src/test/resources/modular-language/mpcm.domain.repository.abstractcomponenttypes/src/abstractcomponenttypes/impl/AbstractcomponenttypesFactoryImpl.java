/**
 */
package abstractcomponenttypes.impl;

import abstractcomponenttypes.*;

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
public class AbstractcomponenttypesFactoryImpl extends EFactoryImpl implements AbstractcomponenttypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractcomponenttypesFactory init() {
		try {
			AbstractcomponenttypesFactory theAbstractcomponenttypesFactory = (AbstractcomponenttypesFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractcomponenttypesPackage.eNS_URI);
			if (theAbstractcomponenttypesFactory != null) {
				return theAbstractcomponenttypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractcomponenttypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractcomponenttypesFactoryImpl() {
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
			case AbstractcomponenttypesPackage.PROVIDES_COMPONENT_TYPE: return createProvidesComponentType();
			case AbstractcomponenttypesPackage.COMPLETE_COMPONENT_TYPE: return createCompleteComponentType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesComponentType createProvidesComponentType() {
		ProvidesComponentTypeImpl providesComponentType = new ProvidesComponentTypeImpl();
		return providesComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteComponentType createCompleteComponentType() {
		CompleteComponentTypeImpl completeComponentType = new CompleteComponentTypeImpl();
		return completeComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractcomponenttypesPackage getAbstractcomponenttypesPackage() {
		return (AbstractcomponenttypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractcomponenttypesPackage getPackage() {
		return AbstractcomponenttypesPackage.eINSTANCE;
	}

} //AbstractcomponenttypesFactoryImpl
