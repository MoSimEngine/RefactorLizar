package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.graph.Network;

public class HyperGraphSizeCalculator {
  
  public double calculate(Network hypergraph, List<Object> hyperEdges) {
    
    /*
    Schau für jeden Knoten an zu welcher HyperEdge er verbunden ist.
    Das gibt ein Pattern.
    Für jeden Knoten schauen wie oft sein Pattern ist.
    Durch |HyperEdges| teilen
    Darüber -log_2
    das alles summieren.
    */
    Map<BitSet,Integer> patterns = new HashMap<>();
    Set nodes = hypergraph.nodes();
    for (Object node : nodes) {
      BitSet pattern = createPattern(hyperEdges, node);
      if(patterns.get(pattern) == null) {
        patterns.put(pattern, 1);
      }  else {
        patterns.merge(pattern,1, (a,b) -> a+b);
      } 
    }
    double size = 0;
    for (Object node : nodes) {
      BitSet pattern = createPattern(hyperEdges, node);
      int prob = patterns.get(pattern);
      size += log2(prob/nodes.size());
    }
    return size;
  }

  private BitSet createPattern(List<Object> hyperEdges, Object node) {
    BitSet pattern = new BitSet();
    for (int i = 0; i < hyperEdges.size(); i++) {
      if(isPart(node, hyperEdges.get(i))) {
        pattern.set(i);
      }
    }
    return pattern;
  }

  private boolean isPart(Object v, Object knoten) {
    return true;
  }
  private double log2(double value) {
		return Math.log(value)/Math.log(2);
	}
}
