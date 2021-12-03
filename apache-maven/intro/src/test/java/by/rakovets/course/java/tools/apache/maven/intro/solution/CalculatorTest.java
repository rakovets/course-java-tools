package by.rakovets.course.java.tools.apache.maven.intro.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition")
    public void testAdd() {
        Assertions.assertEquals(3.0, calculator.add(1.0, 2.0));
    }

    @Test
    @DisplayName("Subtraction")
    public void testSubtract() {
        Assertions.assertEquals(-1.0, calculator.subtract(1.0, 2.0));
    }

    @Test
    @DisplayName("Multiplication")
    public void testMultiply() {
        Assertions.assertEquals(30.0, calculator.multiply(10.0, 3.0));
        Assertions.assertEquals(0.0, calculator.multiply(0.0, 3.0));
        Assertions.assertEquals(0.0, calculator.multiply(3.0, 0.0));
    }

    @Test
    @DisplayName("Division")
    public void testDivide() {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.divide(1.0, 0.0));
        Assertions.assertEquals(3.333333, calculator.divide(10.0, 3.0), 0.000001);
    }
}
