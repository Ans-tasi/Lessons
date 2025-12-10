import java.util.Iterator;
import java.util.Set;

public class MethodsStudents {
    public void removeStudent(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.calculateGrades() < 3.0) {
                System.out.println("Студент: " + student.getName() + "Отчислен. Средний балл: " + student.calculateGrades());
                iterator.remove();
            }
        }
    }

    public void transferStudent(Set<Student> students) {
        for (Student student : students) {
            if (student.calculateGrades() >= 3.0 ) {
                int newCourse = student.getCourse() + 1;
                System.out.println("Студент: " + student.getName() + "Зачислен на курс: " + newCourse);
            }
        }
    }

    public void printNameStudent(Set<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На курсе " + course + " студентов не найдено.");
        }
    }

}