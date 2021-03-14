/**
 */
package org.palladiosimulator.simulizar.action.core;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Guarded
 * Transition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getConditionURI
 * <em>Condition URI</em>}</li>
 * <li>{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getGuardedStep
 * <em>Guarded Step</em>}</li>
 * <li>{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getNestedAdaptationBehavior
 * <em>Nested Adaptation Behavior</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.simulizar.action.core.CorePackage#getGuardedTransition()
 * @model
 * @generated
 */
public interface GuardedTransition extends EObject, Entity {
    /**
     * Returns the value of the '<em><b>Condition URI</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition URI</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Condition URI</em>' attribute.
     * @see #setConditionURI(String)
     * @see org.palladiosimulator.simulizar.action.core.CorePackage#getGuardedTransition_ConditionURI()
     * @model
     * @generated
     */
    String getConditionURI();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getConditionURI
     * <em>Condition URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Condition URI</em>' attribute.
     * @see #getConditionURI()
     * @generated
     */
    void setConditionURI(String value);

    /**
     * Returns the value of the '<em><b>Guarded Step</b></em>' container reference. It is
     * bidirectional and its opposite is
     * '{@link org.palladiosimulator.simulizar.action.core.GuardedStep#getGuardedTransitions
     * <em>Guarded Transitions</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guarded Step</em>' container reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Guarded Step</em>' container reference.
     * @see #setGuardedStep(GuardedStep)
     * @see org.palladiosimulator.simulizar.action.core.CorePackage#getGuardedTransition_GuardedStep()
     * @see org.palladiosimulator.simulizar.action.core.GuardedStep#getGuardedTransitions
     * @model opposite="guardedTransitions" transient="false"
     * @generated
     */
    GuardedStep getGuardedStep();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getGuardedStep
     * <em>Guarded Step</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Guarded Step</em>' container reference.
     * @see #getGuardedStep()
     * @generated
     */
    void setGuardedStep(GuardedStep value);

    /**
     * Returns the value of the '<em><b>Nested Adaptation Behavior</b></em>' containment reference.
     * It is bidirectional and its opposite is
     * '{@link org.palladiosimulator.simulizar.action.core.NestedAdaptationBehavior#getGuardedTransition
     * <em>Guarded Transition</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nested Adaptation Behavior</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Nested Adaptation Behavior</em>' containment reference.
     * @see #setNestedAdaptationBehavior(NestedAdaptationBehavior)
     * @see org.palladiosimulator.simulizar.action.core.CorePackage#getGuardedTransition_NestedAdaptationBehavior()
     * @see org.palladiosimulator.simulizar.action.core.NestedAdaptationBehavior#getGuardedTransition
     * @model opposite="guardedTransition" containment="true"
     * @generated
     */
    NestedAdaptationBehavior getNestedAdaptationBehavior();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.simulizar.action.core.GuardedTransition#getNestedAdaptationBehavior
     * <em>Nested Adaptation Behavior</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Nested Adaptation Behavior</em>' containment reference.
     * @see #getNestedAdaptationBehavior()
     * @generated
     */
    void setNestedAdaptationBehavior(NestedAdaptationBehavior value);

} // GuardedTransition
