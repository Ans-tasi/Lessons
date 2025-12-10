import java.util.Map;

public class Student {
        private String name;
        private String group;
        private int course;
        private Map <String, Integer> grades;

        public Student (String name, String group, int course, Map <String, Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public String getName() {
            return name;
        }

        public Map<String, Integer> getGrades() {
            return grades;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public double calculateGrades () {
            if (grades == null) {
                return 0.0;
            }
            int sum = 0;
            for (int grade : grades.values()) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }
        public String toString() {
            return String.format("Студент: %s, Группа: %s, Курс: %d, Средний балл: %f",
                    name, group, course, calculateGrades());
        }
    }

