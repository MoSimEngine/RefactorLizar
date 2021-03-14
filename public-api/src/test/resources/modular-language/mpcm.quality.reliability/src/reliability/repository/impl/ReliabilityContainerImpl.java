/**
 */
package reliability.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reliability.repository.FailureDeclaration;
import reliability.repository.ReliabilityContainer;
import reliability.repository.RepositoryPackage;

import reliability.seff.AcquireActionTimeout;
import reliability.seff.FailureHandlingExternalCallAction;
import reliability.seff.InternalFailureOccurrenceDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliability Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link reliability.repository.impl.ReliabilityContainerImpl#getFailureDeclarations <em>Failure Declarations</em>}</li>
 *   <li>{@link reliability.repository.impl.ReliabilityContainerImpl#getFailureHandlingExternalCallActions <em>Failure Handling External Call Actions</em>}</li>
 *   <li>{@link reliability.repository.impl.ReliabilityContainerImpl#getInternalFailureOccurenceDescriptions <em>Internal Failure Occurence Descriptions</em>}</li>
 *   <li>{@link reliability.repository.impl.ReliabilityContainerImpl#getAcquireActionTimeout <em>Acquire Action Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReliabilityContainerImpl extends MinimalEObjectImpl.Container implements ReliabilityContainer {
	/**
	 * The cached value of the '{@link #getFailureDeclarations() <em>Failure Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureDeclaration> failureDeclarations;

	/**
	 * The cached value of the '{@link #getFailureHandlingExternalCallActions() <em>Failure Handling External Call Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureHandlingExternalCallActions()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureHandlingExternalCallAction> failureHandlingExternalCallActions;

	/**
	 * The cached value of the '{@link #getInternalFailureOccurenceDescriptions() <em>Internal Failure Occurence Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFailureOccurenceDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalFailureOccurrenceDescription> internalFailureOccurenceDescriptions;

	/**
	 * The cached value of the '{@link #getAcquireActionTimeout() <em>Acquire Action Timeout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireActionTimeout()
	 * @generated
	 * @ordered
	 */
	protected EList<AcquireActionTimeout> acquireActionTimeout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.RELIABILITY_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureDeclaration> getFailureDeclarations() {
		if (failureDeclarations == null) {
			failureDeclarations = new EObjectContainmentEList<FailureDeclaration>(FailureDeclaration.class, this, RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS);
		}
		return failureDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureHandlingExternalCallAction> getFailureHandlingExternalCallActions() {
		if (failureHandlingExternalCallActions == null) {
			failureHandlingExternalCallActions = new EObjectContainmentEList<FailureHandlingExternalCallAction>(FailureHandlingExternalCallAction.class, this, RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS);
		}
		return failureHandlingExternalCallActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalFailureOccurrenceDescription> getInternalFailureOccurenceDescriptions() {
		if (internalFailureOccurenceDescriptions == null) {
			internalFailureOccurenceDescriptions = new EObjectContainmentEList<InternalFailureOccurrenceDescription>(InternalFailureOccurrenceDescription.class, this, RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS);
		}
		return internalFailureOccurenceDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcquireActionTimeout> getAcquireActionTimeout() {
		if (acquireActionTimeout == null) {
			acquireActionTimeout = new EObjectContainmentEList<AcquireActionTimeout>(AcquireActionTimeout.class, this, RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT);
		}
		return acquireActionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS:
				return ((InternalEList<?>)getFailureDeclarations()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS:
				return ((InternalEList<?>)getFailureHandlingExternalCallActions()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS:
				return ((InternalEList<?>)getInternalFailureOccurenceDescriptions()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT:
				return ((InternalEList<?>)getAcquireActionTimeout()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS:
				return getFailureDeclarations();
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS:
				return getFailureHandlingExternalCallActions();
			case RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS:
				return getInternalFailureOccurenceDescriptions();
			case RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT:
				return getAcquireActionTimeout();
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
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS:
				getFailureDeclarations().clear();
				getFailureDeclarations().addAll((Collection<? extends FailureDeclaration>)newValue);
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS:
				getFailureHandlingExternalCallActions().clear();
				getFailureHandlingExternalCallActions().addAll((Collection<? extends FailureHandlingExternalCallAction>)newValue);
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS:
				getInternalFailureOccurenceDescriptions().clear();
				getInternalFailureOccurenceDescriptions().addAll((Collection<? extends InternalFailureOccurrenceDescription>)newValue);
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT:
				getAcquireActionTimeout().clear();
				getAcquireActionTimeout().addAll((Collection<? extends AcquireActionTimeout>)newValue);
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
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS:
				getFailureDeclarations().clear();
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS:
				getFailureHandlingExternalCallActions().clear();
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS:
				getInternalFailureOccurenceDescriptions().clear();
				return;
			case RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT:
				getAcquireActionTimeout().clear();
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
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_DECLARATIONS:
				return failureDeclarations != null && !failureDeclarations.isEmpty();
			case RepositoryPackage.RELIABILITY_CONTAINER__FAILURE_HANDLING_EXTERNAL_CALL_ACTIONS:
				return failureHandlingExternalCallActions != null && !failureHandlingExternalCallActions.isEmpty();
			case RepositoryPackage.RELIABILITY_CONTAINER__INTERNAL_FAILURE_OCCURENCE_DESCRIPTIONS:
				return internalFailureOccurenceDescriptions != null && !internalFailureOccurenceDescriptions.isEmpty();
			case RepositoryPackage.RELIABILITY_CONTAINER__ACQUIRE_ACTION_TIMEOUT:
				return acquireActionTimeout != null && !acquireActionTimeout.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReliabilityContainerImpl
