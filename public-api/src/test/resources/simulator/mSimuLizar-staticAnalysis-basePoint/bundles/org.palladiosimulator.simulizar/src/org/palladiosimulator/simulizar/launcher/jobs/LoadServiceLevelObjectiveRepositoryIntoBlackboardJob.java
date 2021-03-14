package org.palladiosimulator.simulizar.launcher.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.exceptions.SLORepositoryLoadException;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Job for loading service level objectives into blackboard and resolving proxies to Palladio models
 * and MonitorRepository.
 *
 * @author Erlend Stav
 *
 */
public class LoadServiceLevelObjectiveRepositoryIntoBlackboardJob
        implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

    private static final String FILE_PREFIX = "file:///";

    private MDSDBlackboard blackboard;

    private final SimuLizarWorkflowConfiguration configuration;

    /**
     * Constructor
     *
     * @param configuration
     *            the SimuCom workflow configuration.
     */
    public LoadServiceLevelObjectiveRepositoryIntoBlackboardJob(final SimuLizarWorkflowConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#execute(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        if (this.getPCMResourceSetPartition() == null) {
            throw new SLORepositoryLoadException("Palladio models must be loaded first.");
        }

        final PCMResourceSetPartition sloPartition = this.getPCMResourceSetPartition();
        if (!this.getPath().equals("")) {

            // add file protocol if necessary
            String filePath = this.getPath();
            if (!filePath.startsWith("platform:") && !filePath.startsWith(FILE_PREFIX)) {
                filePath = FILE_PREFIX + filePath;
            }

            sloPartition.loadModel(URI.createURI(filePath));
            // now resolve all cross references from current resource to PCM
            sloPartition.resolveAllProxies();
        }

    }

    /**
     * @return returns the blackboard.
     */
    private MDSDBlackboard getBlackboard() {
        return this.blackboard;
    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#getName()
     */
    @Override
    public String getName() {
        return "Loading Service Level Objectives";
    }

    /**
     * @return returns the path.
     */
    private String getPath() {
        return this.configuration.getServiceLevelObjectivesFile();
    }

    /**
     * @return the pcm resource set partition
     */
    private PCMResourceSetPartition getPCMResourceSetPartition() {
        return (PCMResourceSetPartition) (this.getBlackboard()
                .getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#rollback(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {

    }

    /**
     * @see de.uka.ipd.sdq.workflow.IBlackboardInteractingJob#setBlackboard(de.uka.ipd.sdq.workflow.Blackboard)
     */
    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;

    }

}