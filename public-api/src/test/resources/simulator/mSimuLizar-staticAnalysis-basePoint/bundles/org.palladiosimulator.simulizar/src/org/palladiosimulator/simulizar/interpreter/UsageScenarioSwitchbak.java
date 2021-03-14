package org.palladiosimulator.simulizar.interpreter;

import org.apache.log4j.Logger;
import softwarerepository.OperationSignature;
import softwareusage.EntryLevelSystemCall;
import softwareusage.UsageScenario;
// TODO: Switch muss angepasst werden
import org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch;

import org.palladiosimulator.simulizar.exceptions.PCMModelInterpreterException;
import org.palladiosimulator.simulizar.interpreter.listener.EventType;
import org.palladiosimulator.simulizar.interpreter.listener.ModelElementPassedEvent;
import org.palladiosimulator.simulizar.utils.SimulatedStackHelper;

import de.uka.ipd.sdq.scheduler.resources.active.IResourceTableManager;

/**
 * Switch for Usage Scenario in Usage Model
 *
 * @author Joachim Meyer
 * @author Sandro Koch
 *
 * @param <T>
 *            return type of switch methods.
 */

public class UsageScenarioSwitchbak<T> extends UsagemodelSwitch<T> {

    protected static final Logger LOGGER = Logger.getLogger(UsageScenarioSwitchbak.class.getName());

    private final InterpreterDefaultContext context;
    private final IResourceTableManager resourceTableManager;
    
    /**
     * Constructor
     *
     * @param modelInterpreter
     *            the corresponding pcm model interpreter holding this switch..
     */
    public UsageScenarioSwitchbak(final InterpreterDefaultContext context, IResourceTableManager resourceTableManager) {
        this.context = context;
        this.resourceTableManager = resourceTableManager;
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseEntryLevelSystemCall(org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall)
     */
    @Override
    public T caseEntryLevelSystemCall(final EntryLevelSystemCall entryLevelSystemCall) {
        final RepositoryComponentSwitch providedDelegationSwitch = new RepositoryComponentSwitch(this.context,
                RepositoryComponentSwitch.SYSTEM_ASSEMBLY_CONTEXT,
                entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(),
                entryLevelSystemCall.getProvidedRole_EntryLevelSystemCall(), resourceTableManager);

        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<EntryLevelSystemCall>(entryLevelSystemCall,
                        EventType.BEGIN, this.context));

        // FIXME We stick to single model elements here even though several would be needed to
        // uniquely identify the measuring point of interest (system + role + signature) [Lehrig]
        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<OperationSignature>(
                        entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(), EventType.BEGIN,
                        this.context));

        // create new stack frame for input parameter
        SimulatedStackHelper.createAndPushNewStackFrame(this.context.getStack(),
                entryLevelSystemCall.getInputParameterUsages_EntryLevelSystemCall());
        providedDelegationSwitch.doSwitch(entryLevelSystemCall.getProvidedRole_EntryLevelSystemCall());
        this.context.getStack().removeStackFrame();

        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<EntryLevelSystemCall>(entryLevelSystemCall, EventType.END,
                        this.context));

        // FIXME We stick to single model elements here even though several would be needed to
        // uniquely identify the measuring point of interest (system + role + signature) [Lehrig]
        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<OperationSignature>(
                        entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(), EventType.END,
                        this.context));

        return super.caseEntryLevelSystemCall(entryLevelSystemCall);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseUsageScenario(org.palladiosimulator.pcm.usagemodel.UsageScenario)
     */
    @Override
    public T caseUsageScenario(final UsageScenario usageScenario) {
        this.context.getRuntimeState().getEventNotificationHelper().firePassedEvent(
                new ModelElementPassedEvent<UsageScenario>(usageScenario, EventType.BEGIN, this.context));
        final int stacksize = this.context.getStack().size();
        this.doSwitch(usageScenario.getScenarioBehaviour_UsageScenario());
        if (this.context.getStack().size() != stacksize) {
            throw new PCMModelInterpreterException("Interpreter did not pop all pushed stackframes");
        }
        this.context.getRuntimeState().getEventNotificationHelper().firePassedEvent(
                new ModelElementPassedEvent<UsageScenario>(usageScenario, EventType.END, this.context));
        return super.caseUsageScenario(usageScenario);
    }
}
