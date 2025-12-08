public class Process {
    public static int process(String[][] array)
            throws MyArraySizeException, MyArrayDataException {
        final int EXPECTED_SIZE = 4;

        if (array == null || array.length != EXPECTED_SIZE) {
            throw new MyArraySizeException("Неверный размер массива. Ожидался массив " + EXPECTED_SIZE + "x" + EXPECTED_SIZE + ".");
        }
        for (String[] row : array) {
            if (row == null || row.length != EXPECTED_SIZE) {
                throw new MyArraySizeException("Неверный размер массива. Ожидался массив " + EXPECTED_SIZE + "x" + EXPECTED_SIZE + ".");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке.", i, j);
                }
            }
        }
        return sum;
    }
}