package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;

public class Foo {
  
  public void name() {
    Launcher launcher = new Launcher();
    launcher.addInputResource("TODO");
    CtModel model = launcher.buildModel();
    Collection<CtType<?>> types = model.getAllTypes();
    removeDataTypes(types);
    removeNotObservedSystem(types);
    CodeMetric loc = calculateLoC(types);
    CodeMetric sos = calculateSizeOfSystem(types);
    Collection<CodeMetric> complexity = calculateMethodComplexity(types);// TODO:
  }

  private void removeNotObservedSystem(Collection<CtType<?>> types) {}

  private void removeDataTypes(Collection<CtType<?>> types) {

  }
  private CodeMetric calculateLoC(Collection<CtType<?>> types) {
    return new CodeMetric(sumLinesOfCode(types), "Lines of Code");
  }

  private int sumLinesOfCode(Collection<CtType<?>> types) {
    return types.stream().map(v -> v.getPosition().getEndLine()).reduce(0,(a,b) -> a+b);
  }
  private CodeMetric calculateSizeOfSystem(Collection<CtType<?>> types) {
    return new CodeMetric(types.size(),"Size of observed system");
  }
  private Collection<CodeMetric> calculateMethodComplexity(Collection<CtType<?>> types) {
    Collection<Integer> complexity = new ArrayList<>();
    for(CtType<?> type :types) {
      complexity.addAll(CyclomaticComplexityCalculation.calculateCyclomaticComplexity(type));
    }
    Map<Integer,Long> bucketsizeByLength = complexity.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    return bucketsizeByLength.entrySet().stream().map(e -> new CodeMetric(e.getValue(),"Complexity Bucket with size " + e.getKey())).collect(Collectors.toList());
  }
}
