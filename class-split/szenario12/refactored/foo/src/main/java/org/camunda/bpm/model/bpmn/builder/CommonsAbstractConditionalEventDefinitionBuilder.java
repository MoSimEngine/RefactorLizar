package org.camunda.bpm.model.bpmn.builder;
import java.util.List;
import org.camunda.bpm.model.bpmn.instance.domain.events.advanced.ConditionalEventDefinition;
class CommonsAbstractConditionalEventDefinitionBuilder<B extends DomainAbstractConditionalEventDefinitionBuilder> extends AbstractRootElementBuilder<B, ConditionalEventDefinition> {
    /**
     * Sets the camunda variable name attribute, that defines on
     * which variable the condition should be evaluated.
     *
     * @param variableName
     * 		the variable on which the condition should be evaluated
     * @return the builder object
     */
    public B camundaVariableName(String variableName) {
        element.setCamundaVariableName(variableName);
        return myself;
    }

    /**
     * Set the camunda variable events attribute, that defines the variable
     * event on which the condition should be evaluated.
     *
     * @param variableEvents
     * 		the events on which the condition should be evaluated
     * @return the builder object
     */
    public B camundaVariableEvents(String variableEvents) {
        element.setCamundaVariableEvents(variableEvents);
        return myself;
    }

    /**
     * Set the camunda variable events attribute, that defines the variable
     * event on which the condition should be evaluated.
     *
     * @param variableEvents
     * 		the events on which the condition should be evaluated
     * @return the builder object
     */
    public B camundaVariableEvents(List<String> variableEvents) {
        element.setCamundaVariableEventsList(variableEvents);
        return myself;
    }
}