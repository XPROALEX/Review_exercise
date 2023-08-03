import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student sAlessandroV = new Student(1, "Alessandro", "Venuti", LocalDate.of(1997, 07, 14));
        Student sMarioR = new Student(2, "Mario", "Rossi", LocalDate.of(1997, 1, 26), Arrays.asList(18, 21, 16, 29));
        Student sGiorgioB = new Student(3, "Giorgio", "Bianchi", LocalDate.of(1999, 5, 17), Arrays.asList(17, 16, 19, 20));
        Student sLuciaF = new Student(4, "Lucia", "Franchi", LocalDate.of(2000, 2, 13));

        Professor pAntonioC = new Professor(1, "Antonio", "Cavallaro", "Arte");
        Professor pMartinaB = new Professor(2, "Martina", "Bontempo");

        pMartinaB.assingGrade(sAlessandroV, 17);
        pAntonioC.assingGrade(sLuciaF, 16);

        Student[] studentArray = {sAlessandroV, sMarioR, sGiorgioB, sLuciaF};
        System.out.println("Excellent Students: ");
        for (Student students : studentArray) {
            if (students.isExellent() == true) {
                System.out.println(students.getFullName() + " Grade Average: " + students.calculateGradeAverage());
            }
        }
        System.out.println("Student with highest average:");
        double highestAverageGrade = studentArray[0].calculateGradeAverage();
        Student studentWithHighestAverage = studentArray[0];

        for (Student student : studentArray) {
            double average = student.calculateGradeAverage();
            if (highestAverageGrade < average) {
                highestAverageGrade = average;
                studentWithHighestAverage = student;
            }
        }
        System.out.println(studentWithHighestAverage.getFullName() + " " + studentWithHighestAverage.calculateGradeAverage());

        List<Professor> professorsArrayList = new ArrayList<>();
        professorsArrayList.add(pAntonioC);
        professorsArrayList.add(pMartinaB);
    }
}

