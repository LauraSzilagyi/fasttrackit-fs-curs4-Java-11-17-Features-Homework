package ro.fasttrackit.curs4homework.ex1;

import java.time.LocalDate;
import java.time.Period;

public record Student(String name, LocalDate birthDate, int grade) {

    public Student(String name, LocalDate birthDate, int grade) {
        this.name = name;
        this.birthDate = birthDate;
        this.grade = getGradeSafe(grade);
    }

    public Student(String name, int grade, int age) {
        this(name, getBirthDateFromAge(age), getGradeSafe(grade));
    }

    private static int getGradeSafe(int grade) {
        return grade <= 10 && grade >=1 ? grade : 1;
    }

    private static LocalDate getBirthDateFromAge(int age) {
        LocalDate now = LocalDate.now();
        int year = now.getYear() - age;
        return LocalDate.of(year, now.getMonth() , now.getDayOfMonth());
    }

    public int getAge() {
        Period period = Period.between(this.birthDate, LocalDate.now());
        return period.getYears();
    }
}
