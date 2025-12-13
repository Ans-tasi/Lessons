public class ArithmeticCalculate {

    public int sum (int a, int b) {
        return a + b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }

    public int multiply (int a, int b) {
        return a * b;
    }

    public double divide (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        else {
            return (double) a / b;
        }
    }
}