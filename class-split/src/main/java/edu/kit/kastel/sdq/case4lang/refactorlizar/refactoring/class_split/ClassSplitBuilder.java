package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import java.util.function.Consumer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.creation.TypeCreation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification.Relations;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement.MoveMember;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class ClassSplitBuilder {
  
  private CtType<?> source;
  private String targetQName;
  private CtType<?> target;
  private Consumer<Void> action = v -> {};
  public ClassSplitBuilder() {
  }
  public ClassSplitBuilder sourceClass(CtType<?> source) {
    this.source = source;
    return this; 
  }
  public ClassSplitBuilder targetClass(String targetQName) {
    this.targetQName = targetQName;
    return this; 
  }
  public ClassSplitBuilder moveTypeMember(CtTypeMember member) {
    action =action.andThen(v -> MoveMember.moveMember(source, target, member));
    return this;
  }
  public ClassSplitBuilder setTargetAsSuperClass() {
    action =action.andThen(v -> Relations.setInheritance(target, source));
    return this;
  }
  public ClassSplitBuilder setSourceAsSuperClass() {
    action = action.andThen(v -> Relations.setInheritance(source, target));
    return this;
  }
  public Consumer<Void> createClassSplit() {
    if(targetQName.isEmpty() || source == null) {
      throw new IllegalArgumentException("Source and target class must be set");
    }
    target = TypeCreation.classOfQualifiedName(source, targetQName);
    return v -> action.accept(v);
  }
}
