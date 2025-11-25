import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lesson2.printThreeWords();
        Lesson2.checkSumSign();
        Lesson2.printColor();
        Lesson2.compareNumbers();
        System.out.println(Lesson2.checkSum(200, 20));
        Lesson2.checkNumber(3);
        System.out.println(Lesson2.checkNumber2(200));
        Lesson2.repeatString("!? ", 10);
        System.out.println(Lesson2.checkLeapYear(2400));
        Lesson2.invertArray();
        Lesson2.fillArrayLoop();
        Lesson2.numbersLessThanSix();
        Lesson2.diagonalArray();
        System.out.println(Arrays.toString(Lesson2.createArray(10,5)));
    }
}
