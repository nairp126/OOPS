// Package removed to match directory structure

// NOTE: These imports require JUnit 5 (org.junit.jupiter:junit-jupiter-api)
// We will add dependencies in Module 10 (Maven).
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

// The Class Under Test
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Zero division");
        return a / b;
    }
}

/**
 * JUnit 5 Example.
 * Key Concepts: @Test, @BeforeEach, Assertions.
 */
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Runs before EVERY test method. Ensures a clean state.
        calculator = new Calculator();
    }

    @Test
    @DisplayName("1 + 1 should equal 2")
    void testAddition() {
        int result = calculator.add(1, 1);
        assertEquals(2, result, "1 + 1 should be 2");
    }

    @Test
    @DisplayName("Division by zero should throw Exception")
    void testDivisionByZero() {
        // Assert that the code throws the specific exception
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
