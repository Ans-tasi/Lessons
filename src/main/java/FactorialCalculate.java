public class FactorialCalculate {

    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Для отрицательных чисел не определен");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i ++ ) {
            result *= i;
        }
        return Math.toIntExact(result);
    }
}
