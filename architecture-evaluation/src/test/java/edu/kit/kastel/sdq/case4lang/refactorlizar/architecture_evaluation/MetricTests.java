package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import static com.google.common.truth.Truth.assertThat;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MetricTests {

        @Nested
        class HypergraphSize {
    @Test
    void sizeTest1() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.MARTIN)
                                        .getSize().getValue())
                .isWithin(0.1)
                .of(2.75);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.REINER)
                                        .getSize().getValue())
                .isEqualTo(4.0);
    }

    @Test
    void sizeTest2() {
        assertThat(
                        new Application()
                                .evaluate("src/test/resources/smallProject", CalculationMode.MARTIN)
                                .getSize().getValue())
                .isWithin(0.1)
                .of(4.0);
        assertThat(
                        new Application()
                                .evaluate("src/test/resources/smallProject", CalculationMode.REINER)
                                .getSize().getValue())
                .isWithin(0.1)
                .of(5.2);
    }
}
@Nested
class GraphComplexity {
    @Test
    void complexityTest1() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.MARTIN)
                                        .getComplexity().getValue())
                .isWithin(0.1)
                .of(2.75);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.REINER)
                                        .getComplexity().getValue())
                .isEqualTo(4.0);
    }

    @Test
    void complexityTest2() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.MARTIN)
                                        .getComplexity().getValue())
                .isWithin(0.1)
                .of(2.75);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.REINER)
                                .getComplexity().getValue())
                .isEqualTo(4.0);
    }
}
@Nested
class Coupling {
    @Test
    void couplingTest1() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.MARTIN)
                                        .getCoupling().getValue())
                .isWithin(0.1)
                .of(0);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.REINER)
                                        .getCoupling().getValue())
                .isEqualTo(-1.0);
    }

    @Test
    void couplingTest2() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.MARTIN)
                                        .getCoupling().getValue())
                .isWithin(0.1)
                .of(0);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.REINER)
                                .getCoupling().getValue())
                .isEqualTo(-1.0);
    }
}
@Nested
class Cohesion {
    @Test
    void cohesionTest1() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.MARTIN)
                                        .getCohesion().getValue())
                .isWithin(0.1)
                .of(1);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/Foo.java",
                                        CalculationMode.REINER)
                                        .getCohesion().getValue())
                .isEqualTo(1.0);
    }

    @Test
    void cohesionTest2() {
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.MARTIN)
                                .getCohesion().getValue())
                .isWithin(0.1)
                .of(0.17);
        assertThat(
                        new Application()
                                .evaluate(
                                        "src/test/resources/smallProject/", CalculationMode.REINER)
                                .getCohesion().getValue())
                .isWithin(0.1)
                .of(0.21);
    }
}
}
