/**
 */
package softwarerepository.impl;

import base.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.Interface;
import repository.RepositoryComponent;

import repository.datatypes.DataType;

import softwarerepository.ExceptionOccurence;
import softwarerepository.ExceptionType;
import softwarerepository.Softwarerepository;
import softwarerepository.SoftwarerepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Softwarerepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getRepositoryDescription <em>Repository Description</em>}</li>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getComponents__Repository <em>Components Repository</em>}</li>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getInterfaces__Repository <em>Interfaces Repository</em>}</li>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getDataTypes__Repository <em>Data Types Repository</em>}</li>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getExceptionTypes <em>Exception Types</em>}</li>
 *   <li>{@link softwarerepository.impl.SoftwarerepositoryImpl#getExceptionOccurences <em>Exception Occurences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwarerepositoryImpl extends EntityImpl implements Softwarerepository {
	/**
	 * The default value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryDescription() <em>Repository Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryDescription()
	 * @generated
	 * @ordered
	 */
	protected String repositoryDescription = REPOSITORY_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents__Repository() <em>Components Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents__Repository()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryComponent> components__Repository;

	/**
	 * The cached value of the '{@link #getInterfaces__Repository() <em>Interfaces Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces__Repository()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces__Repository;

	/**
	 * The cached value of the '{@link #getDataTypes__Repository() <em>Data Types Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes__Repository()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes__Repository;

	/**
	 * The cached value of the '{@link #getExceptionTypes() <em>Exception Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionType> exceptionTypes;

	/**
	 * The cached value of the '{@link #getExceptionOccurences() <em>Exception Occurences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionOccurences()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionOccurence> exceptionOccurences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwarerepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarerepositoryPackage.Literals.SOFTWAREREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryDescription() {
		return repositoryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryDescription(String newRepositoryDescription) {
		String oldRepositoryDescription = repositoryDescription;
		repositoryDescription = newRepositoryDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION, oldRepositoryDescription, repositoryDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryComponent> getComponents__Repository() {
		if (components__Repository == null) {
			components__Repository = new EObjectContainmentEList<RepositoryComponent>(RepositoryComponent.class, this, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY);
		}
		return components__Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces__Repository() {
		if (interfaces__Repository == null) {
			interfaces__Repository = new EObjectContainmentEList<Interface>(Interface.class, this, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY);
		}
		return interfaces__Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes__Repository() {
		if (dataTypes__Repository == null) {
			dataTypes__Repository = new EObjectContainmentEList<DataType>(DataType.class, this, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY);
		}
		return dataTypes__Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionType> getExceptionTypes() {
		if (exceptionTypes == null) {
			exceptionTypes = new EObjectContainmentEList<ExceptionType>(ExceptionType.class, this, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES);
		}
		return exceptionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionOccurence> getExceptionOccurences() {
		if (exceptionOccurences == null) {
			exceptionOccurences = new EObjectContainmentEList<ExceptionOccurence>(ExceptionOccurence.class, this, SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES);
		}
		return exceptionOccurences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
				return ((InternalEList<?>)getComponents__Repository()).basicRemove(otherEnd, msgs);
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
				return ((InternalEList<?>)getInterfaces__Repository()).basicRemove(otherEnd, msgs);
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
				return ((InternalEList<?>)getDataTypes__Repository()).basicRemove(otherEnd, msgs);
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
				return ((InternalEList<?>)getExceptionTypes()).basicRemove(otherEnd, msgs);
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
				return ((InternalEList<?>)getExceptionOccurences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION:
				return getRepositoryDescription();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
				return getComponents__Repository();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
				return getInterfaces__Repository();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
				return getDataTypes__Repository();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
				return getExceptionTypes();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
				return getExceptionOccurences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION:
				setRepositoryDescription((String)newValue);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
				getComponents__Repository().clear();
				getComponents__Repository().addAll((Collection<? extends RepositoryComponent>)newValue);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
				getInterfaces__Repository().clear();
				getInterfaces__Repository().addAll((Collection<? extends Interface>)newValue);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
				getDataTypes__Repository().clear();
				getDataTypes__Repository().addAll((Collection<? extends DataType>)newValue);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
				getExceptionTypes().clear();
				getExceptionTypes().addAll((Collection<? extends ExceptionType>)newValue);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
				getExceptionOccurences().clear();
				getExceptionOccurences().addAll((Collection<? extends ExceptionOccurence>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION:
				setRepositoryDescription(REPOSITORY_DESCRIPTION_EDEFAULT);
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
				getComponents__Repository().clear();
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
				getInterfaces__Repository().clear();
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
				getDataTypes__Repository().clear();
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
				getExceptionTypes().clear();
				return;
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
				getExceptionOccurences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__REPOSITORY_DESCRIPTION:
				return REPOSITORY_DESCRIPTION_EDEFAULT == null ? repositoryDescription != null : !REPOSITORY_DESCRIPTION_EDEFAULT.equals(repositoryDescription);
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__COMPONENTS_REPOSITORY:
				return components__Repository != null && !components__Repository.isEmpty();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__INTERFACES_REPOSITORY:
				return interfaces__Repository != null && !interfaces__Repository.isEmpty();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__DATA_TYPES_REPOSITORY:
				return dataTypes__Repository != null && !dataTypes__Repository.isEmpty();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_TYPES:
				return exceptionTypes != null && !exceptionTypes.isEmpty();
			case SoftwarerepositoryPackage.SOFTWAREREPOSITORY__EXCEPTION_OCCURENCES:
				return exceptionOccurences != null && !exceptionOccurences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (repositoryDescription: ");
		result.append(repositoryDescription);
		result.append(')');
		return result.toString();
	}

} //SoftwarerepositoryImpl
