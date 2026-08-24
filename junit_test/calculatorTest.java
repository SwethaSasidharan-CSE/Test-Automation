import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class calculatorTest {
    calculator calc = new calculator();

    @Test
    void add() {
        assertEquals(8,calc.add(5,3));
    }

    @Test
    void divide() {
        assertEquals(5,calc.divide(10,2));
    }
    @Test
    void TestException()
    {
        assertThrows(ArithmeticException.class, () ->
                calc.divide(10,0));
    }
}