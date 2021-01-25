package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import java.util.Collection;

/**
 * This defines a post processor for parsing results. PostProcessors are called in arbitrary order.
 * The generic parameter <T> is the type of the parse result. 
 */
public interface PostProcessor<T> {


  /**
   * Processes the given collection of parsing results.
   * @param parsed  a collection of parsed results. Can be empty is never null.
   */
  public void process(Collection<T> parsed);

}
