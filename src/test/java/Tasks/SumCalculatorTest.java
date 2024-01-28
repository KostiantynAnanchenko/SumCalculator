package Tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumForOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testSumForThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumForZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}