/**
 * SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.lang.annotation.Annotation;
import spoon.reflect.code.CtAnnotationFieldAccess;
import spoon.reflect.code.CtArrayRead;
import spoon.reflect.code.CtArrayWrite;
import spoon.reflect.code.CtAssert;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtBreak;
import spoon.reflect.code.CtCase;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCatchVariable;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtComment;
import spoon.reflect.code.CtConditional;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtContinue;
import spoon.reflect.code.CtDo;
import spoon.reflect.code.CtExecutableReferenceExpression;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtFieldRead;
import spoon.reflect.code.CtFieldWrite;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtJavaDoc;
import spoon.reflect.code.CtJavaDocTag;
import spoon.reflect.code.CtLambda;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.code.CtOperatorAssignment;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatementList;
import spoon.reflect.code.CtSuperAccess;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtSwitchExpression;
import spoon.reflect.code.CtSynchronized;
import spoon.reflect.code.CtTextBlock;
import spoon.reflect.code.CtThisAccess;
import spoon.reflect.code.CtThrow;
import spoon.reflect.code.CtTry;
import spoon.reflect.code.CtTryWithResource;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.code.CtUnaryOperator;
import spoon.reflect.code.CtVariableRead;
import spoon.reflect.code.CtVariableWrite;
import spoon.reflect.code.CtWhile;
import spoon.reflect.code.CtYieldStatement;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtAnnotationMethod;
import spoon.reflect.declaration.CtAnnotationType;
import spoon.reflect.declaration.CtAnonymousExecutable;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtCompilationUnit;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtEnumValue;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtImport;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtModule;
import spoon.reflect.declaration.CtModuleRequirement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtPackageDeclaration;
import spoon.reflect.declaration.CtPackageExport;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtProvidedService;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.declaration.CtUsedService;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtCatchVariableReference;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtIntersectionTypeReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtModuleReference;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.reference.CtTypeMemberWildcardImportReference;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtUnboundVariableReference;
import spoon.reflect.reference.CtWildcardReference;
import spoon.reflect.visitor.CtVisitor;

public class ElementVisitor implements CtVisitor {

    private boolean result = false;

    public boolean canVisit() {
        return result;
    }

    @Override
    public <A extends Annotation> void visitCtAnnotation(CtAnnotation<A> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtAnnotationFieldAccess(CtAnnotationFieldAccess<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtAnnotationMethod(CtAnnotationMethod<T> arg0) {
        result = false;
    }

    @Override
    public <A extends Annotation> void visitCtAnnotationType(CtAnnotationType<A> arg0) {
        result = false;
    }

    @Override
    public void visitCtAnonymousExecutable(CtAnonymousExecutable arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtArrayRead(CtArrayRead<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtArrayTypeReference(CtArrayTypeReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtArrayWrite(CtArrayWrite<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtAssert(CtAssert<T> arg0) {
        result = false;
    }

    @Override
    public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtBinaryOperator(CtBinaryOperator<T> arg0) {
        result = false;
    }

    @Override
    public <R> void visitCtBlock(CtBlock<R> arg0) {
        result = false;
    }

    @Override
    public void visitCtBreak(CtBreak arg0) {
        result = false;
    }

    @Override
    public <S> void visitCtCase(CtCase<S> arg0) {
        result = false;
    }

    @Override
    public void visitCtCatch(CtCatch arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtCatchVariable(CtCatchVariable<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtCatchVariableReference(CtCatchVariableReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtClass(CtClass<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtCodeSnippetExpression(CtCodeSnippetExpression<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtCodeSnippetStatement(CtCodeSnippetStatement arg0) {
        result = false;
    }

    @Override
    public void visitCtComment(CtComment arg0) {
        result = false;
    }

    @Override
    public void visitCtCompilationUnit(CtCompilationUnit arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtConditional(CtConditional<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtConstructor(CtConstructor<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtConstructorCall(CtConstructorCall<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtContinue(CtContinue arg0) {
        result = false;
    }

    @Override
    public void visitCtDo(CtDo arg0) {
        result = false;
    }

    @Override
    public <T extends Enum<?>> void visitCtEnum(CtEnum<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtEnumValue(CtEnumValue<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtExecutableReference(CtExecutableReference<T> arg0) {
        result = false;
    }

    @Override
    public <T, E extends CtExpression<?>> void visitCtExecutableReferenceExpression(
            CtExecutableReferenceExpression<T, E> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtField(CtField<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtFieldRead(CtFieldRead<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtFieldReference(CtFieldReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtFieldWrite(CtFieldWrite<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtFor(CtFor arg0) {
        result = false;
    }

    @Override
    public void visitCtForEach(CtForEach arg0) {
        result = false;
    }

    @Override
    public void visitCtIf(CtIf arg0) {
        result = false;
    }

    @Override
    public void visitCtImport(CtImport arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtInterface(CtInterface<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtIntersectionTypeReference(CtIntersectionTypeReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtInvocation(CtInvocation<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtJavaDoc(CtJavaDoc arg0) {
        result = false;
    }

    @Override
    public void visitCtJavaDocTag(CtJavaDocTag arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtLambda(CtLambda<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtLiteral(CtLiteral<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtLocalVariable(CtLocalVariable<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtLocalVariableReference(CtLocalVariableReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtMethod(CtMethod<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtModule(CtModule arg0) {
        result = false;
    }

    @Override
    public void visitCtModuleReference(CtModuleReference arg0) {
        result = false;
    }

    @Override
    public void visitCtModuleRequirement(CtModuleRequirement arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtNewArray(CtNewArray<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtNewClass(CtNewClass<T> arg0) {
        result = false;
    }

    @Override
    public <T, A extends T> void visitCtOperatorAssignment(CtOperatorAssignment<T, A> arg0) {
        result = false;
    }

    @Override
    public void visitCtPackage(CtPackage arg0) {
        result = false;
    }

    @Override
    public void visitCtPackageDeclaration(CtPackageDeclaration arg0) {
        result = false;
    }

    @Override
    public void visitCtPackageExport(CtPackageExport arg0) {
        result = false;
    }

    @Override
    public void visitCtPackageReference(CtPackageReference arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtParameter(CtParameter<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtParameterReference(CtParameterReference<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtProvidedService(CtProvidedService arg0) {
        result = false;
    }

    @Override
    public <R> void visitCtReturn(CtReturn<R> arg0) {
        result = false;
    }

    @Override
    public <R> void visitCtStatementList(CtStatementList arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtSuperAccess(CtSuperAccess<T> arg0) {
        result = false;
    }

    @Override
    public <S> void visitCtSwitch(CtSwitch<S> arg0) {
        result = false;
    }

    @Override
    public <T, S> void visitCtSwitchExpression(CtSwitchExpression<T, S> arg0) {
        result = false;
    }

    @Override
    public void visitCtSynchronized(CtSynchronized arg0) {
        result = false;
    }

    @Override
    public void visitCtTextBlock(CtTextBlock arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtThisAccess(CtThisAccess<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtThrow(CtThrow arg0) {
        result = false;
    }

    @Override
    public void visitCtTry(CtTry arg0) {
        result = false;
    }

    @Override
    public void visitCtTryWithResource(CtTryWithResource arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtTypeAccess(CtTypeAccess<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtTypeMemberWildcardImportReference(CtTypeMemberWildcardImportReference arg0) {
        result = false;
    }

    @Override
    public void visitCtTypeParameter(CtTypeParameter arg0) {
        result = false;
    }

    @Override
    public void visitCtTypeParameterReference(CtTypeParameterReference arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtTypeReference(CtTypeReference<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtUnaryOperator(CtUnaryOperator<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtUnboundVariableReference(CtUnboundVariableReference<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtUsedService(CtUsedService arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtVariableRead(CtVariableRead<T> arg0) {
        result = false;
    }

    @Override
    public <T> void visitCtVariableWrite(CtVariableWrite<T> arg0) {
        result = false;
    }

    @Override
    public void visitCtWhile(CtWhile arg0) {
        result = false;
    }

    @Override
    public void visitCtWildcardReference(CtWildcardReference arg0) {
        result = false;
    }

    @Override
    public void visitCtYieldStatement(CtYieldStatement arg0) {
        result = false;
    }

    /** Set the result to the given boolean value */
    public void setResult(boolean result) {
        this.result = result;
    }
}
