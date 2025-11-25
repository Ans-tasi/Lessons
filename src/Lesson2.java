import java.util.Arrays;

public class Lesson2 {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 28;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 60;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 40;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkSum(int a, int b) {
        boolean result;
        int sum = a + b;
        if ( sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void checkNumber (int a) {
        if (a > 0) {
            System.out.println("Положительное");
        } else if (a == 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean checkNumber2 (int a) {
        boolean result;
        if (a > 0) {
            result = false;
        } else if (a == 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public static void repeatString (String str, int count) {
        String MyStr = "";
        for (int i = 0; i < count; i ++ ) {
            MyStr += str;
        }
        System.out.println(MyStr);
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray() {
        int [] arr = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i ++) {
            if ( arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArrayLoop() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numbersLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonalArray() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < 10; i++) { // Итерируемся по строкам
            for (int j = 0; j < 10; j++) { // Итерируемся по столбцам в текущей строке
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] resultArray = new int[len];
        for (int i = 0; i < len; i++) {
            resultArray[i] = initialValue;
        }
        return resultArray;
    }
}