import java.time.LocalDate;
import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private List<Integer> grades;

    public Student(int studentId, String name, String surname, LocalDate dateOfBirth, List<Integer> grades) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public Student(int studentId, String name, String surname, LocalDate dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateGradeAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Integer i : grades) {
            sum += i;
        }
        return sum;
    }

    public boolean isExellent() {
        return calculateGradeAverage() >= 28;
    }
}
