
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void creaIstanza() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(19.0f, calculator.add(12.0f, 7.0f));
    }

    @Test
    void subtract() {
        assertEquals(5.0f, calculator.subtract(10.0f, 5.0f));
    }

    @Test
    void divide() {
        assertEquals(15.0f, calculator.divide(30.0f, 2.0f));
    }

    @Test
    void multiply() {
        assertEquals(9.0, calculator.multiply(3.0f, 3.0f));
    }
}