package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query;

import com.google.common.flogger.FluentLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.filter.TypeFilter;

/** This class defines multiple util methods for {@link CtType}s. */
public class Types {
    private Types() {
        // no instance
    }

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    /**
     * Checks if the given type has a superclass.
     *
     * @param type The type to check.
     * @return True if the type has a superclass, false otherwise.
     */
    public static boolean hasSuperclass(CtType<?> type) {
        return type.getSuperclass() != null;
    }
    /**
     * Checks if the given type is a singelton. A singelton is a class that can only have one
     * instance.
     *
     * @param type The type to check.
     * @return True if the type is a singleton, false otherwise.
     */
    public static boolean isSingelton(CtType<?> type) {
        return type.getElements(new TypeFilter<>(CtConstructorCall.class)).stream()
                .anyMatch(v -> v.getType().getQualifiedName().equals(type.getQualifiedName()));
    }
    /**
     * Checks if the given class has only constructors.
     *
     * @param upperClass The class to check.
     * @return True if the class has only constructors, false otherwise.
     */
    public static boolean hasOnlyConstructorTypeMembers(CtType<?> upperClass) {
        return upperClass.getTypeMembers().isEmpty()
                || upperClass.getTypeMembers().size()
                        == upperClass.getElements(new TypeFilter<>(CtConstructor.class)).size();
    }
    /**
     * Checks if the given type is a class.
     *
     * @param type The type to check.
     * @return True if the type is a class, false otherwise.
     */
    public static boolean isClass(CtType<?> type) {
        return type.isClass();
    }
    /**
     * Checks if the given type is a interface.
     *
     * @param type The type to check.
     * @return True if the type is an interface, false otherwise.
     */
    public static boolean isInterface(CtType<?> type) {
        return type.isInterface();
    }
    /**
     * Checks if the given type is an enum.
     *
     * @param type The type to check.
     * @return True if the type is an enum, false otherwise.
     */
    public static boolean isEnum(CtType<?> type) {
        return type.isEnum();
    }
    /**
     * Checks if the given type contains all fields.
     *
     * @param referencedFields The fields to contain
     * @param type The type to check.
     * @return True if the type contains all fields, false otherwise.
     */
    public static boolean hasAllFields(List<CtFieldReference<?>> referencedFields, CtType<?> type) {
        for (CtFieldReference<?> field : referencedFields) {
            List<CtFieldReference<?>> fields = new ArrayList<>(type.getAllFields());
            fields.removeIf(v -> !v.getSimpleName().equals(field.getSimpleName()));
            if (fields.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    /**
     * Checks if the given type has all methods.
     *
     * @param referencedMethods The methods to contain.
     * @param type The type to check.
     * @return True if the type has all methods, false otherwise.
     */
    public static boolean hasAllMethods(
            List<CtExecutableReference<?>> referencedMethods, CtType<?> type) {
        try {
            var signaturesForType =
                    type.getAllMethods().stream()
                            .map(CtExecutable::getSignature)
                            .collect(Collectors.toSet());
            var usedSignatures =
                    referencedMethods.stream()
                            .map(CtExecutableReference::getSignature)
                            .collect(Collectors.toSet());
            return signaturesForType.containsAll(usedSignatures);
        } catch (Exception e) {
            logger.atSevere().log("Error while getting methods %s", e);
        }
        return false;
    }
}
