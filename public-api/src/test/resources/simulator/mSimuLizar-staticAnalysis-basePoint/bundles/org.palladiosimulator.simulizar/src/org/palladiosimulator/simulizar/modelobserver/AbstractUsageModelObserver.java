package org.palladiosimulator.simulizar.modelobserver;

import java.util.Objects;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

/*
 * Metamodel Dependencies
 */
import softwareusage.UsageModel;

public abstract class AbstractUsageModelObserver extends AbstractModelObserver<UsageModel> {

    public AbstractUsageModelObserver() {
        super();
    }

    @Override
    public void initialize(final AbstractSimuLizarRuntimeState runtimeState) {
        super.initialize(runtimeState.getPCMPartitionManager().getGlobalPCMModel().getUsageModel(),
                Objects.requireNonNull(runtimeState));
    }
}
