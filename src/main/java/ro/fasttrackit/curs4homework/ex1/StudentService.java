package ro.fasttrackit.curs4homework.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService(List<Student> students) {
        if (students != null) {
            this.students.addAll(students);
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public String averageGradeOfAllStudentsWithName() {
        return this.students.stream()
                .collect(Collectors.teeing(
                        Collectors.mapping(Student::name, Collectors.joining(", ")),
                        Collectors.mapping(Student::grade, Collectors.averagingDouble(value -> value)),
                        (name, gradeAverage) -> name + " have an average grade of " + gradeAverage
                ));
    }

    public List<String> getStudentNameWithCourse() {
        return this.students.stream()
                .map(this::addCourseToStudents)
                .collect(Collectors.toList());
    }

    private String addCourseToStudents(Student student) {
        Random random = new Random();
        String randomCourse = getCourses().get(random.nextInt(getCourses().size()));
        return student.name() + " will participate to course " + randomCourse;
    }

    private List<String> getCourses() {
        List<String> courses = new ArrayList<>();
        String mathematics = """
                {
                    "course":"Mathematics",
                    "semester":2
                }
                """;
        String chemistry = """
                {
                    "course":"Chemistry",
                    "semester":1
                }
                """;
        String physics = """
                {
                    "course":"Physics",
                    "semester":2
                }
                """;
        courses.add(mathematics);
        courses.add(chemistry);
        courses.add(physics);
        return courses;
    }

    public void printStudentsWithTheirGrade() {
        List<Student> students = this.students.stream()
                .sorted(Comparator.comparingInt(Student::grade).reversed())
                .collect(Collectors.toList());

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name() + " have " + getGradeforStudent(i + 1));
        }
    }

    private String getGradeforStudent(int i) {
        return switch (i) {
            case 1, 2, 3 -> "1st grade";
            case 4 -> "5th grade";
            default -> "7th grade";
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentService that = (StudentService) o;
        return Objects.equals(students, that.students);
    }


    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentService{" +
                "students=" + students +
                '}';
    }
}
