import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSquareRootFunction() {
        assertEquals(2.0, Calculator.squareRootFunction(4.0), 0.0001);
    }

    @Test
    public void testFactorialFunction() {
        assertEquals(120L, Calculator.factorialFunction(5L));
    }

    // Add more test methods for other functions...
}

