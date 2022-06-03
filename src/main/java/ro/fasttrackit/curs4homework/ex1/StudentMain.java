package ro.fasttrackit.curs4homework.ex1;

import java.time.LocalDate;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService(List.of(
                new Student("Ion", 8, 26),
                new Student("Maria", 10, 32),
                new Student("Dan", 6, 16),
                new Student("Lidia", LocalDate.of(1978, 2, 26), 10),
                new Student("Andrei", 4, 26)
        ));

        String averageGrade = studentService.averageGradeOfAllStudentsWithName();
        System.out.println(averageGrade);
        System.out.println(studentService.getStudentNameWithCourse());
        studentService.printStudentsWithTheirGrade();
        studentService.getStudents().forEach(student ->
                System.out.println(student.name() + " " + student.getAge())
        );
    }
}
