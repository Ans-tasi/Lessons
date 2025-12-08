public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(String message, int row, int col) {
        super(message);
        this.col = col;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getMessage() {
        return super.getMessage() + "строка " + row + ", " + "столбец " + col;
    }
}
