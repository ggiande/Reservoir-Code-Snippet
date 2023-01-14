package unchecked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacciSequenceGivenTarget() {
        int targetNumber = 2;
        int expectedValue = 1;
        assertEquals(expectedValue, Fibonacci.fibonacciSequence(targetNumber));
    }
}
