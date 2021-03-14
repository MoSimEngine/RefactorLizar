/**
 *
 */
package org.palladiosimulator.simulizar.interpreter.listener;

import org.eclipse.emf.ecore.EObject;

/*
 * Metamodel Dependencies
 */
import softwarerepository.OperationSignature;
import repository.ProvidedRole;
import repository.Signature;
import behaviourseff.ExternalCallAction;
import softwareusage.EntryLevelSystemCall;
import softwareusage.UsageScenario;

/**
 * @author snowball
 *
 */
public abstract class AbstractInterpreterListener implements IInterpreterListener {

    /**
     *
     */
    public AbstractInterpreterListener() {
        super();
    }

    /*
     * (non-Javadoc)
     *
     * @see de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#
     * beginUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
    }

    /*
     * (non-Javadoc)
     *
     * @see de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#
     * endUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
    }

    /*
     * (non-Javadoc)
     *
     * @see de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#
     * beginEntryLevelSystemCallInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginEntryLevelSystemCallInterpretation(final ModelElementPassedEvent<EntryLevelSystemCall> event) {
    }

    /*
     * (non-Javadoc)
     *
     * @see de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#
     * endEntryLevelSystemCallInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endEntryLevelSystemCallInterpretation(final ModelElementPassedEvent<EntryLevelSystemCall> event) {
    }

    /*
     * (non-Javadoc)
     *
     * @see de.upb.pcm.simulizar.interpreter.listener.IInterpreterListener#
     * beginExternalCallInterpretation
     * (de.upb.pcm.simulizar.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginExternalCallInterpretation(final RDSEFFElementPassedEvent<ExternalCallAction> event) {
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * de.upb.pcm.simulizar.interpreter.listener.IInterpreterListener#endExternalCallInterpretation
     * (de.upb.pcm.simulizar.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endExternalCallInterpretation(final RDSEFFElementPassedEvent<ExternalCallAction> event) {
    }
    
	@Override
	public <T extends EObject> void beginUnknownElementInterpretation(ModelElementPassedEvent<T> event) {
	}

	@Override
	public <T extends EObject> void endUnknownElementInterpretation(ModelElementPassedEvent<T> event) {
	}

	@Override
	public void beginSystemOperationCallInterpretation(ModelElementPassedEvent<OperationSignature> event) {
	}

	@Override
	public void endSystemOperationCallInterpretation(ModelElementPassedEvent<OperationSignature> event) {
	}


    @Override
    public <R extends ProvidedRole, S extends Signature> void beginAssemblyProvidedOperationCallInterpretation(
    		AssemblyProvidedOperationPassedEvent<R, S> event) {
    }
    
    @Override
    public <R extends ProvidedRole, S extends Signature> void endAssemblyProvidedOperationCallInterpretation(
    		AssemblyProvidedOperationPassedEvent<R, S> event) {
    }
}
