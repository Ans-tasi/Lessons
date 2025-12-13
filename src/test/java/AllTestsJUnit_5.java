import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AllTestsJUnit_5{

    @Test
    void testFactorialPositive() {
        FactorialCalculate fc = new FactorialCalculate();
        assertEquals(120, fc.calculate(5), "Факториал 5 должен быть 120");
        assertEquals(1, fc.calculate(0), "Факториал 0 должен быть 1");
    }

    @Test
    void testFactorialNegative() {
        FactorialCalculate fc = new FactorialCalculate();
        assertThrows(IllegalArgumentException.class, () -> fc.calculate(-1));
    }

    @Test
    void testTriangleAreaValid() {
        TriangleAreaCalculate tc = new TriangleAreaCalculate();
        assertEquals(6.0, tc.calculateArea(3, 4, 5), 0.001, "Площадь 3-4-5 должна быть 6");
    }

    @Test
    void testTriangleAreaInvalidSides() {
        TriangleAreaCalculate tc = new TriangleAreaCalculate();
        assertThrows(IllegalArgumentException.class, () -> tc.calculateArea(1, 2, 5));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "10, 5, 15",
            "-10, 20, 10"
    })
    void testAddition(int a, int b, int expected) {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        assertEquals(expected, ac.sum(a, b));
    }

    @Test
    void testDivisionByZero() {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        assertThrows(ArithmeticException.class, () -> ac.divide(10, 0));
    }

    @Test
    void testDivisionResult() {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        assertEquals(2.5, ac.divide(5, 2), 0.001);
    }

    @Test
    void testComparison() {
        Comparator comparator =new Comparator();
        assertEquals("10 больше 5", comparator.compare(10, 5));
        assertEquals("10 больше 5", comparator.compare(5, 10));
        assertEquals("Числа равны", comparator.compare(7, 7));
    }

}
