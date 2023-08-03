import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int professorId;
    private String name;
    private String surname;
    private String course;

    public Professor(int professorId, String name, String surname, String course) {
        this.professorId = professorId;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Professor(int professorId, String name, String surname) {
        this.professorId = professorId;
        this.name = name;
        this.surname = surname;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void assingGrade(Student student, int grade) {
        if (grade >= 18) {
            List<Integer> addGrades = student.getGrades();
            if (addGrades == null) {
                addGrades = new ArrayList<>();
            }
            addGrades.add(grade);
            student.setGrades(addGrades);
        } else {
            System.out.println(student.getFullName() + " Sorry , failed exam, you have to repeat it.");
        }
    }
}
