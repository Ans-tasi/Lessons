import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AllTestsTestNG {

    @Test
    public void testFactorialPositive() {
        FactorialCalculate fc = new FactorialCalculate();
        assertEquals(120, fc.calculate(5), "Факториал 5 должен быть 120");
        assertEquals(1, fc.calculate(0), "Факториал 0 должен быть 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialCalculate fc = new FactorialCalculate();
        fc.calculate(-1);
    }


    @Test
    public void testTriangleAreaValid() {
        TriangleAreaCalculate tc = new TriangleAreaCalculate();
        double expected = 6.0;
        double actual = tc.calculateArea(3, 4, 5);
        assertEquals(expected, actual, 0.001, "Площадь 3-4-5 должна быть 6");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaInvalidSides() {
        TriangleAreaCalculate tc = new TriangleAreaCalculate();
        tc.calculateArea(1, 2, 5);
    }

    @Test
    public void testAddition() {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        assertEquals(15, ac.sum(10, 5));
        assertEquals(10, ac.subtract(-10, -20));
        assertEquals(50, ac.multiply(10, 5));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        ac.divide(10, 0);
    }

    @Test
    public void testDivisionResult() {
        ArithmeticCalculate ac = new ArithmeticCalculate();
        double expected = 2.5;
        double actual = ac.divide(5, 2);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testComparison() {
        Comparator comparator = new Comparator();
        assertEquals("10 больше 5", comparator.compare(10, 5));
        assertEquals("10 больше 5", comparator.compare(5, 10));
        assertEquals("Числа равны", comparator.compare(7, 7));
    }
}

