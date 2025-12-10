import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Иванов П.С.", "ИБ-201", 2,
                Map.of("Алгебра", 4, "Физика", 3, "Базы данных", 5)));

        students.add(new Student("Петрова А.В.", "ИБ-201", 2,
                Map.of("Алгебра", 2, "Физика", 2, "Базы данных", 3)));

        students.add(new Student("Сидоров Д.Е.", "ИБ-101", 1,
                Map.of("Матанализ", 5, "Программирование", 5)));

        students.add(new Student("Кузнецов В.И.", "ИБ-301", 3,
                Map.of("Сетевые технологии", 4, "ОС", 2)));

        System.out.println("Начальное состояние студентов (" + students.size() + ")");
        students.forEach(System.out::println);

        MethodsStudents method = new MethodsStudents();


        method.printNameStudent(students, 2);


        method.removeStudent(students);
        System.out.println("Состояние после удаления: " + students.size() + " студентов");
        students.forEach(System.out::println);


        method.transferStudent(students);


        method.printNameStudent(students, 2);
        method.printNameStudent(students, 4);

        PhoneBook book = new PhoneBook();
        book.add("Артемьева", "89001376789");
        book.add("Семенова", "89160009087");

        book.add("Артемьева", "89156789989");
        book.add("Артемьева", "89123456787");

        String searchName1 = "Артемьева";
        List<String> phone1 = book.get(searchName1);
        System.out.print("Абонент " + searchName1 + ": ");
        if (phone1.isEmpty()) {
            System.out.println("Не найдены.");
        } else {
            System.out.println(String.join(" ", phone1));
        }


        String searchName2 = "Семенова";
        List<String> phone2 = book.get(searchName2);
        System.out.print("Абонент " + searchName2 + ": ");
        System.out.println(String.join(" ", phone2));


        String searchName3 = "Смирнов";
        List<String> phone3 = book.get(searchName3);
        System.out.print("Абонент " + searchName3 + ": ");
        if (phone3.isEmpty()) {
            System.out.println("Не найдены.");
        } else {
            System.out.println(String.join(" ", phone3));
        }
    }
}