public class Comparator {

    public String compare(int a, int b) {
        if (a < b) {
            return (b + " больше " + a);
        }
        if (a > b) {
            return (a + " больше " + b);
        }
        else {
            return "Числа равны";
        }
    }
}
