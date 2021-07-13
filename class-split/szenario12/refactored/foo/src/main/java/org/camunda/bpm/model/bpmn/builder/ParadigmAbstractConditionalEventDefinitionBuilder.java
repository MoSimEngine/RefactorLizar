package org.camunda.bpm.model.bpmn.builder;
import org.camunda.bpm.model.bpmn.instance.paradigm.events.Event;
public class ParadigmAbstractConditionalEventDefinitionBuilder extends CommonsAbstractConditionalEventDefinitionBuilder {
    /**
     * Finishes the building of a conditional event definition.
     *
     * @param <T>
     * 		
     * @return the parent event builder
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T extends AbstractFlowNodeBuilder> T conditionalEventDefinitionDone() {
        return ((T) (((Event) (element.getParentElement())).builder()));
    }
}