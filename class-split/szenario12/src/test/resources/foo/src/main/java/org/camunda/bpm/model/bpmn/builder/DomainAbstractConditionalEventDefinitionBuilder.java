package org.camunda.bpm.model.bpmn.builder;
import org.camunda.bpm.model.bpmn.instance.Condition;
import static org.camunda.bpm.model.bpmn.builder.AbstractConditionalEventDefinitionBuilder.createInstance;
public class DomainAbstractConditionalEventDefinitionBuilder extends ParadigmAbstractConditionalEventDefinitionBuilder {
    /**
     * Sets the condition of the conditional event definition.
     *
     * @param conditionText
     * 		the condition which should be evaluate to true or false
     * @return the builder object
     */
    public B condition(String conditionText) {
        Condition condition = createInstance(Condition.class);
        condition.setTextContent(conditionText);
        element.setCondition(condition);
        return myself;
    }
}