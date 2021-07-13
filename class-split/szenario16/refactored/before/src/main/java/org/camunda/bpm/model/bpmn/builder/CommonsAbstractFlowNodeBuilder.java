package org.camunda.bpm.model.bpmn.builder;
import AbstractFlowElementBuilder;
import org.camunda.bpm.model.bpmn.instance.paradigm.flows.FlowNode;
class CommonsAbstractFlowNodeBuilder<B extends DomainAbstractFlowNodeBuilder, E extends FlowNode> extends AbstractFlowElementBuilder<B, E> {
    protected SequenceFlowBuilder currentSequenceFlowBuilder;

    protected boolean compensationStarted;

    /**
     * Sets the Camunda AsyncBefore attribute for the build flow node.
     *
     * @param asyncBefore
     * 		boolean value to set
     * @return the builder object
     */
    public B camundaAsyncBefore(boolean asyncBefore) {
        element.setCamundaAsyncBefore(asyncBefore);
        return myself;
    }

    /**
     * Sets the Camunda asyncBefore attribute to true.
     *
     * @return the builder object
     */
    public B camundaAsyncBefore() {
        element.setCamundaAsyncBefore(true);
        return myself;
    }

    /**
     * Sets the Camunda asyncAfter attribute for the build flow node.
     *
     * @param asyncAfter
     * 		boolean value to set
     * @return the builder object
     */
    public B camundaAsyncAfter(boolean asyncAfter) {
        element.setCamundaAsyncAfter(asyncAfter);
        return myself;
    }

    /**
     * Sets the Camunda asyncAfter attribute to true.
     *
     * @return the builder object
     */
    public B camundaAsyncAfter() {
        element.setCamundaAsyncAfter(true);
        return myself;
    }

    /**
     * Sets the Camunda exclusive attribute to true.
     *
     * @return the builder object
     */
    public B notCamundaExclusive() {
        element.setCamundaExclusive(false);
        return myself;
    }

    /**
     * Sets the camunda exclusive attribute for the build flow node.
     *
     * @param exclusive
     * 		boolean value to set
     * @return the builder object
     */
    public B camundaExclusive(boolean exclusive) {
        element.setCamundaExclusive(exclusive);
        return myself;
    }

    public B camundaJobPriority(String jobPriority) {
        element.setCamundaJobPriority(jobPriority);
        return myself;
    }
}