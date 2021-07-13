package org.camunda.bpm.model.bpmn.builder;
import AssociationDirection.One;
import org.camunda.bpm.model.bpmn.BpmnModelException;
import org.camunda.bpm.model.bpmn.instance.paradigm.activities.Activity;
import org.camunda.bpm.model.bpmn.instance.paradigm.artifacts.Association;
import org.camunda.bpm.model.bpmn.instance.paradigm.flows.FlowNode;
import org.camunda.bpm.model.bpmn.instance.paradigm.gateways.Gateway;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;
public abstract class ParadigmAbstractFlowNodeBuilder<B extends DomainAbstractFlowNodeBuilder, E extends FlowNode> extends CommonsAbstractFlowNodeBuilder {
    protected void connectTargetWithAssociation(FlowNode target) {
        Association association = modelInstance.newInstance(Association.class);
        association.setTarget(target);
        association.setSource(element);
        association.setAssociationDirection(One);
        element.getParentElement().addChildElement(association);
        createEdge(association);
    }

    public Gateway findLastGateway() {
        FlowNode lastGateway = element;
        while (true) {
            try {
                lastGateway = lastGateway.getPreviousNodes().singleResult();
                if (lastGateway instanceof Gateway) {
                    return ((Gateway) (lastGateway));
                }
            } catch (BpmnModelException e) {
                throw new BpmnModelException("Unable to determine an unique previous gateway of " + lastGateway.getId(), e);
            }
        } 
    }

    @SuppressWarnings("rawtypes")
    public AbstractGatewayBuilder moveToLastGateway() {
        return findLastGateway().builder();
    }

    @SuppressWarnings("rawtypes")
    public AbstractFlowNodeBuilder moveToNode(String identifier) {
        ModelElementInstance instance = modelInstance.getModelElementById(identifier);
        if ((instance != null) && (instance instanceof FlowNode)) {
            return ((FlowNode) (instance)).builder();
        } else {
            throw new BpmnModelException("Flow node not found for id " + identifier);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T extends AbstractActivityBuilder> T moveToActivity(String identifier) {
        ModelElementInstance instance = modelInstance.getModelElementById(identifier);
        if ((instance != null) && (instance instanceof Activity)) {
            return ((T) (((Activity) (instance)).builder()));
        } else {
            throw new BpmnModelException("Activity not found for id " + identifier);
        }
    }
}