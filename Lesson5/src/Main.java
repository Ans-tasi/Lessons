public class Main {

    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "1", "7", "8"},
                {"9", "10", "11", "12"},
                {"3", "14", "15", "a"}
        };

        System.out.println("Тестирование корректного массива");
        try {
            int sum =Process.process(array1);
            System.out.println("Сумма элементов корректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка при обработке корректного массива: " + e.getMessage());
        }

        System.out.println("Тестирование массива с некорректными данными");
        try {
            int sum = Process.process(array2);
            System.out.println("Сумма элементов массива с некорректными данными: " + sum);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных массива: " + e.getMessage());
        }

    }
}